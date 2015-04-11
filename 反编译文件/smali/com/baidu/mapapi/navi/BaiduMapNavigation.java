package com.baidu.mapapi.navi; class BaiduMapNavigation {/*

.class public Lcom/baidu/mapapi/navi/BaiduMapNavigation;
.super Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method public static GetLatestBaiduMapApp(Landroid/app/Activity;)V
    .locals 2

    new-instance v0, Landroid/content/Intent;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    #v0=(Reference);
    const-string v1, "android.intent.action.VIEW"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "http://mo.baidu.com/map/"

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    invoke-virtual {p0, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method private static a(Landroid/content/Context;)I
    .locals 4

    const/4 v0, 0x0

    #v0=(Null);
    const-string v1, ""

    :try_start_0
    #v1=(Reference);
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const-string v2, "com.baidu.BaiduMap"

    #v2=(Reference);
    const/4 v3, 0x0

    #v3=(Null);
    invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v1

    iget-object v1, v1, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    #v2=(Integer);
    if-gtz v2, :cond_1

    :cond_0
    :goto_0
    #v0=(Integer);v2=(Conflicted);v3=(Conflicted);
    return v0

    :cond_1
    #v0=(Null);v2=(Integer);v3=(Null);
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    const-string v2, "."

    #v2=(Reference);
    const-string v3, ""

    #v3=(Reference);
    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    #v0=(Integer);
    goto :goto_0

    :catch_0
    #v0=(Null);v2=(Conflicted);v3=(Conflicted);
    move-exception v1

    goto :goto_0
.end method

.method private static a(Lcom/baidu/mapapi/navi/NaviPara;)Ljava/lang/String;
    .locals 10

    const/4 v9, 0x2

    #v9=(PosByte);
    const/4 v8, 0x1

    #v8=(One);
    const/4 v7, 0x0

    #v7=(Null);
    const-wide v5, 0x3eb0c6f7a0b5ed8dL

    #v5=(LongLo);v6=(LongHi);
    new-instance v0, Ljava/lang/StringBuffer;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V

    #v0=(Reference);
    const-string v1, "intent://map/direction?"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v1, "origin="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v1, p0, Lcom/baidu/mapapi/navi/NaviPara;->startName:Ljava/lang/String;

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #v1=(Reference);
    const-string v2, "name:"

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/baidu/mapapi/navi/NaviPara;->startName:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "|"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :cond_0
    #v2=(Conflicted);
    const-string v1, "latlng:%f,%f"

    new-array v2, v9, [Ljava/lang/Object;

    #v2=(Reference);
    iget-object v3, p0, Lcom/baidu/mapapi/navi/NaviPara;->startPoint:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    #v3=(Reference);
    invoke-virtual {v3}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLatitudeE6()I

    move-result v3

    #v3=(Integer);
    int-to-double v3, v3

    #v3=(DoubleLo);v4=(DoubleHi);
    mul-double/2addr v3, v5

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    #v3=(Reference);
    aput-object v3, v2, v7

    iget-object v3, p0, Lcom/baidu/mapapi/navi/NaviPara;->startPoint:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    invoke-virtual {v3}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLongitudeE6()I

    move-result v3

    #v3=(Integer);
    int-to-double v3, v3

    #v3=(DoubleLo);
    mul-double/2addr v3, v5

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    #v3=(Reference);
    aput-object v3, v2, v8

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v1, "&destination="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    iget-object v1, p0, Lcom/baidu/mapapi/navi/NaviPara;->endName:Ljava/lang/String;

    if-eqz v1, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #v1=(Reference);
    const-string v2, "name:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/baidu/mapapi/navi/NaviPara;->endName:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "|"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :cond_1
    const-string v1, "latlng:%f,%f"

    new-array v2, v9, [Ljava/lang/Object;

    iget-object v3, p0, Lcom/baidu/mapapi/navi/NaviPara;->endPoint:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    invoke-virtual {v3}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLatitudeE6()I

    move-result v3

    #v3=(Integer);
    int-to-double v3, v3

    #v3=(DoubleLo);
    mul-double/2addr v3, v5

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    #v3=(Reference);
    aput-object v3, v2, v7

    iget-object v3, p0, Lcom/baidu/mapapi/navi/NaviPara;->endPoint:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    invoke-virtual {v3}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLongitudeE6()I

    move-result v3

    #v3=(Integer);
    int-to-double v3, v3

    #v3=(DoubleLo);
    mul-double/2addr v3, v5

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    #v3=(Reference);
    aput-object v3, v2, v8

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v1, "&coord_type=bd09ll"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v1, "&mode=navigation"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v1, "#Intent;scheme=bdapp;"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v1, "package=com.baidu.BaiduMap;"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v1, "end"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static openBaiduMapNavi(Lcom/baidu/mapapi/navi/NaviPara;Landroid/app/Activity;)V
    .locals 2

    iget-object v0, p0, Lcom/baidu/mapapi/navi/NaviPara;->endPoint:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    #v0=(Reference);
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/mapapi/navi/NaviPara;->startPoint:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    if-nez v0, :cond_1

    :cond_0
    new-instance v0, Lcom/baidu/mapapi/navi/IllegalNaviArgumentException;

    #v0=(UninitRef);
    const-string v1, "start point or end point can not be null."

    #v1=(Reference);
    invoke-direct {v0, v1}, Lcom/baidu/mapapi/navi/IllegalNaviArgumentException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0

    :cond_1
    #v1=(Uninit);
    invoke-static {p1}, Lcom/baidu/mapapi/navi/BaiduMapNavigation;->a(Landroid/content/Context;)I

    move-result v0

    #v0=(Integer);
    if-nez v0, :cond_2

    new-instance v0, Lcom/baidu/mapapi/navi/BaiduMapAppNotSupportNaviException;

    #v0=(UninitRef);
    const-string v1, "BaiduMap app is not installed"

    #v1=(Reference);
    invoke-direct {v0, v1}, Lcom/baidu/mapapi/navi/BaiduMapAppNotSupportNaviException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0

    :cond_2
    #v0=(Integer);v1=(Uninit);
    const/16 v1, 0x1f4

    #v1=(PosShort);
    if-ge v0, v1, :cond_3

    new-instance v0, Lcom/baidu/mapapi/navi/BaiduMapAppNotSupportNaviException;

    #v0=(UninitRef);
    const-string v1, "current baidumap app version not support navigation."

    #v1=(Reference);
    invoke-direct {v0, v1}, Lcom/baidu/mapapi/navi/BaiduMapAppNotSupportNaviException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0

    :cond_3
    :try_start_0
    #v0=(Integer);v1=(PosShort);
    invoke-static {p0}, Lcom/baidu/mapapi/navi/BaiduMapNavigation;->a(Lcom/baidu/mapapi/navi/NaviPara;)Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-static {v0, v1}, Landroid/content/Intent;->parseUri(Ljava/lang/String;I)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    #v1=(PosShort);
    return-void

    :catch_0
    #v0=(Conflicted);
    move-exception v0

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/net/URISyntaxException;->printStackTrace()V

    goto :goto_0
.end method

*/}
