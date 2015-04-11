package com.baidu.mapapi.map; class TextItem {/*

.class public Lcom/baidu/mapapi/map/TextItem;
.super Ljava/lang/Object;


# static fields
.field public static final ALIGN_BOTTOM:I = 0x2

.field public static final ALIGN_CENTER:I = 0x0

.field public static final ALIGN_TOP:I = 0x1


# instance fields
.field private a:Ljava/lang/String;

.field public align:I

.field public bgColor:Lcom/baidu/mapapi/map/Symbol$Color;

.field public fontColor:Lcom/baidu/mapapi/map/Symbol$Color;

.field public fontSize:I

.field public pt:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

.field public text:Ljava/lang/String;

.field public typeface:Landroid/graphics/Typeface;


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v1, 0x0

    #v1=(Null);
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    const/16 v0, 0xc

    #v0=(PosByte);
    iput v0, p0, Lcom/baidu/mapapi/map/TextItem;->fontSize:I

    iput v1, p0, Lcom/baidu/mapapi/map/TextItem;->align:I

    iput v1, p0, Lcom/baidu/mapapi/map/TextItem;->fontSize:I

    return-void
.end method


# virtual methods
.method a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/TextItem;->a:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method a(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/mapapi/map/TextItem;->a:Ljava/lang/String;

    return-void
.end method

*/}
