package com.onedone666.createscuder.render;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.onedone666.createscuder.itemstothrow.BakedEnderPearlEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import org.joml.Matrix4f;

public class BakedThrownEnderPearlRenderer extends EntityRenderer<BakedEnderPearlEntity> {
    private static final ResourceLocation TEXTURE =
            ResourceLocation.fromNamespaceAndPath("createscuder","textures/entities/baked_ender_pearl_thrown.png");

    private static final float HALF = 0.375F;

    public BakedThrownEnderPearlRenderer(EntityRendererProvider.Context context){
        super(context);
    }
    @Override
    public ResourceLocation getTextureLocation(BakedEnderPearlEntity entity){
        return TEXTURE;
    }

    @Override
    public void render(BakedEnderPearlEntity entity, float entityYaw, float partialTick, PoseStack poseStack, MultiBufferSource
                       buffer,int packedLight){
        poseStack.pushPose();
        poseStack.scale(0.75F,0.75F,0.75F);

        poseStack.mulPose(this.entityRenderDispatcher.cameraOrientation());
        VertexConsumer vertexConsumer= buffer.getBuffer(RenderType.entityCutout(TEXTURE));
        PoseStack.Pose pose = poseStack.last();

        Matrix4f matrix = pose.pose();

        // 正反两面都画，保证从背后看也不消失（无翻转错位）
        addQuad(vertexConsumer,pose , matrix, packedLight, true);
        addQuad(vertexConsumer,pose, matrix, packedLight, false);

        poseStack.popPose();
        super.render(entity, entityYaw, partialTick, poseStack, buffer, packedLight);

    }

    private void addQuad(VertexConsumer vertexConsumer,PoseStack.Pose pose,Matrix4f matrix,int packedLight,boolean front){
        float nx =0.0f, ny = 0.0f,z = 0.0f, nz = front ? 1.0f: -1.0f;
        if (front){
            vertexConsumer.addVertex(matrix, -HALF, -HALF,z).setColor(1f,1f,1f,1f)
                    .setUv(0f, 1f).setOverlay(OverlayTexture.NO_OVERLAY).setLight(packedLight)
                    .setNormal(pose, nx, ny, nz);
            vertexConsumer.addVertex(matrix, HALF, -HALF, z).setColor(1f, 1f, 1f, 1f)
                    .setUv(1f, 1f).setOverlay(OverlayTexture.NO_OVERLAY).setLight(packedLight)
                    .setNormal(pose, nx, ny, nz);
            vertexConsumer.addVertex(matrix, HALF, HALF, z).setColor(1f, 1f, 1f, 1f)
                    .setUv(1f, 0f).setOverlay(OverlayTexture.NO_OVERLAY).setLight(packedLight)
                    .setNormal(pose, nx, ny, nz);
            vertexConsumer.addVertex(matrix, -HALF, HALF, z).setColor(1f, 1f, 1f, 1f)
                    .setUv(0f, 0f).setOverlay(OverlayTexture.NO_OVERLAY).setLight(packedLight)
                    .setNormal(pose, nx, ny, nz);
        }else{
// 后面：镜像 UV，从背后看不倒立
            vertexConsumer.addVertex(matrix, -HALF, -HALF, z).setColor(1f, 1f, 1f, 1f)
                    .setUv(1f, 1f).setOverlay(OverlayTexture.NO_OVERLAY).setLight(packedLight)
                    .setNormal(pose, nx, ny, nz);
            vertexConsumer.addVertex(matrix, HALF, -HALF, z).setColor(1f, 1f, 1f, 1f)
                    .setUv(0f, 1f).setOverlay(OverlayTexture.NO_OVERLAY).setLight(packedLight)
                    .setNormal(pose, nx, ny, nz);
            vertexConsumer.addVertex(matrix, HALF, HALF, z).setColor(1f, 1f, 1f, 1f)
                    .setUv(0f, 0f).setOverlay(OverlayTexture.NO_OVERLAY).setLight(packedLight)
                    .setNormal(pose, nx, ny, nz);
            vertexConsumer.addVertex(matrix, -HALF, HALF, z).setColor(1f, 1f, 1f, 1f)
                    .setUv(1f, 0f).setOverlay(OverlayTexture.NO_OVERLAY).setLight(packedLight)
                    .setNormal(pose, nx, ny, nz);

        }
    }
}
