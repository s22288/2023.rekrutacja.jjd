import java.util.List;
import java.util.Optional;

public class Wall implements Structure ,CompositeBlock{
    private List<Block> blocks ;

    @Override
    public String getColor() {
        return "";
    }

    @Override
    public String getMaterial() {
        return "";
    }

    @Override
    public List<Block> getBlocks() {
        return blocks;
    }


    public Wall(List<Block> blocks) {
        this.blocks = blocks;
    }

    @Override
    public Optional<Block> findBlockByColor(String color) {

        return getBlocks().stream().filter(m -> m.getColor().equals(color)).findAny();
    }

    @Override
    public List<Block> findBlocksByMaterial(String material) {
        return getBlocks().stream().filter( m-> m.getMaterial().equals(material)).toList();
    }

    @Override
    public int count() {

        return getBlocks().size();
    }



}