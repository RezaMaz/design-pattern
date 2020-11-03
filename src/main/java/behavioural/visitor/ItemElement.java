package behavioural.visitor;

public interface ItemElement {
    int accept(ShoppingCartVisitor visitor);
}
