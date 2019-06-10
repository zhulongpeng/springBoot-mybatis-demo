package com.zlp.springbootmybatisdemo.base.constant;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName: Constant
 * @Description: 常量类
 */
public class Constant {

    public static class Status {

        public static final int locked = -1;// 锁定状态

        public static final int invalid = 0;// 无效/非正常状态

        public static final int valid = 1;// 有效/正常状态

        public static final int not_show = 2;// 不显示

        public static final int delete = 3;// 删除

        public static final List<Integer> validList = Arrays.asList(valid, not_show);
    }


    public static final class Code {

        public static final int success = 1;

        public static final int error = 0;
    }


    public static final class Message {

        public static final String success = "Success!";

        public static final String error = "System error!";

        public static final String object_not_find = "No Records Matched！";
    }


    public static class SessionKey {

        /**
         * @Fields currentUser : session中存放和获取当前用户信息的key
         */
        public static final String currentUser = "currentUser";

        /**
         * @Fields currentMenuData : session中存放和获取当前用户菜单的key
         */
        public static final String currentMenuData = "currentMenuData";

        /**
         * @Fields currentMessageList : 发消息的队列
         */
        public static final String currentMessageList = "messageUserList";
    }


    public static final class MarketType {

        public static final int source = 1;

        public static final int destination = 2;
    }



    public static class RoleStatus {
        /**
         * @Fields status_normal : 正常
         */
        public static final int status_normal = 1;
        /**
         * @Fields status_delete : 已删除
         */
        public static final int status_delete = 0;
    }


    public static class ResourcesStatus {
        /**
         * @Fields status_normal : 正常
         */
        public static final int status_normal = 1;
        /**
         * @Fields status_delete : 已删除
         */
        public static final int status_delete = 0;
    }


    public static class OfferStatus {
        /**
         * @Fields draft : 草稿
         */
        public static final int draft = 0;

        /**
         * @Fields scheduled : 计划发布
         */
        public static final int scheduled = 1;

        /**
         * @Fields published : 已发布
         */
        public static final int published = 2;

        /**
         * @Fields expired : 已过期
         */
        public static final int expired = 3;

        /**
         * @Fields hidden : 隐藏（下线）
         */
        public static final int hidden = 4;

        /**
         * @Fields show : 不展示
         */
        public static final int no_show = 5;

        public static final List<Integer> statusList = Arrays.asList(draft, scheduled, published, expired, hidden);
    }

    public static class BenefitStatus {
        /**
         * @Fields draft : 草稿
         */
        public static final int draft = 0;

        /**
         * @Fields scheduled : 计划发布
         */
        public static final int scheduled = 1;

        /**
         * @Fields published : 已发布
         */
        public static final int published = 2;

        /**
         * @Fields expired : 已过期
         */
        public static final int expired = 3;

        /**
         * @Fields hidden : 隐藏（下线）
         */
        public static final int hidden = 4;

        /**
         * @Fields show : 不展示
         */
        public static final int no_show = 5;

        public static final List<Integer> statusList = Arrays.asList(draft, scheduled, published, expired, hidden);
    }

    public static class ResourceShowType {
        /**
         * @Fields page_level : 页面级资源
         */
        public static final int page_level = 0;
        /**
         * @Fields menu_level : 菜单级资源
         */
        public static final int menu_level = 2;
        /**
         * @Fields button_level : 按钮级资源
         */
        public static final int button_level = 1;
    }

    public static class MarketLevel {
        /**
         * @Fields all_level : 所有范围
         */
        public static final int ALL = 1;
        /**
         * @Fields all_level : 所有范围
         */
        public static final String ALL_STR = "GLB";
        /**
         * @Fields all_level : 所有范围
         */
        public static final String ALL_VALUE = "Global";
        /**
         * @Fields region_level : 区域范围
         */
        public static final int REGION_LEVEL = 2;
        /**
         * @Fields country_level : 国家范围
         */
        public static final int COUNTRY_LEVEL = 3;
    }

    public static class MastercardTypeLevel {
        /**
         * @Fields all_level : 所有范围
         */
        public static final int ALL = 1;
        /**
         * @Fields all_level : 所有范围
         */
        public static final String ALL_STR = "ALL";
        /**
         * @Fields type_level : 区域范围
         */
        public static final int TYPE_LEVEL = 2;
        /**
         * @Fields product_level : 国家范围
         */
        public static final int PRODUCT_LEVEL = 3;
    }

    public static class SplitType {
        /**
         * @Fields 分号分割
         */
        public static final String FH = ";";
        /**
         * @Fields 逗号分割
         */
        public static final String DH = ",";
    }

    public static class OfferMaster {
        /**
         * 是主版本
         */
        public static final int YES = 1;
        /**
         * 不是主版本
         */
        public static final int NO = 0;
    }

    public static class BenefitMaster {
        /**
         * 是主版本
         */
        public static final int YES = 1;
        /**
         * 不是主版本
         */
        public static final int NO = 0;
    }

    public static final class Exclusivity {

        public static final int YES = 1;

        public static final int NO = 0;

    }

    public enum WeightEnum {
        NOT(0, "非置顶"),
        HAVE(100, "置顶");

        private Integer code;
        private String value;

        WeightEnum(Integer code, String value) {
            this.code = code;
            this.value = value;
        }

        private static final Map<Integer, WeightEnum> map = new HashMap<>();

        static {
            for (WeightEnum weightEnum : WeightEnum.values()) {
                map.put(weightEnum.code, weightEnum);
            }
        }

        public static Integer getByCode(Integer code) {
            WeightEnum weightEnum = map.get(code);
            return weightEnum == null ? null : weightEnum.code;
        }

    }
}
