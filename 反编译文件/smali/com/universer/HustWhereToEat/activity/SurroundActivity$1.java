package com.universer.HustWhereToEat.activity; class SurroundActivity$1 {/*

.class Lcom/universer/HustWhereToEat/activity/SurroundActivity$1;
.super Ljava/lang/Object;
.source "SurroundActivity.java"

# interfaces
.implements Lcom/baidu/location/BDLocationListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/universer/HustWhereToEat/activity/SurroundActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/universer/HustWhereToEat/activity/SurroundActivity;


# direct methods
.method constructor <init>(Lcom/universer/HustWhereToEat/activity/SurroundActivity;)V
    .locals 0
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity$1;->this$0:Lcom/universer/HustWhereToEat/activity/SurroundActivity;

    .line 45
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method private animateToLoc(Lcom/baidu/location/BDLocation;)V
    .locals 13
    .parameter "location"

    .prologue
    const-wide v11, 0x412e848000000000L

    .line 66
    #v11=(LongLo);v12=(LongHi);
    invoke-virtual {p1}, Lcom/baidu/location/BDLocation;->getLatitude()D

    move-result-wide v1

    .line 67
    .local v1, mlatitude:D
    #v1=(DoubleLo);v2=(DoubleHi);
    invoke-virtual {p1}, Lcom/baidu/location/BDLocation;->getLongitude()D

    move-result-wide v3

    .line 68
    .local v3, mlongitude:D
    #v3=(DoubleLo);v4=(DoubleHi);
    iget-object v6, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity$1;->this$0:Lcom/universer/HustWhereToEat/activity/SurroundActivity;

    #v6=(Reference);
    invoke-static {v6}, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->access$2(Lcom/universer/HustWhereToEat/activity/SurroundActivity;)Lcom/baidu/mapapi/map/LocationData;

    move-result-object v6

    invoke-virtual {p1}, Lcom/baidu/location/BDLocation;->getLatitude()D

    move-result-wide v7

    #v7=(DoubleLo);v8=(DoubleHi);
    iput-wide v7, v6, Lcom/baidu/mapapi/map/LocationData;->latitude:D

    .line 69
    iget-object v6, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity$1;->this$0:Lcom/universer/HustWhereToEat/activity/SurroundActivity;

    invoke-static {v6}, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->access$2(Lcom/universer/HustWhereToEat/activity/SurroundActivity;)Lcom/baidu/mapapi/map/LocationData;

    move-result-object v6

    invoke-virtual {p1}, Lcom/baidu/location/BDLocation;->getLongitude()D

    move-result-wide v7

    iput-wide v7, v6, Lcom/baidu/mapapi/map/LocationData;->longitude:D

    .line 70
    iget-object v6, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity$1;->this$0:Lcom/universer/HustWhereToEat/activity/SurroundActivity;

    invoke-static {v6}, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->access$2(Lcom/universer/HustWhereToEat/activity/SurroundActivity;)Lcom/baidu/mapapi/map/LocationData;

    move-result-object v6

    invoke-virtual {p1}, Lcom/baidu/location/BDLocation;->getDerect()F

    move-result v7

    #v7=(Float);
    iput v7, v6, Lcom/baidu/mapapi/map/LocationData;->direction:F

    .line 71
    const-string v6, "LOC"

    new-instance v7, Ljava/lang/StringBuilder;

    #v7=(UninitRef);
    iget-object v8, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity$1;->this$0:Lcom/universer/HustWhereToEat/activity/SurroundActivity;

    #v8=(Reference);
    invoke-static {v8}, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->access$2(Lcom/universer/HustWhereToEat/activity/SurroundActivity;)Lcom/baidu/mapapi/map/LocationData;

    move-result-object v8

    iget-wide v8, v8, Lcom/baidu/mapapi/map/LocationData;->latitude:D

    #v8=(DoubleLo);v9=(DoubleHi);
    invoke-static {v8, v9}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v8

    #v8=(Reference);
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v7=(Reference);
    const-string v8, " "

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    iget-object v8, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity$1;->this$0:Lcom/universer/HustWhereToEat/activity/SurroundActivity;

    invoke-static {v8}, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->access$2(Lcom/universer/HustWhereToEat/activity/SurroundActivity;)Lcom/baidu/mapapi/map/LocationData;

    move-result-object v8

    iget-wide v8, v8, Lcom/baidu/mapapi/map/LocationData;->longitude:D

    #v8=(DoubleLo);
    invoke-virtual {v7, v8, v9}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 72
    const/4 v0, 0x0

    .local v0, i:I
    :goto_0
    #v0=(Integer);v5=(Conflicted);v8=(Conflicted);v9=(Conflicted);
    iget-object v6, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity$1;->this$0:Lcom/universer/HustWhereToEat/activity/SurroundActivity;

    invoke-static {v6}, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->access$3(Lcom/universer/HustWhereToEat/activity/SurroundActivity;)Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    #v6=(Integer);
    if-lt v0, v6, :cond_0

    .line 77
    iget-object v6, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity$1;->this$0:Lcom/universer/HustWhereToEat/activity/SurroundActivity;

    #v6=(Reference);
    invoke-static {v6}, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->access$5(Lcom/universer/HustWhereToEat/activity/SurroundActivity;)Lcom/universer/HustWhereToEat/activity/SurroundActivity$SurroundOverlay;

    move-result-object v6

    iget-object v7, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity$1;->this$0:Lcom/universer/HustWhereToEat/activity/SurroundActivity;

    invoke-static {v7}, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->access$4(Lcom/universer/HustWhereToEat/activity/SurroundActivity;)Ljava/util/List;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/universer/HustWhereToEat/activity/SurroundActivity$SurroundOverlay;->addItem(Ljava/util/List;)V

    .line 80
    iget-object v6, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity$1;->this$0:Lcom/universer/HustWhereToEat/activity/SurroundActivity;

    invoke-static {v6}, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->access$6(Lcom/universer/HustWhereToEat/activity/SurroundActivity;)Lcom/baidu/mapapi/map/MapView;

    move-result-object v6

    invoke-virtual {v6}, Lcom/baidu/mapapi/map/MapView;->refresh()V

    .line 81
    iget-object v6, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity$1;->this$0:Lcom/universer/HustWhereToEat/activity/SurroundActivity;

    invoke-static {v6}, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->access$6(Lcom/universer/HustWhereToEat/activity/SurroundActivity;)Lcom/baidu/mapapi/map/MapView;

    move-result-object v6

    invoke-virtual {v6}, Lcom/baidu/mapapi/map/MapView;->getController()Lcom/baidu/mapapi/map/MapController;

    move-result-object v6

    .line 82
    new-instance v7, Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    #v7=(UninitRef);
    iget-object v8, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity$1;->this$0:Lcom/universer/HustWhereToEat/activity/SurroundActivity;

    #v8=(Reference);
    invoke-static {v8}, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->access$2(Lcom/universer/HustWhereToEat/activity/SurroundActivity;)Lcom/baidu/mapapi/map/LocationData;

    move-result-object v8

    iget-wide v8, v8, Lcom/baidu/mapapi/map/LocationData;->latitude:D

    #v8=(DoubleLo);v9=(DoubleHi);
    mul-double/2addr v8, v11

    double-to-int v8, v8

    .line 83
    #v8=(Integer);
    iget-object v9, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity$1;->this$0:Lcom/universer/HustWhereToEat/activity/SurroundActivity;

    #v9=(Reference);
    invoke-static {v9}, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->access$2(Lcom/universer/HustWhereToEat/activity/SurroundActivity;)Lcom/baidu/mapapi/map/LocationData;

    move-result-object v9

    iget-wide v9, v9, Lcom/baidu/mapapi/map/LocationData;->longitude:D

    #v9=(DoubleLo);v10=(DoubleHi);
    mul-double/2addr v9, v11

    double-to-int v9, v9

    .line 82
    #v9=(Integer);
    invoke-direct {v7, v8, v9}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;-><init>(II)V

    .line 81
    #v7=(Reference);
    invoke-virtual {v6, v7}, Lcom/baidu/mapapi/map/MapController;->animateTo(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)V

    .line 84
    return-void

    .line 73
    :cond_0
    #v6=(Integer);v8=(Conflicted);v9=(Conflicted);v10=(Uninit);
    new-instance v5, Lcom/baidu/mapapi/map/OverlayItem;

    #v5=(UninitRef);
    iget-object v6, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity$1;->this$0:Lcom/universer/HustWhereToEat/activity/SurroundActivity;

    #v6=(Reference);
    invoke-static {v6}, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->access$3(Lcom/universer/HustWhereToEat/activity/SurroundActivity;)Ljava/util/List;

    move-result-object v6

    .line 74
    invoke-interface {v6, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/universer/HustWhereToEat/model/Restaurant;

    invoke-virtual {v6}, Lcom/universer/HustWhereToEat/model/Restaurant;->getPoint()Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    #v7=(UninitRef);
    const-string v8, "item"

    #v8=(Reference);
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v7=(Reference);
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    #v8=(UninitRef);
    const-string v9, "item"

    #v9=(Reference);
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    #v8=(Reference);
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    .line 73
    invoke-direct {v5, v6, v7, v8}, Lcom/baidu/mapapi/map/OverlayItem;-><init>(Lcom/baidu/platform/comapi/basestruct/GeoPoint;Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    .local v5, surroundItem:Lcom/baidu/mapapi/map/OverlayItem;
    #v5=(Reference);
    iget-object v6, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity$1;->this$0:Lcom/universer/HustWhereToEat/activity/SurroundActivity;

    invoke-static {v6}, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->access$4(Lcom/universer/HustWhereToEat/activity/SurroundActivity;)Ljava/util/List;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 72
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_0
.end method


# virtual methods
.method public onReceiveLocation(Lcom/baidu/location/BDLocation;)V
    .locals 2
    .parameter "location"

    .prologue
    .line 54
    if-nez p1, :cond_0

    .line 55
    const-string v0, "LOC NULL"

    #v0=(Reference);
    const-string v1, "noloc"

    #v1=(Reference);
    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 63
    :goto_0
    return-void

    .line 58
    :cond_0
    #v0=(Uninit);v1=(Uninit);
    const-string v0, "LOC suc"

    #v0=(Reference);
    const-string v1, "haveloc"

    #v1=(Reference);
    invoke-static {v0, v1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 59
    iget-object v0, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity$1;->this$0:Lcom/universer/HustWhereToEat/activity/SurroundActivity;

    invoke-static {v0, p1}, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->access$0(Lcom/universer/HustWhereToEat/activity/SurroundActivity;Lcom/baidu/location/BDLocation;)V

    .line 60
    invoke-direct {p0, p1}, Lcom/universer/HustWhereToEat/activity/SurroundActivity$1;->animateToLoc(Lcom/baidu/location/BDLocation;)V

    .line 61
    iget-object v0, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity$1;->this$0:Lcom/universer/HustWhereToEat/activity/SurroundActivity;

    invoke-static {v0}, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->access$1(Lcom/universer/HustWhereToEat/activity/SurroundActivity;)Lcom/baidu/location/LocationClient;

    move-result-object v0

    invoke-virtual {v0}, Lcom/baidu/location/LocationClient;->stop()V

    goto :goto_0
.end method

.method public onReceivePoi(Lcom/baidu/location/BDLocation;)V
    .locals 0
    .parameter "location"

    .prologue
    .line 50
    return-void
.end method

*/}
