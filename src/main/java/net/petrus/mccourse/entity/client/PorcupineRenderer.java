package net.petrus.mccourse.entity.client;

import com.google.common.collect.Maps;
import net.petrus.mccourse.MCCourseMod;
import net.petrus.mccourse.entity.custom.PorcupineEntity;
import net.petrus.mccourse.entity.layer.ModModelLayers;
import net.petrus.mccourse.entity.variant.PorcupineVariant;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.Map;

public class PorcupineRenderer extends MobEntityRenderer<PorcupineEntity, PorcupineModel<PorcupineEntity>> {
    private static final Map<PorcupineVariant, Identifier> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(PorcupineVariant.class), map -> {
                map.put(PorcupineVariant.DEFAULT,
                        new Identifier(MCCourseMod.MOD_ID, "textures/entity/porcupine.png"));
                map.put(PorcupineVariant.GREY,
                        new Identifier(MCCourseMod.MOD_ID, "textures/entity/porcupine_grey.png"));
            });

    public PorcupineRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new PorcupineModel<>(ctx.getPart(ModModelLayers.PORCUPINE)), 0.6f);
    }

    @Override
    public Identifier getTexture(PorcupineEntity entity) {
        return LOCATION_BY_VARIANT.get(entity.getVariant());
    }

    @Override
    public void render(PorcupineEntity livingEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
        if(livingEntity.isBaby()) {
            matrixStack.scale(0.5f, 0.5f, 0.5f);
        } else {
            matrixStack.scale(1f, 1f, 1f);
        }

        super.render(livingEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
