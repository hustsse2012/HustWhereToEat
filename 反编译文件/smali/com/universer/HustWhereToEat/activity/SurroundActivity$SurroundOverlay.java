package com.universer.HustWhereToEat.activity; class SurroundActivity$SurroundOverlay {/*

.class Lcom/universer/HustWhereToEat/activity/SurroundActivity$SurroundOverlay;
.super Lcom/baidu/mapapi/map/ItemizedOverlay;
.source "SurroundActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/universer/HustWhereToEat/activity/SurroundActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "SurroundOverlay"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/baidu/mapapi/map/ItemizedOverlay",
        "<",
        "Lcom/baidu/mapapi/map/OverlayItem;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/universer/HustWhereToEat/activity/SurroundActivity;


# direct methods
.method public constructor <init>(Lcom/universer/HustWhereToEat/activity/SurroundActivity;Landroid/graphics/drawable/Drawable;Lcom/baidu/mapapi/map/MapView;)V
    .locals 0
    .parameter
    .parameter "mark"
    .parameter "mapView"

    .prologue
    .line 277
    iput-object p1, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity$SurroundOverlay;->this$0:Lcom/universer/HustWhereToEat/activity/SurroundActivity;

    .line 278
    invoke-direct {p0, p2, p3}, Lcom/baidu/mapapi/map/ItemizedOverlay;-><init>(Landroid/graphics/drawable/Drawable;Lcom/baidu/mapapi/map/MapView;)V

    .line 279
    #p0=(Reference);
    return-void
.end method

.method static synthetic access$0(Lcom/universer/HustWhereToEat/activity/SurroundActivity$SurroundOverlay;)Lcom/universer/HustWhereToEat/activity/SurroundActivity;
    .locals 1
    .parameter

    .prologue
    .line 275
    iget-object v0, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity$SurroundOverlay;->this$0:Lcom/universer/HustWhereToEat/activity/SurroundActivity;

    #v0=(Reference);
    return-object v0
.end method


# virtual methods
.method protected onTap(I)Z
    .locals 7
    .parameter "index"

    .prologue
    const/4 v6, 0x1

    .line 284
    #v6=(One);
    iget-object v2, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity$SurroundOverlay;->this$0:Lcom/universer/HustWhereToEat/activity/SurroundActivity;

    #v2=(Reference);
    invoke-static {v2}, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->access$3(Lcom/universer/HustWhereToEat/activity/SurroundActivity;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    #v1=(Reference);
    check-cast v1, Lcom/universer/HustWhereToEat/model/Restaurant;

    .line 285
    .local v1, tempRes:Lcom/universer/HustWhereToEat/model/Restaurant;
    iget-object v2, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity$SurroundOverlay;->this$0:Lcom/universer/HustWhereToEat/activity/SurroundActivity;

    new-instance v3, Lcom/baidu/mapapi/map/PopupOverlay;

    #v3=(UninitRef);
    iget-object v4, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity$SurroundOverlay;->this$0:Lcom/universer/HustWhereToEat/activity/SurroundActivity;

    #v4=(Reference);
    invoke-static {v4}, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->access$6(Lcom/universer/HustWhereToEat/activity/SurroundActivity;)Lcom/baidu/mapapi/map/MapView;

    move-result-object v4

    new-instance v5, Lcom/universer/HustWhereToEat/activity/SurroundActivity$SurroundOverlay$1;

    #v5=(UninitRef);
    invoke-direct {v5, p0, v1}, Lcom/universer/HustWhereToEat/activity/SurroundActivity$SurroundOverlay$1;-><init>(Lcom/universer/HustWhereToEat/activity/SurroundActivity$SurroundOverlay;Lcom/universer/HustWhereToEat/model/Restaurant;)V

    #v5=(Reference);
    invoke-direct {v3, v4, v5}, Lcom/baidu/mapapi/map/PopupOverlay;-><init>(Lcom/baidu/mapapi/map/MapView;Lcom/baidu/mapapi/map/PopupClickListener;)V

    #v3=(Reference);
    invoke-static {v2, v3}, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->access$7(Lcom/universer/HustWhereToEat/activity/SurroundActivity;Lcom/baidu/mapapi/map/PopupOverlay;)V

    .line 301
    iget-object v2, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity$SurroundOverlay;->this$0:Lcom/universer/HustWhereToEat/activity/SurroundActivity;

    invoke-static {v2, p1}, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->access$8(Lcom/universer/HustWhereToEat/activity/SurroundActivity;I)V

    .line 302
    new-array v0, v6, [Landroid/graphics/Bitmap;

    .line 303
    .local v0, bmps:[Landroid/graphics/Bitmap;
    #v0=(Reference);
    const/4 v2, 0x0

    #v2=(Null);
    iget-object v3, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity$SurroundOverlay;->this$0:Lcom/universer/HustWhereToEat/activity/SurroundActivity;

    invoke-static {v3}, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->access$9(Lcom/universer/HustWhereToEat/activity/SurroundActivity;)Landroid/view/View;

    move-result-object v3

    invoke-static {v3}, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->convertViewToBitmap(Landroid/view/View;)Landroid/graphics/Bitmap;

    move-result-object v3

    aput-object v3, v0, v2

    .line 304
    iget-object v2, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity$SurroundOverlay;->this$0:Lcom/universer/HustWhereToEat/activity/SurroundActivity;

    #v2=(Reference);
    invoke-static {v2}, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->access$10(Lcom/universer/HustWhereToEat/activity/SurroundActivity;)Lcom/baidu/mapapi/map/PopupOverlay;

    move-result-object v2

    invoke-virtual {v1}, Lcom/universer/HustWhereToEat/model/Restaurant;->getPoint()Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v3

    const/16 v4, 0x20

    #v4=(PosByte);
    invoke-virtual {v2, v0, v3, v4}, Lcom/baidu/mapapi/map/PopupOverlay;->showPopup([Landroid/graphics/Bitmap;Lcom/baidu/platform/comapi/basestruct/GeoPoint;I)V

    .line 305
    return v6
.end method

.method public onTap(Lcom/baidu/platform/comapi/basestruct/GeoPoint;Lcom/baidu/mapapi/map/MapView;)Z
    .locals 1
    .parameter "arg0"
    .parameter "arg1"

    .prologue
    .line 311
    iget-object v0, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity$SurroundOverlay;->this$0:Lcom/universer/HustWhereToEat/activity/SurroundActivity;

    #v0=(Reference);
    invoke-static {v0}, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->access$10(Lcom/universer/HustWhereToEat/activity/SurroundActivity;)Lcom/baidu/mapapi/map/PopupOverlay;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 312
    iget-object v0, p0, Lcom/universer/HustWhereToEat/activity/SurroundActivity$SurroundOverlay;->this$0:Lcom/universer/HustWhereToEat/activity/SurroundActivity;

    invoke-static {v0}, Lcom/universer/HustWhereToEat/activity/SurroundActivity;->access$10(Lcom/universer/HustWhereToEat/activity/SurroundActivity;)Lcom/baidu/mapapi/map/PopupOverlay;

    move-result-object v0

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/PopupOverlay;->hidePop()V

    .line 314
    :cond_0
    const/4 v0, 0x0

    #v0=(Null);
    return v0
.end method

*/}
