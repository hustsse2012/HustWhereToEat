package com.baidu.location; class LocationClientOption {/*

.class public final Lcom/baidu/location/LocationClientOption;
.super Ljava/lang/Object;


# static fields
.field public static final GpsFirst:I = 0x1

.field public static final MIN_SCAN_SPAN:I = 0x3e8

.field public static final NetWorkFirst:I = 0x2


# instance fields
.field protected a:I

.field protected byte:Ljava/lang/String;

.field protected case:Z

.field protected char:Ljava/lang/String;

.field protected do:F

.field protected else:Z

.field protected for:Z

.field protected goto:I

.field protected if:Z

.field protected int:I

.field protected long:I

.field protected new:Ljava/lang/String;

.field protected try:Ljava/lang/String;

.field protected void:Z


# direct methods
.method public constructor <init>()V
    .locals 3

    const/4 v2, 0x1

    #v2=(One);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    const-string v0, "gcj02"

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/location/LocationClientOption;->try:Ljava/lang/String;

    const-string v0, "detail"

    iput-object v0, p0, Lcom/baidu/location/LocationClientOption;->char:Ljava/lang/String;

    iput-boolean v1, p0, Lcom/baidu/location/LocationClientOption;->case:Z

    iput v1, p0, Lcom/baidu/location/LocationClientOption;->int:I

    const/16 v0, 0x2ee0

    #v0=(PosShort);
    iput v0, p0, Lcom/baidu/location/LocationClientOption;->long:I

    const-string v0, "SDK2.0"

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/location/LocationClientOption;->new:Ljava/lang/String;

    iput v2, p0, Lcom/baidu/location/LocationClientOption;->goto:I

    iput-boolean v1, p0, Lcom/baidu/location/LocationClientOption;->void:Z

    iput-boolean v2, p0, Lcom/baidu/location/LocationClientOption;->for:Z

    iput-boolean v1, p0, Lcom/baidu/location/LocationClientOption;->else:Z

    iput-boolean v1, p0, Lcom/baidu/location/LocationClientOption;->if:Z

    const/high16 v0, 0x43fa

    #v0=(Integer);
    iput v0, p0, Lcom/baidu/location/LocationClientOption;->do:F

    const/4 v0, 0x3

    #v0=(PosByte);
    iput v0, p0, Lcom/baidu/location/LocationClientOption;->a:I

    const-string v0, "com.baidu.location.service_v2.9"

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/location/LocationClientOption;->byte:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/baidu/location/LocationClientOption;)V
    .locals 3

    const/4 v2, 0x1

    #v2=(One);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    const-string v0, "gcj02"

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/location/LocationClientOption;->try:Ljava/lang/String;

    const-string v0, "detail"

    iput-object v0, p0, Lcom/baidu/location/LocationClientOption;->char:Ljava/lang/String;

    iput-boolean v1, p0, Lcom/baidu/location/LocationClientOption;->case:Z

    iput v1, p0, Lcom/baidu/location/LocationClientOption;->int:I

    const/16 v0, 0x2ee0

    #v0=(PosShort);
    iput v0, p0, Lcom/baidu/location/LocationClientOption;->long:I

    const-string v0, "SDK2.0"

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/location/LocationClientOption;->new:Ljava/lang/String;

    iput v2, p0, Lcom/baidu/location/LocationClientOption;->goto:I

    iput-boolean v1, p0, Lcom/baidu/location/LocationClientOption;->void:Z

    iput-boolean v2, p0, Lcom/baidu/location/LocationClientOption;->for:Z

    iput-boolean v1, p0, Lcom/baidu/location/LocationClientOption;->else:Z

    iput-boolean v1, p0, Lcom/baidu/location/LocationClientOption;->if:Z

    const/high16 v0, 0x43fa

    #v0=(Integer);
    iput v0, p0, Lcom/baidu/location/LocationClientOption;->do:F

    const/4 v0, 0x3

    #v0=(PosByte);
    iput v0, p0, Lcom/baidu/location/LocationClientOption;->a:I

    const-string v0, "com.baidu.location.service_v2.9"

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/location/LocationClientOption;->byte:Ljava/lang/String;

    iget-object v0, p1, Lcom/baidu/location/LocationClientOption;->try:Ljava/lang/String;

    iput-object v0, p0, Lcom/baidu/location/LocationClientOption;->try:Ljava/lang/String;

    iget-object v0, p1, Lcom/baidu/location/LocationClientOption;->char:Ljava/lang/String;

    iput-object v0, p0, Lcom/baidu/location/LocationClientOption;->char:Ljava/lang/String;

    iget-boolean v0, p1, Lcom/baidu/location/LocationClientOption;->case:Z

    #v0=(Boolean);
    iput-boolean v0, p0, Lcom/baidu/location/LocationClientOption;->case:Z

    iget v0, p1, Lcom/baidu/location/LocationClientOption;->int:I

    #v0=(Integer);
    iput v0, p0, Lcom/baidu/location/LocationClientOption;->int:I

    iget v0, p1, Lcom/baidu/location/LocationClientOption;->long:I

    iput v0, p0, Lcom/baidu/location/LocationClientOption;->long:I

    iget-object v0, p1, Lcom/baidu/location/LocationClientOption;->new:Ljava/lang/String;

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/location/LocationClientOption;->new:Ljava/lang/String;

    iget v0, p1, Lcom/baidu/location/LocationClientOption;->goto:I

    #v0=(Integer);
    iput v0, p0, Lcom/baidu/location/LocationClientOption;->goto:I

    iget-boolean v0, p1, Lcom/baidu/location/LocationClientOption;->void:Z

    #v0=(Boolean);
    iput-boolean v0, p0, Lcom/baidu/location/LocationClientOption;->void:Z

    iget-boolean v0, p1, Lcom/baidu/location/LocationClientOption;->if:Z

    iput-boolean v0, p0, Lcom/baidu/location/LocationClientOption;->if:Z

    iget v0, p1, Lcom/baidu/location/LocationClientOption;->do:F

    #v0=(Integer);
    iput v0, p0, Lcom/baidu/location/LocationClientOption;->do:F

    iget v0, p1, Lcom/baidu/location/LocationClientOption;->a:I

    iput v0, p0, Lcom/baidu/location/LocationClientOption;->a:I

    iget-object v0, p1, Lcom/baidu/location/LocationClientOption;->byte:Ljava/lang/String;

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/location/LocationClientOption;->byte:Ljava/lang/String;

    iget-boolean v0, p1, Lcom/baidu/location/LocationClientOption;->for:Z

    #v0=(Boolean);
    iput-boolean v0, p0, Lcom/baidu/location/LocationClientOption;->for:Z

    return-void
.end method


# virtual methods
.method public disableCache(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/baidu/location/LocationClientOption;->for:Z

    return-void
.end method

.method public equals(Lcom/baidu/location/LocationClientOption;)Z
    .locals 2

    iget-object v0, p0, Lcom/baidu/location/LocationClientOption;->try:Ljava/lang/String;

    #v0=(Reference);
    iget-object v1, p1, Lcom/baidu/location/LocationClientOption;->try:Ljava/lang/String;

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/location/LocationClientOption;->char:Ljava/lang/String;

    #v0=(Reference);
    iget-object v1, p1, Lcom/baidu/location/LocationClientOption;->char:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/baidu/location/LocationClientOption;->case:Z

    iget-boolean v1, p1, Lcom/baidu/location/LocationClientOption;->case:Z

    #v1=(Boolean);
    if-ne v0, v1, :cond_0

    iget v0, p0, Lcom/baidu/location/LocationClientOption;->int:I

    #v0=(Integer);
    iget v1, p1, Lcom/baidu/location/LocationClientOption;->int:I

    #v1=(Integer);
    if-ne v0, v1, :cond_0

    iget v0, p0, Lcom/baidu/location/LocationClientOption;->long:I

    iget v1, p1, Lcom/baidu/location/LocationClientOption;->long:I

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/baidu/location/LocationClientOption;->new:Ljava/lang/String;

    #v0=(Reference);
    iget-object v1, p1, Lcom/baidu/location/LocationClientOption;->new:Ljava/lang/String;

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/baidu/location/LocationClientOption;->void:Z

    iget-boolean v1, p1, Lcom/baidu/location/LocationClientOption;->void:Z

    #v1=(Boolean);
    if-ne v0, v1, :cond_0

    iget v0, p0, Lcom/baidu/location/LocationClientOption;->goto:I

    #v0=(Integer);
    iget v1, p1, Lcom/baidu/location/LocationClientOption;->goto:I

    #v1=(Integer);
    if-ne v0, v1, :cond_0

    iget v0, p0, Lcom/baidu/location/LocationClientOption;->a:I

    iget v1, p1, Lcom/baidu/location/LocationClientOption;->a:I

    if-ne v0, v1, :cond_0

    iget-boolean v0, p0, Lcom/baidu/location/LocationClientOption;->if:Z

    #v0=(Boolean);
    iget-boolean v1, p1, Lcom/baidu/location/LocationClientOption;->if:Z

    #v1=(Boolean);
    if-ne v0, v1, :cond_0

    iget v0, p0, Lcom/baidu/location/LocationClientOption;->do:F

    #v0=(Integer);
    iget v1, p1, Lcom/baidu/location/LocationClientOption;->do:F

    #v1=(Integer);
    cmpl-float v0, v0, v1

    #v0=(Byte);
    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/baidu/location/LocationClientOption;->for:Z

    #v0=(Boolean);
    iget-boolean v1, p1, Lcom/baidu/location/LocationClientOption;->for:Z

    #v1=(Boolean);
    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    #v1=(Conflicted);
    return v0

    :cond_0
    #v0=(Integer);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public getAddrType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/baidu/location/LocationClientOption;->char:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method public getCoorType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/baidu/location/LocationClientOption;->try:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method public getPoiDistance()F
    .locals 1

    iget v0, p0, Lcom/baidu/location/LocationClientOption;->do:F

    #v0=(Integer);
    return v0
.end method

.method public getPoiExtranInfo()Z
    .locals 1

    iget-boolean v0, p0, Lcom/baidu/location/LocationClientOption;->if:Z

    #v0=(Boolean);
    return v0
.end method

.method public getPoiNumber()I
    .locals 1

    iget v0, p0, Lcom/baidu/location/LocationClientOption;->a:I

    #v0=(Integer);
    return v0
.end method

.method public getPriority()I
    .locals 1

    iget v0, p0, Lcom/baidu/location/LocationClientOption;->goto:I

    #v0=(Integer);
    return v0
.end method

.method public getProdName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/baidu/location/LocationClientOption;->new:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method public getScanSpan()I
    .locals 1

    iget v0, p0, Lcom/baidu/location/LocationClientOption;->int:I

    #v0=(Integer);
    return v0
.end method

.method public getServiceName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/baidu/location/LocationClientOption;->byte:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method public getTimeOut()I
    .locals 1

    iget v0, p0, Lcom/baidu/location/LocationClientOption;->long:I

    #v0=(Integer);
    return v0
.end method

.method public isDisableCache()Z
    .locals 1

    iget-boolean v0, p0, Lcom/baidu/location/LocationClientOption;->for:Z

    #v0=(Boolean);
    return v0
.end method

.method public isLocationNotify()Z
    .locals 1

    iget-boolean v0, p0, Lcom/baidu/location/LocationClientOption;->void:Z

    #v0=(Boolean);
    return v0
.end method

.method public isOpenGps()Z
    .locals 1

    iget-boolean v0, p0, Lcom/baidu/location/LocationClientOption;->case:Z

    #v0=(Boolean);
    return v0
.end method

.method public setAddrType(Ljava/lang/String;)V
    .locals 2

    const/16 v1, 0x20

    #v1=(PosByte);
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    #v0=(Integer);
    if-le v0, v1, :cond_0

    const/4 v0, 0x0

    #v0=(Null);
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    :cond_0
    #v0=(Integer);
    iput-object p1, p0, Lcom/baidu/location/LocationClientOption;->char:Ljava/lang/String;

    return-void
.end method

.method public setCoorType(Ljava/lang/String;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    const-string v1, "gcj02"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_0

    const-string v1, "bd09"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_0

    const-string v1, "bd09ll"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_1

    :cond_0
    iput-object v0, p0, Lcom/baidu/location/LocationClientOption;->try:Ljava/lang/String;

    :cond_1
    return-void
.end method

.method public setLocationNotify(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/baidu/location/LocationClientOption;->void:Z

    return-void
.end method

.method public setOpenGps(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/baidu/location/LocationClientOption;->case:Z

    return-void
.end method

.method public setPoiDistance(F)V
    .locals 0

    iput p1, p0, Lcom/baidu/location/LocationClientOption;->do:F

    return-void
.end method

.method public setPoiExtraInfo(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/baidu/location/LocationClientOption;->if:Z

    return-void
.end method

.method public setPoiNumber(I)V
    .locals 1

    const/16 v0, 0xa

    #v0=(PosByte);
    if-le p1, v0, :cond_0

    move p1, v0

    :cond_0
    iput p1, p0, Lcom/baidu/location/LocationClientOption;->a:I

    return-void
.end method

.method public setPriority(I)V
    .locals 1

    const/4 v0, 0x1

    #v0=(One);
    if-eq p1, v0, :cond_0

    const/4 v0, 0x2

    #v0=(PosByte);
    if-ne p1, v0, :cond_1

    :cond_0
    iput p1, p0, Lcom/baidu/location/LocationClientOption;->goto:I

    :cond_1
    return-void
.end method

.method public setProdName(Ljava/lang/String;)V
    .locals 2

    const/16 v1, 0x40

    #v1=(PosByte);
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    #v0=(Integer);
    if-le v0, v1, :cond_0

    const/4 v0, 0x0

    #v0=(Null);
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    :cond_0
    #v0=(Integer);
    iput-object p1, p0, Lcom/baidu/location/LocationClientOption;->new:Ljava/lang/String;

    return-void
.end method

.method public setScanSpan(I)V
    .locals 0

    iput p1, p0, Lcom/baidu/location/LocationClientOption;->int:I

    return-void
.end method

.method public setServiceName(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/baidu/location/LocationClientOption;->byte:Ljava/lang/String;

    return-void
.end method

.method public setTimeOut(I)V
    .locals 0

    iput p1, p0, Lcom/baidu/location/LocationClientOption;->long:I

    return-void
.end method

*/}
