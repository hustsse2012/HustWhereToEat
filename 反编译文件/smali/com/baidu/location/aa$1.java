package com.baidu.location; class aa$1 {/*

.class Lcom/baidu/location/aa$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/hardware/SensorEventListener;


# instance fields
.field final synthetic a:Lcom/baidu/location/aa;


# direct methods
.method constructor <init>(Lcom/baidu/location/aa;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/location/aa$1;->a:Lcom/baidu/location/aa;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public onAccuracyChanged(Landroid/hardware/Sensor;I)V
    .locals 0

    return-void
.end method

.method public onSensorChanged(Landroid/hardware/SensorEvent;)V
    .locals 7

    const/4 v6, 0x2

    #v6=(PosByte);
    const/4 v5, 0x1

    #v5=(One);
    const/4 v4, 0x0

    #v4=(Null);
    iget-object v0, p1, Landroid/hardware/SensorEvent;->sensor:Landroid/hardware/Sensor;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/hardware/Sensor;->getType()I

    move-result v0

    #v0=(Integer);
    packed-switch v0, :pswitch_data_0

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    return-void

    :pswitch_0
    #v0=(Integer);v1=(Uninit);v2=(Uninit);v3=(Uninit);
    iget-object v0, p1, Landroid/hardware/SensorEvent;->values:[F

    #v0=(Reference);
    invoke-virtual {v0}, [F->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [F

    iget-object v2, p0, Lcom/baidu/location/aa$1;->a:Lcom/baidu/location/aa;

    #v2=(Reference);
    invoke-virtual {v0}, [F->clone()Ljava/lang/Object;

    move-result-object v1

    #v1=(Reference);
    check-cast v1, [F

    invoke-static {v2, v1}, Lcom/baidu/location/aa;->if(Lcom/baidu/location/aa;[F)[F

    iget-object v1, p0, Lcom/baidu/location/aa$1;->a:Lcom/baidu/location/aa;

    aget v2, v0, v4

    #v2=(Integer);
    aget v3, v0, v5

    #v3=(Integer);
    aget v0, v0, v6

    #v0=(Integer);
    invoke-static {v1, v2, v3, v0}, Lcom/baidu/location/aa;->if(Lcom/baidu/location/aa;FFF)[F

    move-result-object v0

    #v0=(Reference);
    iget-object v1, p0, Lcom/baidu/location/aa$1;->a:Lcom/baidu/location/aa;

    invoke-static {v1}, Lcom/baidu/location/aa;->do(Lcom/baidu/location/aa;)I

    move-result v1

    #v1=(Integer);
    const/16 v2, 0x14

    #v2=(PosByte);
    if-lt v1, v2, :cond_0

    aget v1, v0, v4

    aget v2, v0, v4

    #v2=(Integer);
    mul-float/2addr v1, v2

    #v1=(Float);
    aget v2, v0, v5

    aget v3, v0, v5

    mul-float/2addr v2, v3

    #v2=(Float);
    add-float/2addr v1, v2

    aget v2, v0, v6

    #v2=(Integer);
    aget v0, v0, v6

    #v0=(Integer);
    mul-float/2addr v0, v2

    #v0=(Float);
    add-float/2addr v0, v1

    float-to-double v0, v0

    #v0=(DoubleLo);v1=(DoubleHi);
    iget-object v2, p0, Lcom/baidu/location/aa$1;->a:Lcom/baidu/location/aa;

    #v2=(Reference);
    invoke-static {v2}, Lcom/baidu/location/aa;->for(Lcom/baidu/location/aa;)I

    move-result v2

    #v2=(Integer);
    if-nez v2, :cond_1

    const-wide/high16 v2, 0x4010

    #v2=(LongLo);v3=(LongHi);
    cmpl-double v0, v0, v2

    #v0=(Byte);
    if-lez v0, :cond_0

    iget-object v0, p0, Lcom/baidu/location/aa$1;->a:Lcom/baidu/location/aa;

    #v0=(Reference);
    invoke-static {v0, v5}, Lcom/baidu/location/aa;->if(Lcom/baidu/location/aa;I)I

    goto :goto_0

    :cond_1
    #v0=(DoubleLo);v2=(Integer);v3=(Integer);
    const-wide v2, 0x3f847ae140000000L

    #v2=(LongLo);v3=(LongHi);
    cmpg-double v0, v0, v2

    #v0=(Byte);
    if-gez v0, :cond_0

    iget-object v0, p0, Lcom/baidu/location/aa$1;->a:Lcom/baidu/location/aa;

    #v0=(Reference);
    invoke-static {v0, v4}, Lcom/baidu/location/aa;->if(Lcom/baidu/location/aa;I)I

    goto :goto_0

    #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);p0=(Unknown);p1=(Unknown);
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

*/}
