package net.minecraft.src;
 
public class mod_apatite extends BaseMod{
 
    public static Block oreApatite;
    public int blockID;
    public String fileToOverride;
    public String textureFilePath;
 
    public mod_apatite()
    {
    }
    public void load()
    {
    	blockID = ;
    	fileToOverride = "/terrain.png";
    	textureFilePath = "/block/apatite.png";
　　　　
    	oreApatite = new BlockApatite(blockID, ModLoader.addOverride(fileToOverride, textureFilePath));
　　　　
    	oreApatite.setHardness(3F);
　　　　
    	oreApatite.setBlockName("oreApatite");
　　　　
    	oreApatite.setResistance(5F);
　　　　
    	oreApatite.setStepSound(Block.soundStoneFootstep);
　　　　
    	oreApatite.setLightValue(1.0F);
　　　　
    	ModLoader.registerBlock(oreApatite);
　　　　
        ModLoader.addName(oreApatite, "Apatite Ore");
    }
    public String getVersion()
    {
            return "1.0.0";
    }
}
