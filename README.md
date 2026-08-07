# Create Scuder（机械动力：幽末）

> A Minecraft mod that brings **Sculk** and **Ender** content into the world of **Create**. Built on NeoForge, expanding the Create & Create Dragons Plus ecosystem.
>
> 一个基于 **Create（机械动力）** 与 **Create Dragons Plus** 生态的 Minecraft 模组，为游戏加入 **幽匿（Sculk）** 与 **末影（Ender）** 主题内容。

## 📦 简介 / Overview

**Create Scuder** 是一款以「幽匿」与「末影」为主题的机械动力扩展模组，当前聚焦于：把幽匿的「生长 / 吞噬 / 汲取」概念与末影的「空间 / 传送」概念，通过 Create 的自动化管线串联起来，让玩家用机械的方式收割与利用这两种世界之力。

模组仍处于 **早期开发阶段**，当前版本重点打磨基础内容（投掷物、流体、自动化接口），后续将逐步扩展大型机械结构。

## ✨ 特性 / Features

### 当前已实现 / Currently Implemented

- **烘干末影珍珠（Baked Ender Pearl）** — 可投掷物品：
  - 通过 **熔炉 / 烟熏炉 / Create 智能烟熏（mechanical smoking）** 将普通末影珍珠加工而成；
  - 投掷命中方块时 **有 50% 概率生成一只末影螨**，随后消失（暂不传送玩家）；
  - 配合 Create 的漏斗、传送带等可实现全自动批量加工。
- **幽匿胶体（Sculk Colloid）** — 一种浓稠、流速缓慢的流体：
  - 高密度 / 高粘稠度（`density 3000 / viscosity 3000`），流动缓慢，适合作为「浓稠幽匿精华」的表现；
  - 支持通用流体桶、Create 管道 / 泵 / 储罐等流体自动化（基于 `FluidStack` / `IFluidHandler`）；
  - 自带逐帧流动动画纹理。
- **末影胶体（Ender Colloid）** — 幽匿胶体的末影变体：
  - 结构与幽匿胶体一致，动画节奏更快的流动纹理；
  - 与幽匿胶体共同构成「幽匿 — 末影」双胶体体系，为后续合成链预留接口。
- **自定义创造标签页（Create Scuder）** — 收纳本模组全部物品。
- **双语文本（简体中文 / English）** — 数据生成驱动的语言文件。

### 规划中 / Planned

- [ ] 幽匿 / 末影主题的 **机械与方块结构**（大型机械，与 Create 联动）；
- [ ] 基于幽匿胶体 / 末影胶体的 **合成链与自动化配方**；
- [ ] 烘干末影珍珠的 **传送 / 空间效果** 深化；
- [ ] 更多幽匿主题的投掷物与实体互动。

## 🛠 依赖 / Dependencies

| 依赖 | 版本要求 | 备注 |
|---|---|---|
| Minecraft | 1.21.1 | — |
| NeoForge | ≥ 21.1.244 | 必选 |
| Create | ≥ 6.0.0 | 必选，核心联动 |
| Create Dragons Plus | ≥ 1.0.0 | 必选 |
| JEI | 可选 | 配方查看 |

## ⚙️ 构建 / Building

```bash
# 构建模组 JAR
./gradlew build            # 产物: build/libs/createscuder-1.0.0.jar

# 运行客户端 / 服务器
./gradlew runClient
./gradlew runServer

# 数据生成（语言文件等 → src/generated/resources/）
./gradlew runData

# 运行游戏测试
./gradlew runGameTestServer

# 刷新依赖 / 重置构建
./gradlew --refresh-dependencies
./gradlew clean
```

环境要求：**JDK 21**。版本信息集中在 `gradle.properties`。

## 🗂 技术概览 / Technical Overview

- **架构**：NeoForge `DeferredRegister` 系统；客户端逻辑隔离在 `*Client` 类；流体基于 `BaseFlowingFluid` + `FluidType` + `LiquidBlock` + `BucketItem` 标准管线。
- **数据生成**：语言文件由 `LanguageProvider` 生成到 `src/generated/resources/`。
- **翻译**：简体中文（`zh_cn`）与英文（`en_us`）双语言。

## 📄 License / 许可证

- **Code（代码）**：MIT License
- **Art Assets（美术资源：纹理、模型、音效等）**：CC BY-NC 4.0

本模组**源码**以 MIT 协议开源，可自由使用、修改、分发（须保留版权声明）；**美术资源**采用 **CC BY-NC 4.0**（署名-非商业）许可，可自由使用、修改、分发但**须署名且不得用于商业用途**。详见 `LICENSE.txt`。

The mod's **source code** is open-sourced under the MIT License; **art assets** (textures, models, sounds, etc.) are licensed under **CC BY-NC 4.0** (Attribution-NonCommercial) — free to use, modify, and redistribute for **non-commercial purposes** with attribution. See `LICENSE.txt` for details.