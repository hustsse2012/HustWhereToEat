package com.baidu.mapapi.map; class d {/*

.class Lcom/baidu/mapapi/map/d;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/baidu/platform/comapi/map/u;


# instance fields
.field final synthetic a:Lcom/baidu/mapapi/map/MapView;


# direct methods
.method constructor <init>(Lcom/baidu/mapapi/map/MapView;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/mapapi/map/d;->a:Lcom/baidu/mapapi/map/MapView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public a()V
    .locals 7

    const/4 v6, 0x1

    #v6=(One);
    const/4 v5, 0x0

    #v5=(Null);
    iget-object v0, p0, Lcom/baidu/mapapi/map/d;->a:Lcom/baidu/mapapi/map/MapView;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/mapapi/map/MapView;->a()V

    iget-object v0, p0, Lcom/baidu/mapapi/map/d;->a:Lcom/baidu/mapapi/map/MapView;

    iget-boolean v0, v0, Lcom/baidu/mapapi/map/MapView;->d:Z

    #v0=(Boolean);
    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/baidu/mapapi/map/d;->a:Lcom/baidu/mapapi/map/MapView;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/mapapi/map/MapView;->getHeight()I

    move-result v0

    #v0=(Integer);
    if-gtz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/mapapi/map/d;->a:Lcom/baidu/mapapi/map/MapView;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/mapapi/map/MapView;->getWidth()I

    move-result v0

    #v0=(Integer);
    if-lez v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/baidu/mapapi/map/d;->a:Lcom/baidu/mapapi/map/MapView;

    #v0=(Reference);
    iput-boolean v6, v0, Lcom/baidu/mapapi/map/MapView;->d:Z

    iget-object v0, p0, Lcom/baidu/mapapi/map/d;->a:Lcom/baidu/mapapi/map/MapView;

    invoke-static {v0}, Lcom/baidu/mapapi/map/MapView;->a(Lcom/baidu/mapapi/map/MapView;)Lcom/baidu/mapapi/map/MKMapViewListener;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/baidu/mapapi/map/d;->a:Lcom/baidu/mapapi/map/MapView;

    invoke-static {v0}, Lcom/baidu/mapapi/map/MapView;->a(Lcom/baidu/mapapi/map/MapView;)Lcom/baidu/mapapi/map/MKMapViewListener;

    move-result-object v0

    invoke-interface {v0}, Lcom/baidu/mapapi/map/MKMapViewListener;->onMapLoadFinish()V

    :cond_1
    #v0=(Conflicted);
    iget-object v0, p0, Lcom/baidu/mapapi/map/d;->a:Lcom/baidu/mapapi/map/MapView;

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/mapapi/map/MapView;->b(Lcom/baidu/mapapi/map/MapView;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/baidu/mapapi/map/d;->a:Lcom/baidu/mapapi/map/MapView;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/mapapi/map/MapView;->getZoomLevel()F

    move-result v0

    #v0=(Float);
    float-to-int v1, v0

    #v1=(Integer);
    iget-object v0, p0, Lcom/baidu/mapapi/map/d;->a:Lcom/baidu/mapapi/map/MapView;

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/mapapi/map/MapView;->c(Lcom/baidu/mapapi/map/MapView;)I

    move-result v0

    #v0=(Integer);
    if-eq v0, v1, :cond_2

    invoke-static {}, Lcom/baidu/mapapi/map/MapView;->d()Landroid/util/SparseArray;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    aget v2, v0, v5

    #v2=(Integer);
    invoke-static {}, Lcom/baidu/mapapi/map/MapView;->d()Landroid/util/SparseArray;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    aget v0, v0, v6

    #v0=(Integer);
    iget-object v3, p0, Lcom/baidu/mapapi/map/d;->a:Lcom/baidu/mapapi/map/MapView;

    #v3=(Reference);
    invoke-static {v3}, Lcom/baidu/mapapi/map/MapView;->d(Lcom/baidu/mapapi/map/MapView;)Landroid/widget/ImageView;

    move-result-object v3

    div-int/lit8 v4, v0, 0x2

    #v4=(Integer);
    div-int/lit8 v0, v0, 0x2

    invoke-virtual {v3, v4, v5, v0, v5}, Landroid/widget/ImageView;->setPadding(IIII)V

    const/16 v0, 0x3e8

    #v0=(PosShort);
    if-lt v2, v0, :cond_3

    const-string v0, " %d\u516c\u91cc "

    #v0=(Reference);
    new-array v3, v6, [Ljava/lang/Object;

    div-int/lit16 v2, v2, 0x3e8

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    #v2=(Reference);
    aput-object v2, v3, v5

    invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    iget-object v2, p0, Lcom/baidu/mapapi/map/d;->a:Lcom/baidu/mapapi/map/MapView;

    invoke-static {v2}, Lcom/baidu/mapapi/map/MapView;->e(Lcom/baidu/mapapi/map/MapView;)Landroid/widget/TextView;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v2, p0, Lcom/baidu/mapapi/map/d;->a:Lcom/baidu/mapapi/map/MapView;

    invoke-static {v2}, Lcom/baidu/mapapi/map/MapView;->f(Lcom/baidu/mapapi/map/MapView;)Landroid/widget/TextView;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/baidu/mapapi/map/d;->a:Lcom/baidu/mapapi/map/MapView;

    invoke-static {v0, v1}, Lcom/baidu/mapapi/map/MapView;->a(Lcom/baidu/mapapi/map/MapView;I)I

    :cond_2
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    return-void

    :cond_3
    #v0=(PosShort);v1=(Integer);v2=(Integer);v3=(Reference);v4=(Integer);
    const-string v0, " %d\u7c73 "

    #v0=(Reference);
    new-array v3, v6, [Ljava/lang/Object;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    #v2=(Reference);
    aput-object v2, v3, v5

    invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public a(I)V
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/d;->a:Lcom/baidu/mapapi/map/MapView;

    #v0=(Reference);
    invoke-static {v0, p1}, Lcom/baidu/mapapi/map/MapView;->b(Lcom/baidu/mapapi/map/MapView;I)V

    return-void
.end method

.method public a(II)V
    .locals 2

    iget-object v0, p0, Lcom/baidu/mapapi/map/d;->a:Lcom/baidu/mapapi/map/MapView;

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/mapapi/map/MapView;->i(Lcom/baidu/mapapi/map/MapView;)Lcom/baidu/mapapi/map/MKMapTouchListener;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-boolean v0, Lcom/baidu/platform/comapi/a;->a:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/mapapi/map/d;->a:Lcom/baidu/mapapi/map/MapView;

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/mapapi/map/MapView;->i(Lcom/baidu/mapapi/map/MapView;)Lcom/baidu/mapapi/map/MKMapTouchListener;

    move-result-object v0

    iget-object v1, p0, Lcom/baidu/mapapi/map/d;->a:Lcom/baidu/mapapi/map/MapView;

    #v1=(Reference);
    invoke-virtual {v1}, Lcom/baidu/mapapi/map/MapView;->getProjection()Lcom/baidu/platform/comapi/map/Projection;

    move-result-object v1

    invoke-interface {v1, p1, p2}, Lcom/baidu/platform/comapi/map/Projection;->fromPixels(II)Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/baidu/mapapi/map/MKMapTouchListener;->onMapClick(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)V

    :cond_0
    #v0=(Conflicted);v1=(Conflicted);
    return-void
.end method

.method public a(ILcom/baidu/platform/comapi/basestruct/GeoPoint;I)V
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/map/d;->a:Lcom/baidu/mapapi/map/MapView;

    #v0=(Reference);
    invoke-static {v0, p1, p2, p3}, Lcom/baidu/mapapi/map/MapView;->a(Lcom/baidu/mapapi/map/MapView;ILcom/baidu/platform/comapi/basestruct/GeoPoint;I)V

    return-void
.end method

.method public a(Lcom/baidu/platform/comapi/map/t;)V
    .locals 2

    if-nez p1, :cond_1

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);
    return-void

    :cond_1
    #v0=(Uninit);v1=(Uninit);
    iget-object v0, p0, Lcom/baidu/mapapi/map/d;->a:Lcom/baidu/mapapi/map/MapView;

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/mapapi/map/MapView;->j(Lcom/baidu/mapapi/map/MapView;)Lcom/baidu/mapapi/map/MKMapStatusChangeListener;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-boolean v0, Lcom/baidu/platform/comapi/a;->a:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/mapapi/map/d;->a:Lcom/baidu/mapapi/map/MapView;

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/mapapi/map/MapView;->h(Lcom/baidu/mapapi/map/MapView;)Lcom/baidu/mapapi/map/MapController;

    move-result-object v0

    invoke-virtual {v0}, Lcom/baidu/mapapi/map/MapController;->isMapLoadFinish()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/mapapi/map/d;->a:Lcom/baidu/mapapi/map/MapView;

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/mapapi/map/MapView;->j(Lcom/baidu/mapapi/map/MapView;)Lcom/baidu/mapapi/map/MKMapStatusChangeListener;

    move-result-object v0

    iget-object v1, p0, Lcom/baidu/mapapi/map/d;->a:Lcom/baidu/mapapi/map/MapView;

    #v1=(Reference);
    invoke-static {v1}, Lcom/baidu/mapapi/map/MapView;->h(Lcom/baidu/mapapi/map/MapView;)Lcom/baidu/mapapi/map/MapController;

    move-result-object v1

    invoke-virtual {v1}, Lcom/baidu/mapapi/map/MapController;->a()Lcom/baidu/mapapi/map/MKMapStatus;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/baidu/mapapi/map/MKMapStatusChangeListener;->onMapStatusChange(Lcom/baidu/mapapi/map/MKMapStatus;)V

    goto :goto_0
.end method

.method public a(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/baidu/platform/comapi/map/f;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public a(Ljava/util/List;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/baidu/platform/comapi/map/r;",
            ">;I)V"
        }
    .end annotation

    iget-object v1, p0, Lcom/baidu/mapapi/map/d;->a:Lcom/baidu/mapapi/map/MapView;

    #v1=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/platform/comapi/map/r;

    invoke-static {v1, v0, p2}, Lcom/baidu/mapapi/map/MapView;->a(Lcom/baidu/mapapi/map/MapView;Lcom/baidu/platform/comapi/map/r;I)V

    return-void
.end method

.method public b()V
    .locals 5

    const/4 v4, 0x0

    #v4=(Null);
    const/4 v3, 0x1

    #v3=(One);
    const/4 v2, 0x0

    #v2=(Null);
    iget-object v0, p0, Lcom/baidu/mapapi/map/d;->a:Lcom/baidu/mapapi/map/MapView;

    #v0=(Reference);
    iget-object v0, v0, Lcom/baidu/mapapi/map/MapView;->a:Lcom/baidu/platform/comapi/map/q;

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/q;->i()F

    move-result v0

    #v0=(Float);
    const/high16 v1, 0x4040

    #v1=(Integer);
    cmpg-float v1, v0, v1

    #v1=(Byte);
    if-gtz v1, :cond_3

    iget-object v1, p0, Lcom/baidu/mapapi/map/d;->a:Lcom/baidu/mapapi/map/MapView;

    #v1=(Reference);
    invoke-static {v1}, Lcom/baidu/mapapi/map/MapView;->g(Lcom/baidu/mapapi/map/MapView;)F

    move-result v1

    #v1=(Float);
    cmpl-float v1, v1, v0

    #v1=(Byte);
    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/baidu/mapapi/map/d;->a:Lcom/baidu/mapapi/map/MapView;

    #v1=(Reference);
    invoke-static {v1, v0}, Lcom/baidu/mapapi/map/MapView;->a(Lcom/baidu/mapapi/map/MapView;F)F

    iget-object v0, p0, Lcom/baidu/mapapi/map/d;->a:Lcom/baidu/mapapi/map/MapView;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/mapapi/map/MapView;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "\u5df2\u7f29\u5c0f\u5230\u6700\u5c0f\u7ea7\u522b"

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    iget-object v0, p0, Lcom/baidu/mapapi/map/d;->a:Lcom/baidu/mapapi/map/MapView;

    invoke-virtual {v0, v3, v2}, Lcom/baidu/mapapi/map/MapView;->a(ZZ)V

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);
    iget-object v0, p0, Lcom/baidu/mapapi/map/d;->a:Lcom/baidu/mapapi/map/MapView;

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/mapapi/map/MapView;->h(Lcom/baidu/mapapi/map/MapView;)Lcom/baidu/mapapi/map/MapController;

    move-result-object v0

    iget-object v0, v0, Lcom/baidu/mapapi/map/MapController;->b:Landroid/os/Message;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/baidu/mapapi/map/d;->a:Lcom/baidu/mapapi/map/MapView;

    invoke-static {v0}, Lcom/baidu/mapapi/map/MapView;->h(Lcom/baidu/mapapi/map/MapView;)Lcom/baidu/mapapi/map/MapController;

    move-result-object v0

    iget-object v0, v0, Lcom/baidu/mapapi/map/MapController;->b:Landroid/os/Message;

    invoke-virtual {v0}, Landroid/os/Message;->getTarget()Landroid/os/Handler;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/baidu/mapapi/map/d;->a:Lcom/baidu/mapapi/map/MapView;

    invoke-static {v0}, Lcom/baidu/mapapi/map/MapView;->h(Lcom/baidu/mapapi/map/MapView;)Lcom/baidu/mapapi/map/MapController;

    move-result-object v0

    iget-object v0, v0, Lcom/baidu/mapapi/map/MapController;->b:Landroid/os/Message;

    invoke-virtual {v0}, Landroid/os/Message;->getTarget()Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/baidu/mapapi/map/d;->a:Lcom/baidu/mapapi/map/MapView;

    #v1=(Reference);
    invoke-static {v1}, Lcom/baidu/mapapi/map/MapView;->h(Lcom/baidu/mapapi/map/MapView;)Lcom/baidu/mapapi/map/MapController;

    move-result-object v1

    iget-object v1, v1, Lcom/baidu/mapapi/map/MapController;->b:Landroid/os/Message;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    iget-object v0, p0, Lcom/baidu/mapapi/map/d;->a:Lcom/baidu/mapapi/map/MapView;

    invoke-static {v0}, Lcom/baidu/mapapi/map/MapView;->h(Lcom/baidu/mapapi/map/MapView;)Lcom/baidu/mapapi/map/MapController;

    move-result-object v0

    const/4 v1, 0x0

    #v1=(Null);
    iput-object v1, v0, Lcom/baidu/mapapi/map/MapController;->b:Landroid/os/Message;

    :cond_1
    #v1=(Conflicted);
    iget-object v0, p0, Lcom/baidu/mapapi/map/d;->a:Lcom/baidu/mapapi/map/MapView;

    invoke-static {v0}, Lcom/baidu/mapapi/map/MapView;->a(Lcom/baidu/mapapi/map/MapView;)Lcom/baidu/mapapi/map/MKMapViewListener;

    move-result-object v0

    if-eqz v0, :cond_2

    sget-boolean v0, Lcom/baidu/platform/comapi/a;->a:Z

    #v0=(Boolean);
    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/baidu/mapapi/map/d;->a:Lcom/baidu/mapapi/map/MapView;

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/mapapi/map/MapView;->a(Lcom/baidu/mapapi/map/MapView;)Lcom/baidu/mapapi/map/MKMapViewListener;

    move-result-object v0

    invoke-interface {v0}, Lcom/baidu/mapapi/map/MKMapViewListener;->onMapAnimationFinish()V

    :cond_2
    #v0=(Conflicted);
    return-void

    :cond_3
    #v0=(Float);v1=(Byte);
    const/high16 v1, 0x4198

    #v1=(Integer);
    cmpl-float v1, v0, v1

    #v1=(Byte);
    if-ltz v1, :cond_4

    iget-object v1, p0, Lcom/baidu/mapapi/map/d;->a:Lcom/baidu/mapapi/map/MapView;

    #v1=(Reference);
    invoke-static {v1}, Lcom/baidu/mapapi/map/MapView;->g(Lcom/baidu/mapapi/map/MapView;)F

    move-result v1

    #v1=(Float);
    cmpl-float v1, v1, v0

    #v1=(Byte);
    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/baidu/mapapi/map/d;->a:Lcom/baidu/mapapi/map/MapView;

    #v1=(Reference);
    invoke-static {v1, v0}, Lcom/baidu/mapapi/map/MapView;->a(Lcom/baidu/mapapi/map/MapView;F)F

    iget-object v0, p0, Lcom/baidu/mapapi/map/d;->a:Lcom/baidu/mapapi/map/MapView;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/mapapi/map/MapView;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "\u5df2\u653e\u5927\u5230\u6700\u5927\u7ea7\u522b"

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    iget-object v0, p0, Lcom/baidu/mapapi/map/d;->a:Lcom/baidu/mapapi/map/MapView;

    invoke-virtual {v0, v2, v3}, Lcom/baidu/mapapi/map/MapView;->a(ZZ)V

    goto :goto_0

    :cond_4
    #v0=(Float);v1=(Byte);
    iget-object v0, p0, Lcom/baidu/mapapi/map/d;->a:Lcom/baidu/mapapi/map/MapView;

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/mapapi/map/MapView;->g(Lcom/baidu/mapapi/map/MapView;)F

    move-result v0

    #v0=(Float);
    cmpl-float v0, v0, v4

    #v0=(Byte);
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/mapapi/map/d;->a:Lcom/baidu/mapapi/map/MapView;

    #v0=(Reference);
    invoke-static {v0, v4}, Lcom/baidu/mapapi/map/MapView;->a(Lcom/baidu/mapapi/map/MapView;F)F

    iget-object v0, p0, Lcom/baidu/mapapi/map/d;->a:Lcom/baidu/mapapi/map/MapView;

    invoke-virtual {v0, v3, v3}, Lcom/baidu/mapapi/map/MapView;->a(ZZ)V

    goto/16 :goto_0
.end method

.method public b(II)V
    .locals 2

    iget-object v0, p0, Lcom/baidu/mapapi/map/d;->a:Lcom/baidu/mapapi/map/MapView;

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/mapapi/map/MapView;->i(Lcom/baidu/mapapi/map/MapView;)Lcom/baidu/mapapi/map/MKMapTouchListener;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-boolean v0, Lcom/baidu/platform/comapi/a;->a:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/mapapi/map/d;->a:Lcom/baidu/mapapi/map/MapView;

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/mapapi/map/MapView;->i(Lcom/baidu/mapapi/map/MapView;)Lcom/baidu/mapapi/map/MKMapTouchListener;

    move-result-object v0

    iget-object v1, p0, Lcom/baidu/mapapi/map/d;->a:Lcom/baidu/mapapi/map/MapView;

    #v1=(Reference);
    invoke-virtual {v1}, Lcom/baidu/mapapi/map/MapView;->getProjection()Lcom/baidu/platform/comapi/map/Projection;

    move-result-object v1

    invoke-interface {v1, p1, p2}, Lcom/baidu/platform/comapi/map/Projection;->fromPixels(II)Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/baidu/mapapi/map/MKMapTouchListener;->onMapDoubleClick(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)V

    :cond_0
    #v0=(Conflicted);v1=(Conflicted);
    return-void
.end method

.method public b(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/baidu/platform/comapi/map/r;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public b(Ljava/util/List;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/baidu/platform/comapi/map/r;",
            ">;I)V"
        }
    .end annotation

    iget-object v1, p0, Lcom/baidu/mapapi/map/d;->a:Lcom/baidu/mapapi/map/MapView;

    #v1=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/platform/comapi/map/r;

    iget v0, v0, Lcom/baidu/platform/comapi/map/r;->b:I

    #v0=(Integer);
    invoke-static {v1, v0, p2}, Lcom/baidu/mapapi/map/MapView;->a(Lcom/baidu/mapapi/map/MapView;II)V

    return-void
.end method

.method public c()V
    .locals 5

    const/4 v4, 0x0

    #v4=(Null);
    const/4 v3, 0x1

    #v3=(One);
    const/4 v2, 0x0

    #v2=(Null);
    iget-object v0, p0, Lcom/baidu/mapapi/map/d;->a:Lcom/baidu/mapapi/map/MapView;

    #v0=(Reference);
    iget-object v0, v0, Lcom/baidu/mapapi/map/MapView;->a:Lcom/baidu/platform/comapi/map/q;

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/q;->i()F

    move-result v0

    #v0=(Float);
    const/high16 v1, 0x4040

    #v1=(Integer);
    cmpg-float v1, v0, v1

    #v1=(Byte);
    if-gtz v1, :cond_2

    iget-object v1, p0, Lcom/baidu/mapapi/map/d;->a:Lcom/baidu/mapapi/map/MapView;

    #v1=(Reference);
    invoke-static {v1}, Lcom/baidu/mapapi/map/MapView;->g(Lcom/baidu/mapapi/map/MapView;)F

    move-result v1

    #v1=(Float);
    cmpl-float v1, v1, v0

    #v1=(Byte);
    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/baidu/mapapi/map/d;->a:Lcom/baidu/mapapi/map/MapView;

    #v1=(Reference);
    invoke-static {v1, v0}, Lcom/baidu/mapapi/map/MapView;->a(Lcom/baidu/mapapi/map/MapView;F)F

    iget-object v0, p0, Lcom/baidu/mapapi/map/d;->a:Lcom/baidu/mapapi/map/MapView;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/mapapi/map/MapView;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "\u5df2\u7f29\u5c0f\u5230\u6700\u5c0f\u7ea7\u522b"

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    iget-object v0, p0, Lcom/baidu/mapapi/map/d;->a:Lcom/baidu/mapapi/map/MapView;

    invoke-virtual {v0, v3, v2}, Lcom/baidu/mapapi/map/MapView;->a(ZZ)V

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);
    iget-object v0, p0, Lcom/baidu/mapapi/map/d;->a:Lcom/baidu/mapapi/map/MapView;

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/mapapi/map/MapView;->a(Lcom/baidu/mapapi/map/MapView;)Lcom/baidu/mapapi/map/MKMapViewListener;

    move-result-object v0

    if-eqz v0, :cond_1

    sget-boolean v0, Lcom/baidu/platform/comapi/a;->a:Z

    #v0=(Boolean);
    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/baidu/mapapi/map/d;->a:Lcom/baidu/mapapi/map/MapView;

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/mapapi/map/MapView;->a(Lcom/baidu/mapapi/map/MapView;)Lcom/baidu/mapapi/map/MKMapViewListener;

    move-result-object v0

    invoke-interface {v0}, Lcom/baidu/mapapi/map/MKMapViewListener;->onMapMoveFinish()V

    :cond_1
    #v0=(Conflicted);
    return-void

    :cond_2
    #v0=(Float);v1=(Byte);
    const/high16 v1, 0x4198

    #v1=(Integer);
    cmpl-float v1, v0, v1

    #v1=(Byte);
    if-ltz v1, :cond_3

    iget-object v1, p0, Lcom/baidu/mapapi/map/d;->a:Lcom/baidu/mapapi/map/MapView;

    #v1=(Reference);
    invoke-static {v1}, Lcom/baidu/mapapi/map/MapView;->g(Lcom/baidu/mapapi/map/MapView;)F

    move-result v1

    #v1=(Float);
    cmpl-float v1, v1, v0

    #v1=(Byte);
    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/baidu/mapapi/map/d;->a:Lcom/baidu/mapapi/map/MapView;

    #v1=(Reference);
    invoke-static {v1, v0}, Lcom/baidu/mapapi/map/MapView;->a(Lcom/baidu/mapapi/map/MapView;F)F

    iget-object v0, p0, Lcom/baidu/mapapi/map/d;->a:Lcom/baidu/mapapi/map/MapView;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/mapapi/map/MapView;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "\u5df2\u653e\u5927\u5230\u6700\u5927\u7ea7\u522b"

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    iget-object v0, p0, Lcom/baidu/mapapi/map/d;->a:Lcom/baidu/mapapi/map/MapView;

    invoke-virtual {v0, v2, v3}, Lcom/baidu/mapapi/map/MapView;->a(ZZ)V

    goto :goto_0

    :cond_3
    #v0=(Float);v1=(Byte);
    iget-object v0, p0, Lcom/baidu/mapapi/map/d;->a:Lcom/baidu/mapapi/map/MapView;

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/mapapi/map/MapView;->g(Lcom/baidu/mapapi/map/MapView;)F

    move-result v0

    #v0=(Float);
    cmpl-float v0, v0, v4

    #v0=(Byte);
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/mapapi/map/d;->a:Lcom/baidu/mapapi/map/MapView;

    #v0=(Reference);
    invoke-static {v0, v4}, Lcom/baidu/mapapi/map/MapView;->a(Lcom/baidu/mapapi/map/MapView;F)F

    iget-object v0, p0, Lcom/baidu/mapapi/map/d;->a:Lcom/baidu/mapapi/map/MapView;

    invoke-virtual {v0, v3, v3}, Lcom/baidu/mapapi/map/MapView;->a(ZZ)V

    goto :goto_0
.end method

.method public c(II)V
    .locals 2

    iget-object v0, p0, Lcom/baidu/mapapi/map/d;->a:Lcom/baidu/mapapi/map/MapView;

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/mapapi/map/MapView;->i(Lcom/baidu/mapapi/map/MapView;)Lcom/baidu/mapapi/map/MKMapTouchListener;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-boolean v0, Lcom/baidu/platform/comapi/a;->a:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/mapapi/map/d;->a:Lcom/baidu/mapapi/map/MapView;

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/mapapi/map/MapView;->i(Lcom/baidu/mapapi/map/MapView;)Lcom/baidu/mapapi/map/MKMapTouchListener;

    move-result-object v0

    iget-object v1, p0, Lcom/baidu/mapapi/map/d;->a:Lcom/baidu/mapapi/map/MapView;

    #v1=(Reference);
    invoke-virtual {v1}, Lcom/baidu/mapapi/map/MapView;->getProjection()Lcom/baidu/platform/comapi/map/Projection;

    move-result-object v1

    invoke-interface {v1, p1, p2}, Lcom/baidu/platform/comapi/map/Projection;->fromPixels(II)Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/baidu/mapapi/map/MKMapTouchListener;->onMapLongClick(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)V

    :cond_0
    #v0=(Conflicted);v1=(Conflicted);
    return-void
.end method

.method public c(Ljava/util/List;I)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/baidu/platform/comapi/map/r;",
            ">;I)V"
        }
    .end annotation

    const/4 v5, 0x0

    #v5=(Null);
    if-eqz p1, :cond_3

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    #v0=(Integer);
    if-lez v0, :cond_3

    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Lcom/baidu/platform/comapi/map/r;

    iget v1, v0, Lcom/baidu/platform/comapi/map/r;->e:I

    #v1=(Integer);
    const/16 v2, 0x11

    #v2=(PosByte);
    if-ne v1, v2, :cond_0

    new-instance v1, Lcom/baidu/mapapi/map/MapPoi;

    #v1=(UninitRef);
    invoke-direct {v1}, Lcom/baidu/mapapi/map/MapPoi;-><init>()V

    #v1=(Reference);
    iget-object v2, v0, Lcom/baidu/platform/comapi/map/r;->d:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    #v2=(Reference);
    invoke-static {v2}, Lcom/baidu/mapapi/utils/f;->a(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v2

    iput-object v2, v1, Lcom/baidu/mapapi/map/MapPoi;->geoPt:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    iget-object v2, v0, Lcom/baidu/platform/comapi/map/r;->c:Ljava/lang/String;

    const-string v3, "\\\\"

    #v3=(Reference);
    const-string v4, ""

    #v4=(Reference);
    invoke-virtual {v2, v3, v4}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/baidu/mapapi/map/MapPoi;->strText:Ljava/lang/String;

    iget v2, v0, Lcom/baidu/platform/comapi/map/r;->f:I

    #v2=(Integer);
    iput v2, v1, Lcom/baidu/mapapi/map/MapPoi;->offset:I

    iget-object v2, p0, Lcom/baidu/mapapi/map/d;->a:Lcom/baidu/mapapi/map/MapView;

    #v2=(Reference);
    invoke-static {v2}, Lcom/baidu/mapapi/map/MapView;->a(Lcom/baidu/mapapi/map/MapView;)Lcom/baidu/mapapi/map/MKMapViewListener;

    move-result-object v2

    if-eqz v2, :cond_0

    sget-boolean v2, Lcom/baidu/platform/comapi/a;->a:Z

    #v2=(Boolean);
    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/baidu/mapapi/map/d;->a:Lcom/baidu/mapapi/map/MapView;

    #v2=(Reference);
    invoke-static {v2}, Lcom/baidu/mapapi/map/MapView;->a(Lcom/baidu/mapapi/map/MapView;)Lcom/baidu/mapapi/map/MKMapViewListener;

    move-result-object v2

    invoke-interface {v2, v1}, Lcom/baidu/mapapi/map/MKMapViewListener;->onClickMapPoi(Lcom/baidu/mapapi/map/MapPoi;)V

    :cond_0
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    iget v1, v0, Lcom/baidu/platform/comapi/map/r;->e:I

    #v1=(Integer);
    const/16 v2, 0x13

    #v2=(PosByte);
    if-ne v1, v2, :cond_1

    iget-object v1, p0, Lcom/baidu/mapapi/map/d;->a:Lcom/baidu/mapapi/map/MapView;

    #v1=(Reference);
    invoke-static {v1}, Lcom/baidu/mapapi/map/MapView;->h(Lcom/baidu/mapapi/map/MapView;)Lcom/baidu/mapapi/map/MapController;

    move-result-object v1

    iget-object v1, v1, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    invoke-virtual {v1}, Lcom/baidu/platform/comapi/map/o;->m()Lcom/baidu/platform/comapi/map/t;

    move-result-object v1

    iput v5, v1, Lcom/baidu/platform/comapi/map/t;->c:I

    iput v5, v1, Lcom/baidu/platform/comapi/map/t;->b:I

    iget-object v2, p0, Lcom/baidu/mapapi/map/d;->a:Lcom/baidu/mapapi/map/MapView;

    #v2=(Reference);
    invoke-static {v2}, Lcom/baidu/mapapi/map/MapView;->h(Lcom/baidu/mapapi/map/MapView;)Lcom/baidu/mapapi/map/MapController;

    move-result-object v2

    iget-object v2, v2, Lcom/baidu/mapapi/map/MapController;->a:Lcom/baidu/platform/comapi/map/o;

    const/16 v3, 0x12c

    #v3=(PosShort);
    invoke-virtual {v2, v1, v3}, Lcom/baidu/platform/comapi/map/o;->a(Lcom/baidu/platform/comapi/map/t;I)V

    :cond_1
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    iget v1, v0, Lcom/baidu/platform/comapi/map/r;->e:I

    #v1=(Integer);
    const/16 v2, 0x12

    #v2=(PosByte);
    if-ne v1, v2, :cond_2

    iget-object v1, p0, Lcom/baidu/mapapi/map/d;->a:Lcom/baidu/mapapi/map/MapView;

    #v1=(Reference);
    invoke-static {v1, p2}, Lcom/baidu/mapapi/map/MapView;->c(Lcom/baidu/mapapi/map/MapView;I)V

    :cond_2
    #v1=(Conflicted);
    iget v1, v0, Lcom/baidu/platform/comapi/map/r;->e:I

    #v1=(Integer);
    const/16 v2, 0x17

    if-ne v1, v2, :cond_3

    iget-object v1, p0, Lcom/baidu/mapapi/map/d;->a:Lcom/baidu/mapapi/map/MapView;

    #v1=(Reference);
    invoke-static {v1, v0, p2}, Lcom/baidu/mapapi/map/MapView;->a(Lcom/baidu/mapapi/map/MapView;Lcom/baidu/platform/comapi/map/r;I)V

    :cond_3
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    return-void
.end method

*/}
