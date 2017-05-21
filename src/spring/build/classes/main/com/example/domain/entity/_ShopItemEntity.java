package com.example.domain.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "2.12.0" }, date = "2017-05-21T16:17:55.575+0900")
public final class _ShopItemEntity extends org.seasar.doma.jdbc.entity.AbstractEntityType<com.example.domain.entity.ShopItemEntity> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.12.0");
    }

    private static final _ShopItemEntity __singleton = new _ShopItemEntity();

    private final org.seasar.doma.jdbc.entity.NamingType __namingType = null;

    /** the shopId */
    public final org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, com.example.domain.entity.ShopItemEntity, java.lang.Integer, Object> $shopId = new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<>(com.example.domain.entity.ShopItemEntity.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "shopId", "", __namingType, false);

    /** the shopName */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, com.example.domain.entity.ShopItemEntity, java.lang.String, Object> $shopName = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.example.domain.entity.ShopItemEntity.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "shopName", "", __namingType, true, true, false);

    /** the itemId */
    public final org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, com.example.domain.entity.ShopItemEntity, java.lang.Integer, Object> $itemId = new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<>(com.example.domain.entity.ShopItemEntity.class, java.lang.Integer.class, java.lang.Integer.class, () -> new org.seasar.doma.wrapper.IntegerWrapper(), null, null, "itemId", "", __namingType, false);

    /** the itemName */
    public final org.seasar.doma.jdbc.entity.DefaultPropertyType<java.lang.Object, com.example.domain.entity.ShopItemEntity, java.lang.String, Object> $itemName = new org.seasar.doma.jdbc.entity.DefaultPropertyType<>(com.example.domain.entity.ShopItemEntity.class, java.lang.String.class, java.lang.String.class, () -> new org.seasar.doma.wrapper.StringWrapper(), null, null, "itemName", "", __namingType, true, true, false);

    private final java.util.function.Supplier<org.seasar.doma.jdbc.entity.NullEntityListener<com.example.domain.entity.ShopItemEntity>> __listenerSupplier;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final boolean __isQuoteRequired;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.domain.entity.ShopItemEntity, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.domain.entity.ShopItemEntity, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.domain.entity.ShopItemEntity, ?>> __entityPropertyTypeMap;

    private _ShopItemEntity() {
        __listenerSupplier = () -> ListenerHolder.listener;
        __immutable = false;
        __name = "ShopItemEntity";
        __catalogName = "";
        __schemaName = "";
        __tableName = "";
        __isQuoteRequired = false;
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.domain.entity.ShopItemEntity, ?>> __idList = new java.util.ArrayList<>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.domain.entity.ShopItemEntity, ?>> __list = new java.util.ArrayList<>(4);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.domain.entity.ShopItemEntity, ?>> __map = new java.util.HashMap<>(4);
        __idList.add($shopId);
        __list.add($shopId);
        __map.put("shopId", $shopId);
        __list.add($shopName);
        __map.put("shopName", $shopName);
        __idList.add($itemId);
        __list.add($itemId);
        __map.put("itemId", $itemId);
        __list.add($itemName);
        __map.put("itemName", $itemName);
        __idPropertyTypes = java.util.Collections.unmodifiableList(__idList);
        __entityPropertyTypes = java.util.Collections.unmodifiableList(__list);
        __entityPropertyTypeMap = java.util.Collections.unmodifiableMap(__map);
    }

    @Override
    public org.seasar.doma.jdbc.entity.NamingType getNamingType() {
        return __namingType;
    }

    @Override
    public boolean isImmutable() {
        return __immutable;
    }

    @Override
    public String getName() {
        return __name;
    }

    @Override
    public String getCatalogName() {
        return __catalogName;
    }

    @Override
    public String getSchemaName() {
        return __schemaName;
    }

    @Override
    public String getTableName() {
        return getTableName(org.seasar.doma.jdbc.Naming.DEFAULT::apply);
    }

    @Override
    public String getTableName(java.util.function.BiFunction<org.seasar.doma.jdbc.entity.NamingType, String, String> namingFunction) {
        if (__tableName.isEmpty()) {
            return namingFunction.apply(__namingType, __name);
        }
        return __tableName;
    }

    @Override
    public boolean isQuoteRequired() {
        return __isQuoteRequired;
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preInsert(com.example.domain.entity.ShopItemEntity entity, org.seasar.doma.jdbc.entity.PreInsertContext<com.example.domain.entity.ShopItemEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preUpdate(com.example.domain.entity.ShopItemEntity entity, org.seasar.doma.jdbc.entity.PreUpdateContext<com.example.domain.entity.ShopItemEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void preDelete(com.example.domain.entity.ShopItemEntity entity, org.seasar.doma.jdbc.entity.PreDeleteContext<com.example.domain.entity.ShopItemEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.preDelete(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postInsert(com.example.domain.entity.ShopItemEntity entity, org.seasar.doma.jdbc.entity.PostInsertContext<com.example.domain.entity.ShopItemEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postInsert(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postUpdate(com.example.domain.entity.ShopItemEntity entity, org.seasar.doma.jdbc.entity.PostUpdateContext<com.example.domain.entity.ShopItemEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postUpdate(entity, context);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    @Override
    public void postDelete(com.example.domain.entity.ShopItemEntity entity, org.seasar.doma.jdbc.entity.PostDeleteContext<com.example.domain.entity.ShopItemEntity> context) {
        Class __listenerClass = org.seasar.doma.jdbc.entity.NullEntityListener.class;
        org.seasar.doma.jdbc.entity.NullEntityListener __listener = context.getConfig().getEntityListenerProvider().get(__listenerClass, __listenerSupplier);
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.domain.entity.ShopItemEntity, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.domain.entity.ShopItemEntity, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.example.domain.entity.ShopItemEntity, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.example.domain.entity.ShopItemEntity, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, com.example.domain.entity.ShopItemEntity, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public com.example.domain.entity.ShopItemEntity newEntity(java.util.Map<String, org.seasar.doma.jdbc.entity.Property<com.example.domain.entity.ShopItemEntity, ?>> __args) {
        com.example.domain.entity.ShopItemEntity entity = new com.example.domain.entity.ShopItemEntity();
        if (__args.get("shopId") != null) __args.get("shopId").save(entity);
        if (__args.get("shopName") != null) __args.get("shopName").save(entity);
        if (__args.get("itemId") != null) __args.get("itemId").save(entity);
        if (__args.get("itemName") != null) __args.get("itemName").save(entity);
        return entity;
    }

    @Override
    public Class<com.example.domain.entity.ShopItemEntity> getEntityClass() {
        return com.example.domain.entity.ShopItemEntity.class;
    }

    @Override
    public com.example.domain.entity.ShopItemEntity getOriginalStates(com.example.domain.entity.ShopItemEntity __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(com.example.domain.entity.ShopItemEntity __entity) {
    }

    /**
     * @return the singleton
     */
    public static _ShopItemEntity getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _ShopItemEntity newInstance() {
        return new _ShopItemEntity();
    }

    private static class ListenerHolder {
        private static org.seasar.doma.jdbc.entity.NullEntityListener<com.example.domain.entity.ShopItemEntity> listener = new org.seasar.doma.jdbc.entity.NullEntityListener<>();
    }

}
