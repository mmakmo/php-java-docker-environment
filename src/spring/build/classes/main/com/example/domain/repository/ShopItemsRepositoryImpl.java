package com.example.domain.repository;

/** */
@org.springframework.stereotype.Repository()
@javax.annotation.Generated(value = { "Doma", "2.12.0" }, date = "2017-05-21T16:17:55.767+0900")
public class ShopItemsRepositoryImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements com.example.domain.repository.ShopItemsRepository {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.12.0");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.getDeclaredMethod(com.example.domain.repository.ShopItemsRepository.class, "getShopItems", java.lang.Integer.class);

    /**
     * @param config the config
     */
    @org.springframework.beans.factory.annotation.Autowired()
    public ShopItemsRepositoryImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    @Override
    public java.util.List<com.example.domain.entity.ShopItemEntity> getShopItems(java.lang.Integer shopId) {
        entering("com.example.domain.repository.ShopItemsRepositoryImpl", "getShopItems", shopId);
        try {
            org.seasar.doma.jdbc.query.SqlFileSelectQuery __query = getQueryImplementors().createSqlFileSelectQuery(__method0);
            __query.setMethod(__method0);
            __query.setConfig(__config);
            __query.setSqlFilePath("META-INF/com/example/domain/repository/ShopItemsRepository/getShopItems.sql");
            __query.setEntityType(com.example.domain.entity._ShopItemEntity.getSingletonInternal());
            __query.addParameter("shopId", java.lang.Integer.class, shopId);
            __query.setCallerClassName("com.example.domain.repository.ShopItemsRepositoryImpl");
            __query.setCallerMethodName("getShopItems");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setFetchType(org.seasar.doma.FetchType.LAZY);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.setSqlLogType(org.seasar.doma.jdbc.SqlLogType.FORMATTED);
            __query.prepare();
            org.seasar.doma.jdbc.command.SelectCommand<java.util.List<com.example.domain.entity.ShopItemEntity>> __command = getCommandImplementors().createSelectCommand(__method0, __query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<com.example.domain.entity.ShopItemEntity>(com.example.domain.entity._ShopItemEntity.getSingletonInternal()));
            java.util.List<com.example.domain.entity.ShopItemEntity> __result = __command.execute();
            __query.complete();
            exiting("com.example.domain.repository.ShopItemsRepositoryImpl", "getShopItems", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.example.domain.repository.ShopItemsRepositoryImpl", "getShopItems", __e);
            throw __e;
        }
    }

}
