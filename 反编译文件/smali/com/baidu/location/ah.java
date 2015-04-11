package com.baidu.location; class ah {/*

.class public Lcom/baidu/location/ah;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/baidu/location/BDGeofence;


# static fields
.field private static final byte:Ljava/lang/String; = "Administrative"

.field private static final case:I = 0x2

.field private static final d:I = 0x64

.field private static final e:I = 0x2

.field private static final else:I = 0x1

.field private static final for:Ljava/lang/String; = "Circle"

.field private static final h:I = 0x3

.field public static final int:I = 0x1

.field private static final void:J = 0x278d00L


# instance fields
.field private final a:I

.field private b:F

.field private final c:I

.field private char:Z

.field private final do:Ljava/lang/String;

.field private f:Z

.field private g:J

.field private final goto:D

.field private if:Z

.field private final long:J

.field private final new:Ljava/lang/String;

.field private final try:D


# direct methods
.method public constructor <init>(ILjava/lang/String;DDIJLjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    invoke-static {p7}, Lcom/baidu/location/ah;->if(I)V

    invoke-static {p2}, Lcom/baidu/location/ah;->if(Ljava/lang/String;)V

    invoke-static {p3, p4, p5, p6}, Lcom/baidu/location/ah;->a(DD)V

    invoke-static {p10}, Lcom/baidu/location/ah;->a(Ljava/lang/String;)V

    invoke-static {p8, p9}, Lcom/baidu/location/ah;->if(J)V

    iput p1, p0, Lcom/baidu/location/ah;->c:I

    iput-object p2, p0, Lcom/baidu/location/ah;->do:Ljava/lang/String;

    iput-wide p3, p0, Lcom/baidu/location/ah;->goto:D

    iput-wide p5, p0, Lcom/baidu/location/ah;->try:D

    iput p7, p0, Lcom/baidu/location/ah;->a:I

    iput-wide p8, p0, Lcom/baidu/location/ah;->long:J

    iput-object p10, p0, Lcom/baidu/location/ah;->new:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;DDIJLjava/lang/String;)V
    .locals 11

    const/4 v1, 0x1

    #v1=(One);
    move-object v0, p0

    #v0=(UninitThis);
    move-object v2, p1

    #v2=(Reference);
    move-wide v3, p4

    #v3=(DoubleLo);v4=(DoubleHi);
    move-wide v5, p2

    #v5=(DoubleLo);v6=(DoubleHi);
    move/from16 v7, p6

    #v7=(Integer);
    move-wide/from16 v8, p7

    #v8=(LongLo);v9=(LongHi);
    move-object/from16 v10, p9

    #v10=(Reference);
    invoke-direct/range {v0 .. v10}, Lcom/baidu/location/ah;-><init>(ILjava/lang/String;DDIJLjava/lang/String;)V

    #v0=(Reference);p0=(Reference);
    return-void
.end method

.method private static a(I)Ljava/lang/String;
    .locals 1

    packed-switch p0, :pswitch_data_0

    const/4 v0, 0x0

    :goto_0
    #v0=(Reference);
    return-object v0

    :pswitch_0
    #v0=(Uninit);
    const-string v0, "Circle"

    #v0=(Reference);
    goto :goto_0

    :pswitch_1
    #v0=(Uninit);
    const-string v0, "Administrative"

    #v0=(Reference);
    goto :goto_0

    #v0=(Unknown);p0=(Unknown);
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private static a(DD)V
    .locals 0

    return-void
.end method

.method private static a(Ljava/lang/String;)V
    .locals 3

    const-string v0, "bd09"

    #v0=(Reference);
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_0

    const-string v0, "bd09ll"

    #v0=(Reference);
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_0

    const-string v0, "gcj02"

    #v0=(Reference);
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    #v0=(UninitRef);
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #v1=(Reference);
    const-string v2, "invalid coord type: "

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0

    :cond_0
    #v0=(Boolean);v1=(Uninit);v2=(Uninit);
    return-void
.end method

.method private static if(I)V
    .locals 3

    const/4 v0, 0x1

    #v0=(One);
    if-eq p0, v0, :cond_0

    const/4 v0, 0x2

    #v0=(PosByte);
    if-eq p0, v0, :cond_0

    const/4 v0, 0x3

    if-eq p0, v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    #v0=(UninitRef);
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #v1=(Reference);
    const-string v2, "invalid radius type: "

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0

    :cond_0
    #v0=(PosByte);v1=(Uninit);v2=(Uninit);
    return-void
.end method

.method private static if(J)V
    .locals 4

    long-to-double v0, p0

    #v0=(DoubleLo);v1=(DoubleHi);
    const-wide v2, 0x408f400000000000L

    #v2=(LongLo);v3=(LongHi);
    div-double/2addr v0, v2

    const-wide v2, 0x4143c68000000000L

    cmpl-double v0, v0, v2

    #v0=(Byte);
    if-lez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    #v0=(UninitRef);
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #v1=(Reference);
    const-string v2, "invalid druationMillis :"

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0

    :cond_0
    #v0=(Byte);v1=(DoubleHi);v2=(LongLo);
    return-void
.end method

.method private static if(Ljava/lang/String;)V
    .locals 3

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    #v0=(Integer);
    const/16 v1, 0x64

    #v1=(PosByte);
    if-le v0, v1, :cond_1

    :cond_0
    #v1=(Conflicted);
    new-instance v0, Ljava/lang/IllegalArgumentException;

    #v0=(UninitRef);
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #v1=(Reference);
    const-string v2, "Geofence name is null or too long: "

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0

    :cond_1
    #v0=(Integer);v1=(PosByte);v2=(Uninit);
    return-void
.end method


# virtual methods
.method public a()D
    .locals 2

    iget-wide v0, p0, Lcom/baidu/location/ah;->try:D

    #v0=(DoubleLo);v1=(DoubleHi);
    return-wide v0
.end method

.method public a(F)V
    .locals 0

    iput p1, p0, Lcom/baidu/location/ah;->b:F

    return-void
.end method

.method public a(J)V
    .locals 0

    iput-wide p1, p0, Lcom/baidu/location/ah;->g:J

    return-void
.end method

.method public a(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/baidu/location/ah;->if:Z

    return-void
.end method

.method public byte()D
    .locals 2

    iget-wide v0, p0, Lcom/baidu/location/ah;->goto:D

    #v0=(DoubleLo);v1=(DoubleHi);
    return-wide v0
.end method

.method public case()I
    .locals 1

    iget-boolean v0, p0, Lcom/baidu/location/ah;->char:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    #v0=(PosByte);
    return v0

    :cond_0
    #v0=(Boolean);
    iget-boolean v0, p0, Lcom/baidu/location/ah;->if:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x2

    #v0=(PosByte);
    goto :goto_0

    :cond_1
    #v0=(Boolean);
    const/4 v0, 0x3

    #v0=(PosByte);
    goto :goto_0
.end method

.method public char()J
    .locals 2

    iget-wide v0, p0, Lcom/baidu/location/ah;->g:J

    #v0=(LongLo);v1=(LongHi);
    return-wide v0
.end method

.method public do()F
    .locals 1

    iget v0, p0, Lcom/baidu/location/ah;->b:F

    #v0=(Integer);
    return v0
.end method

.method public do(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/baidu/location/ah;->f:Z

    return-void
.end method

.method public else()J
    .locals 2

    iget-wide v0, p0, Lcom/baidu/location/ah;->long:J

    #v0=(LongLo);v1=(LongHi);
    return-wide v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 6

    const/4 v0, 0x1

    #v0=(One);
    const/4 v1, 0x0

    #v1=(Null);
    if-ne p0, p1, :cond_1

    :cond_0
    :goto_0
    #v0=(Boolean);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    return v0

    :cond_1
    #v0=(One);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
    if-nez p1, :cond_2

    move v0, v1

    #v0=(Null);
    goto :goto_0

    :cond_2
    #v0=(One);
    instance-of v2, p1, Lcom/baidu/location/ah;

    #v2=(Boolean);
    if-nez v2, :cond_3

    move v0, v1

    #v0=(Null);
    goto :goto_0

    :cond_3
    #v0=(One);
    check-cast p1, Lcom/baidu/location/ah;

    iget v2, p0, Lcom/baidu/location/ah;->a:I

    #v2=(Integer);
    iget v3, p1, Lcom/baidu/location/ah;->a:I

    #v3=(Integer);
    if-eq v2, v3, :cond_4

    move v0, v1

    #v0=(Null);
    goto :goto_0

    :cond_4
    #v0=(One);
    iget-wide v2, p0, Lcom/baidu/location/ah;->goto:D

    #v2=(DoubleLo);v3=(DoubleHi);
    iget-wide v4, p1, Lcom/baidu/location/ah;->goto:D

    #v4=(DoubleLo);v5=(DoubleHi);
    cmpl-double v2, v2, v4

    #v2=(Byte);
    if-eqz v2, :cond_5

    move v0, v1

    #v0=(Null);
    goto :goto_0

    :cond_5
    #v0=(One);
    iget-wide v2, p0, Lcom/baidu/location/ah;->try:D

    #v2=(DoubleLo);
    iget-wide v4, p1, Lcom/baidu/location/ah;->try:D

    cmpl-double v2, v2, v4

    #v2=(Byte);
    if-eqz v2, :cond_6

    move v0, v1

    #v0=(Null);
    goto :goto_0

    :cond_6
    #v0=(One);
    iget v2, p0, Lcom/baidu/location/ah;->c:I

    #v2=(Integer);
    iget v3, p1, Lcom/baidu/location/ah;->c:I

    #v3=(Integer);
    if-eq v2, v3, :cond_7

    move v0, v1

    #v0=(Null);
    goto :goto_0

    :cond_7
    #v0=(One);
    iget-object v2, p0, Lcom/baidu/location/ah;->new:Ljava/lang/String;

    #v2=(Reference);
    iget-object v3, p1, Lcom/baidu/location/ah;->new:Ljava/lang/String;

    #v3=(Reference);
    if-eq v2, v3, :cond_0

    move v0, v1

    #v0=(Null);
    goto :goto_0
.end method

.method public for()Z
    .locals 1

    iget-boolean v0, p0, Lcom/baidu/location/ah;->char:Z

    #v0=(Boolean);
    return v0
.end method

.method public getGeofenceId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/baidu/location/ah;->do:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method public if(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/baidu/location/ah;->char:Z

    return-void
.end method

.method public if()Z
    .locals 1

    iget-boolean v0, p0, Lcom/baidu/location/ah;->if:Z

    #v0=(Boolean);
    return v0
.end method

.method public int()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/baidu/location/ah;->new:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method public new()I
    .locals 1

    iget v0, p0, Lcom/baidu/location/ah;->a:I

    #v0=(Integer);
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    const-string v0, "Geofence[Type:%s, Name:%s, latitude:%.6f, longitude:%.6f, radius:%.0f, expriation:%d, coordType:%s, fenceType:%d]"

    #v0=(Reference);
    const/16 v1, 0x8

    #v1=(PosByte);
    new-array v1, v1, [Ljava/lang/Object;

    #v1=(Reference);
    const/4 v2, 0x0

    #v2=(Null);
    iget v3, p0, Lcom/baidu/location/ah;->c:I

    #v3=(Integer);
    invoke-static {v3}, Lcom/baidu/location/ah;->a(I)Ljava/lang/String;

    move-result-object v3

    #v3=(Reference);
    aput-object v3, v1, v2

    const/4 v2, 0x1

    #v2=(One);
    iget-object v3, p0, Lcom/baidu/location/ah;->do:Ljava/lang/String;

    aput-object v3, v1, v2

    const/4 v2, 0x2

    #v2=(PosByte);
    iget-wide v3, p0, Lcom/baidu/location/ah;->goto:D

    #v3=(DoubleLo);v4=(DoubleHi);
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    #v3=(Reference);
    aput-object v3, v1, v2

    const/4 v2, 0x3

    iget-wide v3, p0, Lcom/baidu/location/ah;->try:D

    #v3=(DoubleLo);
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    #v3=(Reference);
    aput-object v3, v1, v2

    const/4 v2, 0x4

    iget v3, p0, Lcom/baidu/location/ah;->b:F

    #v3=(Integer);
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    #v3=(Reference);
    aput-object v3, v1, v2

    const/4 v2, 0x5

    iget-wide v3, p0, Lcom/baidu/location/ah;->long:J

    #v3=(LongLo);v4=(LongHi);
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    #v3=(Reference);
    aput-object v3, v1, v2

    const/4 v2, 0x6

    iget-object v3, p0, Lcom/baidu/location/ah;->new:Ljava/lang/String;

    aput-object v3, v1, v2

    const/4 v2, 0x7

    invoke-virtual {p0}, Lcom/baidu/location/ah;->case()I

    move-result v3

    #v3=(Integer);
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    #v3=(Reference);
    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public try()Z
    .locals 1

    iget-boolean v0, p0, Lcom/baidu/location/ah;->f:Z

    #v0=(Boolean);
    return v0
.end method

*/}
