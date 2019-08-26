#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};
#end

import com.tny.game.suite.base.GameCacheManager;

#parse("File Header.java")
@Component
public class ${NAME} extends GameCacheManager<${ITEM_NAME}> {

    protected ${NAME}() {
        super(${ITEM_NAME}.class);
    }

}
