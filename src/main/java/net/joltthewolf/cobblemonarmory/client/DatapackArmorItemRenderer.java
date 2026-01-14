package net.joltthewolf.cobblemonarmory.client;

import net.joltthewolf.cobblemonarmory.item.DatapackArmorItem;
import net.minecraft.world.item.ItemStack;
import software.bernie.geckolib.renderer.GeoItemRenderer;

public class DatapackArmorItemRenderer extends GeoItemRenderer<DatapackArmorItem> {

    private final DatapackArmorItemModel model;

    public DatapackArmorItemRenderer() {
        super(new DatapackArmorItemModel());
        this.model = (DatapackArmorItemModel) this.getGeoModel();
    }

    public void setCurrentStack(ItemStack stack) {
        model.setCurrentStack(stack);
    }
}

