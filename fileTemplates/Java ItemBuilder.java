#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};

#end

import com.tny.game.base.item.ItemBuilder;

#parse("File Header.java")
class ${NAME} extends ItemBuilder<${ITEM_NAME}, ${ITEM_NAME}Model, ${NAME}> {

    private ${NAME}() {
    }

    public static ${NAME} newBuilder() {
        return new ${NAME}();
    }

    @Override
    protected ${ITEM_NAME} createItem() {
        return new ${ITEM_NAME}();
    }
    
    @Override
    protected void afterModelItem(${ITEM_NAME} item) {
        super.afterModelItem(item);
    }

}