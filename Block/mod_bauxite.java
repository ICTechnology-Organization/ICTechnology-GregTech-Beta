package net.minecraft.src;
 
public class mod_bauxite extends BaseMod{
 
    public static Block oreBauxite;
    public int blockID;
    public String fileToOverride;
    public String textureFilePath;
 
    public mod_bauxite()
    {
    }
    public void load()
    {
    	blockID = ;
    	fileToOverride = "/terrain.png";
    	textureFilePath = "/block/bauxite.png";
　　　　
    	oreBauxite = new BlockBauxite(blockID, ModLoader.addOverride(fileToOverride, textureFilePath));
　　　　
    	oreBauxite.setHardness(3F);
　　　　
    	oreBauxite.setBlockName("oreBauxite");
　　　　
    	oreBauxite.setResistance(5F);
　　　　
    	oreBauxite.setStepSound(Block.soundStoneFootstep);
　　　　
    	oreBauxite.setLightValue(1.0F);
　　　　
    	ModLoader.registerBlock(oreBauxite);
　　　　
        ModLoader.addName(oreBauxite, "Bauxite Ore");
    }
    public String getVersion()
    {
            return "1.0.0";
    }
}
