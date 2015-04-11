package com.baidu.mapapi.search; class MKSearch {/*

.class public Lcom/baidu/mapapi/search/MKSearch;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/baidu/mapapi/search/MKSearch$1;,
        Lcom/baidu/mapapi/search/MKSearch$a;
    }
.end annotation


# static fields
.field public static final EBUS_NO_SUBWAY:I = 0x6

.field public static final EBUS_TIME_FIRST:I = 0x3

.field public static final EBUS_TRANSFER_FIRST:I = 0x4

.field public static final EBUS_WALK_FIRST:I = 0x5

.field public static final ECAR_AVOID_JAM:I = -0x1

.field public static final ECAR_DIS_FIRST:I = 0x1

.field public static final ECAR_FEE_FIRST:I = 0x2

.field public static final ECAR_TIME_FIRST:I = 0x0

.field public static final POI_DETAIL_SEARCH:I = 0x34

.field public static final TYPE_AREA_MULTI_POI_LIST:I = 0x2d

.field public static final TYPE_AREA_POI_LIST:I = 0x15

.field public static final TYPE_CITY_LIST:I = 0x7

.field public static final TYPE_POI_LIST:I = 0xb

.field private static final b:Ljava/lang/String;


# instance fields
.field a:Lcom/baidu/mapapi/search/MKSearchListener;

.field private c:Lcom/baidu/platform/comapi/basestruct/b;

.field private d:Ljava/lang/String;

.field private e:[Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:I

.field private h:I

.field private i:I

.field private j:I

.field private k:I

.field private l:Lcom/baidu/mapapi/search/MKSearch$a;

.field private m:Lcom/baidu/mapapi/BMapManager;

.field private n:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/baidu/mapapi/search/MKSearch;

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/baidu/mapapi/search/MKSearch;->b:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    const/4 v2, 0x0

    #v2=(Null);
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    new-instance v0, Lcom/baidu/platform/comapi/basestruct/b;

    #v0=(UninitRef);
    invoke-direct {v0}, Lcom/baidu/platform/comapi/basestruct/b;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/mapapi/search/MKSearch;->c:Lcom/baidu/platform/comapi/basestruct/b;

    const/4 v0, 0x3

    #v0=(PosByte);
    iput v0, p0, Lcom/baidu/mapapi/search/MKSearch;->h:I

    iput v2, p0, Lcom/baidu/mapapi/search/MKSearch;->i:I

    iput v2, p0, Lcom/baidu/mapapi/search/MKSearch;->j:I

    iput v2, p0, Lcom/baidu/mapapi/search/MKSearch;->k:I

    new-instance v0, Lcom/baidu/mapapi/search/MKSearch$a;

    #v0=(UninitRef);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-direct {v0, p0, v1}, Lcom/baidu/mapapi/search/MKSearch$a;-><init>(Lcom/baidu/mapapi/search/MKSearch;Lcom/baidu/mapapi/search/MKSearch$1;)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/mapapi/search/MKSearch;->l:Lcom/baidu/mapapi/search/MKSearch$a;

    iput v2, p0, Lcom/baidu/mapapi/search/MKSearch;->n:I

    return-void
.end method

.method static synthetic a(Lcom/baidu/mapapi/search/MKSearch;)I
    .locals 1

    iget v0, p0, Lcom/baidu/mapapi/search/MKSearch;->k:I

    #v0=(Integer);
    return v0
.end method

.method static synthetic a(Lcom/baidu/mapapi/search/MKSearch;I)I
    .locals 0

    iput p1, p0, Lcom/baidu/mapapi/search/MKSearch;->k:I

    return p1
.end method

.method private static a(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)Lcom/baidu/platform/comapi/basestruct/c;
    .locals 6

    const-wide v4, 0x412e848000000000L

    #v4=(LongLo);v5=(LongHi);
    invoke-static {}, Lcom/baidu/platform/comapi/a/a;->a()Lcom/baidu/platform/comapi/a/a;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {p0}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLongitudeE6()I

    move-result v1

    #v1=(Integer);
    int-to-double v1, v1

    #v1=(DoubleLo);v2=(DoubleHi);
    div-double/2addr v1, v4

    double-to-float v1, v1

    #v1=(Float);
    invoke-virtual {p0}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLatitudeE6()I

    move-result v2

    #v2=(Integer);
    int-to-double v2, v2

    #v2=(DoubleLo);v3=(DoubleHi);
    div-double/2addr v2, v4

    double-to-float v2, v2

    #v2=(Float);
    const-string v3, "bd09ll"

    #v3=(Reference);
    invoke-virtual {v0, v1, v2, v3}, Lcom/baidu/platform/comapi/a/a;->a(FFLjava/lang/String;)Lcom/baidu/platform/comapi/basestruct/c;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/baidu/mapapi/search/MKSearch;->b:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic b(Lcom/baidu/mapapi/search/MKSearch;)I
    .locals 1

    iget v0, p0, Lcom/baidu/mapapi/search/MKSearch;->n:I

    #v0=(Integer);
    return v0
.end method

.method static synthetic c(Lcom/baidu/mapapi/search/MKSearch;)Lcom/baidu/mapapi/BMapManager;
    .locals 1

    iget-object v0, p0, Lcom/baidu/mapapi/search/MKSearch;->m:Lcom/baidu/mapapi/BMapManager;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic d(Lcom/baidu/mapapi/search/MKSearch;)I
    .locals 1

    iget v0, p0, Lcom/baidu/mapapi/search/MKSearch;->j:I

    #v0=(Integer);
    return v0
.end method

.method public static getPoiPageCapacity()I
    .locals 1

    invoke-static {}, Lcom/baidu/platform/comapi/b/e;->a()Lcom/baidu/platform/comapi/b/e;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/platform/comapi/b/e;->c()I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public static setPoiPageCapacity(I)V
    .locals 1

    invoke-static {}, Lcom/baidu/platform/comapi/b/e;->a()Lcom/baidu/platform/comapi/b/e;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0, p0}, Lcom/baidu/platform/comapi/b/e;->a(I)V

    return-void
.end method


# virtual methods
.method public busLineSearch(Ljava/lang/String;Ljava/lang/String;)I
    .locals 3

    const/4 v0, -0x1

    #v0=(Byte);
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    #v1=(Integer);
    if-lez v1, :cond_0

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    if-gtz v1, :cond_1

    :cond_0
    :goto_0
    #v1=(Conflicted);v2=(Conflicted);
    return v0

    :cond_1
    #v1=(Integer);v2=(Uninit);
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v2, 0x1f

    #v2=(PosByte);
    if-gt v1, v2, :cond_0

    iget v1, p0, Lcom/baidu/mapapi/search/MKSearch;->k:I

    iput v1, p0, Lcom/baidu/mapapi/search/MKSearch;->j:I

    const/16 v1, 0xd

    #v1=(PosByte);
    iput v1, p0, Lcom/baidu/mapapi/search/MKSearch;->k:I

    invoke-static {}, Lcom/baidu/platform/comapi/b/e;->a()Lcom/baidu/platform/comapi/b/e;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1, p1, p2}, Lcom/baidu/platform/comapi/b/e;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_0

    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public drivingSearch(Ljava/lang/String;Lcom/baidu/mapapi/search/MKPlanNode;Ljava/lang/String;Lcom/baidu/mapapi/search/MKPlanNode;)I
    .locals 13

    if-eqz p2, :cond_0

    if-nez p4, :cond_1

    :cond_0
    const/4 v1, -0x1

    :goto_0
    #v0=(Conflicted);v1=(Byte);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
    return v1

    :cond_1
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);
    new-instance v2, Lcom/baidu/platform/comapi/b/b;

    #v2=(UninitRef);
    invoke-direct {v2}, Lcom/baidu/platform/comapi/b/b;-><init>()V

    #v2=(Reference);
    iget-object v1, p2, Lcom/baidu/mapapi/search/MKPlanNode;->name:Ljava/lang/String;

    #v1=(Reference);
    if-eqz v1, :cond_2

    iget-object v1, p2, Lcom/baidu/mapapi/search/MKPlanNode;->name:Ljava/lang/String;

    iput-object v1, v2, Lcom/baidu/platform/comapi/b/b;->c:Ljava/lang/String;

    :cond_2
    iget-object v1, p2, Lcom/baidu/mapapi/search/MKPlanNode;->pt:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    if-eqz v1, :cond_4

    iget-object v1, p2, Lcom/baidu/mapapi/search/MKPlanNode;->pt:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    invoke-static {v1}, Lcom/baidu/mapapi/search/MKSearch;->a(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)Lcom/baidu/platform/comapi/basestruct/c;

    move-result-object v1

    iput-object v1, v2, Lcom/baidu/platform/comapi/b/b;->b:Lcom/baidu/platform/comapi/basestruct/c;

    const/4 v1, 0x1

    #v1=(One);
    iput v1, v2, Lcom/baidu/platform/comapi/b/b;->a:I

    move-object v5, p1

    :goto_1
    #v1=(Conflicted);v5=(Reference);
    new-instance v3, Lcom/baidu/platform/comapi/b/b;

    #v3=(UninitRef);
    invoke-direct {v3}, Lcom/baidu/platform/comapi/b/b;-><init>()V

    #v3=(Reference);
    move-object/from16 v0, p4

    #v0=(Reference);
    iget-object v1, v0, Lcom/baidu/mapapi/search/MKPlanNode;->name:Ljava/lang/String;

    #v1=(Reference);
    if-eqz v1, :cond_3

    move-object/from16 v0, p4

    iget-object v1, v0, Lcom/baidu/mapapi/search/MKPlanNode;->name:Ljava/lang/String;

    iput-object v1, v3, Lcom/baidu/platform/comapi/b/b;->c:Ljava/lang/String;

    :cond_3
    move-object/from16 v0, p4

    iget-object v1, v0, Lcom/baidu/mapapi/search/MKPlanNode;->pt:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    if-eqz v1, :cond_6

    move-object/from16 v0, p4

    iget-object v1, v0, Lcom/baidu/mapapi/search/MKPlanNode;->pt:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    invoke-static {v1}, Lcom/baidu/mapapi/search/MKSearch;->a(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)Lcom/baidu/platform/comapi/basestruct/c;

    move-result-object v1

    iput-object v1, v3, Lcom/baidu/platform/comapi/b/b;->b:Lcom/baidu/platform/comapi/basestruct/c;

    const/4 v1, 0x1

    #v1=(One);
    iput v1, v3, Lcom/baidu/platform/comapi/b/b;->a:I

    move-object/from16 v6, p3

    :goto_2
    #v1=(Conflicted);v6=(Reference);
    iget v1, p0, Lcom/baidu/mapapi/search/MKSearch;->k:I

    #v1=(Integer);
    iput v1, p0, Lcom/baidu/mapapi/search/MKSearch;->j:I

    const/4 v1, 0x2

    #v1=(PosByte);
    iput v1, p0, Lcom/baidu/mapapi/search/MKSearch;->k:I

    invoke-static {}, Lcom/baidu/platform/comapi/b/e;->a()Lcom/baidu/platform/comapi/b/e;

    move-result-object v1

    #v1=(Reference);
    const/4 v4, 0x0

    #v4=(Null);
    const/4 v7, 0x0

    #v7=(Null);
    const/16 v8, 0xc

    #v8=(PosByte);
    iget v9, p0, Lcom/baidu/mapapi/search/MKSearch;->i:I

    #v9=(Integer);
    const/4 v10, 0x0

    #v10=(Null);
    const/4 v11, 0x0

    #v11=(Null);
    const/4 v12, 0x0

    #v12=(Null);
    invoke-virtual/range {v1 .. v12}, Lcom/baidu/platform/comapi/b/e;->a(Lcom/baidu/platform/comapi/b/b;Lcom/baidu/platform/comapi/b/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/baidu/platform/comapi/basestruct/b;IIILjava/util/ArrayList;Ljava/util/Map;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_8

    const/4 v1, 0x0

    #v1=(Null);
    goto :goto_0

    :cond_4
    #v0=(Uninit);v1=(Reference);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);
    if-eqz p1, :cond_5

    const-string v1, ""

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_a

    :cond_5
    #v1=(Conflicted);
    const-string p1, "1"

    move-object v5, p1

    #v5=(Reference);
    goto :goto_1

    :cond_6
    #v0=(Reference);v1=(Reference);v3=(Reference);
    if-eqz p3, :cond_7

    const-string v1, ""

    move-object/from16 v0, p3

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_9

    :cond_7
    #v1=(Conflicted);
    const-string p3, "1"

    move-object/from16 v6, p3

    #v6=(Reference);
    goto :goto_2

    :cond_8
    #v1=(Boolean);v4=(Null);v7=(Null);v8=(PosByte);v9=(Integer);v10=(Null);v11=(Null);v12=(Null);
    const/4 v1, -0x1

    #v1=(Byte);
    goto :goto_0

    :cond_9
    #v1=(Boolean);v4=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);
    move-object/from16 v6, p3

    #v6=(Reference);
    goto :goto_2

    :cond_a
    #v0=(Uninit);v3=(Uninit);v5=(Uninit);v6=(Uninit);
    move-object v5, p1

    #v5=(Reference);
    goto :goto_1
.end method

.method public drivingSearch(Ljava/lang/String;Lcom/baidu/mapapi/search/MKPlanNode;Ljava/lang/String;Lcom/baidu/mapapi/search/MKPlanNode;Ljava/util/List;)I
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/baidu/mapapi/search/MKPlanNode;",
            "Ljava/lang/String;",
            "Lcom/baidu/mapapi/search/MKPlanNode;",
            "Ljava/util/List",
            "<",
            "Lcom/baidu/mapapi/search/MKWpNode;",
            ">;)I"
        }
    .end annotation

    if-eqz p2, :cond_0

    if-nez p4, :cond_1

    :cond_0
    const/4 v1, -0x1

    :goto_0
    #v0=(Conflicted);v1=(Byte);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
    return v1

    :cond_1
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);
    new-instance v2, Lcom/baidu/platform/comapi/b/b;

    #v2=(UninitRef);
    invoke-direct {v2}, Lcom/baidu/platform/comapi/b/b;-><init>()V

    #v2=(Reference);
    iget-object v1, p2, Lcom/baidu/mapapi/search/MKPlanNode;->name:Ljava/lang/String;

    #v1=(Reference);
    if-eqz v1, :cond_2

    iget-object v1, p2, Lcom/baidu/mapapi/search/MKPlanNode;->name:Ljava/lang/String;

    iput-object v1, v2, Lcom/baidu/platform/comapi/b/b;->c:Ljava/lang/String;

    :cond_2
    iget-object v1, p2, Lcom/baidu/mapapi/search/MKPlanNode;->pt:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    if-eqz v1, :cond_8

    iget-object v1, p2, Lcom/baidu/mapapi/search/MKPlanNode;->pt:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    invoke-static {v1}, Lcom/baidu/mapapi/search/MKSearch;->a(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)Lcom/baidu/platform/comapi/basestruct/c;

    move-result-object v1

    iput-object v1, v2, Lcom/baidu/platform/comapi/b/b;->b:Lcom/baidu/platform/comapi/basestruct/c;

    const/4 v1, 0x1

    #v1=(One);
    iput v1, v2, Lcom/baidu/platform/comapi/b/b;->a:I

    move-object v5, p1

    :goto_1
    #v1=(Conflicted);v5=(Reference);
    new-instance v3, Lcom/baidu/platform/comapi/b/b;

    #v3=(UninitRef);
    invoke-direct {v3}, Lcom/baidu/platform/comapi/b/b;-><init>()V

    #v3=(Reference);
    move-object/from16 v0, p4

    #v0=(Reference);
    iget-object v1, v0, Lcom/baidu/mapapi/search/MKPlanNode;->name:Ljava/lang/String;

    #v1=(Reference);
    if-eqz v1, :cond_3

    move-object/from16 v0, p4

    iget-object v1, v0, Lcom/baidu/mapapi/search/MKPlanNode;->name:Ljava/lang/String;

    iput-object v1, v3, Lcom/baidu/platform/comapi/b/b;->c:Ljava/lang/String;

    :cond_3
    move-object/from16 v0, p4

    iget-object v1, v0, Lcom/baidu/mapapi/search/MKPlanNode;->pt:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    if-eqz v1, :cond_a

    move-object/from16 v0, p4

    iget-object v1, v0, Lcom/baidu/mapapi/search/MKPlanNode;->pt:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    invoke-static {v1}, Lcom/baidu/mapapi/search/MKSearch;->a(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)Lcom/baidu/platform/comapi/basestruct/c;

    move-result-object v1

    iput-object v1, v3, Lcom/baidu/platform/comapi/b/b;->b:Lcom/baidu/platform/comapi/basestruct/c;

    const/4 v1, 0x1

    #v1=(One);
    iput v1, v3, Lcom/baidu/platform/comapi/b/b;->a:I

    move-object/from16 v6, p3

    :goto_2
    #v1=(Conflicted);v6=(Reference);
    iget v1, p0, Lcom/baidu/mapapi/search/MKSearch;->k:I

    #v1=(Integer);
    iput v1, p0, Lcom/baidu/mapapi/search/MKSearch;->j:I

    const/4 v1, 0x2

    #v1=(PosByte);
    iput v1, p0, Lcom/baidu/mapapi/search/MKSearch;->k:I

    new-instance v11, Ljava/util/ArrayList;

    #v11=(UninitRef);
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    #v11=(Reference);
    invoke-interface/range {p5 .. p5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_4
    :goto_3
    #v1=(Conflicted);v4=(Reference);v7=(Conflicted);v8=(Conflicted);
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_d

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    #v1=(Reference);
    check-cast v1, Lcom/baidu/mapapi/search/MKWpNode;

    iget-object v7, v1, Lcom/baidu/mapapi/search/MKWpNode;->pt:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    #v7=(Reference);
    if-nez v7, :cond_5

    iget-object v7, v1, Lcom/baidu/mapapi/search/MKWpNode;->name:Ljava/lang/String;

    if-eqz v7, :cond_4

    iget-object v7, v1, Lcom/baidu/mapapi/search/MKWpNode;->city:Ljava/lang/String;

    if-eqz v7, :cond_4

    iget-object v7, v1, Lcom/baidu/mapapi/search/MKWpNode;->name:Ljava/lang/String;

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v7

    #v7=(Integer);
    if-eqz v7, :cond_4

    iget-object v7, v1, Lcom/baidu/mapapi/search/MKWpNode;->city:Ljava/lang/String;

    #v7=(Reference);
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v7

    #v7=(Integer);
    if-eqz v7, :cond_4

    :cond_5
    #v7=(Conflicted);
    new-instance v7, Lcom/baidu/platform/comapi/b/g;

    #v7=(UninitRef);
    invoke-direct {v7}, Lcom/baidu/platform/comapi/b/g;-><init>()V

    #v7=(Reference);
    iget-object v8, v1, Lcom/baidu/mapapi/search/MKWpNode;->name:Ljava/lang/String;

    #v8=(Reference);
    if-eqz v8, :cond_6

    iget-object v8, v1, Lcom/baidu/mapapi/search/MKWpNode;->name:Ljava/lang/String;

    iput-object v8, v7, Lcom/baidu/platform/comapi/b/g;->b:Ljava/lang/String;

    :cond_6
    iget-object v8, v1, Lcom/baidu/mapapi/search/MKWpNode;->pt:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    if-eqz v8, :cond_7

    iget-object v8, v1, Lcom/baidu/mapapi/search/MKWpNode;->pt:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    invoke-static {v8}, Lcom/baidu/mapapi/search/MKSearch;->a(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)Lcom/baidu/platform/comapi/basestruct/c;

    move-result-object v8

    iput-object v8, v7, Lcom/baidu/platform/comapi/b/g;->a:Lcom/baidu/platform/comapi/basestruct/c;

    :cond_7
    iget-object v8, v1, Lcom/baidu/mapapi/search/MKWpNode;->city:Ljava/lang/String;

    if-nez v8, :cond_c

    const-string v1, ""

    iput-object v1, v7, Lcom/baidu/platform/comapi/b/g;->c:Ljava/lang/String;

    :goto_4
    invoke-virtual {v11, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_8
    #v0=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v11=(Uninit);
    if-eqz p1, :cond_9

    const-string v1, ""

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_10

    :cond_9
    #v1=(Conflicted);
    const-string p1, "1"

    move-object v5, p1

    #v5=(Reference);
    goto/16 :goto_1

    :cond_a
    #v0=(Reference);v1=(Reference);v3=(Reference);
    if-eqz p3, :cond_b

    const-string v1, ""

    move-object/from16 v0, p3

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_f

    :cond_b
    #v1=(Conflicted);
    const-string p3, "1"

    move-object/from16 v6, p3

    #v6=(Reference);
    goto :goto_2

    :cond_c
    #v1=(Reference);v4=(Reference);v7=(Reference);v8=(Reference);v11=(Reference);
    iget-object v1, v1, Lcom/baidu/mapapi/search/MKWpNode;->city:Ljava/lang/String;

    iput-object v1, v7, Lcom/baidu/platform/comapi/b/g;->c:Ljava/lang/String;

    goto :goto_4

    :cond_d
    #v1=(Boolean);v7=(Conflicted);v8=(Conflicted);
    invoke-static {}, Lcom/baidu/platform/comapi/b/e;->a()Lcom/baidu/platform/comapi/b/e;

    move-result-object v1

    #v1=(Reference);
    const/4 v4, 0x0

    #v4=(Null);
    const/4 v7, 0x0

    #v7=(Null);
    const/16 v8, 0xc

    #v8=(PosByte);
    iget v9, p0, Lcom/baidu/mapapi/search/MKSearch;->i:I

    #v9=(Integer);
    const/4 v10, 0x0

    #v10=(Null);
    const/4 v12, 0x0

    #v12=(Null);
    invoke-virtual/range {v1 .. v12}, Lcom/baidu/platform/comapi/b/e;->a(Lcom/baidu/platform/comapi/b/b;Lcom/baidu/platform/comapi/b/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/baidu/platform/comapi/basestruct/b;IIILjava/util/ArrayList;Ljava/util/Map;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_e

    const/4 v1, 0x0

    #v1=(Null);
    goto/16 :goto_0

    :cond_e
    #v1=(Boolean);
    const/4 v1, -0x1

    #v1=(Byte);
    goto/16 :goto_0

    :cond_f
    #v1=(Boolean);v4=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);
    move-object/from16 v6, p3

    #v6=(Reference);
    goto/16 :goto_2

    :cond_10
    #v0=(Uninit);v3=(Uninit);v5=(Uninit);v6=(Uninit);
    move-object v5, p1

    #v5=(Reference);
    goto/16 :goto_1
.end method

.method public geocode(Ljava/lang/String;Ljava/lang/String;)I
    .locals 3

    const/4 v0, -0x1

    #v0=(Byte);
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    #v1=(Integer);
    if-eqz v1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v2, 0x63

    #v2=(PosByte);
    if-le v1, v2, :cond_1

    :cond_0
    :goto_0
    #v1=(Conflicted);v2=(Conflicted);
    return v0

    :cond_1
    #v1=(Integer);v2=(PosByte);
    iget v1, p0, Lcom/baidu/mapapi/search/MKSearch;->k:I

    iput v1, p0, Lcom/baidu/mapapi/search/MKSearch;->j:I

    const/4 v1, 0x4

    #v1=(PosByte);
    iput v1, p0, Lcom/baidu/mapapi/search/MKSearch;->k:I

    invoke-static {}, Lcom/baidu/platform/comapi/b/e;->a()Lcom/baidu/platform/comapi/b/e;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1, p1, p2}, Lcom/baidu/platform/comapi/b/e;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_0

    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public goToPoiPage(I)I
    .locals 9

    iget v0, p0, Lcom/baidu/mapapi/search/MKSearch;->k:I

    #v0=(Integer);
    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x0

    :goto_0
    #v0=(Byte);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    return v0

    :pswitch_0
    #v0=(Integer);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);
    invoke-static {}, Lcom/baidu/platform/comapi/b/e;->a()Lcom/baidu/platform/comapi/b/e;

    move-result-object v0

    #v0=(Reference);
    iget-object v1, p0, Lcom/baidu/mapapi/search/MKSearch;->d:Ljava/lang/String;

    #v1=(Reference);
    const/4 v2, 0x1

    #v2=(One);
    iput p1, p0, Lcom/baidu/mapapi/search/MKSearch;->n:I

    iget-object v4, p0, Lcom/baidu/mapapi/search/MKSearch;->c:Lcom/baidu/platform/comapi/basestruct/b;

    #v4=(Reference);
    const/16 v5, 0xc

    #v5=(PosByte);
    const/4 v6, 0x0

    #v6=(Null);
    const/4 v7, 0x0

    #v7=(Null);
    move v3, p1

    #v3=(Integer);
    invoke-virtual/range {v0 .. v7}, Lcom/baidu/platform/comapi/b/e;->a(Ljava/lang/String;IILcom/baidu/platform/comapi/basestruct/b;ILcom/baidu/platform/comapi/basestruct/c;Ljava/util/Map;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0

    :cond_0
    #v0=(Boolean);
    const/4 v0, -0x1

    #v0=(Byte);
    goto :goto_0

    :pswitch_1
    #v0=(Integer);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
    invoke-static {}, Lcom/baidu/platform/comapi/b/e;->a()Lcom/baidu/platform/comapi/b/e;

    move-result-object v0

    #v0=(Reference);
    iget-object v1, p0, Lcom/baidu/mapapi/search/MKSearch;->d:Ljava/lang/String;

    #v1=(Reference);
    iget-object v2, p0, Lcom/baidu/mapapi/search/MKSearch;->f:Ljava/lang/String;

    #v2=(Reference);
    iput p1, p0, Lcom/baidu/mapapi/search/MKSearch;->n:I

    const/4 v4, 0x0

    #v4=(Null);
    const/16 v5, 0xc

    #v5=(PosByte);
    const/4 v6, 0x0

    #v6=(Null);
    move v3, p1

    #v3=(Integer);
    invoke-virtual/range {v0 .. v6}, Lcom/baidu/platform/comapi/b/e;->a(Ljava/lang/String;Ljava/lang/String;ILcom/baidu/platform/comapi/basestruct/b;ILjava/util/Map;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_1

    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0

    :cond_1
    #v0=(Boolean);
    const/4 v0, -0x1

    #v0=(Byte);
    goto :goto_0

    :pswitch_2
    #v0=(Integer);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
    new-instance v7, Ljava/util/HashMap;

    #v7=(UninitRef);
    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    #v7=(Reference);
    const-string v0, "distance"

    #v0=(Reference);
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #v1=(Reference);
    const-string v2, ""

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/baidu/mapapi/search/MKSearch;->g:I

    #v2=(Integer);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/baidu/platform/comapi/b/e;->a()Lcom/baidu/platform/comapi/b/e;

    move-result-object v0

    iget-object v1, p0, Lcom/baidu/mapapi/search/MKSearch;->d:Ljava/lang/String;

    const/4 v2, 0x1

    #v2=(One);
    iput p1, p0, Lcom/baidu/mapapi/search/MKSearch;->n:I

    const/16 v4, 0xc

    #v4=(PosByte);
    iget-object v5, p0, Lcom/baidu/mapapi/search/MKSearch;->c:Lcom/baidu/platform/comapi/basestruct/b;

    #v5=(Reference);
    iget-object v6, p0, Lcom/baidu/mapapi/search/MKSearch;->c:Lcom/baidu/platform/comapi/basestruct/b;

    #v6=(Reference);
    move v3, p1

    #v3=(Integer);
    invoke-virtual/range {v0 .. v7}, Lcom/baidu/platform/comapi/b/e;->a(Ljava/lang/String;IIILcom/baidu/platform/comapi/basestruct/b;Lcom/baidu/platform/comapi/basestruct/b;Ljava/util/Map;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_2

    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0

    :cond_2
    #v0=(Boolean);
    const/4 v0, -0x1

    #v0=(Byte);
    goto :goto_0

    :pswitch_3
    #v0=(Integer);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
    invoke-static {}, Lcom/baidu/platform/comapi/b/e;->a()Lcom/baidu/platform/comapi/b/e;

    move-result-object v0

    #v0=(Reference);
    iget-object v1, p0, Lcom/baidu/mapapi/search/MKSearch;->e:[Ljava/lang/String;

    #v1=(Reference);
    const/4 v2, 0x1

    #v2=(One);
    iput p1, p0, Lcom/baidu/mapapi/search/MKSearch;->n:I

    const/16 v4, 0xc

    #v4=(PosByte);
    const/4 v5, 0x0

    #v5=(Null);
    iget-object v6, p0, Lcom/baidu/mapapi/search/MKSearch;->c:Lcom/baidu/platform/comapi/basestruct/b;

    #v6=(Reference);
    iget-object v7, p0, Lcom/baidu/mapapi/search/MKSearch;->c:Lcom/baidu/platform/comapi/basestruct/b;

    #v7=(Reference);
    const/4 v8, 0x0

    #v8=(Null);
    move v3, p1

    #v3=(Integer);
    invoke-virtual/range {v0 .. v8}, Lcom/baidu/platform/comapi/b/e;->a([Ljava/lang/String;IIIILcom/baidu/platform/comapi/basestruct/b;Lcom/baidu/platform/comapi/basestruct/b;Ljava/util/Map;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_3

    const/4 v0, 0x0

    #v0=(Null);
    goto/16 :goto_0

    :cond_3
    #v0=(Boolean);
    const/4 v0, -0x1

    #v0=(Byte);
    goto/16 :goto_0

    #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);p0=(Unknown);p1=(Unknown);
    nop

    :pswitch_data_0
    .packed-switch 0x7
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_3
        :pswitch_3
    .end packed-switch
.end method

.method public init(Lcom/baidu/mapapi/BMapManager;Lcom/baidu/mapapi/search/MKSearchListener;)Z
    .locals 2

    if-nez p1, :cond_0

    const/4 v0, 0x0

    :goto_0
    #v0=(Boolean);v1=(Conflicted);
    return v0

    :cond_0
    #v0=(Uninit);v1=(Uninit);
    iput-object p1, p0, Lcom/baidu/mapapi/search/MKSearch;->m:Lcom/baidu/mapapi/BMapManager;

    if-eqz p2, :cond_1

    iput-object p2, p0, Lcom/baidu/mapapi/search/MKSearch;->a:Lcom/baidu/mapapi/search/MKSearchListener;

    :cond_1
    invoke-static {}, Lcom/baidu/platform/comapi/b/e;->a()Lcom/baidu/platform/comapi/b/e;

    move-result-object v0

    #v0=(Reference);
    iget-object v1, p0, Lcom/baidu/mapapi/search/MKSearch;->l:Lcom/baidu/mapapi/search/MKSearch$a;

    #v1=(Reference);
    invoke-virtual {v0, v1}, Lcom/baidu/platform/comapi/b/e;->a(Lcom/baidu/platform/comapi/b/c;)V

    const/4 v0, 0x1

    #v0=(One);
    goto :goto_0
.end method

.method public poiDetailSearch(Ljava/lang/String;)I
    .locals 3

    const/16 v2, 0xc

    #v2=(PosByte);
    const/4 v0, -0x1

    #v0=(Byte);
    if-nez p1, :cond_1

    :cond_0
    :goto_0
    #v1=(Conflicted);
    return v0

    :cond_1
    #v1=(Uninit);
    iget v1, p0, Lcom/baidu/mapapi/search/MKSearch;->k:I

    #v1=(Integer);
    if-eq v1, v2, :cond_0

    iget v1, p0, Lcom/baidu/mapapi/search/MKSearch;->k:I

    iput v1, p0, Lcom/baidu/mapapi/search/MKSearch;->j:I

    iput v2, p0, Lcom/baidu/mapapi/search/MKSearch;->k:I

    invoke-static {}, Lcom/baidu/platform/comapi/b/e;->a()Lcom/baidu/platform/comapi/b/e;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1, p1}, Lcom/baidu/platform/comapi/b/e;->a(Ljava/lang/String;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_0

    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public poiDetailShareURLSearch(Ljava/lang/String;)Z
    .locals 1

    if-nez p1, :cond_0

    const/4 v0, 0x0

    :goto_0
    #v0=(Boolean);
    return v0

    :cond_0
    #v0=(Uninit);
    iget v0, p0, Lcom/baidu/mapapi/search/MKSearch;->k:I

    #v0=(Integer);
    iput v0, p0, Lcom/baidu/mapapi/search/MKSearch;->j:I

    const/16 v0, 0xf

    #v0=(PosByte);
    iput v0, p0, Lcom/baidu/mapapi/search/MKSearch;->k:I

    invoke-static {}, Lcom/baidu/platform/comapi/b/e;->a()Lcom/baidu/platform/comapi/b/e;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0, p1}, Lcom/baidu/platform/comapi/b/e;->b(Ljava/lang/String;)Z

    move-result v0

    #v0=(Boolean);
    goto :goto_0
.end method

.method public poiMultiSearchInbounds([Ljava/lang/String;Lcom/baidu/platform/comapi/basestruct/GeoPoint;Lcom/baidu/platform/comapi/basestruct/GeoPoint;)I
    .locals 10

    const/16 v8, 0xa

    #v8=(PosByte);
    const/4 v3, 0x0

    #v3=(Null);
    const/4 v9, -0x1

    #v9=(Byte);
    const-wide v6, 0x412e848000000000L

    #v6=(LongLo);v7=(LongHi);
    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    if-nez p3, :cond_2

    :cond_0
    move v3, v9

    :cond_1
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Byte);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    return v3

    :cond_2
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Null);v4=(Uninit);v5=(Uninit);v6=(LongLo);v7=(LongHi);
    array-length v0, p1

    #v0=(Integer);
    const/4 v1, 0x2

    #v1=(PosByte);
    if-lt v0, v1, :cond_3

    array-length v0, p1

    if-le v0, v8, :cond_4

    :cond_3
    move v3, v9

    #v3=(Byte);
    goto :goto_0

    :cond_4
    #v3=(Null);
    invoke-static {}, Lcom/baidu/platform/comapi/a/a;->a()Lcom/baidu/platform/comapi/a/a;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {p2}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLongitudeE6()I

    move-result v1

    #v1=(Integer);
    int-to-double v1, v1

    #v1=(DoubleLo);v2=(DoubleHi);
    div-double/2addr v1, v6

    double-to-float v1, v1

    #v1=(Float);
    invoke-virtual {p2}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLatitudeE6()I

    move-result v2

    #v2=(Integer);
    int-to-double v4, v2

    #v4=(DoubleLo);v5=(DoubleHi);
    div-double/2addr v4, v6

    double-to-float v2, v4

    #v2=(Float);
    const-string v4, "bd09ll"

    #v4=(Reference);
    invoke-virtual {v0, v1, v2, v4}, Lcom/baidu/platform/comapi/a/a;->a(FFLjava/lang/String;)Lcom/baidu/platform/comapi/basestruct/c;

    move-result-object v0

    invoke-static {}, Lcom/baidu/platform/comapi/a/a;->a()Lcom/baidu/platform/comapi/a/a;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {p3}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLongitudeE6()I

    move-result v2

    #v2=(Integer);
    int-to-double v4, v2

    #v4=(DoubleLo);
    div-double/2addr v4, v6

    double-to-float v2, v4

    #v2=(Float);
    invoke-virtual {p3}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLatitudeE6()I

    move-result v4

    #v4=(Integer);
    int-to-double v4, v4

    #v4=(DoubleLo);
    div-double/2addr v4, v6

    double-to-float v4, v4

    #v4=(Float);
    const-string v5, "bd09ll"

    #v5=(Reference);
    invoke-virtual {v1, v2, v4, v5}, Lcom/baidu/platform/comapi/a/a;->a(FFLjava/lang/String;)Lcom/baidu/platform/comapi/basestruct/c;

    move-result-object v1

    iget-object v2, p0, Lcom/baidu/mapapi/search/MKSearch;->c:Lcom/baidu/platform/comapi/basestruct/b;

    #v2=(Reference);
    invoke-virtual {v2, v0}, Lcom/baidu/platform/comapi/basestruct/b;->a(Lcom/baidu/platform/comapi/basestruct/c;)V

    iget-object v0, p0, Lcom/baidu/mapapi/search/MKSearch;->c:Lcom/baidu/platform/comapi/basestruct/b;

    invoke-virtual {v0, v1}, Lcom/baidu/platform/comapi/basestruct/b;->b(Lcom/baidu/platform/comapi/basestruct/c;)V

    iget v0, p0, Lcom/baidu/mapapi/search/MKSearch;->k:I

    #v0=(Integer);
    iput v0, p0, Lcom/baidu/mapapi/search/MKSearch;->j:I

    iput v8, p0, Lcom/baidu/mapapi/search/MKSearch;->k:I

    iput-object p1, p0, Lcom/baidu/mapapi/search/MKSearch;->e:[Ljava/lang/String;

    invoke-static {}, Lcom/baidu/platform/comapi/b/e;->a()Lcom/baidu/platform/comapi/b/e;

    move-result-object v0

    #v0=(Reference);
    iget-object v1, p0, Lcom/baidu/mapapi/search/MKSearch;->e:[Ljava/lang/String;

    const/4 v2, 0x1

    #v2=(One);
    iput v3, p0, Lcom/baidu/mapapi/search/MKSearch;->n:I

    const/16 v4, 0xc

    #v4=(PosByte);
    iget-object v6, p0, Lcom/baidu/mapapi/search/MKSearch;->c:Lcom/baidu/platform/comapi/basestruct/b;

    #v6=(Reference);
    iget-object v7, p0, Lcom/baidu/mapapi/search/MKSearch;->c:Lcom/baidu/platform/comapi/basestruct/b;

    #v7=(Reference);
    const/4 v8, 0x0

    #v8=(Null);
    move v5, v3

    #v5=(Null);
    invoke-virtual/range {v0 .. v8}, Lcom/baidu/platform/comapi/b/e;->a([Ljava/lang/String;IIIILcom/baidu/platform/comapi/basestruct/b;Lcom/baidu/platform/comapi/basestruct/b;Ljava/util/Map;)Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_1

    move v3, v9

    #v3=(Byte);
    goto :goto_0
.end method

.method public poiMultiSearchNearBy([Ljava/lang/String;Lcom/baidu/platform/comapi/basestruct/GeoPoint;I)I
    .locals 10

    const-wide v6, 0x412e848000000000L

    #v6=(LongLo);v7=(LongHi);
    const/4 v3, 0x0

    #v3=(Null);
    const/4 v9, -0x1

    #v9=(Byte);
    if-eqz p2, :cond_0

    if-nez p1, :cond_2

    :cond_0
    move v3, v9

    :cond_1
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Byte);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    return v3

    :cond_2
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Null);v4=(Uninit);v5=(Uninit);v6=(LongLo);v7=(LongHi);v8=(Uninit);
    if-gtz p3, :cond_3

    move v3, v9

    #v3=(Byte);
    goto :goto_0

    :cond_3
    #v3=(Null);
    array-length v0, p1

    #v0=(Integer);
    const/4 v1, 0x2

    #v1=(PosByte);
    if-lt v0, v1, :cond_4

    array-length v0, p1

    const/16 v1, 0xa

    if-le v0, v1, :cond_5

    :cond_4
    move v3, v9

    #v3=(Byte);
    goto :goto_0

    :cond_5
    #v3=(Null);
    invoke-static {}, Lcom/baidu/platform/comapi/a/a;->a()Lcom/baidu/platform/comapi/a/a;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {p2}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLongitudeE6()I

    move-result v1

    #v1=(Integer);
    int-to-double v1, v1

    #v1=(DoubleLo);v2=(DoubleHi);
    div-double/2addr v1, v6

    double-to-float v1, v1

    #v1=(Float);
    invoke-virtual {p2}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLatitudeE6()I

    move-result v2

    #v2=(Integer);
    int-to-double v4, v2

    #v4=(DoubleLo);v5=(DoubleHi);
    div-double/2addr v4, v6

    double-to-float v2, v4

    #v2=(Float);
    const-string v4, "bd09ll"

    #v4=(Reference);
    invoke-virtual {v0, v1, v2, v4}, Lcom/baidu/platform/comapi/a/a;->a(FFLjava/lang/String;)Lcom/baidu/platform/comapi/basestruct/c;

    move-result-object v0

    new-instance v1, Lcom/baidu/platform/comapi/basestruct/c;

    #v1=(UninitRef);
    iget v2, v0, Lcom/baidu/platform/comapi/basestruct/c;->a:I

    #v2=(Integer);
    sub-int/2addr v2, p3

    iget v4, v0, Lcom/baidu/platform/comapi/basestruct/c;->b:I

    #v4=(Integer);
    sub-int/2addr v4, p3

    invoke-direct {v1, v2, v4}, Lcom/baidu/platform/comapi/basestruct/c;-><init>(II)V

    #v1=(Reference);
    new-instance v2, Lcom/baidu/platform/comapi/basestruct/c;

    #v2=(UninitRef);
    iget v4, v0, Lcom/baidu/platform/comapi/basestruct/c;->a:I

    add-int/2addr v4, p3

    iget v0, v0, Lcom/baidu/platform/comapi/basestruct/c;->b:I

    #v0=(Integer);
    add-int/2addr v0, p3

    invoke-direct {v2, v4, v0}, Lcom/baidu/platform/comapi/basestruct/c;-><init>(II)V

    #v2=(Reference);
    iget-object v0, p0, Lcom/baidu/mapapi/search/MKSearch;->c:Lcom/baidu/platform/comapi/basestruct/b;

    #v0=(Reference);
    invoke-virtual {v0, v1}, Lcom/baidu/platform/comapi/basestruct/b;->a(Lcom/baidu/platform/comapi/basestruct/c;)V

    iget-object v0, p0, Lcom/baidu/mapapi/search/MKSearch;->c:Lcom/baidu/platform/comapi/basestruct/b;

    invoke-virtual {v0, v2}, Lcom/baidu/platform/comapi/basestruct/b;->b(Lcom/baidu/platform/comapi/basestruct/c;)V

    iget v0, p0, Lcom/baidu/mapapi/search/MKSearch;->k:I

    #v0=(Integer);
    iput v0, p0, Lcom/baidu/mapapi/search/MKSearch;->j:I

    const/16 v0, 0xb

    #v0=(PosByte);
    iput v0, p0, Lcom/baidu/mapapi/search/MKSearch;->k:I

    iput-object p1, p0, Lcom/baidu/mapapi/search/MKSearch;->e:[Ljava/lang/String;

    invoke-static {}, Lcom/baidu/platform/comapi/b/e;->a()Lcom/baidu/platform/comapi/b/e;

    move-result-object v0

    #v0=(Reference);
    iget-object v1, p0, Lcom/baidu/mapapi/search/MKSearch;->e:[Ljava/lang/String;

    const/4 v2, 0x1

    #v2=(One);
    iput v3, p0, Lcom/baidu/mapapi/search/MKSearch;->n:I

    const/16 v4, 0xc

    #v4=(PosByte);
    iget-object v6, p0, Lcom/baidu/mapapi/search/MKSearch;->c:Lcom/baidu/platform/comapi/basestruct/b;

    #v6=(Reference);
    iget-object v7, p0, Lcom/baidu/mapapi/search/MKSearch;->c:Lcom/baidu/platform/comapi/basestruct/b;

    #v7=(Reference);
    const/4 v8, 0x0

    #v8=(Null);
    move v5, v3

    #v5=(Null);
    invoke-virtual/range {v0 .. v8}, Lcom/baidu/platform/comapi/b/e;->a([Ljava/lang/String;IIIILcom/baidu/platform/comapi/basestruct/b;Lcom/baidu/platform/comapi/basestruct/b;Ljava/util/Map;)Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_1

    move v3, v9

    #v3=(Byte);
    goto :goto_0
.end method

.method public poiRGCShareURLSearch(Lcom/baidu/platform/comapi/basestruct/GeoPoint;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 3

    if-nez p1, :cond_0

    const/4 v0, 0x0

    :goto_0
    #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);
    return v0

    :cond_0
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);
    invoke-static {p1}, Lcom/baidu/mapapi/utils/f;->b(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v0

    #v0=(Reference);
    new-instance v1, Lcom/baidu/platform/comapi/basestruct/c;

    #v1=(UninitRef);
    invoke-virtual {v0}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLongitudeE6()I

    move-result v2

    #v2=(Integer);
    invoke-virtual {v0}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLatitudeE6()I

    move-result v0

    #v0=(Integer);
    invoke-direct {v1, v2, v0}, Lcom/baidu/platform/comapi/basestruct/c;-><init>(II)V

    #v1=(Reference);
    iget v0, p0, Lcom/baidu/mapapi/search/MKSearch;->k:I

    iput v0, p0, Lcom/baidu/mapapi/search/MKSearch;->j:I

    const/16 v0, 0xe

    #v0=(PosByte);
    iput v0, p0, Lcom/baidu/mapapi/search/MKSearch;->k:I

    invoke-static {}, Lcom/baidu/platform/comapi/b/e;->a()Lcom/baidu/platform/comapi/b/e;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0, v1, p2, p3}, Lcom/baidu/platform/comapi/b/e;->a(Lcom/baidu/platform/comapi/basestruct/c;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    #v0=(Boolean);
    goto :goto_0
.end method

.method public poiSearchInCity(Ljava/lang/String;Ljava/lang/String;)I
    .locals 8

    const/4 v4, 0x0

    #v4=(Null);
    const/4 v3, 0x0

    #v3=(Null);
    const/4 v7, -0x1

    #v7=(Byte);
    if-nez p2, :cond_1

    move v3, v7

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Byte);v5=(Conflicted);v6=(Conflicted);
    return v3

    :cond_1
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Null);v5=(Uninit);v6=(Uninit);
    if-nez p1, :cond_2

    const-string p1, ""

    :cond_2
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    #v2=(Integer);
    const/16 v5, 0x10

    #v5=(PosByte);
    if-le v2, v5, :cond_3

    move v3, v7

    #v3=(Byte);
    goto :goto_0

    :cond_3
    #v3=(Null);
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    const/16 v5, 0x63

    if-le v2, v5, :cond_5

    :cond_4
    move v3, v7

    #v3=(Byte);
    goto :goto_0

    :cond_5
    #v3=(Null);
    iput-object v1, p0, Lcom/baidu/mapapi/search/MKSearch;->d:Ljava/lang/String;

    iput-object v0, p0, Lcom/baidu/mapapi/search/MKSearch;->f:Ljava/lang/String;

    iget v0, p0, Lcom/baidu/mapapi/search/MKSearch;->k:I

    #v0=(Integer);
    iput v0, p0, Lcom/baidu/mapapi/search/MKSearch;->j:I

    const/4 v0, 0x7

    #v0=(PosByte);
    iput v0, p0, Lcom/baidu/mapapi/search/MKSearch;->k:I

    invoke-static {}, Lcom/baidu/platform/comapi/b/e;->a()Lcom/baidu/platform/comapi/b/e;

    move-result-object v0

    #v0=(Reference);
    iget-object v1, p0, Lcom/baidu/mapapi/search/MKSearch;->d:Ljava/lang/String;

    iget-object v2, p0, Lcom/baidu/mapapi/search/MKSearch;->f:Ljava/lang/String;

    #v2=(Reference);
    iput v3, p0, Lcom/baidu/mapapi/search/MKSearch;->n:I

    const/16 v5, 0xc

    move-object v6, v4

    #v6=(Null);
    invoke-virtual/range {v0 .. v6}, Lcom/baidu/platform/comapi/b/e;->a(Ljava/lang/String;Ljava/lang/String;ILcom/baidu/platform/comapi/basestruct/b;ILjava/util/Map;)Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_0

    move v3, v7

    #v3=(Byte);
    goto :goto_0
.end method

.method public poiSearchInbounds(Ljava/lang/String;Lcom/baidu/platform/comapi/basestruct/GeoPoint;Lcom/baidu/platform/comapi/basestruct/GeoPoint;)I
    .locals 8

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    if-nez p3, :cond_1

    :cond_0
    const/4 v0, -0x1

    :goto_0
    #v0=(Byte);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    return v0

    :cond_1
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    #v1=(Integer);
    if-eqz v1, :cond_2

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v2, 0x63

    #v2=(PosByte);
    if-le v1, v2, :cond_3

    :cond_2
    #v2=(Conflicted);
    const/4 v0, -0x1

    #v0=(Byte);
    goto :goto_0

    :cond_3
    #v0=(Reference);v2=(PosByte);
    invoke-static {}, Lcom/baidu/platform/comapi/a/a;->a()Lcom/baidu/platform/comapi/a/a;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {p2}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLongitudeE6()I

    move-result v2

    #v2=(Integer);
    int-to-double v2, v2

    #v2=(DoubleLo);v3=(DoubleHi);
    const-wide v4, 0x412e848000000000L

    #v4=(LongLo);v5=(LongHi);
    div-double/2addr v2, v4

    double-to-float v2, v2

    #v2=(Float);
    invoke-virtual {p2}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLatitudeE6()I

    move-result v3

    #v3=(Integer);
    int-to-double v3, v3

    #v3=(DoubleLo);v4=(DoubleHi);
    const-wide v5, 0x412e848000000000L

    #v5=(LongLo);v6=(LongHi);
    div-double/2addr v3, v5

    double-to-float v3, v3

    #v3=(Float);
    const-string v4, "bd09ll"

    #v4=(Reference);
    invoke-virtual {v1, v2, v3, v4}, Lcom/baidu/platform/comapi/a/a;->a(FFLjava/lang/String;)Lcom/baidu/platform/comapi/basestruct/c;

    move-result-object v1

    invoke-static {}, Lcom/baidu/platform/comapi/a/a;->a()Lcom/baidu/platform/comapi/a/a;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {p3}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLongitudeE6()I

    move-result v3

    #v3=(Integer);
    int-to-double v3, v3

    #v3=(DoubleLo);v4=(DoubleHi);
    const-wide v5, 0x412e848000000000L

    div-double/2addr v3, v5

    double-to-float v3, v3

    #v3=(Float);
    invoke-virtual {p3}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLatitudeE6()I

    move-result v4

    #v4=(Integer);
    int-to-double v4, v4

    #v4=(DoubleLo);v5=(DoubleHi);
    const-wide v6, 0x412e848000000000L

    #v6=(LongLo);v7=(LongHi);
    div-double/2addr v4, v6

    double-to-float v4, v4

    #v4=(Float);
    const-string v5, "bd09ll"

    #v5=(Reference);
    invoke-virtual {v2, v3, v4, v5}, Lcom/baidu/platform/comapi/a/a;->a(FFLjava/lang/String;)Lcom/baidu/platform/comapi/basestruct/c;

    move-result-object v2

    iget-object v3, p0, Lcom/baidu/mapapi/search/MKSearch;->c:Lcom/baidu/platform/comapi/basestruct/b;

    #v3=(Reference);
    invoke-virtual {v3, v1}, Lcom/baidu/platform/comapi/basestruct/b;->a(Lcom/baidu/platform/comapi/basestruct/c;)V

    iget-object v1, p0, Lcom/baidu/mapapi/search/MKSearch;->c:Lcom/baidu/platform/comapi/basestruct/b;

    invoke-virtual {v1, v2}, Lcom/baidu/platform/comapi/basestruct/b;->b(Lcom/baidu/platform/comapi/basestruct/c;)V

    iget v1, p0, Lcom/baidu/mapapi/search/MKSearch;->k:I

    #v1=(Integer);
    iput v1, p0, Lcom/baidu/mapapi/search/MKSearch;->j:I

    const/16 v1, 0x8

    #v1=(PosByte);
    iput v1, p0, Lcom/baidu/mapapi/search/MKSearch;->k:I

    iput-object v0, p0, Lcom/baidu/mapapi/search/MKSearch;->d:Ljava/lang/String;

    invoke-static {}, Lcom/baidu/platform/comapi/b/e;->a()Lcom/baidu/platform/comapi/b/e;

    move-result-object v0

    iget-object v1, p0, Lcom/baidu/mapapi/search/MKSearch;->d:Ljava/lang/String;

    #v1=(Reference);
    const/4 v2, 0x1

    #v2=(One);
    const/4 v3, 0x0

    #v3=(Null);
    iput v3, p0, Lcom/baidu/mapapi/search/MKSearch;->n:I

    iget-object v4, p0, Lcom/baidu/mapapi/search/MKSearch;->c:Lcom/baidu/platform/comapi/basestruct/b;

    #v4=(Reference);
    const/16 v5, 0xc

    #v5=(PosByte);
    const/4 v6, 0x0

    #v6=(Null);
    const/4 v7, 0x0

    #v7=(Null);
    invoke-virtual/range {v0 .. v7}, Lcom/baidu/platform/comapi/b/e;->a(Ljava/lang/String;IILcom/baidu/platform/comapi/basestruct/b;ILcom/baidu/platform/comapi/basestruct/c;Ljava/util/Map;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_4

    const/4 v0, 0x0

    #v0=(Null);
    goto/16 :goto_0

    :cond_4
    #v0=(Boolean);
    const/4 v0, -0x1

    #v0=(Byte);
    goto/16 :goto_0
.end method

.method public poiSearchNearBy(Ljava/lang/String;Lcom/baidu/platform/comapi/basestruct/GeoPoint;I)I
    .locals 9

    const/4 v3, 0x0

    #v3=(Null);
    const/4 v8, -0x1

    #v8=(Byte);
    if-eqz p2, :cond_0

    if-nez p1, :cond_2

    :cond_0
    move v3, v8

    :cond_1
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Byte);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    return v3

    :cond_2
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Null);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
    if-gtz p3, :cond_3

    move v3, v8

    #v3=(Byte);
    goto :goto_0

    :cond_3
    #v3=(Null);
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    #v1=(Integer);
    if-eqz v1, :cond_4

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v2, 0x63

    #v2=(PosByte);
    if-le v1, v2, :cond_5

    :cond_4
    #v2=(Conflicted);
    move v3, v8

    #v3=(Byte);
    goto :goto_0

    :cond_5
    #v2=(PosByte);v3=(Null);
    invoke-static {p2}, Lcom/baidu/mapapi/utils/f;->b(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v1

    #v1=(Reference);
    new-instance v2, Lcom/baidu/platform/comapi/basestruct/c;

    #v2=(UninitRef);
    invoke-virtual {v1}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLongitudeE6()I

    move-result v4

    #v4=(Integer);
    sub-int/2addr v4, p3

    invoke-virtual {v1}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLatitudeE6()I

    move-result v5

    #v5=(Integer);
    sub-int/2addr v5, p3

    invoke-direct {v2, v4, v5}, Lcom/baidu/platform/comapi/basestruct/c;-><init>(II)V

    #v2=(Reference);
    new-instance v4, Lcom/baidu/platform/comapi/basestruct/c;

    #v4=(UninitRef);
    invoke-virtual {v1}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLongitudeE6()I

    move-result v5

    add-int/2addr v5, p3

    invoke-virtual {v1}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLatitudeE6()I

    move-result v1

    #v1=(Integer);
    add-int/2addr v1, p3

    invoke-direct {v4, v5, v1}, Lcom/baidu/platform/comapi/basestruct/c;-><init>(II)V

    #v4=(Reference);
    iget-object v1, p0, Lcom/baidu/mapapi/search/MKSearch;->c:Lcom/baidu/platform/comapi/basestruct/b;

    #v1=(Reference);
    invoke-virtual {v1, v2}, Lcom/baidu/platform/comapi/basestruct/b;->a(Lcom/baidu/platform/comapi/basestruct/c;)V

    iget-object v1, p0, Lcom/baidu/mapapi/search/MKSearch;->c:Lcom/baidu/platform/comapi/basestruct/b;

    invoke-virtual {v1, v4}, Lcom/baidu/platform/comapi/basestruct/b;->b(Lcom/baidu/platform/comapi/basestruct/c;)V

    iput-object v0, p0, Lcom/baidu/mapapi/search/MKSearch;->d:Ljava/lang/String;

    iget v0, p0, Lcom/baidu/mapapi/search/MKSearch;->k:I

    #v0=(Integer);
    iput v0, p0, Lcom/baidu/mapapi/search/MKSearch;->j:I

    const/16 v0, 0x9

    #v0=(PosByte);
    iput v0, p0, Lcom/baidu/mapapi/search/MKSearch;->k:I

    iput p3, p0, Lcom/baidu/mapapi/search/MKSearch;->g:I

    new-instance v7, Ljava/util/HashMap;

    #v7=(UninitRef);
    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    #v7=(Reference);
    const-string v0, "distance"

    #v0=(Reference);
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #v1=(Reference);
    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Lcom/baidu/mapapi/search/MKSearch;->g:I

    #v2=(Integer);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v7, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/baidu/platform/comapi/b/e;->a()Lcom/baidu/platform/comapi/b/e;

    move-result-object v0

    iget-object v1, p0, Lcom/baidu/mapapi/search/MKSearch;->d:Ljava/lang/String;

    const/4 v2, 0x1

    #v2=(One);
    iput v3, p0, Lcom/baidu/mapapi/search/MKSearch;->n:I

    const/16 v4, 0xc

    #v4=(PosByte);
    iget-object v5, p0, Lcom/baidu/mapapi/search/MKSearch;->c:Lcom/baidu/platform/comapi/basestruct/b;

    #v5=(Reference);
    iget-object v6, p0, Lcom/baidu/mapapi/search/MKSearch;->c:Lcom/baidu/platform/comapi/basestruct/b;

    #v6=(Reference);
    invoke-virtual/range {v0 .. v7}, Lcom/baidu/platform/comapi/b/e;->a(Ljava/lang/String;IIILcom/baidu/platform/comapi/basestruct/b;Lcom/baidu/platform/comapi/basestruct/b;Ljava/util/Map;)Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_1

    move v3, v8

    #v3=(Byte);
    goto/16 :goto_0
.end method

.method public reverseGeocode(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)I
    .locals 3

    const/4 v0, -0x1

    #v0=(Byte);
    if-nez p1, :cond_1

    :cond_0
    :goto_0
    #v1=(Conflicted);v2=(Conflicted);
    return v0

    :cond_1
    #v1=(Uninit);v2=(Uninit);
    invoke-static {p1}, Lcom/baidu/mapapi/search/MKSearch;->a(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)Lcom/baidu/platform/comapi/basestruct/c;

    move-result-object v1

    #v1=(Reference);
    iget v2, p0, Lcom/baidu/mapapi/search/MKSearch;->k:I

    #v2=(Integer);
    iput v2, p0, Lcom/baidu/mapapi/search/MKSearch;->j:I

    const/4 v2, 0x5

    #v2=(PosByte);
    iput v2, p0, Lcom/baidu/mapapi/search/MKSearch;->k:I

    invoke-static {}, Lcom/baidu/platform/comapi/b/e;->a()Lcom/baidu/platform/comapi/b/e;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v2, v1}, Lcom/baidu/platform/comapi/b/e;->a(Lcom/baidu/platform/comapi/basestruct/c;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_0

    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public setDrivingPolicy(I)I
    .locals 2

    const/4 v0, -0x1

    #v0=(Byte);
    const/4 v1, 0x2

    #v1=(PosByte);
    if-gt p1, v1, :cond_0

    if-lt p1, v0, :cond_0

    iput p1, p0, Lcom/baidu/mapapi/search/MKSearch;->i:I

    const/4 v0, 0x0

    :cond_0
    return v0
.end method

.method public setTransitPolicy(I)I
    .locals 1

    const/4 v0, 0x6

    #v0=(PosByte);
    if-gt p1, v0, :cond_0

    const/4 v0, 0x3

    if-ge p1, v0, :cond_1

    :cond_0
    const/4 v0, -0x1

    :goto_0
    #v0=(Byte);
    return v0

    :cond_1
    #v0=(PosByte);
    iput p1, p0, Lcom/baidu/mapapi/search/MKSearch;->h:I

    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public suggestionSearch(Ljava/lang/String;Ljava/lang/String;)I
    .locals 8

    const/4 v4, 0x0

    #v4=(Null);
    const/4 v2, 0x0

    #v2=(Null);
    const/4 v7, -0x1

    #v7=(Byte);
    if-nez p1, :cond_1

    move v2, v7

    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Byte);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    return v2

    :cond_1
    #v0=(Uninit);v1=(Uninit);v2=(Null);v3=(Uninit);v5=(Uninit);v6=(Uninit);
    if-eqz p2, :cond_2

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    #v0=(Integer);
    if-nez v0, :cond_5

    :cond_2
    #v0=(Conflicted);
    const-string v3, "1"

    :goto_1
    #v3=(Reference);
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v0

    #v0=(Integer);
    if-eqz v0, :cond_3

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v5, 0x63

    #v5=(PosByte);
    if-le v0, v5, :cond_4

    :cond_3
    #v5=(Conflicted);
    move v2, v7

    #v2=(Byte);
    goto :goto_0

    :cond_4
    #v2=(Null);v5=(PosByte);
    iget v0, p0, Lcom/baidu/mapapi/search/MKSearch;->k:I

    iput v0, p0, Lcom/baidu/mapapi/search/MKSearch;->j:I

    const/4 v0, 0x6

    #v0=(PosByte);
    iput v0, p0, Lcom/baidu/mapapi/search/MKSearch;->k:I

    invoke-static {}, Lcom/baidu/platform/comapi/b/e;->a()Lcom/baidu/platform/comapi/b/e;

    move-result-object v0

    #v0=(Reference);
    const/16 v5, 0xc

    move-object v6, v4

    #v6=(Null);
    invoke-virtual/range {v0 .. v6}, Lcom/baidu/platform/comapi/b/e;->a(Ljava/lang/String;ILjava/lang/String;Lcom/baidu/platform/comapi/basestruct/b;ILcom/baidu/platform/comapi/basestruct/c;)Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_0

    move v2, v7

    #v2=(Byte);
    goto :goto_0

    :cond_5
    #v0=(Integer);v1=(Uninit);v2=(Null);v3=(Uninit);v5=(Uninit);v6=(Uninit);
    move-object v3, p2

    #v3=(Reference);
    goto :goto_1
.end method

.method public transitSearch(Ljava/lang/String;Lcom/baidu/mapapi/search/MKPlanNode;Lcom/baidu/mapapi/search/MKPlanNode;)I
    .locals 9

    const/4 v4, 0x0

    #v4=(Null);
    const/4 v3, 0x1

    #v3=(One);
    const/4 v8, -0x1

    #v8=(Byte);
    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    if-nez p3, :cond_1

    :cond_0
    move v0, v8

    :goto_0
    #v0=(Byte);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    return v0

    :cond_1
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(One);v5=(Uninit);v6=(Uninit);v7=(Uninit);
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    #v0=(Integer);
    const/16 v1, 0x1f

    #v1=(PosByte);
    if-le v0, v1, :cond_2

    move v0, v8

    #v0=(Byte);
    goto :goto_0

    :cond_2
    #v0=(Integer);
    new-instance v1, Lcom/baidu/platform/comapi/b/b;

    #v1=(UninitRef);
    invoke-direct {v1}, Lcom/baidu/platform/comapi/b/b;-><init>()V

    #v1=(Reference);
    iget-object v0, p2, Lcom/baidu/mapapi/search/MKPlanNode;->name:Ljava/lang/String;

    #v0=(Reference);
    if-eqz v0, :cond_3

    iget-object v0, p2, Lcom/baidu/mapapi/search/MKPlanNode;->name:Ljava/lang/String;

    iput-object v0, v1, Lcom/baidu/platform/comapi/b/b;->c:Ljava/lang/String;

    :cond_3
    iget-object v0, p2, Lcom/baidu/mapapi/search/MKPlanNode;->pt:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    if-eqz v0, :cond_4

    iget-object v0, p2, Lcom/baidu/mapapi/search/MKPlanNode;->pt:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    invoke-static {v0}, Lcom/baidu/mapapi/search/MKSearch;->a(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)Lcom/baidu/platform/comapi/basestruct/c;

    move-result-object v0

    iput-object v0, v1, Lcom/baidu/platform/comapi/b/b;->b:Lcom/baidu/platform/comapi/basestruct/c;

    iput v3, v1, Lcom/baidu/platform/comapi/b/b;->a:I

    :cond_4
    new-instance v2, Lcom/baidu/platform/comapi/b/b;

    #v2=(UninitRef);
    invoke-direct {v2}, Lcom/baidu/platform/comapi/b/b;-><init>()V

    #v2=(Reference);
    iget-object v0, p3, Lcom/baidu/mapapi/search/MKPlanNode;->name:Ljava/lang/String;

    if-eqz v0, :cond_5

    iget-object v0, p3, Lcom/baidu/mapapi/search/MKPlanNode;->name:Ljava/lang/String;

    iput-object v0, v2, Lcom/baidu/platform/comapi/b/b;->c:Ljava/lang/String;

    :cond_5
    iget-object v0, p3, Lcom/baidu/mapapi/search/MKPlanNode;->pt:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    if-eqz v0, :cond_6

    iget-object v0, p3, Lcom/baidu/mapapi/search/MKPlanNode;->pt:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    invoke-static {v0}, Lcom/baidu/mapapi/search/MKSearch;->a(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)Lcom/baidu/platform/comapi/basestruct/c;

    move-result-object v0

    iput-object v0, v2, Lcom/baidu/platform/comapi/b/b;->b:Lcom/baidu/platform/comapi/basestruct/c;

    iput v3, v2, Lcom/baidu/platform/comapi/b/b;->a:I

    :cond_6
    iget v0, p0, Lcom/baidu/mapapi/search/MKSearch;->k:I

    #v0=(Integer);
    iput v0, p0, Lcom/baidu/mapapi/search/MKSearch;->j:I

    const/4 v0, 0x3

    #v0=(PosByte);
    iput v0, p0, Lcom/baidu/mapapi/search/MKSearch;->k:I

    invoke-static {}, Lcom/baidu/platform/comapi/b/e;->a()Lcom/baidu/platform/comapi/b/e;

    move-result-object v0

    #v0=(Reference);
    const/16 v5, 0xc

    #v5=(PosByte);
    iget v6, p0, Lcom/baidu/mapapi/search/MKSearch;->h:I

    #v6=(Integer);
    move-object v3, p1

    #v3=(Reference);
    move-object v7, v4

    #v7=(Null);
    invoke-virtual/range {v0 .. v7}, Lcom/baidu/platform/comapi/b/e;->a(Lcom/baidu/platform/comapi/b/b;Lcom/baidu/platform/comapi/b/b;Ljava/lang/String;Lcom/baidu/platform/comapi/basestruct/b;IILjava/util/Map;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_7

    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0

    :cond_7
    #v0=(Boolean);
    move v0, v8

    #v0=(Byte);
    goto :goto_0
.end method

.method public walkingSearch(Ljava/lang/String;Lcom/baidu/mapapi/search/MKPlanNode;Ljava/lang/String;Lcom/baidu/mapapi/search/MKPlanNode;)I
    .locals 10

    const/4 v9, -0x1

    #v9=(Byte);
    const/4 v3, 0x0

    #v3=(Null);
    const/4 v6, 0x1

    #v6=(One);
    if-eqz p2, :cond_0

    if-nez p4, :cond_1

    :cond_0
    move v0, v9

    :goto_0
    #v0=(Byte);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Boolean);v7=(Conflicted);v8=(Conflicted);
    return v0

    :cond_1
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v4=(Uninit);v5=(Uninit);v6=(One);v7=(Uninit);v8=(Uninit);
    new-instance v1, Lcom/baidu/platform/comapi/b/b;

    #v1=(UninitRef);
    invoke-direct {v1}, Lcom/baidu/platform/comapi/b/b;-><init>()V

    #v1=(Reference);
    iget-object v0, p2, Lcom/baidu/mapapi/search/MKPlanNode;->name:Ljava/lang/String;

    #v0=(Reference);
    if-eqz v0, :cond_2

    iget-object v0, p2, Lcom/baidu/mapapi/search/MKPlanNode;->name:Ljava/lang/String;

    iput-object v0, v1, Lcom/baidu/platform/comapi/b/b;->c:Ljava/lang/String;

    :cond_2
    iget-object v0, p2, Lcom/baidu/mapapi/search/MKPlanNode;->pt:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    if-eqz v0, :cond_4

    iget-object v0, p2, Lcom/baidu/mapapi/search/MKPlanNode;->pt:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    invoke-static {v0}, Lcom/baidu/mapapi/search/MKSearch;->a(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)Lcom/baidu/platform/comapi/basestruct/c;

    move-result-object v0

    iput-object v0, v1, Lcom/baidu/platform/comapi/b/b;->b:Lcom/baidu/platform/comapi/basestruct/c;

    iput v6, v1, Lcom/baidu/platform/comapi/b/b;->a:I

    move-object v4, p1

    :goto_1
    #v0=(Conflicted);v4=(Reference);
    new-instance v2, Lcom/baidu/platform/comapi/b/b;

    #v2=(UninitRef);
    invoke-direct {v2}, Lcom/baidu/platform/comapi/b/b;-><init>()V

    #v2=(Reference);
    iget-object v0, p4, Lcom/baidu/mapapi/search/MKPlanNode;->name:Ljava/lang/String;

    #v0=(Reference);
    if-eqz v0, :cond_3

    iget-object v0, p4, Lcom/baidu/mapapi/search/MKPlanNode;->name:Ljava/lang/String;

    iput-object v0, v2, Lcom/baidu/platform/comapi/b/b;->c:Ljava/lang/String;

    :cond_3
    iget-object v0, p4, Lcom/baidu/mapapi/search/MKPlanNode;->pt:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    if-eqz v0, :cond_6

    iget-object v0, p4, Lcom/baidu/mapapi/search/MKPlanNode;->pt:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    invoke-static {v0}, Lcom/baidu/mapapi/search/MKSearch;->a(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)Lcom/baidu/platform/comapi/basestruct/c;

    move-result-object v0

    iput-object v0, v2, Lcom/baidu/platform/comapi/b/b;->b:Lcom/baidu/platform/comapi/basestruct/c;

    iput v6, v2, Lcom/baidu/platform/comapi/b/b;->a:I

    move-object v5, p3

    :goto_2
    #v0=(Conflicted);v5=(Reference);
    iget v0, p0, Lcom/baidu/mapapi/search/MKSearch;->k:I

    #v0=(Integer);
    iput v0, p0, Lcom/baidu/mapapi/search/MKSearch;->j:I

    iput v6, p0, Lcom/baidu/mapapi/search/MKSearch;->k:I

    invoke-static {}, Lcom/baidu/platform/comapi/b/e;->a()Lcom/baidu/platform/comapi/b/e;

    move-result-object v0

    #v0=(Reference);
    const/16 v7, 0xc

    #v7=(PosByte);
    move-object v6, v3

    #v6=(Null);
    move-object v8, v3

    #v8=(Null);
    invoke-virtual/range {v0 .. v8}, Lcom/baidu/platform/comapi/b/e;->a(Lcom/baidu/platform/comapi/b/b;Lcom/baidu/platform/comapi/b/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/baidu/platform/comapi/basestruct/b;ILjava/util/Map;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_8

    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0

    :cond_4
    #v0=(Reference);v2=(Uninit);v4=(Uninit);v5=(Uninit);v6=(One);v7=(Uninit);v8=(Uninit);
    if-eqz p1, :cond_5

    const-string v0, ""

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_a

    :cond_5
    #v0=(Conflicted);
    const-string p1, "1"

    move-object v4, p1

    #v4=(Reference);
    goto :goto_1

    :cond_6
    #v0=(Reference);v2=(Reference);
    if-eqz p3, :cond_7

    const-string v0, ""

    invoke-virtual {v0, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_9

    :cond_7
    #v0=(Conflicted);
    const-string p3, "1"

    move-object v5, p3

    #v5=(Reference);
    goto :goto_2

    :cond_8
    #v0=(Boolean);v6=(Null);v7=(PosByte);v8=(Null);
    move v0, v9

    #v0=(Byte);
    goto :goto_0

    :cond_9
    #v0=(Boolean);v5=(Uninit);v6=(One);v7=(Uninit);v8=(Uninit);
    move-object v5, p3

    #v5=(Reference);
    goto :goto_2

    :cond_a
    #v2=(Uninit);v4=(Uninit);v5=(Uninit);
    move-object v4, p1

    #v4=(Reference);
    goto :goto_1
.end method

*/}
