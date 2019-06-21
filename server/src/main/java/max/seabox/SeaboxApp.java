package max.seabox;

import com.blade.Blade;

/**
 * 启动函数
 */
public class SeaboxApp {

    public static void main(String[] args) {
        Blade.of().start(SeaboxApp.class, args);
    }

}
