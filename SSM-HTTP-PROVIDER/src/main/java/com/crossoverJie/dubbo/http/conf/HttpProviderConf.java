package com.crossoverJie.dubbo.http.conf;


import java.util.List;

/**
 *                    _ooOoo_
 *                   o8888888o
 *                   88" . "88
 *                   (| -_- |)
 *                    O\ = /O
 *                ____/`---'\____
 *              .   ' \\| |// `.
 *               / \\||| : |||// \
 *             / _||||| -:- |||||- \
 *               | | \\\ - /// | |
 *             | \_| ''\---/'' | |
 *              \ .-\__ `-` ___/-. /
 *           ___`. .' /--.--\ `. . __
 *        ."" '< `.___\_<|>_/___.' >'"".
 *       | | : `- \`.;`\ _ /`;.`/ - ` : | |
 *         \ \ `-. \_ __\ /__ _/ .-` / /
 * ======`-.____`-.___\_____/___.-`____.-'======
 *                    `=---='
 *
 * .............................................
 *          佛祖保佑             永无BUG
 * @author crossoverJie
 * Date: 2017/4/28 上午10:51
 * @since JDK 1.7
 */
public class HttpProviderConf {

    /**
     * 提供http访问的包
     */
    private List<String> usePackage ;

    public List<String> getUsePackage() {
        return usePackage;
    }

    public void setUsePackage(List<String> usePackage) {
        this.usePackage = usePackage;
    }
}
