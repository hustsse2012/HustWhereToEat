package com.baidu.location; class BDErrorReport {/*

.class public abstract Lcom/baidu/location/BDErrorReport;
.super Ljava/lang/Object;


# instance fields
.field private a:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Lcom/baidu/location/BDErrorReport;->a:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lcom/baidu/location/BDErrorReport;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Lcom/baidu/location/BDErrorReport;->a:Ljava/lang/String;

    iget-object v0, p1, Lcom/baidu/location/BDErrorReport;->a:Ljava/lang/String;

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/location/BDErrorReport;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getErrorInfo()Landroid/os/Bundle;
    .locals 3

    iget-object v0, p0, Lcom/baidu/location/BDErrorReport;->a:Ljava/lang/String;

    #v0=(Reference);
    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    #v1=(Conflicted);v2=(Conflicted);
    return-object v0

    :cond_0
    #v1=(Uninit);v2=(Uninit);
    new-instance v0, Landroid/os/Bundle;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    #v0=(Reference);
    const-string v1, "errInfo"

    #v1=(Reference);
    iget-object v2, p0, Lcom/baidu/location/BDErrorReport;->a:Ljava/lang/String;

    #v2=(Reference);
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public abstract onReportResult(Z)V
.end method

.method public setErrorInfo(ZDDZLjava/lang/String;DDLjava/lang/String;Ljava/lang/String;)I
    .locals 7

    new-instance v1, Ljava/lang/StringBuffer;

    #v1=(UninitRef);
    const/16 v2, 0x400

    #v2=(PosShort);
    invoke-direct {v1, v2}, Ljava/lang/StringBuffer;-><init>(I)V

    #v1=(Reference);
    const-string v2, "&report=1"

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    if-eqz p1, :cond_0

    sget-object v2, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    const-string v3, "&ell=%.5f|%.5f"

    #v3=(Reference);
    const/4 v4, 0x2

    #v4=(PosByte);
    new-array v4, v4, [Ljava/lang/Object;

    #v4=(Reference);
    const/4 v5, 0x0

    #v5=(Null);
    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v6

    #v6=(Reference);
    aput-object v6, v4, v5

    const/4 v5, 0x1

    #v5=(One);
    invoke-static {p4, p5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v6

    aput-object v6, v4, v5

    invoke-static {v2, v3, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :cond_0
    #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    if-eqz p6, :cond_2

    if-eqz p7, :cond_7

    const-string v2, "gcj02"

    invoke-virtual {p7, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    #v2=(Boolean);
    if-nez v2, :cond_1

    const-string v2, "bd09"

    #v2=(Reference);
    invoke-virtual {p7, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    #v2=(Boolean);
    if-nez v2, :cond_1

    const-string v2, "bd09ll"

    #v2=(Reference);
    invoke-virtual {p7, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    #v2=(Boolean);
    if-nez v2, :cond_1

    const-string v2, "gps"

    #v2=(Reference);
    invoke-virtual {p7, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_7

    :cond_1
    sget-object v2, Ljava/util/Locale;->CHINA:Ljava/util/Locale;

    #v2=(Reference);
    const-string v3, "&ugc=%.5f|%.5f"

    #v3=(Reference);
    const/4 v4, 0x2

    #v4=(PosByte);
    new-array v4, v4, [Ljava/lang/Object;

    #v4=(Reference);
    const/4 v5, 0x0

    #v5=(Null);
    invoke-static/range {p8 .. p9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v6

    #v6=(Reference);
    aput-object v6, v4, v5

    const/4 v5, 0x1

    #v5=(One);
    invoke-static/range {p10 .. p11}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v6

    aput-object v6, v4, v5

    invoke-static {v2, v3, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    const-string v2, "&ucoord="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    invoke-virtual {v1, p7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :cond_2
    #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    if-eqz p12, :cond_4

    invoke-virtual/range {p12 .. p12}, Ljava/lang/String;->length()I

    move-result v2

    #v2=(Integer);
    const/16 v3, 0x3c

    #v3=(PosByte);
    if-le v2, v3, :cond_3

    const/4 v2, 0x0

    #v2=(Null);
    const/16 v3, 0x3c

    move-object/from16 v0, p12

    #v0=(Reference);
    invoke-virtual {v0, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p12

    :cond_3
    #v0=(Conflicted);v2=(Integer);
    const-string v2, "&ver="

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-object/from16 v0, p12

    #v0=(Reference);
    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :cond_4
    #v0=(Conflicted);v3=(Conflicted);
    if-eqz p13, :cond_6

    invoke-virtual/range {p13 .. p13}, Ljava/lang/String;->length()I

    move-result v2

    #v2=(Integer);
    const/16 v3, 0x200

    #v3=(PosShort);
    if-le v2, v3, :cond_5

    const/4 v2, 0x0

    #v2=(Null);
    const/16 v3, 0x200

    move-object/from16 v0, p13

    #v0=(Reference);
    invoke-virtual {v0, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p13

    :cond_5
    #v0=(Conflicted);v2=(Integer);
    const-string v2, "&erInfo="

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    move-object/from16 v0, p13

    #v0=(Reference);
    invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    :cond_6
    #v0=(Conflicted);v3=(Conflicted);
    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/baidu/location/BDErrorReport;->a:Ljava/lang/String;

    const/4 v1, 0x0

    :goto_0
    #v1=(Boolean);v2=(Conflicted);
    return v1

    :cond_7
    #v0=(Uninit);v1=(Reference);
    const/4 v1, 0x1

    #v1=(One);
    goto :goto_0
.end method

*/}
