/*    */ package net.mcreator.interpritation.item;
/*    */ 
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.sounds.SoundEvent;
/*    */ import net.minecraft.world.item.Item;
/*    */ import net.minecraft.world.item.Rarity;
/*    */ import net.minecraft.world.item.RecordItem;
/*    */ import net.minecraftforge.registries.ForgeRegistries;
/*    */ 
/*    */ public class Record16Item
/*    */   extends RecordItem {
/*    */   public Record16Item() {
/* 13 */     super(3, () -> (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thebrokenscript:disc16.youcant")), (new Item.Properties()).m_41487_(1).m_41497_(Rarity.COMMON), 3000);
/*    */   }
/*    */ }


/* Location:              C:\Users\Caleb\Downloads\thebrokenscript-1.9.3-forge-1.20.1.jar!\net\mcreator\interpritation\item\Record16Item.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */