package com.baidu.platform.comapi.map; class o {/*

.class public Lcom/baidu/platform/comapi/map/o;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnKeyListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/baidu/platform/comapi/map/o$a;
    }
.end annotation


# static fields
.field private static K:I

.field private static L:J

.field private static M:I

.field private static N:I

.field private static O:Z

.field private static P:Z

.field private static Q:Lcom/baidu/platform/comapi/map/o$a;

.field private static R:I

.field private static S:I

.field private static T:Z

.field private static U:Z

.field private static V:Z

.field private static W:Landroid/view/VelocityTracker;

.field private static X:J

.field private static Y:J

.field private static Z:J

.field private static aa:J

.field private static ab:I

.field private static ac:F

.field private static ad:F

.field private static ae:Z

.field private static af:J

.field private static ag:J

.field private static ai:J

.field private static aj:J

.field private static ak:J

.field public static i:Z

.field private static final j:Ljava/lang/String;

.field private static final q:I


# instance fields
.field private A:I

.field private B:I

.field private C:I

.field private D:I

.field private E:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

.field private F:I

.field private G:I

.field private H:I

.field private I:I

.field private J:I

.field public a:I

.field private ah:Z

.field private al:Z

.field private am:Z

.field private an:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

.field private ao:Z

.field private ap:I

.field private aq:I

.field private ar:Z

.field private as:Z

.field public b:I

.field public c:I

.field public d:I

.field public e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public f:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public g:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public h:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private k:Lcom/baidu/platform/comjni/map/basemap/a;

.field private l:Landroid/content/Context;

.field private m:Lcom/baidu/platform/comapi/map/q;

.field private n:I

.field private o:Landroid/os/Bundle;

.field private p:Landroid/os/Handler;

.field private r:Z

.field private s:Z

.field private t:Z

.field private u:Z

.field private v:Z

.field private w:Z

.field private x:Z

.field private y:I

.field private z:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Lcom/baidu/platform/comapi/map/o;

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/baidu/platform/comapi/map/o;->j:Ljava/lang/String;

    invoke-static {}, Landroid/view/ViewConfiguration;->getMinimumFlingVelocity()I

    move-result v0

    #v0=(Integer);
    mul-int/lit8 v0, v0, 0x3

    sput v0, Lcom/baidu/platform/comapi/map/o;->q:I

    new-instance v0, Lcom/baidu/platform/comapi/map/o$a;

    #v0=(UninitRef);
    invoke-direct {v0}, Lcom/baidu/platform/comapi/map/o$a;-><init>()V

    #v0=(Reference);
    sput-object v0, Lcom/baidu/platform/comapi/map/o;->Q:Lcom/baidu/platform/comapi/map/o$a;

    const/4 v0, 0x0

    #v0=(Null);
    sput v0, Lcom/baidu/platform/comapi/map/o;->ab:I

    const-wide/16 v0, 0x190

    #v0=(LongLo);v1=(LongHi);
    sput-wide v0, Lcom/baidu/platform/comapi/map/o;->ai:J

    const-wide/16 v0, 0x1f4

    sput-wide v0, Lcom/baidu/platform/comapi/map/o;->aj:J

    const-wide/16 v0, 0x78

    sput-wide v0, Lcom/baidu/platform/comapi/map/o;->ak:J

    const/4 v0, 0x1

    #v0=(One);
    sput-boolean v0, Lcom/baidu/platform/comapi/map/o;->i:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/baidu/platform/comapi/map/q;)V
    .locals 4

    const/4 v3, 0x0

    #v3=(Null);
    const/4 v2, 0x1

    #v2=(One);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    iput-object v3, p0, Lcom/baidu/platform/comapi/map/o;->k:Lcom/baidu/platform/comjni/map/basemap/a;

    iput-object v3, p0, Lcom/baidu/platform/comapi/map/o;->l:Landroid/content/Context;

    iput-object v3, p0, Lcom/baidu/platform/comapi/map/o;->m:Lcom/baidu/platform/comapi/map/q;

    iput v1, p0, Lcom/baidu/platform/comapi/map/o;->n:I

    iput v1, p0, Lcom/baidu/platform/comapi/map/o;->a:I

    iput v1, p0, Lcom/baidu/platform/comapi/map/o;->b:I

    iput v1, p0, Lcom/baidu/platform/comapi/map/o;->c:I

    iput v1, p0, Lcom/baidu/platform/comapi/map/o;->d:I

    new-instance v0, Ljava/util/HashMap;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/platform/comapi/map/o;->e:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/platform/comapi/map/o;->f:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/platform/comapi/map/o;->g:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/platform/comapi/map/o;->h:Ljava/util/Map;

    new-instance v0, Landroid/os/Bundle;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/platform/comapi/map/o;->o:Landroid/os/Bundle;

    iput-object v3, p0, Lcom/baidu/platform/comapi/map/o;->p:Landroid/os/Handler;

    iput-boolean v2, p0, Lcom/baidu/platform/comapi/map/o;->r:Z

    iput-boolean v1, p0, Lcom/baidu/platform/comapi/map/o;->s:Z

    iput-boolean v2, p0, Lcom/baidu/platform/comapi/map/o;->t:Z

    iput-boolean v2, p0, Lcom/baidu/platform/comapi/map/o;->u:Z

    iput-boolean v2, p0, Lcom/baidu/platform/comapi/map/o;->v:Z

    const/16 v0, 0x14

    #v0=(PosByte);
    iput v0, p0, Lcom/baidu/platform/comapi/map/o;->J:I

    iput-boolean v1, p0, Lcom/baidu/platform/comapi/map/o;->ah:Z

    iput-boolean v2, p0, Lcom/baidu/platform/comapi/map/o;->al:Z

    iput-boolean v2, p0, Lcom/baidu/platform/comapi/map/o;->am:Z

    iput-boolean v1, p0, Lcom/baidu/platform/comapi/map/o;->ar:Z

    iput-boolean v1, p0, Lcom/baidu/platform/comapi/map/o;->as:Z

    iput-object p2, p0, Lcom/baidu/platform/comapi/map/o;->m:Lcom/baidu/platform/comapi/map/q;

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/o;->m:Lcom/baidu/platform/comapi/map/q;

    #v0=(Reference);
    invoke-virtual {v0, p0}, Lcom/baidu/platform/comapi/map/q;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    check-cast p1, Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Display;->getWidth()I

    move-result v1

    #v1=(Integer);
    iput v1, p0, Lcom/baidu/platform/comapi/map/o;->H:I

    invoke-virtual {v0}, Landroid/view/Display;->getHeight()I

    move-result v0

    #v0=(Integer);
    iput v0, p0, Lcom/baidu/platform/comapi/map/o;->I:I

    new-instance v0, Lcom/baidu/platform/comapi/map/p;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Lcom/baidu/platform/comapi/map/p;-><init>(Lcom/baidu/platform/comapi/map/o;)V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/platform/comapi/map/o;->p:Landroid/os/Handler;

    invoke-direct {p0}, Lcom/baidu/platform/comapi/map/o;->r()V

    return-void
.end method

.method public static a(IIII)I
    .locals 1

    invoke-static {p0, p1, p2, p3}, Lcom/baidu/platform/comjni/map/basemap/a;->b(IIII)I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method static synthetic a(Lcom/baidu/platform/comapi/map/o;)Lcom/baidu/platform/comapi/map/q;
    .locals 1

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/o;->m:Lcom/baidu/platform/comapi/map/q;

    #v0=(Reference);
    return-object v0
.end method

.method private b(Lcom/baidu/platform/comapi/map/t;)V
    .locals 4

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/o;->o:Landroid/os/Bundle;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/os/Bundle;->clear()V

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/o;->o:Landroid/os/Bundle;

    const-string v1, "level"

    #v1=(Reference);
    iget v2, p1, Lcom/baidu/platform/comapi/map/t;->a:F

    #v2=(Integer);
    float-to-double v2, v2

    #v2=(DoubleLo);v3=(DoubleHi);
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Bundle;->putDouble(Ljava/lang/String;D)V

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/o;->o:Landroid/os/Bundle;

    const-string v1, "rotation"

    iget v2, p1, Lcom/baidu/platform/comapi/map/t;->b:I

    #v2=(Integer);
    int-to-double v2, v2

    #v2=(DoubleLo);
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Bundle;->putDouble(Ljava/lang/String;D)V

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/o;->o:Landroid/os/Bundle;

    const-string v1, "overlooking"

    iget v2, p1, Lcom/baidu/platform/comapi/map/t;->c:I

    #v2=(Integer);
    int-to-double v2, v2

    #v2=(DoubleLo);
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Bundle;->putDouble(Ljava/lang/String;D)V

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/o;->o:Landroid/os/Bundle;

    const-string v1, "centerptx"

    iget v2, p1, Lcom/baidu/platform/comapi/map/t;->d:I

    #v2=(Integer);
    int-to-double v2, v2

    #v2=(DoubleLo);
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Bundle;->putDouble(Ljava/lang/String;D)V

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/o;->o:Landroid/os/Bundle;

    const-string v1, "centerpty"

    iget v2, p1, Lcom/baidu/platform/comapi/map/t;->e:I

    #v2=(Integer);
    int-to-double v2, v2

    #v2=(DoubleLo);
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Bundle;->putDouble(Ljava/lang/String;D)V

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/o;->o:Landroid/os/Bundle;

    const-string v1, "left"

    iget-object v2, p1, Lcom/baidu/platform/comapi/map/t;->f:Lcom/baidu/platform/comapi/map/t$b;

    #v2=(Reference);
    iget v2, v2, Lcom/baidu/platform/comapi/map/t$b;->a:I

    #v2=(Integer);
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/o;->o:Landroid/os/Bundle;

    const-string v1, "right"

    iget-object v2, p1, Lcom/baidu/platform/comapi/map/t;->f:Lcom/baidu/platform/comapi/map/t$b;

    #v2=(Reference);
    iget v2, v2, Lcom/baidu/platform/comapi/map/t$b;->b:I

    #v2=(Integer);
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/o;->o:Landroid/os/Bundle;

    const-string v1, "top"

    iget-object v2, p1, Lcom/baidu/platform/comapi/map/t;->f:Lcom/baidu/platform/comapi/map/t$b;

    #v2=(Reference);
    iget v2, v2, Lcom/baidu/platform/comapi/map/t$b;->c:I

    #v2=(Integer);
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/o;->o:Landroid/os/Bundle;

    const-string v1, "bottom"

    iget-object v2, p1, Lcom/baidu/platform/comapi/map/t;->f:Lcom/baidu/platform/comapi/map/t$b;

    #v2=(Reference);
    iget v2, v2, Lcom/baidu/platform/comapi/map/t$b;->d:I

    #v2=(Integer);
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/o;->o:Landroid/os/Bundle;

    const-string v1, "lbx"

    iget-object v2, p1, Lcom/baidu/platform/comapi/map/t;->g:Lcom/baidu/platform/comapi/map/t$a;

    #v2=(Reference);
    iget-object v2, v2, Lcom/baidu/platform/comapi/map/t$a;->e:Lcom/baidu/platform/comapi/basestruct/c;

    iget v2, v2, Lcom/baidu/platform/comapi/basestruct/c;->a:I

    #v2=(Integer);
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/o;->o:Landroid/os/Bundle;

    const-string v1, "lby"

    iget-object v2, p1, Lcom/baidu/platform/comapi/map/t;->g:Lcom/baidu/platform/comapi/map/t$a;

    #v2=(Reference);
    iget-object v2, v2, Lcom/baidu/platform/comapi/map/t$a;->e:Lcom/baidu/platform/comapi/basestruct/c;

    iget v2, v2, Lcom/baidu/platform/comapi/basestruct/c;->b:I

    #v2=(Integer);
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/o;->o:Landroid/os/Bundle;

    const-string v1, "ltx"

    iget-object v2, p1, Lcom/baidu/platform/comapi/map/t;->g:Lcom/baidu/platform/comapi/map/t$a;

    #v2=(Reference);
    iget-object v2, v2, Lcom/baidu/platform/comapi/map/t$a;->f:Lcom/baidu/platform/comapi/basestruct/c;

    iget v2, v2, Lcom/baidu/platform/comapi/basestruct/c;->a:I

    #v2=(Integer);
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/o;->o:Landroid/os/Bundle;

    const-string v1, "lty"

    iget-object v2, p1, Lcom/baidu/platform/comapi/map/t;->g:Lcom/baidu/platform/comapi/map/t$a;

    #v2=(Reference);
    iget-object v2, v2, Lcom/baidu/platform/comapi/map/t$a;->f:Lcom/baidu/platform/comapi/basestruct/c;

    iget v2, v2, Lcom/baidu/platform/comapi/basestruct/c;->b:I

    #v2=(Integer);
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/o;->o:Landroid/os/Bundle;

    const-string v1, "rtx"

    iget-object v2, p1, Lcom/baidu/platform/comapi/map/t;->g:Lcom/baidu/platform/comapi/map/t$a;

    #v2=(Reference);
    iget-object v2, v2, Lcom/baidu/platform/comapi/map/t$a;->g:Lcom/baidu/platform/comapi/basestruct/c;

    iget v2, v2, Lcom/baidu/platform/comapi/basestruct/c;->a:I

    #v2=(Integer);
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/o;->o:Landroid/os/Bundle;

    const-string v1, "rty"

    iget-object v2, p1, Lcom/baidu/platform/comapi/map/t;->g:Lcom/baidu/platform/comapi/map/t$a;

    #v2=(Reference);
    iget-object v2, v2, Lcom/baidu/platform/comapi/map/t$a;->g:Lcom/baidu/platform/comapi/basestruct/c;

    iget v2, v2, Lcom/baidu/platform/comapi/basestruct/c;->b:I

    #v2=(Integer);
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/o;->o:Landroid/os/Bundle;

    const-string v1, "rbx"

    iget-object v2, p1, Lcom/baidu/platform/comapi/map/t;->g:Lcom/baidu/platform/comapi/map/t$a;

    #v2=(Reference);
    iget-object v2, v2, Lcom/baidu/platform/comapi/map/t$a;->h:Lcom/baidu/platform/comapi/basestruct/c;

    iget v2, v2, Lcom/baidu/platform/comapi/basestruct/c;->a:I

    #v2=(Integer);
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/o;->o:Landroid/os/Bundle;

    const-string v1, "rby"

    iget-object v2, p1, Lcom/baidu/platform/comapi/map/t;->g:Lcom/baidu/platform/comapi/map/t$a;

    #v2=(Reference);
    iget-object v2, v2, Lcom/baidu/platform/comapi/map/t$a;->h:Lcom/baidu/platform/comapi/basestruct/c;

    iget v2, v2, Lcom/baidu/platform/comapi/basestruct/c;->b:I

    #v2=(Integer);
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/o;->o:Landroid/os/Bundle;

    const-string v1, "xoffset"

    iget-wide v2, p1, Lcom/baidu/platform/comapi/map/t;->h:J

    #v2=(LongLo);v3=(LongHi);
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/o;->o:Landroid/os/Bundle;

    const-string v1, "yoffset"

    iget-wide v2, p1, Lcom/baidu/platform/comapi/map/t;->i:J

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Bundle;->putLong(Ljava/lang/String;J)V

    iget-object v1, p0, Lcom/baidu/platform/comapi/map/o;->o:Landroid/os/Bundle;

    const-string v2, "bfpp"

    #v2=(Reference);
    iget-boolean v0, p1, Lcom/baidu/platform/comapi/map/t;->j:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    return-void

    :cond_0
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method static synthetic b(Lcom/baidu/platform/comapi/map/o;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/baidu/platform/comapi/map/o;->ar:Z

    #v0=(Boolean);
    return v0
.end method

.method static synthetic c(Lcom/baidu/platform/comapi/map/o;)V
    .locals 0

    invoke-direct {p0}, Lcom/baidu/platform/comapi/map/o;->p()V

    return-void
.end method

.method static synthetic d(Lcom/baidu/platform/comapi/map/o;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/baidu/platform/comapi/map/o;->as:Z

    #v0=(Boolean);
    return v0
.end method

.method static synthetic e(Lcom/baidu/platform/comapi/map/o;)V
    .locals 0

    invoke-direct {p0}, Lcom/baidu/platform/comapi/map/o;->q()V

    return-void
.end method

.method private f(Landroid/view/MotionEvent;)V
    .locals 5

    sget-object v0, Lcom/baidu/platform/comapi/map/o;->Q:Lcom/baidu/platform/comapi/map/o$a;

    #v0=(Reference);
    iget-boolean v0, v0, Lcom/baidu/platform/comapi/map/o$a;->j:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    :goto_0
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    return-void

    :cond_0
    #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getDownTime()J

    move-result-wide v0

    #v0=(LongLo);v1=(LongHi);
    sput-wide v0, Lcom/baidu/platform/comapi/map/o;->ag:J

    sget-wide v0, Lcom/baidu/platform/comapi/map/o;->ag:J

    sget-wide v2, Lcom/baidu/platform/comapi/map/o;->af:J

    #v2=(LongLo);v3=(LongHi);
    sub-long/2addr v0, v2

    sget-wide v2, Lcom/baidu/platform/comapi/map/o;->ai:J

    cmp-long v0, v0, v2

    #v0=(Byte);
    if-gez v0, :cond_2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    #v0=(Float);
    sget v1, Lcom/baidu/platform/comapi/map/o;->ac:F

    #v1=(Integer);
    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    sget-wide v1, Lcom/baidu/platform/comapi/map/o;->ak:J

    #v1=(LongLo);v2=(LongHi);
    long-to-float v1, v1

    #v1=(Float);
    cmpg-float v0, v0, v1

    #v0=(Byte);
    if-gez v0, :cond_1

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    #v0=(Float);
    sget v1, Lcom/baidu/platform/comapi/map/o;->ad:F

    #v1=(Integer);
    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    sget-wide v1, Lcom/baidu/platform/comapi/map/o;->ak:J

    #v1=(LongLo);
    long-to-float v1, v1

    #v1=(Float);
    cmpg-float v0, v0, v1

    #v0=(Byte);
    if-gez v0, :cond_1

    invoke-virtual {p0, p1}, Lcom/baidu/platform/comapi/map/o;->e(Landroid/view/MotionEvent;)V

    const-wide/16 v0, 0x0

    #v0=(LongLo);v1=(LongHi);
    sput-wide v0, Lcom/baidu/platform/comapi/map/o;->af:J

    :goto_1
    #v2=(Conflicted);
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    #v0=(Float);
    sput v0, Lcom/baidu/platform/comapi/map/o;->ac:F

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    sput v0, Lcom/baidu/platform/comapi/map/o;->ad:F

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    float-to-int v0, v0

    #v0=(Integer);
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    #v1=(Float);
    float-to-int v1, v1

    #v1=(Integer);
    const/4 v2, 0x4

    #v2=(PosByte);
    const/4 v3, 0x0

    #v3=(Null);
    shl-int/lit8 v4, v1, 0x10

    #v4=(Integer);
    or-int/2addr v4, v0

    invoke-virtual {p0, v2, v3, v4}, Lcom/baidu/platform/comapi/map/o;->a(III)I

    invoke-virtual {p0, v0, v1}, Lcom/baidu/platform/comapi/map/o;->g(II)Z

    const/4 v0, 0x1

    #v0=(One);
    sput-boolean v0, Lcom/baidu/platform/comapi/map/o;->ae:Z

    goto :goto_0

    :cond_1
    #v0=(Byte);v1=(Float);v2=(LongHi);v3=(LongHi);v4=(Uninit);
    sget-wide v0, Lcom/baidu/platform/comapi/map/o;->ag:J

    #v0=(LongLo);v1=(LongHi);
    sput-wide v0, Lcom/baidu/platform/comapi/map/o;->af:J

    goto :goto_1

    :cond_2
    #v0=(Byte);v2=(LongLo);
    sget-wide v0, Lcom/baidu/platform/comapi/map/o;->ag:J

    #v0=(LongLo);
    sput-wide v0, Lcom/baidu/platform/comapi/map/o;->af:J

    goto :goto_1
.end method

.method public static h()V
    .locals 4

    const/4 v3, 0x0

    #v3=(Null);
    sput v3, Lcom/baidu/platform/comapi/map/o;->K:I

    const-wide/16 v0, 0x0

    #v0=(LongLo);v1=(LongHi);
    sput-wide v0, Lcom/baidu/platform/comapi/map/o;->L:J

    sput v3, Lcom/baidu/platform/comapi/map/o;->M:I

    sput v3, Lcom/baidu/platform/comapi/map/o;->N:I

    sput-boolean v3, Lcom/baidu/platform/comapi/map/o;->O:Z

    sput-boolean v3, Lcom/baidu/platform/comapi/map/o;->P:Z

    sget-object v0, Lcom/baidu/platform/comapi/map/o;->Q:Lcom/baidu/platform/comapi/map/o$a;

    #v0=(Reference);
    iput-boolean v3, v0, Lcom/baidu/platform/comapi/map/o$a;->j:Z

    sget-object v0, Lcom/baidu/platform/comapi/map/o;->Q:Lcom/baidu/platform/comapi/map/o$a;

    const-wide/16 v1, 0x0

    #v1=(LongLo);v2=(LongHi);
    iput-wide v1, v0, Lcom/baidu/platform/comapi/map/o$a;->m:D

    sput v3, Lcom/baidu/platform/comapi/map/o;->S:I

    sput v3, Lcom/baidu/platform/comapi/map/o;->R:I

    sput-boolean v3, Lcom/baidu/platform/comapi/map/o;->T:Z

    sput-boolean v3, Lcom/baidu/platform/comapi/map/o;->U:Z

    sput-boolean v3, Lcom/baidu/platform/comapi/map/o;->V:Z

    return-void
.end method

.method private p()V
    .locals 4

    const/4 v3, 0x0

    #v3=(Null);
    iget-boolean v0, p0, Lcom/baidu/platform/comapi/map/o;->ao:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    new-instance v0, Landroid/graphics/Point;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    #v0=(Reference);
    iget-object v1, p0, Lcom/baidu/platform/comapi/map/o;->m:Lcom/baidu/platform/comapi/map/q;

    #v1=(Reference);
    invoke-virtual {v1}, Lcom/baidu/platform/comapi/map/q;->d()Lcom/baidu/platform/comapi/map/Projection;

    move-result-object v1

    iget-object v2, p0, Lcom/baidu/platform/comapi/map/o;->an:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    #v2=(Reference);
    invoke-interface {v1, v2, v0}, Lcom/baidu/platform/comapi/map/Projection;->toPixels(Lcom/baidu/platform/comapi/basestruct/GeoPoint;Landroid/graphics/Point;)Landroid/graphics/Point;

    iget v1, v0, Landroid/graphics/Point;->x:I

    #v1=(Integer);
    iget v2, p0, Lcom/baidu/platform/comapi/map/o;->ap:I

    #v2=(Integer);
    sub-int/2addr v1, v2

    iget v0, v0, Landroid/graphics/Point;->y:I

    #v0=(Integer);
    iget v2, p0, Lcom/baidu/platform/comapi/map/o;->aq:I

    sub-int/2addr v0, v2

    invoke-virtual {p0, v1, v0}, Lcom/baidu/platform/comapi/map/o;->f(II)V

    iput-boolean v3, p0, Lcom/baidu/platform/comapi/map/o;->ao:Z

    :cond_0
    #v1=(Conflicted);v2=(Conflicted);
    iput-boolean v3, p0, Lcom/baidu/platform/comapi/map/o;->ar:Z

    iput v3, p0, Lcom/baidu/platform/comapi/map/o;->ap:I

    iput v3, p0, Lcom/baidu/platform/comapi/map/o;->aq:I

    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Lcom/baidu/platform/comapi/map/o;->an:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    return-void
.end method

.method private q()V
    .locals 4

    const/4 v3, 0x0

    #v3=(Null);
    iget-boolean v0, p0, Lcom/baidu/platform/comapi/map/o;->ao:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    new-instance v0, Landroid/graphics/Point;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    #v0=(Reference);
    iget-object v1, p0, Lcom/baidu/platform/comapi/map/o;->m:Lcom/baidu/platform/comapi/map/q;

    #v1=(Reference);
    invoke-virtual {v1}, Lcom/baidu/platform/comapi/map/q;->d()Lcom/baidu/platform/comapi/map/Projection;

    move-result-object v1

    iget-object v2, p0, Lcom/baidu/platform/comapi/map/o;->an:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    #v2=(Reference);
    invoke-interface {v1, v2, v0}, Lcom/baidu/platform/comapi/map/Projection;->toPixels(Lcom/baidu/platform/comapi/basestruct/GeoPoint;Landroid/graphics/Point;)Landroid/graphics/Point;

    iget v1, v0, Landroid/graphics/Point;->x:I

    #v1=(Integer);
    iget v2, p0, Lcom/baidu/platform/comapi/map/o;->ap:I

    #v2=(Integer);
    sub-int/2addr v1, v2

    iget v0, v0, Landroid/graphics/Point;->y:I

    #v0=(Integer);
    iget v2, p0, Lcom/baidu/platform/comapi/map/o;->aq:I

    sub-int/2addr v0, v2

    invoke-virtual {p0, v1, v0}, Lcom/baidu/platform/comapi/map/o;->f(II)V

    iput-boolean v3, p0, Lcom/baidu/platform/comapi/map/o;->ao:Z

    :cond_0
    #v1=(Conflicted);v2=(Conflicted);
    iput-boolean v3, p0, Lcom/baidu/platform/comapi/map/o;->as:Z

    iput v3, p0, Lcom/baidu/platform/comapi/map/o;->ap:I

    iput v3, p0, Lcom/baidu/platform/comapi/map/o;->aq:I

    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Lcom/baidu/platform/comapi/map/o;->an:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    return-void
.end method

.method private r()V
    .locals 2

    const/16 v0, 0xfa0

    #v0=(PosShort);
    iget-object v1, p0, Lcom/baidu/platform/comapi/map/o;->p:Landroid/os/Handler;

    #v1=(Reference);
    invoke-static {v0, v1}, Lcom/baidu/platform/comjni/engine/a;->a(ILandroid/os/Handler;)V

    const/16 v0, 0x27

    #v0=(PosByte);
    iget-object v1, p0, Lcom/baidu/platform/comapi/map/o;->p:Landroid/os/Handler;

    invoke-static {v0, v1}, Lcom/baidu/platform/comjni/engine/a;->a(ILandroid/os/Handler;)V

    const/16 v0, 0x29

    iget-object v1, p0, Lcom/baidu/platform/comapi/map/o;->p:Landroid/os/Handler;

    invoke-static {v0, v1}, Lcom/baidu/platform/comjni/engine/a;->a(ILandroid/os/Handler;)V

    const/16 v0, 0x200

    #v0=(PosShort);
    iget-object v1, p0, Lcom/baidu/platform/comapi/map/o;->p:Landroid/os/Handler;

    invoke-static {v0, v1}, Lcom/baidu/platform/comjni/engine/a;->a(ILandroid/os/Handler;)V

    return-void
.end method

.method private s()V
    .locals 2

    const/16 v0, 0xfa0

    #v0=(PosShort);
    iget-object v1, p0, Lcom/baidu/platform/comapi/map/o;->p:Landroid/os/Handler;

    #v1=(Reference);
    invoke-static {v0, v1}, Lcom/baidu/platform/comjni/engine/a;->b(ILandroid/os/Handler;)V

    const/16 v0, 0x29

    #v0=(PosByte);
    iget-object v1, p0, Lcom/baidu/platform/comapi/map/o;->p:Landroid/os/Handler;

    invoke-static {v0, v1}, Lcom/baidu/platform/comjni/engine/a;->b(ILandroid/os/Handler;)V

    const/16 v0, 0x27

    iget-object v1, p0, Lcom/baidu/platform/comapi/map/o;->p:Landroid/os/Handler;

    invoke-static {v0, v1}, Lcom/baidu/platform/comjni/engine/a;->b(ILandroid/os/Handler;)V

    const/16 v0, 0x200

    #v0=(PosShort);
    iget-object v1, p0, Lcom/baidu/platform/comapi/map/o;->p:Landroid/os/Handler;

    invoke-static {v0, v1}, Lcom/baidu/platform/comjni/engine/a;->b(ILandroid/os/Handler;)V

    return-void
.end method


# virtual methods
.method a()I
    .locals 1

    iget v0, p0, Lcom/baidu/platform/comapi/map/o;->n:I

    #v0=(Integer);
    return v0
.end method

.method public a(III)I
    .locals 1

    iget v0, p0, Lcom/baidu/platform/comapi/map/o;->n:I

    #v0=(Integer);
    invoke-static {v0, p1, p2, p3}, Lcom/baidu/platform/comapi/map/o;->a(IIII)I

    move-result v0

    return v0
.end method

.method a(II)V
    .locals 1

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/o;->k:Lcom/baidu/platform/comjni/map/basemap/a;

    #v0=(Reference);
    invoke-virtual {v0, p1, p2}, Lcom/baidu/platform/comjni/map/basemap/a;->c(II)V

    return-void
.end method

.method public a(Landroid/os/Bundle;Lcom/baidu/platform/comapi/map/w;)V
    .locals 13

    if-nez p1, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    #v0=(UninitRef);
    const-string v1, "IllegalArgument"

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0

    :cond_0
    #v0=(Uninit);v1=(Uninit);
    iget-object v0, p0, Lcom/baidu/platform/comapi/map/o;->k:Lcom/baidu/platform/comjni/map/basemap/a;

    #v0=(Reference);
    if-nez v0, :cond_1

    new-instance v0, Lcom/baidu/platform/comjni/map/basemap/a;

    #v0=(UninitRef);
    invoke-direct {v0}, Lcom/baidu/platform/comjni/map/basemap/a;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Lcom/baidu/platform/comapi/map/o;->k:Lcom/baidu/platform/comjni/map/basemap/a;

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/o;->k:Lcom/baidu/platform/comjni/map/basemap/a;

    invoke-virtual {v0}, Lcom/baidu/platform/comjni/map/basemap/a;->a()Z

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/o;->k:Lcom/baidu/platform/comjni/map/basemap/a;

    invoke-virtual {v0}, Lcom/baidu/platform/comjni/map/basemap/a;->c()I

    move-result v0

    #v0=(Integer);
    iput v0, p0, Lcom/baidu/platform/comapi/map/o;->n:I

    :cond_1
    #v0=(Conflicted);
    if-eqz p2, :cond_2

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/o;->k:Lcom/baidu/platform/comjni/map/basemap/a;

    #v0=(Reference);
    invoke-virtual {v0, p2}, Lcom/baidu/platform/comjni/map/basemap/a;->a(Lcom/baidu/platform/comjni/map/basemap/BaseMapCallback;)Z

    :cond_2
    #v0=(Conflicted);
    const/4 v0, 0x0

    #v0=(Null);
    invoke-static {}, Lcom/baidu/platform/comapi/d/c;->n()I

    move-result v1

    #v1=(Integer);
    const/16 v2, 0xb4

    #v2=(PosShort);
    if-lt v1, v2, :cond_3

    const/4 v0, 0x1

    :cond_3
    #v0=(Boolean);
    invoke-static {}, Lcom/baidu/platform/comapi/d/c;->n()I

    move-result v1

    const/16 v2, 0xa0

    if-ge v1, v2, :cond_5

    const/16 v1, 0x12

    #v1=(PosByte);
    iput v1, p0, Lcom/baidu/platform/comapi/map/o;->J:I

    :goto_0
    const-string v1, "modulePath"

    #v1=(Reference);
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    #v7=(Reference);
    const-string v1, "appSdcardPath"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    #v8=(Reference);
    const-string v1, "appCachePath"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    #v3=(Reference);
    const-string v1, "appSecondCachePath"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    #v4=(Reference);
    const-string v1, "mapTmpMax"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v10

    #v10=(Integer);
    const-string v1, "domTmpMax"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v11

    #v11=(Integer);
    const-string v1, "itsTmpMax"

    invoke-virtual {p1, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v12

    #v12=(Integer);
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #v1=(Reference);
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/cfg/h/"

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    #v2=(Reference);
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v5, "/cfg/h/"

    #v5=(Reference);
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    #v6=(Reference);
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    #v2=(Reference);
    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v5, "/vmp/h/"

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v5, Ljava/lang/StringBuilder;

    #v5=(UninitRef);
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    #v5=(Reference);
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v9, "/vmp/h/"

    #v9=(Reference);
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    new-instance v9, Ljava/lang/StringBuilder;

    #v9=(UninitRef);
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    #v9=(Reference);
    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v9, "/tmp/"

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-instance v9, Ljava/lang/StringBuilder;

    #v9=(UninitRef);
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    #v9=(Reference);
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v9, "/tmp/"

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    if-nez v0, :cond_4

    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    #v0=(Reference);
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/cfg/l/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    #v0=(Reference);
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "/cfg/l/"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    #v0=(Reference);
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "/vmp/l/"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    #v0=(Reference);
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v5, "/vmp/l/"

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    :cond_4
    #v0=(Conflicted);
    iget-object v0, p0, Lcom/baidu/platform/comapi/map/o;->k:Lcom/baidu/platform/comjni/map/basemap/a;

    #v0=(Reference);
    iget v7, p0, Lcom/baidu/platform/comapi/map/o;->H:I

    #v7=(Integer);
    iget v8, p0, Lcom/baidu/platform/comapi/map/o;->I:I

    #v8=(Integer);
    invoke-static {}, Lcom/baidu/platform/comapi/d/c;->n()I

    move-result v9

    #v9=(Integer);
    invoke-virtual/range {v0 .. v12}, Lcom/baidu/platform/comjni/map/basemap/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIII)Z

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/o;->k:Lcom/baidu/platform/comjni/map/basemap/a;

    invoke-virtual {v0}, Lcom/baidu/platform/comjni/map/basemap/a;->e()V

    return-void

    :cond_5
    #v0=(Boolean);v1=(Integer);v2=(PosShort);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);
    invoke-static {}, Lcom/baidu/platform/comapi/d/c;->n()I

    move-result v1

    const/16 v2, 0xf0

    if-ge v1, v2, :cond_6

    const/16 v1, 0x19

    #v1=(PosByte);
    iput v1, p0, Lcom/baidu/platform/comapi/map/o;->J:I

    goto/16 :goto_0

    :cond_6
    #v1=(Integer);
    invoke-static {}, Lcom/baidu/platform/comapi/d/c;->n()I

    move-result v1

    const/16 v2, 0x140

    if-ge v1, v2, :cond_7

    const/16 v1, 0x25

    #v1=(PosByte);
    iput v1, p0, Lcom/baidu/platform/comapi/map/o;->J:I

    goto/16 :goto_0

    :cond_7
    #v1=(Integer);
    const/16 v1, 0x32

    #v1=(PosByte);
    iput v1, p0, Lcom/baidu/platform/comapi/map/o;->J:I

    goto/16 :goto_0
.end method

.method public a(Lcom/baidu/platform/comapi/basestruct/GeoPoint;)V
    .locals 2

    const/4 v1, 0x0

    #v1=(Null);
    iget-object v0, p0, Lcom/baidu/platform/comapi/map/o;->m:Lcom/baidu/platform/comapi/map/q;

    #v0=(Reference);
    invoke-virtual {v0, p1, v1, v1}, Lcom/baidu/platform/comapi/map/q;->a(Lcom/baidu/platform/comapi/basestruct/GeoPoint;Landroid/os/Message;Ljava/lang/Runnable;)V

    return-void
.end method

.method public a(Lcom/baidu/platform/comapi/basestruct/GeoPoint;Landroid/os/Message;)V
    .locals 2

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/o;->m:Lcom/baidu/platform/comapi/map/q;

    #v0=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-virtual {v0, p1, p2, v1}, Lcom/baidu/platform/comapi/map/q;->a(Lcom/baidu/platform/comapi/basestruct/GeoPoint;Landroid/os/Message;Ljava/lang/Runnable;)V

    return-void
.end method

.method public a(Lcom/baidu/platform/comapi/map/q;)V
    .locals 1

    iput-object p1, p0, Lcom/baidu/platform/comapi/map/o;->m:Lcom/baidu/platform/comapi/map/q;

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/o;->m:Lcom/baidu/platform/comapi/map/q;

    #v0=(Reference);
    invoke-virtual {v0, p0}, Lcom/baidu/platform/comapi/map/q;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    return-void
.end method

.method public a(Lcom/baidu/platform/comapi/map/t;)V
    .locals 3

    const/4 v2, 0x0

    #v2=(Null);
    iget-object v0, p0, Lcom/baidu/platform/comapi/map/o;->k:Lcom/baidu/platform/comjni/map/basemap/a;

    #v0=(Reference);
    if-nez v0, :cond_0

    :goto_0
    #v1=(Conflicted);
    return-void

    :cond_0
    #v1=(Uninit);
    invoke-direct {p0, p1}, Lcom/baidu/platform/comapi/map/o;->b(Lcom/baidu/platform/comapi/map/t;)V

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/o;->o:Landroid/os/Bundle;

    const-string v1, "animation"

    #v1=(Reference);
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/o;->o:Landroid/os/Bundle;

    const-string v1, "animatime"

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/o;->k:Lcom/baidu/platform/comjni/map/basemap/a;

    iget-object v1, p0, Lcom/baidu/platform/comapi/map/o;->o:Landroid/os/Bundle;

    invoke-virtual {v0, v1}, Lcom/baidu/platform/comjni/map/basemap/a;->a(Landroid/os/Bundle;)V

    goto :goto_0
.end method

.method public a(Lcom/baidu/platform/comapi/map/t;I)V
    .locals 3

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/o;->k:Lcom/baidu/platform/comjni/map/basemap/a;

    #v0=(Reference);
    if-nez v0, :cond_0

    :goto_0
    #v1=(Conflicted);v2=(Conflicted);
    return-void

    :cond_0
    #v1=(Uninit);v2=(Uninit);
    invoke-direct {p0, p1}, Lcom/baidu/platform/comapi/map/o;->b(Lcom/baidu/platform/comapi/map/t;)V

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/o;->o:Landroid/os/Bundle;

    const-string v1, "animation"

    #v1=(Reference);
    const/4 v2, 0x1

    #v2=(One);
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/o;->o:Landroid/os/Bundle;

    const-string v1, "animatime"

    invoke-virtual {v0, v1, p2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/o;->k:Lcom/baidu/platform/comjni/map/basemap/a;

    iget-object v1, p0, Lcom/baidu/platform/comapi/map/o;->o:Landroid/os/Bundle;

    invoke-virtual {v0, v1}, Lcom/baidu/platform/comjni/map/basemap/a;->a(Landroid/os/Bundle;)V

    goto :goto_0
.end method

.method public a(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/o;->m:Lcom/baidu/platform/comapi/map/q;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/q;->requestRender()V

    if-eqz p1, :cond_0

    const-string v0, ""

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_1

    :cond_0
    #v0=(Conflicted);
    new-instance v0, Ljava/lang/IllegalArgumentException;

    #v0=(UninitRef);
    const-string v1, "the path is invalid!"

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0

    :cond_1
    #v0=(Boolean);v1=(Uninit);
    iget-object v0, p0, Lcom/baidu/platform/comapi/map/o;->k:Lcom/baidu/platform/comjni/map/basemap/a;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Lcom/baidu/platform/comjni/map/basemap/a;->a(Ljava/lang/String;)V

    return-void
.end method

.method public a(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/baidu/platform/comapi/map/o;->t:Z

    return-void
.end method

.method public a(Landroid/view/MotionEvent;)Z
    .locals 22

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v2

    #v2=(Integer);
    sget-object v3, Lcom/baidu/platform/comapi/map/o;->Q:Lcom/baidu/platform/comapi/map/o$a;

    #v3=(Reference);
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v3, 0x2

    #v3=(PosByte);
    if-ne v2, v3, :cond_27

    invoke-virtual/range {p0 .. p0}, Lcom/baidu/platform/comapi/map/o;->l()I

    move-result v2

    int-to-float v2, v2

    #v2=(Float);
    const/4 v3, 0x0

    #v3=(Null);
    move-object/from16 v0, p1

    #v0=(Reference);
    invoke-virtual {v0, v3}, Landroid/view/MotionEvent;->getY(I)F

    move-result v3

    #v3=(Float);
    sub-float v4, v2, v3

    #v4=(Float);
    invoke-virtual/range {p0 .. p0}, Lcom/baidu/platform/comapi/map/o;->l()I

    move-result v2

    #v2=(Integer);
    int-to-float v2, v2

    #v2=(Float);
    const/4 v3, 0x1

    #v3=(One);
    move-object/from16 v0, p1

    invoke-virtual {v0, v3}, Landroid/view/MotionEvent;->getY(I)F

    move-result v3

    #v3=(Float);
    sub-float v5, v2, v3

    #v5=(Float);
    const/4 v2, 0x0

    #v2=(Null);
    move-object/from16 v0, p1

    invoke-virtual {v0, v2}, Landroid/view/MotionEvent;->getX(I)F

    move-result v6

    #v6=(Float);
    const/4 v2, 0x1

    #v2=(One);
    move-object/from16 v0, p1

    invoke-virtual {v0, v2}, Landroid/view/MotionEvent;->getX(I)F

    move-result v7

    #v7=(Float);
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    #v2=(Integer);
    sparse-switch v2, :sswitch_data_0

    :goto_0
    #v3=(Conflicted);
    sget-object v2, Lcom/baidu/platform/comapi/map/o;->W:Landroid/view/VelocityTracker;

    #v2=(Reference);
    if-nez v2, :cond_0

    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v2

    sput-object v2, Lcom/baidu/platform/comapi/map/o;->W:Landroid/view/VelocityTracker;

    :cond_0
    sget-object v2, Lcom/baidu/platform/comapi/map/o;->W:Landroid/view/VelocityTracker;

    move-object/from16 v0, p1

    invoke-virtual {v2, v0}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    invoke-static {}, Landroid/view/ViewConfiguration;->getMinimumFlingVelocity()I

    move-result v2

    #v2=(Integer);
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    move-result v3

    #v3=(Integer);
    sget-object v8, Lcom/baidu/platform/comapi/map/o;->W:Landroid/view/VelocityTracker;

    #v8=(Reference);
    const/16 v9, 0x3e8

    #v9=(PosShort);
    int-to-float v3, v3

    #v3=(Float);
    invoke-virtual {v8, v9, v3}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V

    sget-object v3, Lcom/baidu/platform/comapi/map/o;->W:Landroid/view/VelocityTracker;

    #v3=(Reference);
    const/4 v8, 0x1

    #v8=(One);
    invoke-virtual {v3, v8}, Landroid/view/VelocityTracker;->getXVelocity(I)F

    move-result v3

    #v3=(Float);
    sget-object v8, Lcom/baidu/platform/comapi/map/o;->W:Landroid/view/VelocityTracker;

    #v8=(Reference);
    const/4 v9, 0x1

    #v9=(One);
    invoke-virtual {v8, v9}, Landroid/view/VelocityTracker;->getYVelocity(I)F

    move-result v8

    #v8=(Float);
    sget-object v9, Lcom/baidu/platform/comapi/map/o;->W:Landroid/view/VelocityTracker;

    #v9=(Reference);
    const/4 v10, 0x2

    #v10=(PosByte);
    invoke-virtual {v9, v10}, Landroid/view/VelocityTracker;->getXVelocity(I)F

    move-result v9

    #v9=(Float);
    sget-object v10, Lcom/baidu/platform/comapi/map/o;->W:Landroid/view/VelocityTracker;

    #v10=(Reference);
    const/4 v11, 0x2

    #v11=(PosByte);
    invoke-virtual {v10, v11}, Landroid/view/VelocityTracker;->getYVelocity(I)F

    move-result v10

    #v10=(Float);
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v11

    #v11=(Float);
    int-to-float v12, v2

    #v12=(Float);
    cmpl-float v11, v11, v12

    #v11=(Byte);
    if-gtz v11, :cond_1

    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    move-result v8

    int-to-float v11, v2

    #v11=(Float);
    cmpl-float v8, v8, v11

    #v8=(Byte);
    if-gtz v8, :cond_1

    invoke-static {v9}, Ljava/lang/Math;->abs(F)F

    move-result v8

    #v8=(Float);
    int-to-float v11, v2

    cmpl-float v8, v8, v11

    #v8=(Byte);
    if-gtz v8, :cond_1

    invoke-static {v10}, Ljava/lang/Math;->abs(F)F

    move-result v8

    #v8=(Float);
    int-to-float v2, v2

    #v2=(Float);
    cmpl-float v2, v8, v2

    #v2=(Byte);
    if-lez v2, :cond_24

    :cond_1
    #v2=(Integer);
    sget-object v2, Lcom/baidu/platform/comapi/map/o;->Q:Lcom/baidu/platform/comapi/map/o$a;

    #v2=(Reference);
    iget-boolean v2, v2, Lcom/baidu/platform/comapi/map/o$a;->j:Z

    #v2=(Boolean);
    const/4 v8, 0x1

    #v8=(One);
    if-ne v2, v8, :cond_c

    sget v2, Lcom/baidu/platform/comapi/map/o;->K:I

    #v2=(Integer);
    if-nez v2, :cond_9

    sget-object v2, Lcom/baidu/platform/comapi/map/o;->Q:Lcom/baidu/platform/comapi/map/o$a;

    #v2=(Reference);
    iget v2, v2, Lcom/baidu/platform/comapi/map/o$a;->h:F

    #v2=(Integer);
    sub-float/2addr v2, v4

    #v2=(Float);
    const/4 v8, 0x0

    #v8=(Null);
    cmpl-float v2, v2, v8

    #v2=(Byte);
    if-lez v2, :cond_2

    sget-object v2, Lcom/baidu/platform/comapi/map/o;->Q:Lcom/baidu/platform/comapi/map/o$a;

    #v2=(Reference);
    iget v2, v2, Lcom/baidu/platform/comapi/map/o$a;->i:F

    #v2=(Integer);
    sub-float/2addr v2, v5

    #v2=(Float);
    const/4 v8, 0x0

    cmpl-float v2, v2, v8

    #v2=(Byte);
    if-gtz v2, :cond_3

    :cond_2
    sget-object v2, Lcom/baidu/platform/comapi/map/o;->Q:Lcom/baidu/platform/comapi/map/o$a;

    #v2=(Reference);
    iget v2, v2, Lcom/baidu/platform/comapi/map/o$a;->h:F

    #v2=(Integer);
    sub-float/2addr v2, v4

    #v2=(Float);
    const/4 v8, 0x0

    cmpg-float v2, v2, v8

    #v2=(Byte);
    if-gez v2, :cond_8

    sget-object v2, Lcom/baidu/platform/comapi/map/o;->Q:Lcom/baidu/platform/comapi/map/o$a;

    #v2=(Reference);
    iget v2, v2, Lcom/baidu/platform/comapi/map/o$a;->i:F

    #v2=(Integer);
    sub-float/2addr v2, v5

    #v2=(Float);
    const/4 v8, 0x0

    cmpg-float v2, v2, v8

    #v2=(Byte);
    if-gez v2, :cond_8

    :cond_3
    move-object/from16 v0, p0

    iget-boolean v2, v0, Lcom/baidu/platform/comapi/map/o;->am:Z

    #v2=(Boolean);
    const/4 v8, 0x1

    #v8=(One);
    if-ne v2, v8, :cond_8

    sub-float v2, v5, v4

    #v2=(Float);
    float-to-double v10, v2

    #v10=(DoubleLo);v11=(DoubleHi);
    sub-float v2, v7, v6

    float-to-double v12, v2

    #v12=(DoubleLo);v13=(DoubleHi);
    invoke-static {v10, v11, v12, v13}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v10

    sget-object v2, Lcom/baidu/platform/comapi/map/o;->Q:Lcom/baidu/platform/comapi/map/o$a;

    #v2=(Reference);
    iget v2, v2, Lcom/baidu/platform/comapi/map/o$a;->i:F

    #v2=(Integer);
    sget-object v8, Lcom/baidu/platform/comapi/map/o;->Q:Lcom/baidu/platform/comapi/map/o$a;

    #v8=(Reference);
    iget v8, v8, Lcom/baidu/platform/comapi/map/o$a;->h:F

    #v8=(Integer);
    sub-float/2addr v2, v8

    #v2=(Float);
    float-to-double v12, v2

    sget-object v2, Lcom/baidu/platform/comapi/map/o;->Q:Lcom/baidu/platform/comapi/map/o$a;

    #v2=(Reference);
    iget v2, v2, Lcom/baidu/platform/comapi/map/o$a;->g:F

    #v2=(Integer);
    sget-object v8, Lcom/baidu/platform/comapi/map/o;->Q:Lcom/baidu/platform/comapi/map/o$a;

    #v8=(Reference);
    iget v8, v8, Lcom/baidu/platform/comapi/map/o$a;->f:F

    #v8=(Integer);
    sub-float/2addr v2, v8

    #v2=(Float);
    float-to-double v14, v2

    #v14=(DoubleLo);v15=(DoubleHi);
    invoke-static {v12, v13, v14, v15}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v12

    sub-double/2addr v10, v12

    sub-float v2, v7, v6

    sub-float v8, v7, v6

    #v8=(Float);
    mul-float/2addr v2, v8

    sub-float v8, v5, v4

    sub-float v12, v5, v4

    #v12=(Float);
    mul-float/2addr v8, v12

    add-float/2addr v2, v8

    invoke-static {v2}, Landroid/util/FloatMath;->sqrt(F)F

    move-result v2

    float-to-double v12, v2

    #v12=(DoubleLo);
    sget-object v2, Lcom/baidu/platform/comapi/map/o;->Q:Lcom/baidu/platform/comapi/map/o$a;

    #v2=(Reference);
    iget-wide v14, v2, Lcom/baidu/platform/comapi/map/o$a;->m:D

    div-double/2addr v12, v14

    invoke-static {v12, v13}, Ljava/lang/Math;->log(D)D

    move-result-wide v14

    const-wide/high16 v16, 0x4000

    #v16=(LongLo);v17=(LongHi);
    invoke-static/range {v16 .. v17}, Ljava/lang/Math;->log(D)D

    move-result-wide v16

    #v16=(DoubleLo);v17=(DoubleHi);
    div-double v14, v14, v16

    const-wide v16, 0x40c3880000000000L

    #v16=(LongLo);v17=(LongHi);
    mul-double v14, v14, v16

    double-to-int v2, v14

    #v2=(Integer);
    const-wide v14, 0x4066800000000000L

    #v14=(LongLo);v15=(LongHi);
    mul-double/2addr v10, v14

    const-wide v14, 0x400921ff2e48e8a7L

    div-double/2addr v10, v14

    double-to-int v8, v10

    #v8=(Integer);
    const-wide/16 v10, 0x0

    #v10=(LongLo);v11=(LongHi);
    cmpl-double v10, v12, v10

    #v10=(Byte);
    if-lez v10, :cond_4

    const/16 v10, 0xbb8

    #v10=(PosShort);
    if-gt v2, v10, :cond_5

    const/16 v10, -0xbb8

    #v10=(Short);
    if-lt v2, v10, :cond_5

    :cond_4
    invoke-static {v8}, Ljava/lang/Math;->abs(I)I

    move-result v2

    const/16 v10, 0xa

    #v10=(PosByte);
    if-lt v2, v10, :cond_7

    :cond_5
    #v10=(Short);
    const/4 v2, 0x2

    #v2=(PosByte);
    sput v2, Lcom/baidu/platform/comapi/map/o;->K:I

    :cond_6
    :goto_1
    #v2=(Integer);v10=(Float);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);
    sget v2, Lcom/baidu/platform/comapi/map/o;->K:I

    if-nez v2, :cond_9

    const/4 v2, 0x1

    :goto_2
    #v1=(Conflicted);v2=(Boolean);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v18=(Conflicted);v19=(Conflicted);v20=(Conflicted);v21=(Conflicted);
    return v2

    :sswitch_0
    #v1=(Uninit);v2=(Integer);v3=(Float);v4=(Float);v5=(Float);v6=(Float);v7=(Float);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);v20=(Uninit);v21=(Uninit);
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v2

    #v2=(LongLo);v3=(LongHi);
    sput-wide v2, Lcom/baidu/platform/comapi/map/o;->Y:J

    sget v2, Lcom/baidu/platform/comapi/map/o;->ab:I

    #v2=(Integer);
    add-int/lit8 v2, v2, -0x1

    sput v2, Lcom/baidu/platform/comapi/map/o;->ab:I

    goto/16 :goto_0

    :sswitch_1
    #v3=(Float);
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v2

    #v2=(LongLo);v3=(LongHi);
    sput-wide v2, Lcom/baidu/platform/comapi/map/o;->X:J

    sget v2, Lcom/baidu/platform/comapi/map/o;->ab:I

    #v2=(Integer);
    add-int/lit8 v2, v2, -0x1

    sput v2, Lcom/baidu/platform/comapi/map/o;->ab:I

    goto/16 :goto_0

    :sswitch_2
    #v3=(Float);
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v2

    #v2=(LongLo);v3=(LongHi);
    sput-wide v2, Lcom/baidu/platform/comapi/map/o;->aa:J

    sget v2, Lcom/baidu/platform/comapi/map/o;->ab:I

    #v2=(Integer);
    add-int/lit8 v2, v2, 0x1

    sput v2, Lcom/baidu/platform/comapi/map/o;->ab:I

    goto/16 :goto_0

    :sswitch_3
    #v3=(Float);
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v2

    #v2=(LongLo);v3=(LongHi);
    sput-wide v2, Lcom/baidu/platform/comapi/map/o;->Z:J

    sget v2, Lcom/baidu/platform/comapi/map/o;->ab:I

    #v2=(Integer);
    add-int/lit8 v2, v2, 0x1

    sput v2, Lcom/baidu/platform/comapi/map/o;->ab:I

    goto/16 :goto_0

    :cond_7
    #v3=(Float);v8=(Integer);v9=(Float);v10=(PosByte);v11=(LongHi);v12=(DoubleLo);v13=(DoubleHi);v14=(LongLo);v15=(LongHi);v16=(LongLo);v17=(LongHi);
    invoke-static {v8}, Ljava/lang/Math;->abs(I)I

    move-result v2

    const/4 v8, 0x1

    #v8=(One);
    if-ge v2, v8, :cond_6

    const/4 v2, 0x1

    #v2=(One);
    sput v2, Lcom/baidu/platform/comapi/map/o;->K:I

    goto :goto_1

    :cond_8
    #v2=(Byte);v8=(Boolean);v10=(Float);v11=(Float);v12=(Float);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);
    const/4 v2, 0x2

    #v2=(PosByte);
    sput v2, Lcom/baidu/platform/comapi/map/o;->K:I

    goto :goto_1

    :cond_9
    #v2=(Integer);v8=(Integer);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);
    sget v2, Lcom/baidu/platform/comapi/map/o;->K:I

    const/4 v8, 0x1

    #v8=(One);
    if-ne v2, v8, :cond_13

    move-object/from16 v0, p0

    iget-boolean v2, v0, Lcom/baidu/platform/comapi/map/o;->r:Z

    #v2=(Boolean);
    if-eqz v2, :cond_13

    sget-boolean v2, Lcom/baidu/platform/comapi/map/o;->O:Z

    if-nez v2, :cond_a

    const/4 v2, 0x1

    #v2=(One);
    sput-boolean v2, Lcom/baidu/platform/comapi/map/o;->O:Z

    :cond_a
    #v2=(Boolean);
    sget-boolean v2, Lcom/baidu/platform/comapi/map/o;->T:Z

    if-nez v2, :cond_b

    const/4 v2, 0x1

    #v2=(One);
    sput-boolean v2, Lcom/baidu/platform/comapi/map/o;->T:Z

    :cond_b
    #v2=(Boolean);
    sget-object v2, Lcom/baidu/platform/comapi/map/o;->Q:Lcom/baidu/platform/comapi/map/o$a;

    #v2=(Reference);
    iget v2, v2, Lcom/baidu/platform/comapi/map/o$a;->h:F

    #v2=(Integer);
    sub-float/2addr v2, v4

    #v2=(Float);
    const/4 v3, 0x0

    #v3=(Null);
    cmpl-float v2, v2, v3

    #v2=(Byte);
    if-lez v2, :cond_12

    sget-object v2, Lcom/baidu/platform/comapi/map/o;->Q:Lcom/baidu/platform/comapi/map/o$a;

    #v2=(Reference);
    iget v2, v2, Lcom/baidu/platform/comapi/map/o$a;->i:F

    #v2=(Integer);
    sub-float/2addr v2, v5

    #v2=(Float);
    const/4 v3, 0x0

    cmpl-float v2, v2, v3

    #v2=(Byte);
    if-lez v2, :cond_12

    const/4 v2, 0x1

    #v2=(One);
    const/16 v3, 0x53

    #v3=(PosByte);
    const/4 v8, 0x0

    #v8=(Null);
    move-object/from16 v0, p0

    invoke-virtual {v0, v2, v3, v8}, Lcom/baidu/platform/comapi/map/o;->a(III)I

    :cond_c
    :goto_3
    #v1=(Conflicted);v2=(Conflicted);v3=(Float);v8=(Float);v9=(Integer);v10=(Conflicted);v18=(Conflicted);v19=(Conflicted);v20=(Conflicted);v21=(Conflicted);
    sget v2, Lcom/baidu/platform/comapi/map/o;->K:I

    #v2=(Integer);
    const/4 v3, 0x1

    #v3=(One);
    if-ne v2, v3, :cond_22

    sget v2, Lcom/baidu/platform/comapi/map/o;->ab:I

    if-nez v2, :cond_22

    move-object/from16 v0, p0

    iget-boolean v2, v0, Lcom/baidu/platform/comapi/map/o;->s:Z

    #v2=(Boolean);
    if-nez v2, :cond_21

    invoke-static {}, Lcom/baidu/platform/comapi/c/a;->a()Lcom/baidu/platform/comapi/c/a;

    move-result-object v2

    #v2=(Reference);
    const-string v3, "mapview_gesture_3d_enter"

    #v3=(Reference);
    invoke-virtual {v2, v3}, Lcom/baidu/platform/comapi/c/a;->a(Ljava/lang/String;)V

    :cond_d
    :goto_4
    #v2=(Conflicted);v3=(Conflicted);v8=(Conflicted);v9=(Conflicted);
    const/4 v2, 0x2

    #v2=(PosByte);
    sget v3, Lcom/baidu/platform/comapi/map/o;->K:I

    #v3=(Integer);
    if-eq v2, v3, :cond_e

    sget-object v2, Lcom/baidu/platform/comapi/map/o;->Q:Lcom/baidu/platform/comapi/map/o$a;

    #v2=(Reference);
    iput v4, v2, Lcom/baidu/platform/comapi/map/o$a;->h:F

    sget-object v2, Lcom/baidu/platform/comapi/map/o;->Q:Lcom/baidu/platform/comapi/map/o$a;

    iput v5, v2, Lcom/baidu/platform/comapi/map/o$a;->i:F

    sget-object v2, Lcom/baidu/platform/comapi/map/o;->Q:Lcom/baidu/platform/comapi/map/o$a;

    iput v6, v2, Lcom/baidu/platform/comapi/map/o$a;->f:F

    sget-object v2, Lcom/baidu/platform/comapi/map/o;->Q:Lcom/baidu/platform/comapi/map/o$a;

    iput v7, v2, Lcom/baidu/platform/comapi/map/o$a;->g:F

    :cond_e
    #v2=(Conflicted);
    sget-object v2, Lcom/baidu/platform/comapi/map/o;->Q:Lcom/baidu/platform/comapi/map/o$a;

    #v2=(Reference);
    iget-boolean v2, v2, Lcom/baidu/platform/comapi/map/o$a;->j:Z

    #v2=(Boolean);
    if-nez v2, :cond_11

    sget-object v2, Lcom/baidu/platform/comapi/map/o;->Q:Lcom/baidu/platform/comapi/map/o$a;

    #v2=(Reference);
    invoke-virtual/range {p0 .. p0}, Lcom/baidu/platform/comapi/map/o;->k()I

    move-result v3

    div-int/lit8 v3, v3, 0x2

    int-to-float v3, v3

    #v3=(Float);
    iput v3, v2, Lcom/baidu/platform/comapi/map/o$a;->k:F

    sget-object v2, Lcom/baidu/platform/comapi/map/o;->Q:Lcom/baidu/platform/comapi/map/o$a;

    invoke-virtual/range {p0 .. p0}, Lcom/baidu/platform/comapi/map/o;->l()I

    move-result v3

    #v3=(Integer);
    div-int/lit8 v3, v3, 0x2

    int-to-float v3, v3

    #v3=(Float);
    iput v3, v2, Lcom/baidu/platform/comapi/map/o$a;->l:F

    sget-object v2, Lcom/baidu/platform/comapi/map/o;->Q:Lcom/baidu/platform/comapi/map/o$a;

    iput v6, v2, Lcom/baidu/platform/comapi/map/o$a;->b:F

    sget-object v2, Lcom/baidu/platform/comapi/map/o;->Q:Lcom/baidu/platform/comapi/map/o$a;

    iput v4, v2, Lcom/baidu/platform/comapi/map/o$a;->c:F

    sget-object v2, Lcom/baidu/platform/comapi/map/o;->Q:Lcom/baidu/platform/comapi/map/o$a;

    iput v7, v2, Lcom/baidu/platform/comapi/map/o$a;->d:F

    sget-object v2, Lcom/baidu/platform/comapi/map/o;->Q:Lcom/baidu/platform/comapi/map/o$a;

    iput v5, v2, Lcom/baidu/platform/comapi/map/o$a;->e:F

    sget-object v2, Lcom/baidu/platform/comapi/map/o;->Q:Lcom/baidu/platform/comapi/map/o$a;

    const/4 v3, 0x1

    #v3=(One);
    iput-boolean v3, v2, Lcom/baidu/platform/comapi/map/o$a;->j:Z

    const-wide/16 v2, 0x0

    #v2=(LongLo);v3=(LongHi);
    sget-object v4, Lcom/baidu/platform/comapi/map/o;->Q:Lcom/baidu/platform/comapi/map/o$a;

    #v4=(Reference);
    iget-wide v4, v4, Lcom/baidu/platform/comapi/map/o$a;->m:D

    #v4=(DoubleLo);v5=(DoubleHi);
    cmpl-double v2, v2, v4

    #v2=(Byte);
    if-nez v2, :cond_f

    sget-object v2, Lcom/baidu/platform/comapi/map/o;->Q:Lcom/baidu/platform/comapi/map/o$a;

    #v2=(Reference);
    iget v2, v2, Lcom/baidu/platform/comapi/map/o$a;->g:F

    #v2=(Integer);
    sget-object v3, Lcom/baidu/platform/comapi/map/o;->Q:Lcom/baidu/platform/comapi/map/o$a;

    #v3=(Reference);
    iget v3, v3, Lcom/baidu/platform/comapi/map/o$a;->f:F

    #v3=(Integer);
    sub-float/2addr v2, v3

    #v2=(Float);
    sget-object v3, Lcom/baidu/platform/comapi/map/o;->Q:Lcom/baidu/platform/comapi/map/o$a;

    #v3=(Reference);
    iget v3, v3, Lcom/baidu/platform/comapi/map/o$a;->g:F

    #v3=(Integer);
    sget-object v4, Lcom/baidu/platform/comapi/map/o;->Q:Lcom/baidu/platform/comapi/map/o$a;

    #v4=(Reference);
    iget v4, v4, Lcom/baidu/platform/comapi/map/o$a;->f:F

    #v4=(Integer);
    sub-float/2addr v3, v4

    #v3=(Float);
    mul-float/2addr v2, v3

    sget-object v3, Lcom/baidu/platform/comapi/map/o;->Q:Lcom/baidu/platform/comapi/map/o$a;

    #v3=(Reference);
    iget v3, v3, Lcom/baidu/platform/comapi/map/o$a;->i:F

    #v3=(Integer);
    sget-object v4, Lcom/baidu/platform/comapi/map/o;->Q:Lcom/baidu/platform/comapi/map/o$a;

    #v4=(Reference);
    iget v4, v4, Lcom/baidu/platform/comapi/map/o$a;->h:F

    #v4=(Integer);
    sub-float/2addr v3, v4

    #v3=(Float);
    sget-object v4, Lcom/baidu/platform/comapi/map/o;->Q:Lcom/baidu/platform/comapi/map/o$a;

    #v4=(Reference);
    iget v4, v4, Lcom/baidu/platform/comapi/map/o$a;->i:F

    #v4=(Integer);
    sget-object v5, Lcom/baidu/platform/comapi/map/o;->Q:Lcom/baidu/platform/comapi/map/o$a;

    #v5=(Reference);
    iget v5, v5, Lcom/baidu/platform/comapi/map/o$a;->h:F

    #v5=(Integer);
    sub-float/2addr v4, v5

    #v4=(Float);
    mul-float/2addr v3, v4

    add-float/2addr v2, v3

    invoke-static {v2}, Landroid/util/FloatMath;->sqrt(F)F

    move-result v2

    float-to-double v2, v2

    #v2=(DoubleLo);v3=(DoubleHi);
    sget-object v4, Lcom/baidu/platform/comapi/map/o;->Q:Lcom/baidu/platform/comapi/map/o$a;

    #v4=(Reference);
    iput-wide v2, v4, Lcom/baidu/platform/comapi/map/o$a;->m:D

    :cond_f
    #v2=(Conflicted);v3=(LongHi);v4=(Conflicted);v5=(Conflicted);
    move-object/from16 v0, p0

    iget-boolean v2, v0, Lcom/baidu/platform/comapi/map/o;->x:Z

    #v2=(Boolean);
    if-nez v2, :cond_10

    move-object/from16 v0, p0

    iget-boolean v2, v0, Lcom/baidu/platform/comapi/map/o;->w:Z

    if-eqz v2, :cond_11

    :cond_10
    const/4 v2, 0x0

    #v2=(Null);
    move-object/from16 v0, p1

    invoke-virtual {v0, v2}, Landroid/view/MotionEvent;->getX(I)F

    move-result v2

    #v2=(Float);
    float-to-int v2, v2

    #v2=(Integer);
    move-object/from16 v0, p0

    iput v2, v0, Lcom/baidu/platform/comapi/map/o;->y:I

    const/4 v2, 0x0

    #v2=(Null);
    move-object/from16 v0, p1

    invoke-virtual {v0, v2}, Landroid/view/MotionEvent;->getY(I)F

    move-result v2

    #v2=(Float);
    float-to-int v2, v2

    #v2=(Integer);
    move-object/from16 v0, p0

    iput v2, v0, Lcom/baidu/platform/comapi/map/o;->A:I

    const/4 v2, 0x1

    #v2=(One);
    move-object/from16 v0, p1

    invoke-virtual {v0, v2}, Landroid/view/MotionEvent;->getX(I)F

    move-result v2

    #v2=(Float);
    float-to-int v2, v2

    #v2=(Integer);
    move-object/from16 v0, p0

    iput v2, v0, Lcom/baidu/platform/comapi/map/o;->z:I

    const/4 v2, 0x1

    #v2=(One);
    move-object/from16 v0, p1

    invoke-virtual {v0, v2}, Landroid/view/MotionEvent;->getY(I)F

    move-result v2

    #v2=(Float);
    float-to-int v2, v2

    #v2=(Integer);
    move-object/from16 v0, p0

    iput v2, v0, Lcom/baidu/platform/comapi/map/o;->B:I

    move-object/from16 v0, p0

    iget v2, v0, Lcom/baidu/platform/comapi/map/o;->z:I

    move-object/from16 v0, p0

    iget v3, v0, Lcom/baidu/platform/comapi/map/o;->y:I

    #v3=(Integer);
    sub-int/2addr v2, v3

    div-int/lit8 v2, v2, 0x2

    move-object/from16 v0, p0

    iget v3, v0, Lcom/baidu/platform/comapi/map/o;->y:I

    add-int/2addr v2, v3

    move-object/from16 v0, p0

    iput v2, v0, Lcom/baidu/platform/comapi/map/o;->C:I

    move-object/from16 v0, p0

    iget v2, v0, Lcom/baidu/platform/comapi/map/o;->B:I

    move-object/from16 v0, p0

    iget v3, v0, Lcom/baidu/platform/comapi/map/o;->A:I

    sub-int/2addr v2, v3

    div-int/lit8 v2, v2, 0x2

    move-object/from16 v0, p0

    iget v3, v0, Lcom/baidu/platform/comapi/map/o;->A:I

    add-int/2addr v2, v3

    move-object/from16 v0, p0

    iput v2, v0, Lcom/baidu/platform/comapi/map/o;->D:I

    sget-object v2, Lcom/baidu/platform/comapi/map/o;->j:Ljava/lang/String;

    #v2=(Reference);
    new-instance v3, Ljava/lang/StringBuilder;

    #v3=(UninitRef);
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    #v3=(Reference);
    const-string v4, "mFinger0X="

    #v4=(Reference);
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    move-object/from16 v0, p0

    iget v4, v0, Lcom/baidu/platform/comapi/map/o;->y:I

    #v4=(Integer);
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "mFinger1X="

    #v4=(Reference);
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    move-object/from16 v0, p0

    iget v4, v0, Lcom/baidu/platform/comapi/map/o;->z:I

    #v4=(Integer);
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "mFingerCenterX="

    #v4=(Reference);
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    move-object/from16 v0, p0

    iget v4, v0, Lcom/baidu/platform/comapi/map/o;->C:I

    #v4=(Integer);
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/baidu/mapapi/utils/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v2, Lcom/baidu/platform/comapi/map/o;->j:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    #v3=(UninitRef);
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    #v3=(Reference);
    const-string v4, "mFinger0Y="

    #v4=(Reference);
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    move-object/from16 v0, p0

    iget v4, v0, Lcom/baidu/platform/comapi/map/o;->A:I

    #v4=(Integer);
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "mFinger1Y="

    #v4=(Reference);
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    move-object/from16 v0, p0

    iget v4, v0, Lcom/baidu/platform/comapi/map/o;->B:I

    #v4=(Integer);
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "mFingerCenterY="

    #v4=(Reference);
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    move-object/from16 v0, p0

    iget v4, v0, Lcom/baidu/platform/comapi/map/o;->D:I

    #v4=(Integer);
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/baidu/mapapi/utils/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/baidu/platform/comapi/map/o;->m:Lcom/baidu/platform/comapi/map/q;

    invoke-virtual {v2}, Lcom/baidu/platform/comapi/map/q;->d()Lcom/baidu/platform/comapi/map/Projection;

    move-result-object v2

    move-object/from16 v0, p0

    iget v3, v0, Lcom/baidu/platform/comapi/map/o;->C:I

    #v3=(Integer);
    move-object/from16 v0, p0

    iget v4, v0, Lcom/baidu/platform/comapi/map/o;->D:I

    invoke-interface {v2, v3, v4}, Lcom/baidu/platform/comapi/map/Projection;->fromPixels(II)Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v2

    move-object/from16 v0, p0

    iput-object v2, v0, Lcom/baidu/platform/comapi/map/o;->E:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-object/from16 v0, p0

    iget v2, v0, Lcom/baidu/platform/comapi/map/o;->C:I

    #v2=(Integer);
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/baidu/platform/comapi/map/o;->m:Lcom/baidu/platform/comapi/map/q;

    #v3=(Reference);
    invoke-virtual {v3}, Lcom/baidu/platform/comapi/map/q;->getWidth()I

    move-result v3

    #v3=(Integer);
    div-int/lit8 v3, v3, 0x2

    sub-int/2addr v2, v3

    move-object/from16 v0, p0

    iput v2, v0, Lcom/baidu/platform/comapi/map/o;->F:I

    move-object/from16 v0, p0

    iget v2, v0, Lcom/baidu/platform/comapi/map/o;->D:I

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/baidu/platform/comapi/map/o;->m:Lcom/baidu/platform/comapi/map/q;

    #v3=(Reference);
    invoke-virtual {v3}, Lcom/baidu/platform/comapi/map/q;->getHeight()I

    move-result v3

    #v3=(Integer);
    div-int/lit8 v3, v3, 0x2

    sub-int/2addr v2, v3

    move-object/from16 v0, p0

    iput v2, v0, Lcom/baidu/platform/comapi/map/o;->G:I

    :cond_11
    #v3=(Conflicted);v4=(Conflicted);
    const/4 v2, 0x1

    #v2=(One);
    goto/16 :goto_2

    :cond_12
    #v1=(Uninit);v2=(Byte);v3=(Null);v4=(Float);v5=(Float);v8=(One);v9=(Float);v10=(Float);v18=(Uninit);v19=(Uninit);v20=(Uninit);v21=(Uninit);
    sget-object v2, Lcom/baidu/platform/comapi/map/o;->Q:Lcom/baidu/platform/comapi/map/o$a;

    #v2=(Reference);
    iget v2, v2, Lcom/baidu/platform/comapi/map/o$a;->h:F

    #v2=(Integer);
    sub-float/2addr v2, v4

    #v2=(Float);
    const/4 v3, 0x0

    cmpg-float v2, v2, v3

    #v2=(Byte);
    if-gez v2, :cond_c

    sget-object v2, Lcom/baidu/platform/comapi/map/o;->Q:Lcom/baidu/platform/comapi/map/o$a;

    #v2=(Reference);
    iget v2, v2, Lcom/baidu/platform/comapi/map/o$a;->i:F

    #v2=(Integer);
    sub-float/2addr v2, v5

    #v2=(Float);
    const/4 v3, 0x0

    cmpg-float v2, v2, v3

    #v2=(Byte);
    if-gez v2, :cond_c

    const/4 v2, 0x1

    #v2=(One);
    const/16 v3, 0x57

    #v3=(PosByte);
    const/4 v8, 0x0

    #v8=(Null);
    move-object/from16 v0, p0

    invoke-virtual {v0, v2, v3, v8}, Lcom/baidu/platform/comapi/map/o;->a(III)I

    goto/16 :goto_3

    :cond_13
    #v2=(Integer);v3=(Float);v8=(One);
    sget v2, Lcom/baidu/platform/comapi/map/o;->K:I

    const/4 v8, 0x2

    #v8=(PosByte);
    if-eq v2, v8, :cond_14

    sget v2, Lcom/baidu/platform/comapi/map/o;->K:I

    const/4 v8, 0x4

    if-eq v2, v8, :cond_14

    sget v2, Lcom/baidu/platform/comapi/map/o;->K:I

    const/4 v8, 0x3

    if-ne v2, v8, :cond_c

    :cond_14
    sget-boolean v2, Lcom/baidu/platform/comapi/map/o;->P:Z

    #v2=(Boolean);
    if-nez v2, :cond_15

    const/4 v2, 0x1

    #v2=(One);
    sput-boolean v2, Lcom/baidu/platform/comapi/map/o;->P:Z

    :cond_15
    #v2=(Boolean);
    sub-float v2, v5, v4

    #v2=(Float);
    float-to-double v10, v2

    #v10=(DoubleLo);v11=(DoubleHi);
    sub-float v2, v7, v6

    float-to-double v12, v2

    #v12=(DoubleLo);v13=(DoubleHi);
    invoke-static {v10, v11, v12, v13}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v10

    sget-object v2, Lcom/baidu/platform/comapi/map/o;->Q:Lcom/baidu/platform/comapi/map/o$a;

    #v2=(Reference);
    iget v2, v2, Lcom/baidu/platform/comapi/map/o$a;->i:F

    #v2=(Integer);
    sget-object v8, Lcom/baidu/platform/comapi/map/o;->Q:Lcom/baidu/platform/comapi/map/o$a;

    #v8=(Reference);
    iget v8, v8, Lcom/baidu/platform/comapi/map/o$a;->h:F

    #v8=(Integer);
    sub-float/2addr v2, v8

    #v2=(Float);
    float-to-double v12, v2

    sget-object v2, Lcom/baidu/platform/comapi/map/o;->Q:Lcom/baidu/platform/comapi/map/o$a;

    #v2=(Reference);
    iget v2, v2, Lcom/baidu/platform/comapi/map/o$a;->g:F

    #v2=(Integer);
    sget-object v8, Lcom/baidu/platform/comapi/map/o;->Q:Lcom/baidu/platform/comapi/map/o$a;

    #v8=(Reference);
    iget v8, v8, Lcom/baidu/platform/comapi/map/o$a;->f:F

    #v8=(Integer);
    sub-float/2addr v2, v8

    #v2=(Float);
    float-to-double v14, v2

    #v14=(DoubleLo);v15=(DoubleHi);
    invoke-static {v12, v13, v14, v15}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v12

    sub-double/2addr v10, v12

    sub-float v2, v7, v6

    sub-float v8, v7, v6

    #v8=(Float);
    mul-float/2addr v2, v8

    sub-float v8, v5, v4

    sub-float v12, v5, v4

    #v12=(Float);
    mul-float/2addr v8, v12

    add-float/2addr v2, v8

    invoke-static {v2}, Landroid/util/FloatMath;->sqrt(F)F

    move-result v2

    float-to-double v12, v2

    #v12=(DoubleLo);
    sget-object v2, Lcom/baidu/platform/comapi/map/o;->Q:Lcom/baidu/platform/comapi/map/o$a;

    #v2=(Reference);
    iget-wide v14, v2, Lcom/baidu/platform/comapi/map/o$a;->m:D

    div-double/2addr v12, v14

    invoke-static {v12, v13}, Ljava/lang/Math;->log(D)D

    move-result-wide v14

    const-wide/high16 v16, 0x4000

    #v16=(LongLo);v17=(LongHi);
    invoke-static/range {v16 .. v17}, Ljava/lang/Math;->log(D)D

    move-result-wide v16

    #v16=(DoubleLo);v17=(DoubleHi);
    div-double v14, v14, v16

    const-wide v16, 0x40c3880000000000L

    #v16=(LongLo);v17=(LongHi);
    mul-double v14, v14, v16

    double-to-int v2, v14

    #v2=(Integer);
    sget-object v8, Lcom/baidu/platform/comapi/map/o;->Q:Lcom/baidu/platform/comapi/map/o$a;

    #v8=(Reference);
    iget v8, v8, Lcom/baidu/platform/comapi/map/o$a;->l:F

    #v8=(Integer);
    sget-object v14, Lcom/baidu/platform/comapi/map/o;->Q:Lcom/baidu/platform/comapi/map/o$a;

    #v14=(Reference);
    iget v14, v14, Lcom/baidu/platform/comapi/map/o$a;->h:F

    #v14=(Integer);
    sub-float/2addr v8, v14

    #v8=(Float);
    float-to-double v14, v8

    #v14=(DoubleLo);
    sget-object v8, Lcom/baidu/platform/comapi/map/o;->Q:Lcom/baidu/platform/comapi/map/o$a;

    #v8=(Reference);
    iget v8, v8, Lcom/baidu/platform/comapi/map/o$a;->k:F

    #v8=(Integer);
    sget-object v16, Lcom/baidu/platform/comapi/map/o;->Q:Lcom/baidu/platform/comapi/map/o$a;

    #v16=(Reference);
    move-object/from16 v0, v16

    iget v0, v0, Lcom/baidu/platform/comapi/map/o$a;->f:F

    #v0=(Integer);
    move/from16 v16, v0

    #v16=(Integer);
    sub-float v8, v8, v16

    #v8=(Float);
    float-to-double v0, v8

    #v0=(DoubleLo);v1=(DoubleHi);
    move-wide/from16 v16, v0

    #v16=(DoubleLo);v17=(DoubleHi);
    invoke-static/range {v14 .. v17}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v14

    sget-object v8, Lcom/baidu/platform/comapi/map/o;->Q:Lcom/baidu/platform/comapi/map/o$a;

    #v8=(Reference);
    iget v8, v8, Lcom/baidu/platform/comapi/map/o$a;->k:F

    #v8=(Integer);
    sget-object v16, Lcom/baidu/platform/comapi/map/o;->Q:Lcom/baidu/platform/comapi/map/o$a;

    #v16=(Reference);
    move-object/from16 v0, v16

    #v0=(Reference);
    iget v0, v0, Lcom/baidu/platform/comapi/map/o$a;->f:F

    #v0=(Integer);
    move/from16 v16, v0

    #v16=(Integer);
    sub-float v8, v8, v16

    #v8=(Float);
    sget-object v16, Lcom/baidu/platform/comapi/map/o;->Q:Lcom/baidu/platform/comapi/map/o$a;

    #v16=(Reference);
    move-object/from16 v0, v16

    #v0=(Reference);
    iget v0, v0, Lcom/baidu/platform/comapi/map/o$a;->k:F

    #v0=(Integer);
    move/from16 v16, v0

    #v16=(Integer);
    sget-object v17, Lcom/baidu/platform/comapi/map/o;->Q:Lcom/baidu/platform/comapi/map/o$a;

    #v17=(Reference);
    move-object/from16 v0, v17

    #v0=(Reference);
    iget v0, v0, Lcom/baidu/platform/comapi/map/o$a;->f:F

    #v0=(Integer);
    move/from16 v17, v0

    #v17=(Integer);
    sub-float v16, v16, v17

    #v16=(Float);
    mul-float v8, v8, v16

    sget-object v16, Lcom/baidu/platform/comapi/map/o;->Q:Lcom/baidu/platform/comapi/map/o$a;

    #v16=(Reference);
    move-object/from16 v0, v16

    #v0=(Reference);
    iget v0, v0, Lcom/baidu/platform/comapi/map/o$a;->l:F

    #v0=(Integer);
    move/from16 v16, v0

    #v16=(Integer);
    sget-object v17, Lcom/baidu/platform/comapi/map/o;->Q:Lcom/baidu/platform/comapi/map/o$a;

    #v17=(Reference);
    move-object/from16 v0, v17

    #v0=(Reference);
    iget v0, v0, Lcom/baidu/platform/comapi/map/o$a;->h:F

    #v0=(Integer);
    move/from16 v17, v0

    #v17=(Integer);
    sub-float v16, v16, v17

    #v16=(Float);
    sget-object v17, Lcom/baidu/platform/comapi/map/o;->Q:Lcom/baidu/platform/comapi/map/o$a;

    #v17=(Reference);
    move-object/from16 v0, v17

    #v0=(Reference);
    iget v0, v0, Lcom/baidu/platform/comapi/map/o$a;->l:F

    #v0=(Integer);
    move/from16 v17, v0

    #v17=(Integer);
    sget-object v18, Lcom/baidu/platform/comapi/map/o;->Q:Lcom/baidu/platform/comapi/map/o$a;

    #v18=(Reference);
    move-object/from16 v0, v18

    #v0=(Reference);
    iget v0, v0, Lcom/baidu/platform/comapi/map/o$a;->h:F

    #v0=(Integer);
    move/from16 v18, v0

    #v18=(Integer);
    sub-float v17, v17, v18

    #v17=(Float);
    mul-float v16, v16, v17

    add-float v8, v8, v16

    invoke-static {v8}, Landroid/util/FloatMath;->sqrt(F)F

    move-result v8

    float-to-double v0, v8

    #v0=(DoubleLo);
    move-wide/from16 v16, v0

    #v16=(DoubleLo);v17=(DoubleHi);
    add-double v18, v14, v10

    #v18=(DoubleLo);v19=(DoubleHi);
    invoke-static/range {v18 .. v19}, Ljava/lang/Math;->cos(D)D

    move-result-wide v18

    mul-double v18, v18, v16

    mul-double v18, v18, v12

    float-to-double v0, v6

    move-wide/from16 v20, v0

    #v20=(DoubleLo);v21=(DoubleHi);
    add-double v18, v18, v20

    move-wide/from16 v0, v18

    double-to-float v8, v0

    add-double/2addr v14, v10

    invoke-static {v14, v15}, Ljava/lang/Math;->sin(D)D

    move-result-wide v14

    mul-double v14, v14, v16

    mul-double/2addr v14, v12

    float-to-double v0, v4

    move-wide/from16 v16, v0

    add-double v14, v14, v16

    double-to-float v14, v14

    #v14=(Float);
    const-wide v15, 0x4066800000000000L

    #v15=(LongLo);v16=(LongHi);
    mul-double/2addr v10, v15

    const-wide v15, 0x400921ff2e48e8a7L

    div-double/2addr v10, v15

    double-to-int v10, v10

    #v10=(Integer);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-boolean v11, v0, Lcom/baidu/platform/comapi/map/o;->am:Z

    #v11=(Boolean);
    const/4 v15, 0x1

    #v15=(One);
    if-ne v11, v15, :cond_1e

    const-wide/16 v15, 0x0

    #v15=(LongLo);
    cmpl-double v3, v12, v15

    #v3=(Byte);
    if-lez v3, :cond_1a

    const/4 v3, 0x3

    #v3=(PosByte);
    sget v9, Lcom/baidu/platform/comapi/map/o;->K:I

    #v9=(Integer);
    if-eq v3, v9, :cond_16

    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    move-result v3

    #v3=(Integer);
    const/16 v9, 0x7d0

    #v9=(PosShort);
    if-le v3, v9, :cond_1a

    const/4 v3, 0x2

    #v3=(PosByte);
    sget v9, Lcom/baidu/platform/comapi/map/o;->K:I

    #v9=(Integer);
    if-ne v3, v9, :cond_1a

    :cond_16
    const/4 v3, 0x3

    sput v3, Lcom/baidu/platform/comapi/map/o;->K:I

    sget-boolean v3, Lcom/baidu/platform/comapi/map/o;->V:Z

    #v3=(Boolean);
    if-nez v3, :cond_17

    const/4 v3, 0x1

    #v3=(One);
    sput-boolean v3, Lcom/baidu/platform/comapi/map/o;->V:Z

    :cond_17
    #v3=(Boolean);
    move-object/from16 v0, p0

    iget-boolean v3, v0, Lcom/baidu/platform/comapi/map/o;->u:Z

    if-eqz v3, :cond_19

    move-object/from16 v0, p0

    iget-boolean v3, v0, Lcom/baidu/platform/comapi/map/o;->w:Z

    if-eqz v3, :cond_18

    invoke-virtual/range {p0 .. p0}, Lcom/baidu/platform/comapi/map/o;->m()Lcom/baidu/platform/comapi/map/t;

    move-result-object v3

    #v3=(Reference);
    if-eqz v3, :cond_18

    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/baidu/platform/comapi/map/o;->E:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    #v9=(Reference);
    invoke-virtual {v9}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLongitudeE6()I

    move-result v9

    #v9=(Integer);
    iput v9, v3, Lcom/baidu/platform/comapi/map/t;->d:I

    move-object/from16 v0, p0

    iget-object v9, v0, Lcom/baidu/platform/comapi/map/o;->E:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    #v9=(Reference);
    invoke-virtual {v9}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLatitudeE6()I

    move-result v9

    #v9=(Integer);
    iput v9, v3, Lcom/baidu/platform/comapi/map/t;->e:I

    move-object/from16 v0, p0

    iget v9, v0, Lcom/baidu/platform/comapi/map/o;->F:I

    int-to-long v9, v9

    #v9=(LongLo);v10=(LongHi);
    iput-wide v9, v3, Lcom/baidu/platform/comapi/map/t;->h:J

    move-object/from16 v0, p0

    iget v9, v0, Lcom/baidu/platform/comapi/map/o;->G:I

    #v9=(Integer);
    neg-int v9, v9

    int-to-long v9, v9

    #v9=(LongLo);
    iput-wide v9, v3, Lcom/baidu/platform/comapi/map/t;->i:J

    move-object/from16 v0, p0

    invoke-virtual {v0, v3}, Lcom/baidu/platform/comapi/map/o;->a(Lcom/baidu/platform/comapi/map/t;)V

    :cond_18
    #v3=(Conflicted);v9=(Conflicted);v10=(Conflicted);
    const/16 v3, 0x2001

    #v3=(PosShort);
    const/4 v9, 0x3

    #v9=(PosByte);
    move-object/from16 v0, p0

    invoke-virtual {v0, v3, v9, v2}, Lcom/baidu/platform/comapi/map/o;->a(III)I

    :cond_19
    :goto_5
    #v3=(Integer);v9=(Integer);v11=(Conflicted);v12=(Conflicted);v15=(Conflicted);
    move-object/from16 v0, p0

    iget-object v2, v0, Lcom/baidu/platform/comapi/map/o;->m:Lcom/baidu/platform/comapi/map/q;

    #v2=(Reference);
    const/4 v3, 0x1

    #v3=(One);
    invoke-virtual {v2, v3}, Lcom/baidu/platform/comapi/map/q;->setRenderMode(I)V

    sget-object v2, Lcom/baidu/platform/comapi/map/o;->Q:Lcom/baidu/platform/comapi/map/o$a;

    iput v8, v2, Lcom/baidu/platform/comapi/map/o$a;->k:F

    sget-object v2, Lcom/baidu/platform/comapi/map/o;->Q:Lcom/baidu/platform/comapi/map/o$a;

    iput v14, v2, Lcom/baidu/platform/comapi/map/o$a;->l:F

    goto/16 :goto_3

    :cond_1a
    #v2=(Integer);v3=(Integer);v10=(Integer);v11=(Boolean);v12=(DoubleLo);v15=(LongLo);
    move-object/from16 v0, p0

    iget-boolean v2, v0, Lcom/baidu/platform/comapi/map/o;->am:Z

    #v2=(Boolean);
    const/4 v3, 0x1

    #v3=(One);
    if-ne v2, v3, :cond_19

    if-eqz v10, :cond_19

    const/4 v2, 0x4

    #v2=(PosByte);
    sget v3, Lcom/baidu/platform/comapi/map/o;->K:I

    #v3=(Integer);
    if-eq v2, v3, :cond_1b

    invoke-static {v10}, Ljava/lang/Math;->abs(I)I

    move-result v2

    #v2=(Integer);
    const/16 v3, 0xa

    #v3=(PosByte);
    if-le v2, v3, :cond_19

    const/4 v2, 0x2

    #v2=(PosByte);
    sget v3, Lcom/baidu/platform/comapi/map/o;->K:I

    #v3=(Integer);
    if-ne v2, v3, :cond_19

    :cond_1b
    const/4 v2, 0x4

    sput v2, Lcom/baidu/platform/comapi/map/o;->K:I

    sget-boolean v2, Lcom/baidu/platform/comapi/map/o;->U:Z

    #v2=(Boolean);
    if-nez v2, :cond_1c

    const/4 v2, 0x1

    #v2=(One);
    sput-boolean v2, Lcom/baidu/platform/comapi/map/o;->U:Z

    :cond_1c
    #v2=(Boolean);
    move-object/from16 v0, p0

    iget-boolean v2, v0, Lcom/baidu/platform/comapi/map/o;->v:Z

    if-eqz v2, :cond_19

    move-object/from16 v0, p0

    iget-boolean v2, v0, Lcom/baidu/platform/comapi/map/o;->x:Z

    if-eqz v2, :cond_1d

    invoke-virtual/range {p0 .. p0}, Lcom/baidu/platform/comapi/map/o;->m()Lcom/baidu/platform/comapi/map/t;

    move-result-object v2

    #v2=(Reference);
    if-eqz v2, :cond_1d

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/baidu/platform/comapi/map/o;->E:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    #v3=(Reference);
    invoke-virtual {v3}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLongitudeE6()I

    move-result v3

    #v3=(Integer);
    iput v3, v2, Lcom/baidu/platform/comapi/map/t;->d:I

    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/baidu/platform/comapi/map/o;->E:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    #v3=(Reference);
    invoke-virtual {v3}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;->getLatitudeE6()I

    move-result v3

    #v3=(Integer);
    iput v3, v2, Lcom/baidu/platform/comapi/map/t;->e:I

    move-object/from16 v0, p0

    iget v3, v0, Lcom/baidu/platform/comapi/map/o;->F:I

    int-to-long v11, v3

    #v11=(LongLo);v12=(LongHi);
    iput-wide v11, v2, Lcom/baidu/platform/comapi/map/t;->h:J

    move-object/from16 v0, p0

    iget v3, v0, Lcom/baidu/platform/comapi/map/o;->G:I

    neg-int v3, v3

    int-to-long v11, v3

    iput-wide v11, v2, Lcom/baidu/platform/comapi/map/t;->i:J

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Lcom/baidu/platform/comapi/map/o;->a(Lcom/baidu/platform/comapi/map/t;)V

    :cond_1d
    #v2=(Conflicted);v11=(Conflicted);v12=(Conflicted);
    const/16 v2, 0x2001

    #v2=(PosShort);
    const/4 v3, 0x1

    #v3=(One);
    move-object/from16 v0, p0

    invoke-virtual {v0, v2, v3, v10}, Lcom/baidu/platform/comapi/map/o;->a(III)I

    goto :goto_5

    :cond_1e
    #v2=(Integer);v3=(Float);v9=(Float);v11=(Boolean);v12=(DoubleLo);v15=(One);
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v3

    sget v10, Lcom/baidu/platform/comapi/map/o;->q:I

    int-to-float v10, v10

    #v10=(Float);
    cmpl-float v3, v3, v10

    #v3=(Byte);
    if-gtz v3, :cond_1f

    invoke-static {v9}, Ljava/lang/Math;->abs(F)F

    move-result v3

    #v3=(Float);
    sget v9, Lcom/baidu/platform/comapi/map/o;->q:I

    #v9=(Integer);
    int-to-float v9, v9

    #v9=(Float);
    cmpl-float v3, v3, v9

    #v3=(Byte);
    if-lez v3, :cond_19

    :cond_1f
    const/4 v3, 0x3

    #v3=(PosByte);
    sput v3, Lcom/baidu/platform/comapi/map/o;->K:I

    sget-boolean v3, Lcom/baidu/platform/comapi/map/o;->V:Z

    #v3=(Boolean);
    if-nez v3, :cond_20

    const/4 v3, 0x1

    #v3=(One);
    sput-boolean v3, Lcom/baidu/platform/comapi/map/o;->V:Z

    :cond_20
    #v3=(Boolean);
    move-object/from16 v0, p0

    iget-boolean v3, v0, Lcom/baidu/platform/comapi/map/o;->u:Z

    if-eqz v3, :cond_19

    const/16 v3, 0x2001

    #v3=(PosShort);
    const/4 v9, 0x3

    #v9=(PosByte);
    move-object/from16 v0, p0

    invoke-virtual {v0, v3, v9, v2}, Lcom/baidu/platform/comapi/map/o;->a(III)I

    goto/16 :goto_5

    :cond_21
    #v1=(Conflicted);v2=(Boolean);v3=(One);v9=(Integer);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);v20=(Conflicted);v21=(Conflicted);
    invoke-virtual/range {p0 .. p0}, Lcom/baidu/platform/comapi/map/o;->m()Lcom/baidu/platform/comapi/map/t;

    move-result-object v2

    #v2=(Reference);
    iget v2, v2, Lcom/baidu/platform/comapi/map/t;->c:I

    #v2=(Integer);
    if-nez v2, :cond_d

    invoke-static {}, Lcom/baidu/platform/comapi/c/a;->a()Lcom/baidu/platform/comapi/c/a;

    move-result-object v2

    #v2=(Reference);
    const-string v3, "mapview_gesture_3d_exit"

    #v3=(Reference);
    invoke-virtual {v2, v3}, Lcom/baidu/platform/comapi/c/a;->a(Ljava/lang/String;)V

    goto/16 :goto_4

    :cond_22
    #v2=(Integer);v3=(One);
    sget v2, Lcom/baidu/platform/comapi/map/o;->K:I

    const/4 v3, 0x4

    #v3=(PosByte);
    if-ne v2, v3, :cond_d

    sget v2, Lcom/baidu/platform/comapi/map/o;->ab:I

    if-nez v2, :cond_d

    move-object/from16 v0, p0

    iget-boolean v2, v0, Lcom/baidu/platform/comapi/map/o;->s:Z

    #v2=(Boolean);
    if-nez v2, :cond_23

    invoke-static {}, Lcom/baidu/platform/comapi/c/a;->a()Lcom/baidu/platform/comapi/c/a;

    move-result-object v2

    #v2=(Reference);
    const-string v3, "mapview_gesture_2d_rotate"

    #v3=(Reference);
    invoke-virtual {v2, v3}, Lcom/baidu/platform/comapi/c/a;->a(Ljava/lang/String;)V

    goto/16 :goto_4

    :cond_23
    #v2=(Boolean);v3=(PosByte);
    invoke-static {}, Lcom/baidu/platform/comapi/c/a;->a()Lcom/baidu/platform/comapi/c/a;

    move-result-object v2

    #v2=(Reference);
    const-string v3, "mapview_gesture_3d_rotate"

    #v3=(Reference);
    invoke-virtual {v2, v3}, Lcom/baidu/platform/comapi/c/a;->a(Ljava/lang/String;)V

    goto/16 :goto_4

    :cond_24
    #v1=(Uninit);v2=(Byte);v3=(Float);v9=(Float);v10=(Float);v11=(Float);v12=(Float);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);v20=(Uninit);v21=(Uninit);
    sget v2, Lcom/baidu/platform/comapi/map/o;->K:I

    #v2=(Integer);
    if-nez v2, :cond_d

    sget v2, Lcom/baidu/platform/comapi/map/o;->ab:I

    if-nez v2, :cond_d

    sget-wide v2, Lcom/baidu/platform/comapi/map/o;->Z:J

    #v2=(LongLo);v3=(LongHi);
    sget-wide v8, Lcom/baidu/platform/comapi/map/o;->aa:J

    #v8=(LongLo);v9=(LongHi);
    cmp-long v2, v2, v8

    #v2=(Byte);
    if-lez v2, :cond_25

    sget-wide v2, Lcom/baidu/platform/comapi/map/o;->Z:J

    :goto_6
    #v2=(LongLo);
    sput-wide v2, Lcom/baidu/platform/comapi/map/o;->Z:J

    sget-wide v2, Lcom/baidu/platform/comapi/map/o;->X:J

    sget-wide v8, Lcom/baidu/platform/comapi/map/o;->Y:J

    cmp-long v2, v2, v8

    #v2=(Byte);
    if-gez v2, :cond_26

    sget-wide v2, Lcom/baidu/platform/comapi/map/o;->Y:J

    :goto_7
    #v2=(LongLo);
    sput-wide v2, Lcom/baidu/platform/comapi/map/o;->X:J

    sget-wide v2, Lcom/baidu/platform/comapi/map/o;->Z:J

    sget-wide v8, Lcom/baidu/platform/comapi/map/o;->X:J

    sub-long/2addr v2, v8

    const-wide/16 v8, 0xc8

    cmp-long v2, v2, v8

    #v2=(Byte);
    if-gez v2, :cond_d

    move-object/from16 v0, p0

    iget-boolean v2, v0, Lcom/baidu/platform/comapi/map/o;->u:Z

    #v2=(Boolean);
    if-eqz v2, :cond_d

    const/16 v2, 0x2001

    #v2=(PosShort);
    const/4 v3, 0x4

    #v3=(PosByte);
    const/4 v8, 0x0

    #v8=(Null);
    move-object/from16 v0, p0

    invoke-virtual {v0, v2, v3, v8}, Lcom/baidu/platform/comapi/map/o;->a(III)I

    goto/16 :goto_4

    :cond_25
    #v2=(Byte);v3=(LongHi);v8=(LongLo);
    sget-wide v2, Lcom/baidu/platform/comapi/map/o;->aa:J

    #v2=(LongLo);
    goto :goto_6

    :cond_26
    #v2=(Byte);
    sget-wide v2, Lcom/baidu/platform/comapi/map/o;->X:J

    #v2=(LongLo);
    goto :goto_7

    :cond_27
    #v0=(Uninit);v2=(Integer);v3=(PosByte);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);
    invoke-virtual/range {p0 .. p0}, Lcom/baidu/platform/comapi/map/o;->m()Lcom/baidu/platform/comapi/map/t;

    move-result-object v2

    #v2=(Reference);
    iget v2, v2, Lcom/baidu/platform/comapi/map/t;->c:I

    #v2=(Integer);
    if-eqz v2, :cond_28

    const/4 v2, 0x1

    #v2=(One);
    move-object/from16 v0, p0

    #v0=(Reference);
    iput-boolean v2, v0, Lcom/baidu/platform/comapi/map/o;->s:Z

    :goto_8
    #v2=(Boolean);
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v2

    #v2=(Integer);
    packed-switch v2, :pswitch_data_0

    const/4 v2, 0x0

    #v2=(Null);
    goto/16 :goto_2

    :cond_28
    #v0=(Uninit);v2=(Integer);
    const/4 v2, 0x0

    #v2=(Null);
    move-object/from16 v0, p0

    #v0=(Reference);
    iput-boolean v2, v0, Lcom/baidu/platform/comapi/map/o;->s:Z

    goto :goto_8

    :pswitch_0
    #v2=(Integer);
    invoke-direct/range {p0 .. p1}, Lcom/baidu/platform/comapi/map/o;->f(Landroid/view/MotionEvent;)V

    :goto_9
    const/4 v2, 0x1

    #v2=(One);
    goto/16 :goto_2

    :pswitch_1
    #v2=(Integer);
    invoke-virtual/range {p0 .. p1}, Lcom/baidu/platform/comapi/map/o;->c(Landroid/view/MotionEvent;)Z

    move-result v2

    #v2=(Boolean);
    goto/16 :goto_2

    :pswitch_2
    #v2=(Integer);
    invoke-virtual/range {p0 .. p1}, Lcom/baidu/platform/comapi/map/o;->b(Landroid/view/MotionEvent;)Z

    goto :goto_9

    :sswitch_data_0
    .sparse-switch
        0x5 -> :sswitch_0
        0x6 -> :sswitch_2
        0x105 -> :sswitch_1
        0x106 -> :sswitch_3
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public a(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 4

    mul-float v0, p3, p3

    #v0=(Float);
    mul-float v1, p4, p4

    #v1=(Float);
    add-float/2addr v0, v1

    float-to-double v0, v0

    #v0=(DoubleLo);v1=(DoubleHi);
    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-float v0, v0

    #v0=(Float);
    const/high16 v1, 0x43fa

    #v1=(Integer);
    cmpg-float v1, v0, v1

    #v1=(Byte);
    if-gtz v1, :cond_0

    const/4 v0, 0x0

    :goto_0
    #v0=(Boolean);v2=(Conflicted);v3=(Conflicted);
    return v0

    :cond_0
    #v0=(Float);v2=(Uninit);v3=(Uninit);
    sget-object v1, Lcom/baidu/platform/comapi/map/o;->j:Ljava/lang/String;

    #v1=(Reference);
    const-string v2, "handle fling, send msg to engine"

    #v2=(Reference);
    invoke-static {v1, v2}, Lcom/baidu/mapapi/utils/c;->a(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v1, 0x22

    #v1=(PosByte);
    const v2, 0x3f19999a

    #v2=(Integer);
    mul-float/2addr v0, v2

    float-to-int v0, v0

    #v0=(Integer);
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    #v2=(Float);
    float-to-int v2, v2

    #v2=(Integer);
    shl-int/lit8 v2, v2, 0x10

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    #v3=(Float);
    float-to-int v3, v3

    #v3=(Integer);
    or-int/2addr v2, v3

    invoke-virtual {p0, v1, v0, v2}, Lcom/baidu/platform/comapi/map/o;->a(III)I

    invoke-static {}, Lcom/baidu/platform/comapi/map/o;->h()V

    const/4 v0, 0x1

    #v0=(One);
    goto :goto_0
.end method

.method public b()Lcom/baidu/platform/comjni/map/basemap/a;
    .locals 1

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/o;->k:Lcom/baidu/platform/comjni/map/basemap/a;

    #v0=(Reference);
    return-object v0
.end method

.method public b(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/baidu/platform/comapi/map/o;->u:Z

    return-void
.end method

.method public b(II)Z
    .locals 20

    move-object/from16 v0, p0

    #v0=(Reference);
    iget v2, v0, Lcom/baidu/platform/comapi/map/o;->J:I

    #v2=(Integer);
    int-to-double v2, v2

    #v2=(DoubleLo);v3=(DoubleHi);
    invoke-virtual/range {p0 .. p0}, Lcom/baidu/platform/comapi/map/o;->c()D

    move-result-wide v4

    #v4=(DoubleLo);v5=(DoubleHi);
    mul-double/2addr v2, v4

    double-to-int v2, v2

    #v2=(Integer);
    move-object/from16 v0, p0

    iget-object v3, v0, Lcom/baidu/platform/comapi/map/o;->k:Lcom/baidu/platform/comjni/map/basemap/a;

    #v3=(Reference);
    const/4 v4, -0x1

    #v4=(Byte);
    move/from16 v0, p1

    #v0=(Integer);
    move/from16 v1, p2

    #v1=(Integer);
    invoke-virtual {v3, v4, v0, v1, v2}, Lcom/baidu/platform/comjni/map/basemap/a;->a(IIII)Ljava/lang/String;

    move-result-object v2

    #v2=(Reference);
    if-eqz v2, :cond_9

    :try_start_0
    new-instance v8, Lorg/json/JSONObject;

    #v8=(UninitRef);
    invoke-direct {v8, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    #v8=(Reference);
    new-instance v10, Ljava/util/ArrayList;

    #v10=(UninitRef);
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    #v10=(Reference);
    const/4 v7, 0x0

    #v7=(Null);
    const/4 v6, 0x0

    #v6=(Null);
    const/4 v5, 0x0

    #v5=(Null);
    const/4 v4, 0x0

    #v4=(Null);
    const/4 v3, 0x0

    #v3=(Null);
    const-string v2, "dataset"

    invoke-virtual {v8, v2}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v11

    #v11=(Reference);
    const/4 v2, 0x0

    #v2=(Null);
    invoke-virtual {v11, v2}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    #v2=(Reference);
    check-cast v2, Lorg/json/JSONObject;

    const-string v8, "ty"

    invoke-virtual {v2, v8}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v12

    #v12=(Integer);
    const/16 v8, 0x16

    #v8=(PosByte);
    if-ne v12, v8, :cond_0

    new-instance v7, Ljava/util/ArrayList;

    #v7=(UninitRef);
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    #v7=(Reference);
    move-object v8, v7

    #v8=(Reference);
    move-object v7, v6

    #v7=(Null);
    move-object v6, v5

    move-object v5, v4

    move-object v4, v3

    :goto_0
    #v3=(Reference);v4=(Reference);v5=(Reference);v6=(Reference);v7=(Reference);
    const/4 v3, 0x0

    #v3=(Null);
    move v9, v3

    :goto_1
    #v3=(Integer);v9=(Integer);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);
    invoke-virtual {v11}, Lorg/json/JSONArray;->length()I

    move-result v3

    if-ge v9, v3, :cond_13

    invoke-virtual {v11, v9}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    #v3=(Reference);
    check-cast v3, Lorg/json/JSONObject;

    const-string v13, "ty"

    #v13=(Reference);
    invoke-virtual {v3, v13}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v13

    #v13=(Integer);
    const/16 v14, 0x19

    #v14=(PosByte);
    if-ne v13, v14, :cond_6

    :goto_2
    #v3=(Conflicted);v13=(Conflicted);v14=(Conflicted);
    add-int/lit8 v3, v9, 0x1

    #v3=(Integer);
    move v9, v3

    goto :goto_1

    :cond_0
    #v3=(Null);v4=(Null);v5=(Null);v6=(Null);v7=(Null);v8=(PosByte);v9=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);
    const/4 v8, 0x3

    if-eq v12, v8, :cond_1

    const/16 v8, 0xd

    if-eq v12, v8, :cond_1

    const/16 v8, 0xe

    if-eq v12, v8, :cond_1

    const/16 v8, 0x10

    if-eq v12, v8, :cond_1

    const/16 v8, 0xf

    if-eq v12, v8, :cond_1

    const/4 v8, 0x4

    if-eq v12, v8, :cond_1

    const/16 v8, 0x1c

    if-ne v12, v8, :cond_2

    :cond_1
    new-instance v5, Ljava/util/ArrayList;

    #v5=(UninitRef);
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    #v5=(Reference);
    move-object v8, v7

    #v8=(Null);
    move-object v7, v6

    move-object v6, v5

    #v6=(Reference);
    move-object v5, v4

    #v5=(Null);
    move-object v4, v3

    goto :goto_0

    :cond_2
    #v6=(Null);v8=(PosByte);
    const/16 v8, 0x8

    if-eq v12, v8, :cond_3

    const/4 v8, 0x1

    #v8=(One);
    if-eq v12, v8, :cond_3

    const/4 v8, 0x2

    #v8=(PosByte);
    if-ne v12, v8, :cond_4

    :cond_3
    new-instance v4, Ljava/util/ArrayList;

    #v4=(UninitRef);
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    #v4=(Reference);
    move-object v8, v7

    #v8=(Null);
    move-object v7, v6

    move-object v6, v5

    move-object v5, v4

    #v5=(Reference);
    move-object v4, v3

    #v4=(Null);
    goto :goto_0

    :cond_4
    #v5=(Null);v8=(PosByte);
    const/4 v8, 0x6

    if-ne v12, v8, :cond_5

    new-instance v3, Ljava/util/ArrayList;

    #v3=(UninitRef);
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    #v3=(Reference);
    move-object v8, v7

    #v8=(Null);
    move-object v7, v6

    move-object v6, v5

    move-object v5, v4

    move-object v4, v3

    #v4=(Reference);
    goto :goto_0

    :cond_5
    #v3=(Null);v4=(Null);v8=(PosByte);
    const/16 v8, 0x18

    if-ne v12, v8, :cond_14

    new-instance v6, Ljava/util/ArrayList;

    #v6=(UninitRef);
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    #v6=(Reference);
    move-object v8, v7

    #v8=(Null);
    move-object v7, v6

    #v7=(Reference);
    move-object v6, v5

    #v6=(Null);
    move-object v5, v4

    move-object v4, v3

    goto :goto_0

    :cond_6
    #v3=(Reference);v4=(Reference);v5=(Reference);v6=(Reference);v8=(Reference);v9=(Integer);v13=(Integer);v14=(PosByte);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);
    new-instance v14, Lcom/baidu/platform/comapi/map/r;

    #v14=(UninitRef);
    invoke-direct {v14}, Lcom/baidu/platform/comapi/map/r;-><init>()V

    #v14=(Reference);
    const-string v15, "ud"

    #v15=(Reference);
    invoke-virtual {v3, v15}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v15

    #v15=(Boolean);
    if-eqz v15, :cond_a

    const-string v15, "ud"

    #v15=(Reference);
    invoke-virtual {v3, v15}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    iput-object v15, v14, Lcom/baidu/platform/comapi/map/r;->a:Ljava/lang/String;

    :goto_3
    const-string v15, "tx"

    invoke-virtual {v3, v15}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    iput-object v15, v14, Lcom/baidu/platform/comapi/map/r;->c:Ljava/lang/String;

    const-string v15, "in"

    invoke-virtual {v3, v15}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v15

    #v15=(Boolean);
    if-eqz v15, :cond_b

    const-string v15, "in"

    #v15=(Reference);
    invoke-virtual {v3, v15}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v15

    #v15=(Integer);
    iput v15, v14, Lcom/baidu/platform/comapi/map/r;->b:I

    :goto_4
    const-string v15, "geo"

    #v15=(Reference);
    invoke-virtual {v3, v15}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v15

    #v15=(Boolean);
    if-eqz v15, :cond_7

    const-string v15, "geo"

    #v15=(Reference);
    invoke-virtual {v3, v15}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    new-instance v16, Landroid/os/Bundle;

    #v16=(UninitRef);
    invoke-direct/range {v16 .. v16}, Landroid/os/Bundle;-><init>()V

    #v16=(Reference);
    const-string v17, "strkey"

    #v17=(Reference);
    move-object/from16 v0, v16

    #v0=(Reference);
    move-object/from16 v1, v17

    #v1=(Reference);
    invoke-virtual {v0, v1, v15}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static/range {v16 .. v16}, Lcom/baidu/platform/comjni/tools/JNITools;->TransNodeStr2Pt(Ljava/lang/Object;)V

    new-instance v15, Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    #v15=(UninitRef);
    const-string v17, "pty"

    invoke-virtual/range {v16 .. v17}, Landroid/os/Bundle;->getDouble(Ljava/lang/String;)D

    move-result-wide v17

    #v17=(DoubleLo);v18=(DoubleHi);
    move-wide/from16 v0, v17

    #v0=(DoubleLo);v1=(DoubleHi);
    double-to-int v0, v0

    #v0=(Integer);
    move/from16 v17, v0

    #v17=(Integer);
    const-string v18, "ptx"

    #v18=(Reference);
    move-object/from16 v0, v16

    #v0=(Reference);
    move-object/from16 v1, v18

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getDouble(Ljava/lang/String;)D

    move-result-wide v18

    #v18=(DoubleLo);v19=(DoubleHi);
    move-wide/from16 v0, v18

    #v0=(DoubleLo);v1=(DoubleHi);
    double-to-int v0, v0

    #v0=(Integer);
    move/from16 v16, v0

    #v16=(Integer);
    move/from16 v0, v17

    move/from16 v1, v16

    #v1=(Integer);
    invoke-direct {v15, v0, v1}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;-><init>(II)V

    #v15=(Reference);
    iput-object v15, v14, Lcom/baidu/platform/comapi/map/r;->d:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    :cond_7
    #v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);
    iput v13, v14, Lcom/baidu/platform/comapi/map/r;->e:I

    const-string v13, "of"

    #v13=(Reference);
    invoke-virtual {v3, v13}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v13

    #v13=(Boolean);
    if-eqz v13, :cond_8

    const-string v13, "of"

    #v13=(Reference);
    invoke-virtual {v3, v13}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v13

    #v13=(Integer);
    iput v13, v14, Lcom/baidu/platform/comapi/map/r;->f:I

    :cond_8
    const/16 v13, 0x16

    #v13=(PosByte);
    if-ne v12, v13, :cond_c

    new-instance v13, Lcom/baidu/platform/comapi/map/f;

    #v13=(UninitRef);
    invoke-direct {v13}, Lcom/baidu/platform/comapi/map/f;-><init>()V

    #v13=(Reference);
    iput-object v14, v13, Lcom/baidu/platform/comapi/map/f;->a:Lcom/baidu/platform/comapi/map/r;

    const-string v14, "iest"

    invoke-virtual {v3, v14}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v14

    #v14=(LongLo);v15=(LongHi);
    iput-wide v14, v13, Lcom/baidu/platform/comapi/map/f;->b:J

    const-string v14, "ieend"

    #v14=(Reference);
    invoke-virtual {v3, v14}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v14

    #v14=(LongLo);
    iput-wide v14, v13, Lcom/baidu/platform/comapi/map/f;->c:J

    const-string v14, "iedetail"

    #v14=(Reference);
    invoke-virtual {v3, v14}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, v13, Lcom/baidu/platform/comapi/map/f;->d:Ljava/lang/String;

    invoke-interface {v8, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_2

    :catch_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);
    move-exception v2

    #v2=(Reference);
    invoke-virtual {v2}, Lorg/json/JSONException;->printStackTrace()V

    :cond_9
    const/4 v2, 0x0

    :goto_5
    #v2=(Boolean);
    return v2

    :cond_a
    :try_start_1
    #v0=(Integer);v1=(Integer);v2=(Reference);v3=(Reference);v4=(Reference);v5=(Reference);v6=(Reference);v7=(Reference);v8=(Reference);v9=(Integer);v10=(Reference);v11=(Reference);v12=(Integer);v13=(Integer);v14=(Reference);v15=(Boolean);
    const-string v15, ""

    #v15=(Reference);
    iput-object v15, v14, Lcom/baidu/platform/comapi/map/r;->a:Ljava/lang/String;

    goto/16 :goto_3

    :cond_b
    #v15=(Boolean);
    const/4 v15, 0x0

    #v15=(Null);
    iput v15, v14, Lcom/baidu/platform/comapi/map/r;->b:I

    goto/16 :goto_4

    :cond_c
    #v13=(PosByte);v15=(Conflicted);
    const/4 v3, 0x3

    #v3=(PosByte);
    if-eq v12, v3, :cond_d

    const/16 v3, 0xd

    if-eq v12, v3, :cond_d

    const/16 v3, 0xe

    if-eq v12, v3, :cond_d

    const/16 v3, 0x10

    if-eq v12, v3, :cond_d

    const/16 v3, 0xf

    if-eq v12, v3, :cond_d

    const/4 v3, 0x4

    if-eq v12, v3, :cond_d

    const/16 v3, 0x1c

    if-ne v12, v3, :cond_e

    :cond_d
    invoke-interface {v6, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_2

    :cond_e
    const/16 v3, 0x8

    if-eq v12, v3, :cond_f

    const/4 v3, 0x1

    #v3=(One);
    if-eq v12, v3, :cond_f

    const/4 v3, 0x2

    #v3=(PosByte);
    if-ne v12, v3, :cond_10

    :cond_f
    invoke-interface {v5, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_2

    :cond_10
    const/4 v3, 0x6

    if-ne v12, v3, :cond_11

    invoke-interface {v4, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_2

    :cond_11
    const/16 v3, 0x18

    if-ne v12, v3, :cond_12

    invoke-interface {v7, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_2

    :cond_12
    invoke-interface {v10, v14}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_2

    :cond_13
    #v3=(Integer);v13=(Conflicted);v14=(Conflicted);
    packed-switch v12, :pswitch_data_0

    :goto_6
    :pswitch_0
    #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    const/4 v2, 0x1

    #v2=(One);
    goto :goto_5

    :pswitch_1
    #v0=(Integer);v2=(Reference);v3=(Integer);
    const-string v3, "layerid"

    #v3=(Reference);
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v2

    #v2=(Integer);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v3, v0, Lcom/baidu/platform/comapi/map/o;->m:Lcom/baidu/platform/comapi/map/q;

    iget-object v3, v3, Lcom/baidu/platform/comapi/map/q;->e:Lcom/baidu/platform/comapi/map/u;

    invoke-interface {v3, v10, v2}, Lcom/baidu/platform/comapi/map/u;->c(Ljava/util/List;I)V

    :pswitch_2
    #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v2, v0, Lcom/baidu/platform/comapi/map/o;->m:Lcom/baidu/platform/comapi/map/q;

    #v2=(Reference);
    iget-object v2, v2, Lcom/baidu/platform/comapi/map/q;->e:Lcom/baidu/platform/comapi/map/u;

    const/4 v3, 0x0

    #v3=(Null);
    invoke-interface {v2, v10, v3}, Lcom/baidu/platform/comapi/map/u;->c(Ljava/util/List;I)V

    goto :goto_6

    :pswitch_3
    #v0=(Integer);v3=(Integer);
    const-string v3, "layerid"

    #v3=(Reference);
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v2

    #v2=(Integer);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v3, v0, Lcom/baidu/platform/comapi/map/o;->m:Lcom/baidu/platform/comapi/map/q;

    iget-object v3, v3, Lcom/baidu/platform/comapi/map/q;->e:Lcom/baidu/platform/comapi/map/u;

    invoke-interface {v3, v6, v2}, Lcom/baidu/platform/comapi/map/u;->b(Ljava/util/List;I)V

    goto :goto_6

    :pswitch_4
    #v0=(Integer);v2=(Reference);v3=(Integer);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v2, v0, Lcom/baidu/platform/comapi/map/o;->m:Lcom/baidu/platform/comapi/map/q;

    iget-object v2, v2, Lcom/baidu/platform/comapi/map/q;->e:Lcom/baidu/platform/comapi/map/u;

    invoke-interface {v2, v8}, Lcom/baidu/platform/comapi/map/u;->a(Ljava/util/List;)V

    goto :goto_6

    :pswitch_5
    #v0=(Integer);
    const-string v3, "layerid"

    #v3=(Reference);
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v2

    #v2=(Integer);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v3, v0, Lcom/baidu/platform/comapi/map/o;->m:Lcom/baidu/platform/comapi/map/q;

    iget-object v3, v3, Lcom/baidu/platform/comapi/map/q;->e:Lcom/baidu/platform/comapi/map/u;

    invoke-interface {v3, v10, v2}, Lcom/baidu/platform/comapi/map/u;->c(Ljava/util/List;I)V

    goto :goto_6

    :pswitch_6
    #v0=(Integer);v2=(Reference);v3=(Integer);
    const-string v3, "layerid"

    #v3=(Reference);
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v2

    #v2=(Integer);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v3, v0, Lcom/baidu/platform/comapi/map/o;->m:Lcom/baidu/platform/comapi/map/q;

    iget-object v3, v3, Lcom/baidu/platform/comapi/map/q;->e:Lcom/baidu/platform/comapi/map/u;

    invoke-interface {v3, v5, v2}, Lcom/baidu/platform/comapi/map/u;->a(Ljava/util/List;I)V

    goto :goto_6

    :pswitch_7
    #v0=(Integer);v2=(Reference);v3=(Integer);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v2, v0, Lcom/baidu/platform/comapi/map/o;->m:Lcom/baidu/platform/comapi/map/q;

    iget-object v2, v2, Lcom/baidu/platform/comapi/map/q;->e:Lcom/baidu/platform/comapi/map/u;

    const/4 v3, 0x0

    #v3=(Null);
    invoke-interface {v2, v4, v3}, Lcom/baidu/platform/comapi/map/u;->c(Ljava/util/List;I)V

    goto :goto_6

    :pswitch_8
    #v0=(Integer);v3=(Integer);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v2, v0, Lcom/baidu/platform/comapi/map/o;->m:Lcom/baidu/platform/comapi/map/q;

    iget-object v2, v2, Lcom/baidu/platform/comapi/map/q;->e:Lcom/baidu/platform/comapi/map/u;

    invoke-interface {v2, v7}, Lcom/baidu/platform/comapi/map/u;->b(Ljava/util/List;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_6

    :cond_14
    #v0=(Integer);v3=(Null);v4=(Null);v5=(Null);v6=(Null);v7=(Null);v8=(PosByte);v9=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);
    move-object v8, v7

    #v8=(Null);
    move-object v7, v6

    move-object v6, v5

    move-object v5, v4

    move-object v4, v3

    goto/16 :goto_0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_6
        :pswitch_3
        :pswitch_3
        :pswitch_0
        :pswitch_7
        :pswitch_0
        :pswitch_6
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_4
        :pswitch_5
        :pswitch_8
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_3
    .end packed-switch
.end method

.method public b(III)Z
    .locals 8

    const/4 v3, 0x1

    #v3=(One);
    const/4 v4, 0x0

    #v4=(Null);
    const-string v0, ""

    #v0=(Reference);
    const/4 v2, -0x1

    :try_start_0
    #v2=(Byte);
    iget-object v0, p0, Lcom/baidu/platform/comapi/map/o;->m:Lcom/baidu/platform/comapi/map/q;

    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/q;->c()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    #v0=(Integer);
    add-int/lit8 v0, v0, -0x1

    move v5, v0

    #v5=(Integer);
    move v1, v4

    :goto_0
    #v1=(Integer);v6=(Conflicted);v7=(Conflicted);
    if-ltz v5, :cond_3

    :try_start_1
    iget-object v0, p0, Lcom/baidu/platform/comapi/map/o;->m:Lcom/baidu/platform/comapi/map/q;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/q;->c()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/baidu/platform/comapi/map/v;

    iget v6, v0, Lcom/baidu/platform/comapi/map/v;->mType:I

    #v6=(Integer);
    const/16 v7, 0x1b

    #v7=(PosByte);
    if-eq v6, v7, :cond_0

    move v0, v1

    :goto_1
    #v0=(Integer);
    add-int/lit8 v1, v5, -0x1

    move v5, v1

    move v1, v0

    goto :goto_0

    :cond_0
    #v0=(Reference);
    iget v1, v0, Lcom/baidu/platform/comapi/map/v;->mLayerID:I

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/o;->k:Lcom/baidu/platform/comjni/map/basemap/a;

    invoke-virtual {v0, v1, p2, p3, p3}, Lcom/baidu/platform/comjni/map/basemap/a;->a(IIII)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    const-string v6, ""

    #v6=(Reference);
    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    #v6=(Boolean);
    if-nez v6, :cond_2

    new-instance v5, Lorg/json/JSONObject;

    #v5=(UninitRef);
    invoke-direct {v5, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    #v5=(Reference);
    const-string v0, "dataset"

    invoke-virtual {v5, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    const/4 v5, 0x0

    #v5=(Null);
    invoke-virtual {v0, v5}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/json/JSONObject;

    const-string v5, "itemindex"

    #v5=(Reference);
    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    move-result v0

    #v0=(Integer);
    move v2, v3

    :goto_2
    #v2=(Boolean);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    if-ne p1, v3, :cond_1

    iget-object v3, p0, Lcom/baidu/platform/comapi/map/o;->m:Lcom/baidu/platform/comapi/map/q;

    #v3=(Reference);
    iget-object v3, v3, Lcom/baidu/platform/comapi/map/q;->e:Lcom/baidu/platform/comapi/map/u;

    new-instance v4, Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    #v4=(UninitRef);
    invoke-direct {v4, p2, p3}, Lcom/baidu/platform/comapi/basestruct/GeoPoint;-><init>(II)V

    #v4=(Reference);
    invoke-interface {v3, v0, v4, v1}, Lcom/baidu/platform/comapi/map/u;->a(ILcom/baidu/platform/comapi/basestruct/GeoPoint;I)V

    :cond_1
    #v3=(Conflicted);
    return v2

    :catch_0
    #v0=(Reference);v1=(Uninit);v2=(Byte);v3=(One);v4=(Null);v5=(Uninit);v6=(Uninit);v7=(Uninit);
    move-exception v0

    move v1, v4

    :goto_3
    #v1=(Integer);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    move v0, v2

    #v0=(Byte);
    move v2, v4

    #v2=(Null);
    goto :goto_2

    :catch_1
    #v0=(Conflicted);v2=(Byte);
    move-exception v0

    #v0=(Reference);
    goto :goto_3

    :cond_2
    #v5=(Integer);v6=(Integer);v7=(PosByte);
    move v0, v1

    #v0=(Integer);
    goto :goto_1

    :cond_3
    #v6=(Conflicted);v7=(Conflicted);
    move v0, v2

    #v0=(Byte);
    move v2, v4

    #v2=(Null);
    goto :goto_2
.end method

.method public b(Landroid/view/MotionEvent;)Z
    .locals 9

    const/4 v3, 0x1

    #v3=(One);
    const/high16 v8, 0x4040

    #v8=(Integer);
    const-wide/high16 v6, 0x3ff8

    #v6=(LongLo);v7=(LongHi);
    const/4 v2, 0x0

    #v2=(Null);
    sget-object v0, Lcom/baidu/platform/comapi/map/o;->Q:Lcom/baidu/platform/comapi/map/o$a;

    #v0=(Reference);
    iget-boolean v0, v0, Lcom/baidu/platform/comapi/map/o$a;->j:Z

    #v0=(Boolean);
    if-eqz v0, :cond_1

    move v2, v3

    :cond_0
    :goto_0
    #v0=(Integer);v1=(Conflicted);v2=(Boolean);v3=(PosByte);v4=(Conflicted);v5=(Conflicted);
    return v2

    :cond_1
    #v0=(Boolean);v1=(Uninit);v2=(Null);v3=(One);v4=(Uninit);v5=(Uninit);
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    #v0=(Float);
    sget v1, Lcom/baidu/platform/comapi/map/o;->ac:F

    #v1=(Integer);
    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v4

    #v4=(Float);
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    sget v1, Lcom/baidu/platform/comapi/map/o;->ad:F

    sub-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v5

    #v5=(Float);
    sget v0, Lcom/baidu/platform/comapi/d/c;->C:F

    #v0=(Integer);
    float-to-double v0, v0

    #v0=(DoubleLo);v1=(DoubleHi);
    cmpl-double v0, v0, v6

    #v0=(Byte);
    if-lez v0, :cond_2

    sget v0, Lcom/baidu/platform/comapi/d/c;->C:F

    #v0=(Integer);
    float-to-double v0, v0

    #v0=(DoubleLo);
    mul-double/2addr v0, v6

    :goto_1
    double-to-float v0, v0

    #v0=(Float);
    sget-boolean v1, Lcom/baidu/platform/comapi/map/o;->ae:Z

    #v1=(Boolean);
    if-eqz v1, :cond_3

    div-float v1, v4, v0

    #v1=(Float);
    cmpg-float v1, v1, v8

    #v1=(Byte);
    if-gtz v1, :cond_3

    div-float v0, v5, v0

    cmpg-float v0, v0, v8

    #v0=(Byte);
    if-gtz v0, :cond_3

    move v2, v3

    #v2=(One);
    goto :goto_0

    :cond_2
    #v1=(DoubleHi);v2=(Null);
    sget v0, Lcom/baidu/platform/comapi/d/c;->C:F

    #v0=(Integer);
    float-to-double v0, v0

    #v0=(DoubleLo);
    goto :goto_1

    :cond_3
    #v0=(Float);v1=(Byte);
    sput-boolean v2, Lcom/baidu/platform/comapi/map/o;->ae:Z

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    float-to-int v1, v0

    #v1=(Integer);
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    float-to-int v0, v0

    #v0=(Integer);
    if-gez v1, :cond_4

    move v1, v2

    :cond_4
    if-gez v0, :cond_5

    move v0, v2

    :cond_5
    iget-boolean v3, p0, Lcom/baidu/platform/comapi/map/o;->t:Z

    #v3=(Boolean);
    if-eqz v3, :cond_0

    const/4 v3, 0x3

    #v3=(PosByte);
    shl-int/lit8 v0, v0, 0x10

    or-int/2addr v0, v1

    invoke-virtual {p0, v3, v2, v0}, Lcom/baidu/platform/comapi/map/o;->a(III)I

    goto :goto_0
.end method

.method public c()D
    .locals 2

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/o;->m:Lcom/baidu/platform/comapi/map/q;

    #v0=(Reference);
    invoke-virtual {v0}, Lcom/baidu/platform/comapi/map/q;->g()D

    move-result-wide v0

    #v0=(DoubleLo);v1=(DoubleHi);
    return-wide v0
.end method

.method public c(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/baidu/platform/comapi/map/o;->v:Z

    return-void
.end method

.method public c(II)Z
    .locals 2

    const/4 v0, 0x0

    #v0=(Null);
    iget-boolean v1, p0, Lcom/baidu/platform/comapi/map/o;->ar:Z

    #v1=(Boolean);
    if-nez v1, :cond_0

    iget-boolean v1, p0, Lcom/baidu/platform/comapi/map/o;->as:Z

    if-eqz v1, :cond_1

    :cond_0
    :goto_0
    #v0=(Boolean);v1=(Conflicted);
    return v0

    :cond_1
    #v0=(Null);v1=(Boolean);
    const/4 v1, 0x1

    #v1=(One);
    iput-boolean v1, p0, Lcom/baidu/platform/comapi/map/o;->ar:Z

    iput p1, p0, Lcom/baidu/platform/comapi/map/o;->ap:I

    iput p2, p0, Lcom/baidu/platform/comapi/map/o;->aq:I

    iget-object v1, p0, Lcom/baidu/platform/comapi/map/o;->m:Lcom/baidu/platform/comapi/map/q;

    #v1=(Reference);
    invoke-virtual {v1}, Lcom/baidu/platform/comapi/map/q;->d()Lcom/baidu/platform/comapi/map/Projection;

    move-result-object v1

    invoke-interface {v1, p1, p2}, Lcom/baidu/platform/comapi/map/Projection;->fromPixels(II)Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v1

    iput-object v1, p0, Lcom/baidu/platform/comapi/map/o;->an:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    iget-object v1, p0, Lcom/baidu/platform/comapi/map/o;->an:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    if-nez v1, :cond_2

    iput-boolean v0, p0, Lcom/baidu/platform/comapi/map/o;->ar:Z

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lcom/baidu/platform/comapi/map/o;->i()Z

    move-result v1

    #v1=(Boolean);
    iput-boolean v1, p0, Lcom/baidu/platform/comapi/map/o;->ao:Z

    iget-boolean v1, p0, Lcom/baidu/platform/comapi/map/o;->ao:Z

    if-nez v1, :cond_3

    iput-boolean v0, p0, Lcom/baidu/platform/comapi/map/o;->ar:Z

    :cond_3
    iget-boolean v0, p0, Lcom/baidu/platform/comapi/map/o;->ao:Z

    #v0=(Boolean);
    goto :goto_0
.end method

.method public c(Landroid/view/MotionEvent;)Z
    .locals 8

    const/4 v1, 0x1

    #v1=(One);
    const/high16 v7, 0x4120

    #v7=(Integer);
    const/4 v2, 0x0

    #v2=(Null);
    sget-object v0, Lcom/baidu/platform/comapi/map/o;->Q:Lcom/baidu/platform/comapi/map/o$a;

    #v0=(Reference);
    iget-boolean v0, v0, Lcom/baidu/platform/comapi/map/o$a;->j:Z

    #v0=(Boolean);
    if-nez v0, :cond_3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v3

    #v3=(LongLo);v4=(LongHi);
    sget-wide v5, Lcom/baidu/platform/comapi/map/o;->ag:J

    #v5=(LongLo);v6=(LongHi);
    sub-long/2addr v3, v5

    sget-wide v5, Lcom/baidu/platform/comapi/map/o;->ai:J

    cmp-long v0, v3, v5

    #v0=(Byte);
    if-gez v0, :cond_3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    #v0=(Float);
    sget v3, Lcom/baidu/platform/comapi/map/o;->ac:F

    #v3=(Integer);
    sub-float/2addr v0, v3

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    cmpg-float v0, v0, v7

    #v0=(Byte);
    if-gez v0, :cond_3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    #v0=(Float);
    sget v3, Lcom/baidu/platform/comapi/map/o;->ad:F

    sub-float/2addr v0, v3

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    cmpg-float v0, v0, v7

    #v0=(Byte);
    if-gez v0, :cond_3

    move v0, v1

    :goto_0
    #v0=(Boolean);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    invoke-static {}, Lcom/baidu/platform/comapi/map/o;->h()V

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    #v3=(Float);
    float-to-int v4, v3

    #v4=(Integer);
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    float-to-int v3, v3

    #v3=(Integer);
    if-nez v0, :cond_2

    if-gez v4, :cond_0

    move v4, v2

    :cond_0
    if-gez v3, :cond_1

    move v0, v2

    :goto_1
    #v0=(Integer);
    const/4 v3, 0x5

    #v3=(PosByte);
    shl-int/lit8 v0, v0, 0x10

    or-int/2addr v0, v4

    invoke-virtual {p0, v3, v2, v0}, Lcom/baidu/platform/comapi/map/o;->a(III)I

    :goto_2
    #v1=(Boolean);v3=(Integer);
    return v1

    :cond_1
    #v0=(Boolean);v1=(One);
    move v0, v3

    #v0=(Integer);
    goto :goto_1

    :cond_2
    #v0=(Boolean);
    move v1, v2

    #v1=(Null);
    goto :goto_2

    :cond_3
    #v0=(Byte);v1=(One);v3=(Conflicted);v4=(Conflicted);
    move v0, v2

    #v0=(Null);
    goto :goto_0
.end method

.method public d(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/baidu/platform/comapi/map/o;->r:Z

    return-void
.end method

.method public d()Z
    .locals 1

    iget-boolean v0, p0, Lcom/baidu/platform/comapi/map/o;->t:Z

    #v0=(Boolean);
    return v0
.end method

.method public d(II)Z
    .locals 2

    const/4 v0, 0x0

    #v0=(Null);
    iget-boolean v1, p0, Lcom/baidu/platform/comapi/map/o;->ar:Z

    #v1=(Boolean);
    if-nez v1, :cond_0

    iget-boolean v1, p0, Lcom/baidu/platform/comapi/map/o;->as:Z

    if-eqz v1, :cond_1

    :cond_0
    :goto_0
    #v0=(Boolean);v1=(Conflicted);
    return v0

    :cond_1
    #v0=(Null);v1=(Boolean);
    const/4 v1, 0x1

    #v1=(One);
    iput-boolean v1, p0, Lcom/baidu/platform/comapi/map/o;->as:Z

    iput p1, p0, Lcom/baidu/platform/comapi/map/o;->ap:I

    iput p2, p0, Lcom/baidu/platform/comapi/map/o;->aq:I

    iget-object v1, p0, Lcom/baidu/platform/comapi/map/o;->m:Lcom/baidu/platform/comapi/map/q;

    #v1=(Reference);
    invoke-virtual {v1}, Lcom/baidu/platform/comapi/map/q;->d()Lcom/baidu/platform/comapi/map/Projection;

    move-result-object v1

    invoke-interface {v1, p1, p2}, Lcom/baidu/platform/comapi/map/Projection;->fromPixels(II)Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    move-result-object v1

    iput-object v1, p0, Lcom/baidu/platform/comapi/map/o;->an:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    iget-object v1, p0, Lcom/baidu/platform/comapi/map/o;->an:Lcom/baidu/platform/comapi/basestruct/GeoPoint;

    if-nez v1, :cond_2

    iput-boolean v0, p0, Lcom/baidu/platform/comapi/map/o;->as:Z

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lcom/baidu/platform/comapi/map/o;->j()Z

    move-result v1

    #v1=(Boolean);
    iput-boolean v1, p0, Lcom/baidu/platform/comapi/map/o;->ao:Z

    iget-boolean v1, p0, Lcom/baidu/platform/comapi/map/o;->ao:Z

    if-nez v1, :cond_3

    iput-boolean v0, p0, Lcom/baidu/platform/comapi/map/o;->as:Z

    :cond_3
    iget-boolean v0, p0, Lcom/baidu/platform/comapi/map/o;->ao:Z

    #v0=(Boolean);
    goto :goto_0
.end method

.method public d(Landroid/view/MotionEvent;)Z
    .locals 4

    const/4 v0, 0x1

    #v0=(One);
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    #v1=(Float);
    float-to-int v1, v1

    #v1=(Integer);
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    #v2=(Float);
    float-to-int v2, v2

    #v2=(Integer);
    invoke-virtual {p0, v1, v2}, Lcom/baidu/platform/comapi/map/o;->g(II)Z

    move-result v3

    #v3=(Boolean);
    if-eqz v3, :cond_1

    :cond_0
    :goto_0
    #v0=(Boolean);
    return v0

    :cond_1
    #v0=(One);
    invoke-virtual {p0, v0, v1, v2}, Lcom/baidu/platform/comapi/map/o;->b(III)Z

    move-result v3

    if-nez v3, :cond_0

    iget-boolean v3, p0, Lcom/baidu/platform/comapi/map/o;->ah:Z

    if-eqz v3, :cond_2

    invoke-virtual {p0, v1, v2}, Lcom/baidu/platform/comapi/map/o;->b(II)Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_0

    :cond_2
    #v1=(Integer);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public e(II)V
    .locals 0

    iput p1, p0, Lcom/baidu/platform/comapi/map/o;->H:I

    iput p2, p0, Lcom/baidu/platform/comapi/map/o;->I:I

    return-void
.end method

.method public e(Landroid/view/MotionEvent;)V
    .locals 4

    iget-boolean v0, p0, Lcom/baidu/platform/comapi/map/o;->al:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    const/16 v0, 0x2003

    #v0=(PosShort);
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    #v1=(Float);
    float-to-int v1, v1

    #v1=(Integer);
    shl-int/lit8 v1, v1, 0x10

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    #v2=(Float);
    float-to-int v2, v2

    #v2=(Integer);
    or-int/2addr v1, v2

    iget v2, p0, Lcom/baidu/platform/comapi/map/o;->I:I

    div-int/lit8 v2, v2, 0x2

    shl-int/lit8 v2, v2, 0x10

    iget v3, p0, Lcom/baidu/platform/comapi/map/o;->H:I

    #v3=(Integer);
    div-int/lit8 v3, v3, 0x2

    or-int/2addr v2, v3

    invoke-virtual {p0, v0, v1, v2}, Lcom/baidu/platform/comapi/map/o;->a(III)I

    :cond_0
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    return-void
.end method

.method public e(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/baidu/platform/comapi/map/o;->w:Z

    return-void
.end method

.method public e()Z
    .locals 1

    iget-boolean v0, p0, Lcom/baidu/platform/comapi/map/o;->w:Z

    #v0=(Boolean);
    return v0
.end method

.method public f(II)V
    .locals 1

    if-nez p1, :cond_0

    if-nez p2, :cond_0

    :goto_0
    #v0=(Conflicted);
    return-void

    :cond_0
    #v0=(Uninit);
    iget-object v0, p0, Lcom/baidu/platform/comapi/map/o;->m:Lcom/baidu/platform/comapi/map/q;

    #v0=(Reference);
    invoke-virtual {v0, p1, p2}, Lcom/baidu/platform/comapi/map/q;->a(II)V

    goto :goto_0
.end method

.method public f(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/baidu/platform/comapi/map/o;->x:Z

    return-void
.end method

.method public f()Z
    .locals 1

    iget-boolean v0, p0, Lcom/baidu/platform/comapi/map/o;->x:Z

    #v0=(Boolean);
    return v0
.end method

.method public g(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/baidu/platform/comapi/map/o;->al:Z

    return-void
.end method

.method public g()Z
    .locals 1

    iget-boolean v0, p0, Lcom/baidu/platform/comapi/map/o;->al:Z

    #v0=(Boolean);
    return v0
.end method

.method public g(II)Z
    .locals 6

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/o;->e:Ljava/util/Map;

    #v0=(Reference);
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    #v1=(Reference);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Ljava/lang/String;

    iget-object v2, p0, Lcom/baidu/platform/comapi/map/o;->e:Ljava/util/Map;

    #v2=(Reference);
    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    #v0=(Integer);
    iget v2, p0, Lcom/baidu/platform/comapi/map/o;->J:I

    #v2=(Integer);
    int-to-double v2, v2

    #v2=(DoubleLo);v3=(DoubleHi);
    invoke-virtual {p0}, Lcom/baidu/platform/comapi/map/o;->c()D

    move-result-wide v4

    #v4=(DoubleLo);v5=(DoubleHi);
    mul-double/2addr v2, v4

    double-to-int v2, v2

    #v2=(Integer);
    iget-object v3, p0, Lcom/baidu/platform/comapi/map/o;->k:Lcom/baidu/platform/comjni/map/basemap/a;

    #v3=(Reference);
    invoke-virtual {v3, v0, p1, p2, v2}, Lcom/baidu/platform/comjni/map/basemap/a;->a(IIII)Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    #v0=(Boolean);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    return v0

    :cond_1
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public h(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/baidu/platform/comapi/map/o;->ah:Z

    return-void
.end method

.method public i()Z
    .locals 4

    const/4 v1, 0x1

    #v1=(One);
    const/4 v0, 0x0

    #v0=(Null);
    iget-object v2, p0, Lcom/baidu/platform/comapi/map/o;->m:Lcom/baidu/platform/comapi/map/q;

    #v2=(Reference);
    invoke-virtual {v2}, Lcom/baidu/platform/comapi/map/q;->i()F

    move-result v2

    #v2=(Float);
    const/high16 v3, 0x4198

    #v3=(Integer);
    cmpl-float v2, v2, v3

    #v2=(Byte);
    if-ltz v2, :cond_1

    :cond_0
    :goto_0
    #v0=(Boolean);v2=(Integer);
    return v0

    :cond_1
    #v0=(Null);v2=(Byte);
    const/16 v2, 0x1000

    #v2=(PosShort);
    invoke-virtual {p0, v2, v0, v0}, Lcom/baidu/platform/comapi/map/o;->a(III)I

    move-result v2

    #v2=(Integer);
    if-ne v2, v1, :cond_0

    move v0, v1

    #v0=(One);
    goto :goto_0
.end method

.method public j()Z
    .locals 4

    const/4 v1, 0x1

    #v1=(One);
    const/4 v0, 0x0

    #v0=(Null);
    iget-object v2, p0, Lcom/baidu/platform/comapi/map/o;->m:Lcom/baidu/platform/comapi/map/q;

    #v2=(Reference);
    invoke-virtual {v2}, Lcom/baidu/platform/comapi/map/q;->i()F

    move-result v2

    #v2=(Float);
    const/high16 v3, 0x4040

    #v3=(Integer);
    cmpg-float v2, v2, v3

    #v2=(Byte);
    if-gtz v2, :cond_1

    :cond_0
    :goto_0
    #v0=(Boolean);v2=(Integer);
    return v0

    :cond_1
    #v0=(Null);v2=(Byte);
    const/16 v2, 0x1001

    #v2=(PosShort);
    invoke-virtual {p0, v2, v0, v0}, Lcom/baidu/platform/comapi/map/o;->a(III)I

    move-result v2

    #v2=(Integer);
    if-ne v2, v1, :cond_0

    move v0, v1

    #v0=(One);
    goto :goto_0
.end method

.method public k()I
    .locals 1

    iget v0, p0, Lcom/baidu/platform/comapi/map/o;->H:I

    #v0=(Integer);
    return v0
.end method

.method public l()I
    .locals 1

    iget v0, p0, Lcom/baidu/platform/comapi/map/o;->I:I

    #v0=(Integer);
    return v0
.end method

.method public m()Lcom/baidu/platform/comapi/map/t;
    .locals 10

    const/4 v0, 0x1

    #v0=(One);
    const-wide/32 v8, 0x131bf84

    #v8=(LongLo);v9=(LongHi);
    const-wide/32 v6, -0x131bf84

    #v6=(LongLo);v7=(LongHi);
    iget-object v1, p0, Lcom/baidu/platform/comapi/map/o;->k:Lcom/baidu/platform/comjni/map/basemap/a;

    #v1=(Reference);
    if-nez v1, :cond_0

    const/4 v0, 0x0

    :goto_0
    #v0=(Reference);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    return-object v0

    :cond_0
    #v0=(One);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
    iget-object v1, p0, Lcom/baidu/platform/comapi/map/o;->k:Lcom/baidu/platform/comjni/map/basemap/a;

    invoke-virtual {v1}, Lcom/baidu/platform/comjni/map/basemap/a;->g()Landroid/os/Bundle;

    move-result-object v2

    #v2=(Reference);
    new-instance v1, Lcom/baidu/platform/comapi/map/t;

    #v1=(UninitRef);
    invoke-direct {v1}, Lcom/baidu/platform/comapi/map/t;-><init>()V

    #v1=(Reference);
    const-string v3, "level"

    #v3=(Reference);
    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getDouble(Ljava/lang/String;)D

    move-result-wide v3

    #v3=(DoubleLo);v4=(DoubleHi);
    double-to-float v3, v3

    #v3=(Float);
    iput v3, v1, Lcom/baidu/platform/comapi/map/t;->a:F

    const-string v3, "rotation"

    #v3=(Reference);
    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getDouble(Ljava/lang/String;)D

    move-result-wide v3

    #v3=(DoubleLo);
    double-to-int v3, v3

    #v3=(Integer);
    iput v3, v1, Lcom/baidu/platform/comapi/map/t;->b:I

    const-string v3, "overlooking"

    #v3=(Reference);
    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getDouble(Ljava/lang/String;)D

    move-result-wide v3

    #v3=(DoubleLo);
    double-to-int v3, v3

    #v3=(Integer);
    iput v3, v1, Lcom/baidu/platform/comapi/map/t;->c:I

    const-string v3, "centerptx"

    #v3=(Reference);
    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getDouble(Ljava/lang/String;)D

    move-result-wide v3

    #v3=(DoubleLo);
    double-to-int v3, v3

    #v3=(Integer);
    iput v3, v1, Lcom/baidu/platform/comapi/map/t;->d:I

    const-string v3, "centerpty"

    #v3=(Reference);
    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getDouble(Ljava/lang/String;)D

    move-result-wide v3

    #v3=(DoubleLo);
    double-to-int v3, v3

    #v3=(Integer);
    iput v3, v1, Lcom/baidu/platform/comapi/map/t;->e:I

    iget-object v3, v1, Lcom/baidu/platform/comapi/map/t;->f:Lcom/baidu/platform/comapi/map/t$b;

    #v3=(Reference);
    const-string v4, "left"

    #v4=(Reference);
    invoke-virtual {v2, v4}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v4

    #v4=(Integer);
    iput v4, v3, Lcom/baidu/platform/comapi/map/t$b;->a:I

    iget-object v3, v1, Lcom/baidu/platform/comapi/map/t;->f:Lcom/baidu/platform/comapi/map/t$b;

    const-string v4, "right"

    #v4=(Reference);
    invoke-virtual {v2, v4}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v4

    #v4=(Integer);
    iput v4, v3, Lcom/baidu/platform/comapi/map/t$b;->b:I

    iget-object v3, v1, Lcom/baidu/platform/comapi/map/t;->f:Lcom/baidu/platform/comapi/map/t$b;

    const-string v4, "top"

    #v4=(Reference);
    invoke-virtual {v2, v4}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v4

    #v4=(Integer);
    iput v4, v3, Lcom/baidu/platform/comapi/map/t$b;->c:I

    iget-object v3, v1, Lcom/baidu/platform/comapi/map/t;->f:Lcom/baidu/platform/comapi/map/t$b;

    const-string v4, "bottom"

    #v4=(Reference);
    invoke-virtual {v2, v4}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v4

    #v4=(Integer);
    iput v4, v3, Lcom/baidu/platform/comapi/map/t$b;->d:I

    iget-object v3, v1, Lcom/baidu/platform/comapi/map/t;->g:Lcom/baidu/platform/comapi/map/t$a;

    const-string v4, "gleft"

    #v4=(Reference);
    invoke-virtual {v2, v4}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v4

    #v4=(LongLo);v5=(LongHi);
    iput-wide v4, v3, Lcom/baidu/platform/comapi/map/t$a;->a:J

    iget-object v3, v1, Lcom/baidu/platform/comapi/map/t;->g:Lcom/baidu/platform/comapi/map/t$a;

    const-string v4, "gright"

    #v4=(Reference);
    invoke-virtual {v2, v4}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v4

    #v4=(LongLo);
    iput-wide v4, v3, Lcom/baidu/platform/comapi/map/t$a;->b:J

    iget-object v3, v1, Lcom/baidu/platform/comapi/map/t;->g:Lcom/baidu/platform/comapi/map/t$a;

    const-string v4, "gtop"

    #v4=(Reference);
    invoke-virtual {v2, v4}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v4

    #v4=(LongLo);
    iput-wide v4, v3, Lcom/baidu/platform/comapi/map/t$a;->c:J

    iget-object v3, v1, Lcom/baidu/platform/comapi/map/t;->g:Lcom/baidu/platform/comapi/map/t$a;

    const-string v4, "gbottom"

    #v4=(Reference);
    invoke-virtual {v2, v4}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v4

    #v4=(LongLo);
    iput-wide v4, v3, Lcom/baidu/platform/comapi/map/t$a;->d:J

    iget-object v3, v1, Lcom/baidu/platform/comapi/map/t;->g:Lcom/baidu/platform/comapi/map/t$a;

    iget-object v3, v3, Lcom/baidu/platform/comapi/map/t$a;->e:Lcom/baidu/platform/comapi/basestruct/c;

    const-string v4, "lbx"

    #v4=(Reference);
    invoke-virtual {v2, v4}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v4

    #v4=(Integer);
    iput v4, v3, Lcom/baidu/platform/comapi/basestruct/c;->a:I

    iget-object v3, v1, Lcom/baidu/platform/comapi/map/t;->g:Lcom/baidu/platform/comapi/map/t$a;

    iget-object v3, v3, Lcom/baidu/platform/comapi/map/t$a;->e:Lcom/baidu/platform/comapi/basestruct/c;

    const-string v4, "lby"

    #v4=(Reference);
    invoke-virtual {v2, v4}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v4

    #v4=(Integer);
    iput v4, v3, Lcom/baidu/platform/comapi/basestruct/c;->b:I

    iget-object v3, v1, Lcom/baidu/platform/comapi/map/t;->g:Lcom/baidu/platform/comapi/map/t$a;

    iget-object v3, v3, Lcom/baidu/platform/comapi/map/t$a;->f:Lcom/baidu/platform/comapi/basestruct/c;

    const-string v4, "ltx"

    #v4=(Reference);
    invoke-virtual {v2, v4}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v4

    #v4=(Integer);
    iput v4, v3, Lcom/baidu/platform/comapi/basestruct/c;->a:I

    iget-object v3, v1, Lcom/baidu/platform/comapi/map/t;->g:Lcom/baidu/platform/comapi/map/t$a;

    iget-object v3, v3, Lcom/baidu/platform/comapi/map/t$a;->f:Lcom/baidu/platform/comapi/basestruct/c;

    const-string v4, "lty"

    #v4=(Reference);
    invoke-virtual {v2, v4}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v4

    #v4=(Integer);
    iput v4, v3, Lcom/baidu/platform/comapi/basestruct/c;->b:I

    iget-object v3, v1, Lcom/baidu/platform/comapi/map/t;->g:Lcom/baidu/platform/comapi/map/t$a;

    iget-object v3, v3, Lcom/baidu/platform/comapi/map/t$a;->g:Lcom/baidu/platform/comapi/basestruct/c;

    const-string v4, "rtx"

    #v4=(Reference);
    invoke-virtual {v2, v4}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v4

    #v4=(Integer);
    iput v4, v3, Lcom/baidu/platform/comapi/basestruct/c;->a:I

    iget-object v3, v1, Lcom/baidu/platform/comapi/map/t;->g:Lcom/baidu/platform/comapi/map/t$a;

    iget-object v3, v3, Lcom/baidu/platform/comapi/map/t$a;->g:Lcom/baidu/platform/comapi/basestruct/c;

    const-string v4, "rty"

    #v4=(Reference);
    invoke-virtual {v2, v4}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v4

    #v4=(Integer);
    iput v4, v3, Lcom/baidu/platform/comapi/basestruct/c;->b:I

    iget-object v3, v1, Lcom/baidu/platform/comapi/map/t;->g:Lcom/baidu/platform/comapi/map/t$a;

    iget-object v3, v3, Lcom/baidu/platform/comapi/map/t$a;->h:Lcom/baidu/platform/comapi/basestruct/c;

    const-string v4, "rbx"

    #v4=(Reference);
    invoke-virtual {v2, v4}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v4

    #v4=(Integer);
    iput v4, v3, Lcom/baidu/platform/comapi/basestruct/c;->a:I

    iget-object v3, v1, Lcom/baidu/platform/comapi/map/t;->g:Lcom/baidu/platform/comapi/map/t$a;

    iget-object v3, v3, Lcom/baidu/platform/comapi/map/t$a;->h:Lcom/baidu/platform/comapi/basestruct/c;

    const-string v4, "rby"

    #v4=(Reference);
    invoke-virtual {v2, v4}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v4

    #v4=(Integer);
    iput v4, v3, Lcom/baidu/platform/comapi/basestruct/c;->b:I

    const-string v3, "xoffset"

    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v3

    #v3=(LongLo);v4=(LongHi);
    iput-wide v3, v1, Lcom/baidu/platform/comapi/map/t;->h:J

    const-string v3, "yoffset"

    #v3=(Reference);
    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getLong(Ljava/lang/String;)J

    move-result-wide v3

    #v3=(LongLo);
    iput-wide v3, v1, Lcom/baidu/platform/comapi/map/t;->i:J

    const-string v3, "bfpp"

    #v3=(Reference);
    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v2

    #v2=(Integer);
    if-ne v2, v0, :cond_5

    :goto_1
    #v0=(Boolean);
    iput-boolean v0, v1, Lcom/baidu/platform/comapi/map/t;->j:Z

    iget-object v0, v1, Lcom/baidu/platform/comapi/map/t;->g:Lcom/baidu/platform/comapi/map/t$a;

    #v0=(Reference);
    iget-wide v2, v0, Lcom/baidu/platform/comapi/map/t$a;->a:J

    #v2=(LongLo);v3=(LongHi);
    cmp-long v0, v2, v6

    #v0=(Byte);
    if-gtz v0, :cond_1

    iget-object v0, v1, Lcom/baidu/platform/comapi/map/t;->g:Lcom/baidu/platform/comapi/map/t$a;

    #v0=(Reference);
    iput-wide v6, v0, Lcom/baidu/platform/comapi/map/t$a;->a:J

    :cond_1
    #v0=(Conflicted);
    iget-object v0, v1, Lcom/baidu/platform/comapi/map/t;->g:Lcom/baidu/platform/comapi/map/t$a;

    #v0=(Reference);
    iget-wide v2, v0, Lcom/baidu/platform/comapi/map/t$a;->b:J

    cmp-long v0, v2, v8

    #v0=(Byte);
    if-ltz v0, :cond_2

    iget-object v0, v1, Lcom/baidu/platform/comapi/map/t;->g:Lcom/baidu/platform/comapi/map/t$a;

    #v0=(Reference);
    iput-wide v8, v0, Lcom/baidu/platform/comapi/map/t$a;->b:J

    :cond_2
    #v0=(Conflicted);
    iget-object v0, v1, Lcom/baidu/platform/comapi/map/t;->g:Lcom/baidu/platform/comapi/map/t$a;

    #v0=(Reference);
    iget-wide v2, v0, Lcom/baidu/platform/comapi/map/t$a;->c:J

    cmp-long v0, v2, v8

    #v0=(Byte);
    if-ltz v0, :cond_3

    iget-object v0, v1, Lcom/baidu/platform/comapi/map/t;->g:Lcom/baidu/platform/comapi/map/t$a;

    #v0=(Reference);
    iput-wide v8, v0, Lcom/baidu/platform/comapi/map/t$a;->c:J

    :cond_3
    #v0=(Conflicted);
    iget-object v0, v1, Lcom/baidu/platform/comapi/map/t;->g:Lcom/baidu/platform/comapi/map/t$a;

    #v0=(Reference);
    iget-wide v2, v0, Lcom/baidu/platform/comapi/map/t$a;->d:J

    cmp-long v0, v2, v6

    #v0=(Byte);
    if-gtz v0, :cond_4

    iget-object v0, v1, Lcom/baidu/platform/comapi/map/t;->g:Lcom/baidu/platform/comapi/map/t$a;

    #v0=(Reference);
    iput-wide v6, v0, Lcom/baidu/platform/comapi/map/t$a;->d:J

    :cond_4
    #v0=(Conflicted);
    move-object v0, v1

    #v0=(Reference);
    goto/16 :goto_0

    :cond_5
    #v0=(One);v2=(Integer);v3=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_1
.end method

.method public n()F
    .locals 2

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/o;->k:Lcom/baidu/platform/comjni/map/basemap/a;

    #v0=(Reference);
    if-nez v0, :cond_0

    const/high16 v0, 0x4040

    :goto_0
    #v0=(Integer);v1=(Conflicted);
    return v0

    :cond_0
    #v0=(Reference);v1=(Uninit);
    iget-object v0, p0, Lcom/baidu/platform/comapi/map/o;->k:Lcom/baidu/platform/comjni/map/basemap/a;

    invoke-virtual {v0}, Lcom/baidu/platform/comjni/map/basemap/a;->g()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "level"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getDouble(Ljava/lang/String;)D

    move-result-wide v0

    #v0=(DoubleLo);v1=(DoubleHi);
    double-to-float v0, v0

    #v0=(Float);
    goto :goto_0
.end method

.method public o()V
    .locals 2

    const/4 v1, 0x0

    #v1=(Null);
    invoke-direct {p0}, Lcom/baidu/platform/comapi/map/o;->s()V

    iput-object v1, p0, Lcom/baidu/platform/comapi/map/o;->p:Landroid/os/Handler;

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/o;->k:Lcom/baidu/platform/comjni/map/basemap/a;

    #v0=(Reference);
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/baidu/platform/comapi/map/o;->k:Lcom/baidu/platform/comjni/map/basemap/a;

    invoke-virtual {v0}, Lcom/baidu/platform/comjni/map/basemap/a;->b()Z

    iput-object v1, p0, Lcom/baidu/platform/comapi/map/o;->k:Lcom/baidu/platform/comjni/map/basemap/a;

    :cond_0
    return-void
.end method

.method public onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 4

    const/16 v3, 0x32

    #v3=(PosByte);
    const/16 v2, -0x32

    #v2=(Byte);
    const/4 v0, 0x0

    #v0=(Null);
    iget-object v1, p0, Lcom/baidu/platform/comapi/map/o;->m:Lcom/baidu/platform/comapi/map/q;

    #v1=(Reference);
    if-ne v1, p1, :cond_0

    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result v1

    #v1=(Integer);
    if-eqz v1, :cond_1

    :cond_0
    :goto_0
    #v0=(Boolean);v1=(Conflicted);
    return v0

    :cond_1
    #v0=(Null);v1=(Integer);
    packed-switch p2, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    invoke-virtual {p0, v0, v2}, Lcom/baidu/platform/comapi/map/o;->f(II)V

    :goto_1
    const/4 v0, 0x1

    #v0=(One);
    goto :goto_0

    :pswitch_1
    #v0=(Null);
    invoke-virtual {p0, v2, v0}, Lcom/baidu/platform/comapi/map/o;->f(II)V

    goto :goto_1

    :pswitch_2
    invoke-virtual {p0, v3, v0}, Lcom/baidu/platform/comapi/map/o;->f(II)V

    goto :goto_1

    :pswitch_3
    invoke-virtual {p0, v0, v3}, Lcom/baidu/platform/comapi/map/o;->f(II)V

    goto :goto_1

    #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);p3=(Unknown);
    nop

    :pswitch_data_0
    .packed-switch 0x13
        :pswitch_0
        :pswitch_3
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

*/}
