package problem2;

public class EmptySet extends AbstractSet{


    protected EmptySet(){

    }
    @Override
    public Set emptySet() {
        return new EmptySet();
    }

    @Override
    public Boolean isEmpty() {
        return Boolean.TRUE;
    }

    @Override
    public Set add(Integer element) {
        return new NonEmptySet(element);
    }

    @Override
    public Boolean contain(Integer element) {
        return Boolean.FALSE;
    }

    @Override
    public Set remove(Integer element) {
        return this;
    }

    @Override
    public Integer size() {
        return 0;
    }
}
