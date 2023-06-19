package problem2;

public class NonEmptySet extends AbstractSet {


    private Integer headElementValue;
    private Set restOfSet;

    public NonEmptySet(Integer headElementValue, Set restOfSet) {
        this.headElementValue = headElementValue;
        this.restOfSet = restOfSet;
    }

    public NonEmptySet(Integer headElementValue){
        this.headElementValue = headElementValue;
        this.restOfSet = this.emptySet();
    }

    public Integer getHeadElementValue() {
        return headElementValue;
    }

    public Set getRestOfSet() {
        return restOfSet;
    }

    @Override
    public Set emptySet() {
        return null;
    }

    @Override
    public Boolean isEmpty() {
        return Boolean.FALSE;
    }

    @Override
    public Set add(Integer element) {
        if (this.contain(element)) {
            return this;
        }else return new NonEmptySet(element, this);
    }

    @Override
    public Boolean contain(Integer element) {
        if(this.headElementValue.equals(element)){
            return Boolean.TRUE;
        }else return this.restOfSet.contain(element);
    }

    @Override
    public Set remove(Integer element) {
        if (!this.contain(element)) {
            return this;
        } else if (this.headElementValue.equals(element)) {
            return this.restOfSet;
        }else return new NonEmptySet(this.headElementValue, this.restOfSet.remove(element));
    }

    @Override
    public Integer size() {
        return 1 + this.restOfSet.size();
    }
}
