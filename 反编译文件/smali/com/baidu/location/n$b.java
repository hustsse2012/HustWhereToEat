package com.baidu.location; class n$b {/*

.class Lcom/baidu/location/n$b;
.super Landroid/telephony/PhoneStateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/baidu/location/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lcom/baidu/location/n;


# direct methods
.method public constructor <init>(Lcom/baidu/location/n;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/location/n$b;->a:Lcom/baidu/location/n;

    invoke-direct {p0}, Landroid/telephony/PhoneStateListener;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public onCellLocationChanged(Landroid/telephony/CellLocation;)V
    .locals 2

    if-nez p1, :cond_0

    :goto_0
    #v0=(Conflicted);v1=(Conflicted);
    return-void

    :cond_0
    :try_start_0
    #v0=(Uninit);v1=(Uninit);
    iget-object v0, p0, Lcom/baidu/location/n$b;->a:Lcom/baidu/location/n;

    #v0=(Reference);
    iget-object v1, p0, Lcom/baidu/location/n$b;->a:Lcom/baidu/location/n;

    #v1=(Reference);
    invoke-static {v1}, Lcom/baidu/location/n;->int(Lcom/baidu/location/n;)Landroid/telephony/TelephonyManager;

    move-result-object v1

    invoke-virtual {v1}, Landroid/telephony/TelephonyManager;->getCellLocation()Landroid/telephony/CellLocation;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/baidu/location/n;->if(Lcom/baidu/location/n;Landroid/telephony/CellLocation;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    #v0=(Conflicted);v1=(Conflicted);
    move-exception v0

    #v0=(Reference);
    goto :goto_0
.end method

.method public onSignalStrengthsChanged(Landroid/telephony/SignalStrength;)V
    .locals 3

    iget-object v0, p0, Lcom/baidu/location/n$b;->a:Lcom/baidu/location/n;

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/location/n;->for(Lcom/baidu/location/n;)Lcom/baidu/location/n$a;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/baidu/location/n$b;->a:Lcom/baidu/location/n;

    invoke-static {v0}, Lcom/baidu/location/n;->for(Lcom/baidu/location/n;)Lcom/baidu/location/n$a;

    move-result-object v0

    iget-char v0, v0, Lcom/baidu/location/n$a;->new:C

    #v0=(Char);
    const/16 v1, 0x67

    #v1=(PosByte);
    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lcom/baidu/location/n$b;->a:Lcom/baidu/location/n;

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/location/n;->for(Lcom/baidu/location/n;)Lcom/baidu/location/n$a;

    move-result-object v0

    invoke-virtual {p1}, Landroid/telephony/SignalStrength;->getGsmSignalStrength()I

    move-result v1

    #v1=(Integer);
    iput v1, v0, Lcom/baidu/location/n$a;->int:I

    :cond_0
    :goto_0
    #v0=(Conflicted);
    const-string v0, "cell strength"

    #v0=(Reference);
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #v1=(Reference);
    const-string v2, "===== cell singal strength changed : "

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/baidu/location/n$b;->a:Lcom/baidu/location/n;

    invoke-static {v2}, Lcom/baidu/location/n;->for(Lcom/baidu/location/n;)Lcom/baidu/location/n$a;

    move-result-object v2

    iget v2, v2, Lcom/baidu/location/n$a;->int:I

    #v2=(Integer);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/baidu/location/b;->if(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    #v1=(Conflicted);v2=(Conflicted);
    return-void

    :cond_2
    #v0=(Char);v1=(PosByte);v2=(Uninit);
    iget-object v0, p0, Lcom/baidu/location/n$b;->a:Lcom/baidu/location/n;

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/location/n;->for(Lcom/baidu/location/n;)Lcom/baidu/location/n$a;

    move-result-object v0

    iget-char v0, v0, Lcom/baidu/location/n$a;->new:C

    #v0=(Char);
    const/16 v1, 0x63

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/baidu/location/n$b;->a:Lcom/baidu/location/n;

    #v0=(Reference);
    invoke-static {v0}, Lcom/baidu/location/n;->for(Lcom/baidu/location/n;)Lcom/baidu/location/n$a;

    move-result-object v0

    invoke-virtual {p1}, Landroid/telephony/SignalStrength;->getCdmaDbm()I

    move-result v1

    #v1=(Integer);
    iput v1, v0, Lcom/baidu/location/n$a;->int:I

    goto :goto_0
.end method

*/}
