# 🛡️ Hidden Damage & Durability

A lightweight **Minecraft Forge 1.20.1** mod that removes durability/damage text from item tooltips while keeping the vanilla durability bar fully visible.

## ✨ What it does

- Hides tooltip lines that expose **durability** or **damage** values
- Works globally for damageable items
- Keeps the color-changing durability bar untouched
- Uses Forge tooltip events for broad compatibility with most mods

## ✅ Compatibility

- **Minecraft:** `1.20.1`
- **Forge:** `47.4.21`
- **Java:** `17`

## 📦 Installation

1. Install **Minecraft Forge 47.4.21** for MC 1.20.1.
2. Build this mod (or download a release jar).
3. Put the jar in your `mods/` folder.
4. Launch the game.

## 🧪 Build from source

```bash
./gradlew build
```

Built jar output:

```text
build/libs/
```

## 🔧 Technical notes

The mod listens to Forge `ItemTooltipEvent` on the client and filters durability/damage-related lines from tooltip components. This avoids invasive item rewrites and keeps behavior mod-friendly.

## 📄 License

MIT
