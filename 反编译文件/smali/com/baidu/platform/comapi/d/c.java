package com.baidu.platform.comapi.d; class c {/*

.class public Lcom/baidu/platform/comapi/d/c;
.super Ljava/lang/Object;


# static fields
.field public static A:Landroid/content/Context;

.field public static final B:I

.field public static C:F

.field private static D:Z

.field private static E:I

.field private static F:I

.field static a:Lcom/baidu/platform/comjni/map/commonmemcache/a;

.field static b:Ljava/lang/String;

.field static c:Ljava/lang/String;

.field static d:Ljava/lang/String;

.field static e:Ljava/lang/String;

.field static f:Ljava/lang/String;

.field static g:I

.field static h:I

.field static i:I

.field static j:I

.field static k:I

.field static l:I

.field static m:Ljava/lang/String;

.field static n:Ljava/lang/String;

.field static o:Ljava/lang/String;

.field static p:Ljava/lang/String;

.field static q:Ljava/lang/String;

.field static r:Ljava/lang/String;

.field static s:Ljava/lang/String;

.field static t:Ljava/lang/String;

.field static u:Ljava/lang/String;

.field static v:Ljava/lang/String;

.field static w:Ljava/lang/String;

.field static x:Ljava/lang/String;

.field static y:Ljava/lang/String;

.field static z:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v1, 0x0

    #v1=(Null);
    new-instance v0, Lcom/baidu/platform/comjni/map/commonmemcache/a;

    #v0=(UninitRef);
    invoke-direct {v0}, Lcom/baidu/platform/comjni/map/commonmemcache/a;-><init>()V

    #v0=(Reference);
    sput-object v0, Lcom/baidu/platform/comapi/d/c;->a:Lcom/baidu/platform/comjni/map/commonmemcache/a;

    const-string v0, "02"

    sput-object v0, Lcom/baidu/platform/comapi/d/c;->b:Ljava/lang/String;

    const-string v0, "baidu"

    sput-object v0, Lcom/baidu/platform/comapi/d/c;->s:Ljava/lang/String;

    const-string v0, "baidu"

    sput-object v0, Lcom/baidu/platform/comapi/d/c;->t:Ljava/lang/String;

    const-string v0, ""

    sput-object v0, Lcom/baidu/platform/comapi/d/c;->u:Ljava/lang/String;

    const-string v0, ""

    sput-object v0, Lcom/baidu/platform/comapi/d/c;->v:Ljava/lang/String;

    const-string v0, ""

    sput-object v0, Lcom/baidu/platform/comapi/d/c;->w:Ljava/lang/String;

    const-string v0, "-1"

    sput-object v0, Lcom/baidu/platform/comapi/d/c;->y:Ljava/lang/String;

    const-string v0, "-1"

    sput-object v0, Lcom/baidu/platform/comapi/d/c;->z:Ljava/lang/String;

    sget-object v0, Landroid/os/Build$VERSION;->SDK:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    #v0=(Integer);
    sput v0, Lcom/baidu/platform/comapi/d/c;->B:I

    const/high16 v0, 0x3f80

    sput v0, Lcom/baidu/platform/comapi/d/c;->C:F

    const/4 v0, 0x1

    #v0=(One);
    sput-boolean v0, Lcom/baidu/platform/comapi/d/c;->D:Z

    sput v1, Lcom/baidu/platform/comapi/d/c;->E:I

    sput v1, Lcom/baidu/platform/comapi/d/c;->F:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method public static a()Ljava/lang/String;
    .locals 5

    const/16 v4, 0xa

    #v4=(PosByte);
    new-instance v1, Ljava/util/Random;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/util/Random;-><init>()V

    #v1=(Reference);
    new-instance v2, Ljava/lang/StringBuffer;

    #v2=(UninitRef);
    invoke-direct {v2, v4}, Ljava/lang/StringBuffer;-><init>(I)V

    #v2=(Reference);
    const/4 v0, 0x0

    :goto_0
    #v0=(Integer);v3=(Conflicted);
    if-ge v0, v4, :cond_0

    invoke-virtual {v1, v4}, Ljava/util/Random;->nextInt(I)I

    move-result v3

    #v3=(Integer);
    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    #v3=(Conflicted);
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method public static a(Landroid/content/Context;)Ljava/lang/String;
    .locals 5

    const/4 v1, 0x0

    #v1=(Null);
    const-string v2, "imei.dat"

    :try_start_0
    #v2=(Reference);
    sget-boolean v0, Lcom/baidu/platform/comapi/d/c;->D:Z

    #v0=(Boolean);
    if-nez v0, :cond_0

    invoke-static {}, Lcom/baidu/platform/comapi/d/c;->a()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    #v0=(Reference);
    const v1, 0x8000

    :try_start_1
    #v1=(Char);
    invoke-virtual {p0, v2, v1}, Landroid/content/Context;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;

    move-result-object v1

    #v1=(Reference);
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    #v2=(Reference);
    const-string v3, "|"

    #v3=(Reference);
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->getBytes()[B

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/io/FileOutputStream;->write([B)V

    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :goto_0
    #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    return-object v0

    :cond_0
    :try_start_2
    #v0=(Boolean);v1=(Null);v2=(Reference);v3=(Uninit);v4=(Uninit);
    invoke-virtual {p0, v2}, Landroid/content/Context;->openFileInput(Ljava/lang/String;)Ljava/io/FileInputStream;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/io/FileInputStream;->available()I

    move-result v2

    #v2=(Integer);
    new-array v3, v2, [B

    #v3=(Reference);
    invoke-virtual {v0, v3}, Ljava/io/FileInputStream;->read([B)I

    invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V

    new-instance v2, Ljava/lang/String;

    #v2=(UninitRef);
    invoke-direct {v2, v3}, Ljava/lang/String;-><init>([B)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    #v2=(Reference);
    const/16 v0, 0x7c

    :try_start_3
    #v0=(PosByte);
    invoke-virtual {v2, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    #v0=(Integer);
    add-int/lit8 v0, v0, 0x1

    invoke-virtual {v2, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    move-result-object v0

    #v0=(Reference);
    goto :goto_0

    :catch_0
    #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    move-exception v0

    #v0=(Reference);
    move-object v4, v0

    #v4=(Reference);
    move-object v0, v1

    #v0=(Null);
    move-object v1, v4

    :goto_1
    #v0=(Reference);v1=(Reference);v4=(Conflicted);
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0

    :catch_1
    #v1=(Conflicted);v4=(Uninit);
    move-exception v1

    #v1=(Reference);
    goto :goto_1

    :catch_2
    #v0=(Integer);v1=(Null);v2=(Reference);v3=(Reference);
    move-exception v0

    #v0=(Reference);
    move-object v1, v0

    #v1=(Reference);
    move-object v0, v2

    goto :goto_1
.end method

.method public static a(Ljava/lang/String;)V
    .locals 0

    sput-object p0, Lcom/baidu/platform/comapi/d/c;->p:Ljava/lang/String;

    invoke-static {}, Lcom/baidu/platform/comapi/d/c;->f()V

    return-void
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0}, Lcom/baidu/platform/comapi/d/c;->c(Ljava/lang/String;)V

    invoke-static {p1}, Lcom/baidu/platform/comapi/d/c;->b(Ljava/lang/String;)V

    invoke-static {}, Lcom/baidu/platform/comapi/d/c;->f()V

    return-void
.end method

.method public static b()V
    .locals 0

    invoke-static {}, Lcom/baidu/platform/comapi/d/c;->d()V

    return-void
.end method

.method private static b(Ljava/lang/String;)V
    .locals 0

    sput-object p0, Lcom/baidu/platform/comapi/d/c;->v:Ljava/lang/String;

    return-void
.end method

.method public static b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    sput-object p1, Lcom/baidu/platform/comapi/d/c;->y:Ljava/lang/String;

    sput-object p0, Lcom/baidu/platform/comapi/d/c;->z:Ljava/lang/String;

    invoke-static {}, Lcom/baidu/platform/comapi/d/c;->f()V

    return-void
.end method

.method public static b(Landroid/content/Context;)[B
    .locals 3

    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    const/16 v2, 0x40

    #v2=(PosByte);
    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    iget-object v0, v0, Landroid/content/pm/PackageInfo;->signatures:[Landroid/content/pm/Signature;

    const/4 v1, 0x0

    #v1=(Null);
    aget-object v0, v0, v1

    #v0=(Null);
    invoke-virtual {v0}, Landroid/content/pm/Signature;->toByteArray()[B
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    #v0=(Reference);v1=(Conflicted);v2=(Conflicted);
    return-object v0

    :catch_0
    move-exception v0

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/content/pm/PackageManager$NameNotFoundException;->printStackTrace()V

    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public static c()Landroid/os/Bundle;
    .locals 3

    new-instance v0, Landroid/os/Bundle;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    #v0=(Reference);
    const-string v1, "cpu"

    #v1=(Reference);
    sget-object v2, Lcom/baidu/platform/comapi/d/c;->u:Ljava/lang/String;

    #v2=(Reference);
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "resid"

    sget-object v2, Lcom/baidu/platform/comapi/d/c;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "channel"

    sget-object v2, Lcom/baidu/platform/comapi/d/c;->s:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "glr"

    sget-object v2, Lcom/baidu/platform/comapi/d/c;->v:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "glv"

    sget-object v2, Lcom/baidu/platform/comapi/d/c;->w:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "mb"

    invoke-static {}, Lcom/baidu/platform/comapi/d/c;->g()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "sv"

    invoke-static {}, Lcom/baidu/platform/comapi/d/c;->i()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "os"

    invoke-static {}, Lcom/baidu/platform/comapi/d/c;->k()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "dpi_x"

    invoke-static {}, Lcom/baidu/platform/comapi/d/c;->n()I

    move-result v2

    #v2=(Integer);
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v1, "dpi_y"

    invoke-static {}, Lcom/baidu/platform/comapi/d/c;->n()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v1, "net"

    sget-object v2, Lcom/baidu/platform/comapi/d/c;->p:Ljava/lang/String;

    #v2=(Reference);
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "im"

    sget-object v2, Lcom/baidu/platform/comapi/d/c;->A:Landroid/content/Context;

    invoke-static {v2}, Lcom/baidu/platform/comapi/d/c;->j(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "imrand"

    sget-object v2, Lcom/baidu/platform/comapi/d/c;->A:Landroid/content/Context;

    invoke-static {v2}, Lcom/baidu/platform/comapi/d/c;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "signature"

    sget-object v2, Lcom/baidu/platform/comapi/d/c;->A:Landroid/content/Context;

    invoke-static {v2}, Lcom/baidu/platform/comapi/d/c;->b(Landroid/content/Context;)[B

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    const-string v1, "pcn"

    sget-object v2, Lcom/baidu/platform/comapi/d/c;->A:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "screen_x"

    invoke-static {}, Lcom/baidu/platform/comapi/d/c;->h()I

    move-result v2

    #v2=(Integer);
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v1, "screen_y"

    invoke-static {}, Lcom/baidu/platform/comapi/d/c;->j()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    return-object v0
.end method

.method public static c(Landroid/content/Context;)V
    .locals 4

    const/4 v1, 0x1

    #v1=(One);
    const/4 v2, 0x0

    #v2=(Null);
    sput-object p0, Lcom/baidu/platform/comapi/d/c;->A:Landroid/content/Context;

    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/baidu/platform/comapi/d/c;->x:Ljava/lang/String;

    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    sput-object v0, Lcom/baidu/platform/comapi/d/c;->d:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    #v0=(Reference);
    const-string v3, "Android"

    #v3=(Reference);
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v3, Landroid/os/Build$VERSION;->SDK:Ljava/lang/String;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/baidu/platform/comapi/d/c;->e:Ljava/lang/String;

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/baidu/platform/comapi/d/c;->c:Ljava/lang/String;

    invoke-static {p0}, Lcom/baidu/platform/comapi/d/c;->e(Landroid/content/Context;)V

    invoke-static {p0}, Lcom/baidu/platform/comapi/d/c;->f(Landroid/content/Context;)V

    invoke-static {p0}, Lcom/baidu/platform/comapi/d/c;->g(Landroid/content/Context;)V

    invoke-static {p0}, Lcom/baidu/platform/comapi/d/c;->h(Landroid/content/Context;)V

    invoke-static {p0}, Lcom/baidu/platform/comapi/d/c;->i(Landroid/content/Context;)V

    invoke-static {p0}, Lcom/baidu/platform/comapi/d/c;->l(Landroid/content/Context;)V

    invoke-static {}, Lcom/baidu/platform/comapi/d/c;->u()V

    :try_start_0
    const-string v0, "location"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/location/LocationManager;

    const-string v3, "gps"

    invoke-virtual {v0, v3}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v3

    #v3=(Boolean);
    if-eqz v3, :cond_0

    move v3, v1

    :goto_0
    sput v3, Lcom/baidu/platform/comapi/d/c;->E:I

    const-string v3, "network"

    #v3=(Reference);
    invoke-virtual {v0, v3}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_1

    move v0, v1

    :goto_1
    sput v0, Lcom/baidu/platform/comapi/d/c;->F:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_2
    #v0=(Conflicted);v3=(Conflicted);
    return-void

    :cond_0
    #v0=(Reference);v3=(Boolean);
    move v3, v2

    #v3=(Null);
    goto :goto_0

    :cond_1
    #v0=(Boolean);v3=(Reference);
    move v0, v2

    #v0=(Null);
    goto :goto_1

    :catch_0
    #v0=(Conflicted);v3=(Conflicted);
    move-exception v0

    #v0=(Reference);
    goto :goto_2
.end method

.method private static c(Ljava/lang/String;)V
    .locals 0

    sput-object p0, Lcom/baidu/platform/comapi/d/c;->w:Ljava/lang/String;

    return-void
.end method

.method public static d()V
    .locals 1

    sget-object v0, Lcom/baidu/platform/comapi/d/c;->a:Lcom/baidu/platform/comjni/map/commonmemcache/a;

    #v0=(Reference);
    if-eqz v0, :cond_0

    sget-object v0, Lcom/baidu/platform/comapi/d/c;->a:Lcom/baidu/platform/comjni/map/commonmemcache/a;

    invoke-virtual {v0}, Lcom/baidu/platform/comjni/map/commonmemcache/a;->b()I

    :cond_0
    return-void
.end method

.method public static d(Landroid/content/Context;)V
    .locals 9

    const/4 v1, 0x1

    #v1=(One);
    const/4 v0, 0x0

    :try_start_0
    #v0=(Null);
    new-instance v2, Ljava/io/File;

    #v2=(UninitRef);
    sget-object v3, Lcom/baidu/platform/comapi/d/c;->x:Ljava/lang/String;

    #v3=(Reference);
    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v3

    #v3=(Boolean);
    if-nez v3, :cond_0

    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    :cond_0
    new-instance v2, Ljava/io/File;

    #v2=(UninitRef);
    new-instance v3, Ljava/lang/StringBuilder;

    #v3=(UninitRef);
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    #v3=(Reference);
    sget-object v4, Lcom/baidu/platform/comapi/d/c;->x:Ljava/lang/String;

    #v4=(Reference);
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "/ver.dat"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    const/4 v3, 0x6

    #v3=(PosByte);
    new-array v3, v3, [B

    #v3=(Reference);
    fill-array-data v3, :array_0

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v4

    #v4=(Boolean);
    if-eqz v4, :cond_1

    new-instance v4, Ljava/io/FileInputStream;

    #v4=(UninitRef);
    invoke-direct {v4, v2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    #v4=(Reference);
    invoke-virtual {v4}, Ljava/io/FileInputStream;->available()I

    move-result v5

    #v5=(Integer);
    new-array v5, v5, [B

    #v5=(Reference);
    invoke-virtual {v4, v5}, Ljava/io/FileInputStream;->read([B)I

    invoke-virtual {v4}, Ljava/io/FileInputStream;->close()V

    invoke-static {v5, v3}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v4

    #v4=(Boolean);
    if-eqz v4, :cond_1

    move v1, v0

    :cond_1
    #v1=(Boolean);v5=(Conflicted);
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    move-result-object v4

    #v4=(Reference);
    new-instance v5, Ljava/io/File;

    #v5=(UninitRef);
    new-instance v6, Ljava/lang/StringBuilder;

    #v6=(UninitRef);
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    #v6=(Reference);
    sget-object v7, Lcom/baidu/platform/comapi/d/c;->x:Ljava/lang/String;

    #v7=(Reference);
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, "/channel"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    #v5=(Reference);
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v6

    #v6=(Boolean);
    if-nez v6, :cond_6

    const-string v6, "channel"

    #v6=(Reference);
    invoke-virtual {v4, v6}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v6

    invoke-virtual {v6}, Ljava/io/InputStream;->available()I

    move-result v7

    #v7=(Integer);
    new-array v7, v7, [B

    #v7=(Reference);
    invoke-virtual {v6, v7}, Ljava/io/InputStream;->read([B)I

    new-instance v8, Ljava/lang/String;

    #v8=(UninitRef);
    invoke-direct {v8, v7}, Ljava/lang/String;-><init>([B)V

    #v8=(Reference);
    invoke-virtual {v8}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v8

    sput-object v8, Lcom/baidu/platform/comapi/d/c;->s:Ljava/lang/String;

    new-instance v8, Ljava/lang/String;

    #v8=(UninitRef);
    invoke-direct {v8, v7}, Ljava/lang/String;-><init>([B)V

    #v8=(Reference);
    invoke-virtual {v8}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->getBytes()[B

    move-result-object v7

    invoke-virtual {v6}, Ljava/io/InputStream;->close()V

    invoke-virtual {v5}, Ljava/io/File;->createNewFile()Z

    new-instance v6, Ljava/io/FileOutputStream;

    #v6=(UninitRef);
    invoke-direct {v6, v5}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    #v6=(Reference);
    invoke-virtual {v6, v7}, Ljava/io/FileOutputStream;->write([B)V

    invoke-virtual {v6}, Ljava/io/FileOutputStream;->close()V

    :goto_0
    #v8=(Conflicted);
    new-instance v5, Ljava/io/File;

    #v5=(UninitRef);
    new-instance v6, Ljava/lang/StringBuilder;

    #v6=(UninitRef);
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    #v6=(Reference);
    sget-object v7, Lcom/baidu/platform/comapi/d/c;->x:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, "/oem"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    #v5=(Reference);
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v6

    #v6=(Boolean);
    if-nez v6, :cond_8

    const-string v6, "oem"

    #v6=(Reference);
    invoke-virtual {v4, v6}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v6

    invoke-virtual {v6}, Ljava/io/InputStream;->available()I

    move-result v7

    #v7=(Integer);
    new-array v7, v7, [B

    #v7=(Reference);
    invoke-virtual {v6, v7}, Ljava/io/InputStream;->read([B)I

    new-instance v8, Ljava/lang/String;

    #v8=(UninitRef);
    invoke-direct {v8, v7}, Ljava/lang/String;-><init>([B)V

    #v8=(Reference);
    invoke-virtual {v8}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v8

    sput-object v8, Lcom/baidu/platform/comapi/d/c;->t:Ljava/lang/String;

    new-instance v8, Ljava/lang/String;

    #v8=(UninitRef);
    invoke-direct {v8, v7}, Ljava/lang/String;-><init>([B)V

    #v8=(Reference);
    invoke-virtual {v8}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->getBytes()[B

    move-result-object v7

    invoke-virtual {v6}, Ljava/io/InputStream;->close()V

    invoke-virtual {v5}, Ljava/io/File;->createNewFile()Z

    new-instance v6, Ljava/io/FileOutputStream;

    #v6=(UninitRef);
    invoke-direct {v6, v5}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    #v6=(Reference);
    invoke-virtual {v6, v7}, Ljava/io/FileOutputStream;->write([B)V

    invoke-virtual {v6}, Ljava/io/FileOutputStream;->close()V

    :goto_1
    #v8=(Conflicted);
    if-eqz v1, :cond_7

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    :cond_2
    invoke-virtual {v2}, Ljava/io/File;->createNewFile()Z

    new-instance v1, Ljava/io/FileOutputStream;

    #v1=(UninitRef);
    invoke-direct {v1, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    #v1=(Reference);
    invoke-virtual {v1, v3}, Ljava/io/FileOutputStream;->write([B)V

    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V

    new-instance v1, Ljava/io/File;

    #v1=(UninitRef);
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    #v2=(Reference);
    sget-object v3, Lcom/baidu/platform/comapi/d/c;->x:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "/cfg/h"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    #v2=(Boolean);
    if-nez v2, :cond_3

    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    :cond_3
    new-instance v1, Ljava/io/File;

    #v1=(UninitRef);
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    #v2=(Reference);
    sget-object v3, Lcom/baidu/platform/comapi/d/c;->x:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "/cfg/l"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    #v2=(Boolean);
    if-nez v2, :cond_4

    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    :cond_4
    const/16 v1, 0x10

    #v1=(PosByte);
    new-array v1, v1, [Ljava/lang/String;

    #v1=(Reference);
    const/4 v2, 0x0

    #v2=(Null);
    const-string v3, "CMRequire.dat"

    aput-object v3, v1, v2

    const/4 v2, 0x1

    #v2=(One);
    const-string v3, "VerDatset.dat"

    aput-object v3, v1, v2

    const/4 v2, 0x2

    #v2=(PosByte);
    const-string v3, "cfg/h/ResPack.cfg"

    aput-object v3, v1, v2

    const/4 v2, 0x3

    const-string v3, "cfg/l/ResPack.cfg"

    aput-object v3, v1, v2

    const/4 v2, 0x4

    const-string v3, "cfg/h/DVHotcity.cfg"

    aput-object v3, v1, v2

    const/4 v2, 0x5

    const-string v3, "cfg/l/DVHotcity.cfg"

    aput-object v3, v1, v2

    const/4 v2, 0x6

    const-string v3, "cfg/l/mapstyle.sty"

    aput-object v3, v1, v2

    const/4 v2, 0x7

    const-string v3, "cfg/l/satellitestyle.sty"

    aput-object v3, v1, v2

    const/16 v2, 0x8

    const-string v3, "cfg/l/trafficstyle.sty"

    aput-object v3, v1, v2

    const/16 v2, 0x9

    const-string v3, "cfg/l/DVDirectory.cfg"

    aput-object v3, v1, v2

    const/16 v2, 0xa

    const-string v3, "cfg/l/DVVersion.cfg"

    aput-object v3, v1, v2

    const/16 v2, 0xb

    const-string v3, "cfg/h/mapstyle.sty"

    aput-object v3, v1, v2

    const/16 v2, 0xc

    const-string v3, "cfg/h/satellitestyle.sty"

    aput-object v3, v1, v2

    const/16 v2, 0xd

    const-string v3, "cfg/h/trafficstyle.sty"

    aput-object v3, v1, v2

    const/16 v2, 0xe

    const-string v3, "cfg/h/DVDirectory.cfg"

    aput-object v3, v1, v2

    const/16 v2, 0xf

    const-string v3, "cfg/h/DVVersion.cfg"

    aput-object v3, v1, v2

    const/16 v2, 0x10

    new-array v2, v2, [Ljava/lang/String;

    #v2=(Reference);
    const/4 v3, 0x0

    #v3=(Null);
    const-string v5, "CMRequire.dat"

    aput-object v5, v2, v3

    const/4 v3, 0x1

    #v3=(One);
    const-string v5, "VerDatset.dat"

    aput-object v5, v2, v3

    const/4 v3, 0x2

    #v3=(PosByte);
    const-string v5, "cfg/h/ResPack.rs"

    aput-object v5, v2, v3

    const/4 v3, 0x3

    const-string v5, "cfg/l/ResPack.rs"

    aput-object v5, v2, v3

    const/4 v3, 0x4

    const-string v5, "cfg/h/DVHotcity.cfg"

    aput-object v5, v2, v3

    const/4 v3, 0x5

    const-string v5, "cfg/l/DVHotcity.cfg"

    aput-object v5, v2, v3

    const/4 v3, 0x6

    const-string v5, "cfg/l/mapstyle.sty"

    aput-object v5, v2, v3

    const/4 v3, 0x7

    const-string v5, "cfg/l/satellitestyle.sty"

    aput-object v5, v2, v3

    const/16 v3, 0x8

    const-string v5, "cfg/l/trafficstyle.sty"

    aput-object v5, v2, v3

    const/16 v3, 0x9

    const-string v5, "cfg/l/DVDirectory.cfg"

    aput-object v5, v2, v3

    const/16 v3, 0xa

    const-string v5, "cfg/l/DVVersion.cfg"

    aput-object v5, v2, v3

    const/16 v3, 0xb

    const-string v5, "cfg/h/mapstyle.sty"

    aput-object v5, v2, v3

    const/16 v3, 0xc

    const-string v5, "cfg/h/satellitestyle.sty"

    aput-object v5, v2, v3

    const/16 v3, 0xd

    const-string v5, "cfg/h/trafficstyle.sty"

    aput-object v5, v2, v3

    const/16 v3, 0xe

    const-string v5, "cfg/h/DVDirectory.cfg"

    aput-object v5, v2, v3

    const/16 v3, 0xf

    const-string v5, "cfg/h/DVVersion.cfg"

    aput-object v5, v2, v3

    :goto_2
    #v0=(Integer);v3=(Conflicted);
    array-length v3, v2

    #v3=(Integer);
    if-ge v0, v3, :cond_7

    aget-object v3, v1, v0

    #v3=(Null);
    invoke-virtual {v4, v3}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    move-result-object v3

    #v3=(Reference);
    invoke-virtual {v3}, Ljava/io/InputStream;->available()I

    move-result v5

    #v5=(Integer);
    new-array v5, v5, [B

    #v5=(Reference);
    invoke-virtual {v3, v5}, Ljava/io/InputStream;->read([B)I

    invoke-virtual {v3}, Ljava/io/InputStream;->close()V

    new-instance v3, Ljava/io/File;

    #v3=(UninitRef);
    new-instance v6, Ljava/lang/StringBuilder;

    #v6=(UninitRef);
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    #v6=(Reference);
    sget-object v7, Lcom/baidu/platform/comapi/d/c;->x:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, "/"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    aget-object v7, v2, v0

    #v7=(Null);
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v3, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    #v3=(Reference);
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v6

    #v6=(Boolean);
    if-eqz v6, :cond_5

    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    :cond_5
    invoke-virtual {v3}, Ljava/io/File;->createNewFile()Z

    new-instance v6, Ljava/io/FileOutputStream;

    #v6=(UninitRef);
    invoke-direct {v6, v3}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    #v6=(Reference);
    invoke-virtual {v6, v5}, Ljava/io/FileOutputStream;->write([B)V

    invoke-virtual {v6}, Ljava/io/FileOutputStream;->close()V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_6
    #v0=(Null);v1=(Boolean);v6=(Boolean);v7=(Reference);v8=(Uninit);
    new-instance v6, Ljava/io/FileInputStream;

    #v6=(UninitRef);
    invoke-direct {v6, v5}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    #v6=(Reference);
    invoke-virtual {v6}, Ljava/io/FileInputStream;->available()I

    move-result v5

    #v5=(Integer);
    new-array v5, v5, [B

    #v5=(Reference);
    invoke-virtual {v6, v5}, Ljava/io/FileInputStream;->read([B)I

    new-instance v7, Ljava/lang/String;

    #v7=(UninitRef);
    invoke-direct {v7, v5}, Ljava/lang/String;-><init>([B)V

    #v7=(Reference);
    invoke-virtual {v7}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v5

    sput-object v5, Lcom/baidu/platform/comapi/d/c;->s:Ljava/lang/String;

    invoke-virtual {v6}, Ljava/io/FileInputStream;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    :catch_0
    #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    move-exception v0

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_7
    #v0=(Conflicted);
    return-void

    :cond_8
    :try_start_1
    #v0=(Null);v1=(Boolean);v2=(Reference);v3=(Reference);v4=(Reference);v5=(Reference);v6=(Boolean);v7=(Reference);
    new-instance v6, Ljava/io/FileInputStream;

    #v6=(UninitRef);
    invoke-direct {v6, v5}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    #v6=(Reference);
    invoke-virtual {v6}, Ljava/io/FileInputStream;->available()I

    move-result v5

    #v5=(Integer);
    new-array v5, v5, [B

    #v5=(Reference);
    invoke-virtual {v6, v5}, Ljava/io/FileInputStream;->read([B)I

    new-instance v7, Ljava/lang/String;

    #v7=(UninitRef);
    invoke-direct {v7, v5}, Ljava/lang/String;-><init>([B)V

    #v7=(Reference);
    invoke-virtual {v7}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v5

    sput-object v5, Lcom/baidu/platform/comapi/d/c;->t:Ljava/lang/String;

    invoke-virtual {v6}, Ljava/io/FileInputStream;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_1

    #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);p0=(Unknown);
    nop

    :array_0
    .array-data 0x1
        0x2t
        0x1t
        0x2t
        0x0t
        0x0t
        0x0t
    .end array-data
.end method

.method public static e()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/baidu/platform/comapi/d/c;->p:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method private static e(Landroid/content/Context;)V
    .locals 3

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    :try_start_0
    #v0=(Reference);
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    const/4 v2, 0x0

    #v2=(Null);
    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    invoke-static {}, Lcom/baidu/mapapi/VersionInfo;->getApiVersion()Ljava/lang/String;

    move-result-object v1

    sput-object v1, Lcom/baidu/platform/comapi/d/c;->f:Ljava/lang/String;

    iget v0, v0, Landroid/content/pm/PackageInfo;->versionCode:I

    #v0=(Integer);
    sput v0, Lcom/baidu/platform/comapi/d/c;->g:I
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    #v1=(Conflicted);v2=(Conflicted);
    return-void

    :catch_0
    #v0=(Conflicted);
    move-exception v0

    #v0=(Reference);
    const-string v0, "1.0.0"

    sput-object v0, Lcom/baidu/platform/comapi/d/c;->f:Ljava/lang/String;

    const/4 v0, 0x1

    #v0=(One);
    sput v0, Lcom/baidu/platform/comapi/d/c;->g:I

    goto :goto_0
.end method

.method public static f()V
    .locals 3

    new-instance v0, Landroid/os/Bundle;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    #v0=(Reference);
    const-string v1, "cpu"

    #v1=(Reference);
    sget-object v2, Lcom/baidu/platform/comapi/d/c;->u:Ljava/lang/String;

    #v2=(Reference);
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "resid"

    sget-object v2, Lcom/baidu/platform/comapi/d/c;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "channel"

    sget-object v2, Lcom/baidu/platform/comapi/d/c;->s:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "glr"

    sget-object v2, Lcom/baidu/platform/comapi/d/c;->v:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "glv"

    sget-object v2, Lcom/baidu/platform/comapi/d/c;->w:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "mb"

    invoke-static {}, Lcom/baidu/platform/comapi/d/c;->g()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "sv"

    invoke-static {}, Lcom/baidu/platform/comapi/d/c;->i()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "os"

    invoke-static {}, Lcom/baidu/platform/comapi/d/c;->k()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "dpi_x"

    invoke-static {}, Lcom/baidu/platform/comapi/d/c;->n()I

    move-result v2

    #v2=(Integer);
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v1, "dpi_y"

    invoke-static {}, Lcom/baidu/platform/comapi/d/c;->n()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v1, "net"

    sget-object v2, Lcom/baidu/platform/comapi/d/c;->p:Ljava/lang/String;

    #v2=(Reference);
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "im"

    sget-object v2, Lcom/baidu/platform/comapi/d/c;->A:Landroid/content/Context;

    invoke-static {v2}, Lcom/baidu/platform/comapi/d/c;->j(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "imrand"

    sget-object v2, Lcom/baidu/platform/comapi/d/c;->A:Landroid/content/Context;

    invoke-static {v2}, Lcom/baidu/platform/comapi/d/c;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "pcn"

    sget-object v2, Lcom/baidu/platform/comapi/d/c;->A:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "screen_x"

    invoke-static {}, Lcom/baidu/platform/comapi/d/c;->h()I

    move-result v2

    #v2=(Integer);
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v1, "screen_y"

    invoke-static {}, Lcom/baidu/platform/comapi/d/c;->j()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    const-string v1, "appid"

    sget-object v2, Lcom/baidu/platform/comapi/d/c;->y:Ljava/lang/String;

    #v2=(Reference);
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, "uid"

    sget-object v2, Lcom/baidu/platform/comapi/d/c;->z:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v1, Lcom/baidu/platform/comapi/d/c;->a:Lcom/baidu/platform/comjni/map/commonmemcache/a;

    if-eqz v1, :cond_0

    sget-object v1, Lcom/baidu/platform/comapi/d/c;->a:Lcom/baidu/platform/comjni/map/commonmemcache/a;

    invoke-virtual {v1, v0}, Lcom/baidu/platform/comjni/map/commonmemcache/a;->a(Landroid/os/Bundle;)V

    :cond_0
    return-void
.end method

.method private static f(Landroid/content/Context;)V
    .locals 4

    const/16 v3, 0xa0

    #v3=(PosShort);
    const-string v0, "window"

    #v0=(Reference);
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    new-instance v2, Landroid/util/DisplayMetrics;

    #v2=(UninitRef);
    invoke-direct {v2}, Landroid/util/DisplayMetrics;-><init>()V

    #v2=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    if-eqz v0, :cond_3

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/Display;->getWidth()I

    move-result v1

    #v1=(Integer);
    sput v1, Lcom/baidu/platform/comapi/d/c;->h:I

    invoke-virtual {v0}, Landroid/view/Display;->getHeight()I

    move-result v1

    sput v1, Lcom/baidu/platform/comapi/d/c;->i:I

    invoke-virtual {v0, v2}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    :cond_0
    iget v0, v2, Landroid/util/DisplayMetrics;->density:F

    #v0=(Integer);
    sput v0, Lcom/baidu/platform/comapi/d/c;->C:F

    iget v0, v2, Landroid/util/DisplayMetrics;->xdpi:F

    float-to-int v0, v0

    sput v0, Lcom/baidu/platform/comapi/d/c;->j:I

    iget v0, v2, Landroid/util/DisplayMetrics;->ydpi:F

    float-to-int v0, v0

    sput v0, Lcom/baidu/platform/comapi/d/c;->k:I

    sget v0, Lcom/baidu/platform/comapi/d/c;->B:I

    const/4 v1, 0x3

    #v1=(PosByte);
    if-le v0, v1, :cond_2

    iget v0, v2, Landroid/util/DisplayMetrics;->densityDpi:I

    sput v0, Lcom/baidu/platform/comapi/d/c;->l:I

    :goto_1
    sget v0, Lcom/baidu/platform/comapi/d/c;->l:I

    if-nez v0, :cond_1

    sput v3, Lcom/baidu/platform/comapi/d/c;->l:I

    :cond_1
    return-void

    :cond_2
    sput v3, Lcom/baidu/platform/comapi/d/c;->l:I

    goto :goto_1

    :cond_3
    #v0=(Reference);v1=(Null);
    move-object v0, v1

    #v0=(Null);
    goto :goto_0
.end method

.method public static g()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/baidu/platform/comapi/d/c;->d:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method private static g(Landroid/content/Context;)V
    .locals 2

    const-string v0, "phone"

    #v0=(Reference);
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/telephony/TelephonyManager;

    if-eqz v0, :cond_0

    invoke-static {p0}, Lcom/baidu/platform/comapi/d/c;->j(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    sput-object v1, Lcom/baidu/platform/comapi/d/c;->m:Ljava/lang/String;

    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getSubscriberId()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/baidu/platform/comapi/d/c;->n:Ljava/lang/String;

    invoke-static {p0}, Lcom/baidu/platform/comapi/d/c;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/baidu/platform/comapi/d/c;->o:Ljava/lang/String;

    :cond_0
    #v1=(Conflicted);
    return-void
.end method

.method public static h()I
    .locals 1

    sget v0, Lcom/baidu/platform/comapi/d/c;->h:I

    #v0=(Integer);
    return v0
.end method

.method private static h(Landroid/content/Context;)V
    .locals 2

    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    #v0=(Reference);
    const-string v1, "android_id"

    #v1=(Reference);
    invoke-static {v0, v1}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/baidu/platform/comapi/d/c;->q:Ljava/lang/String;

    return-void
.end method

.method public static i()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/baidu/platform/comapi/d/c;->f:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method private static i(Landroid/content/Context;)V
    .locals 1

    const-string v0, "phone"

    #v0=(Reference);
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/telephony/TelephonyManager;

    if-eqz v0, :cond_0

    const-string v0, "wifi"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/wifi/WifiManager;

    invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/wifi/WifiInfo;->getMacAddress()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/baidu/platform/comapi/d/c;->r:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public static j()I
    .locals 1

    sget v0, Lcom/baidu/platform/comapi/d/c;->i:I

    #v0=(Integer);
    return v0
.end method

.method private static j(Landroid/content/Context;)Ljava/lang/String;
    .locals 5

    const/4 v1, 0x0

    #v1=(Null);
    const-string v2, "imei.dat"

    #v2=(Reference);
    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    #v0=(Reference);
    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v3

    #v3=(Reference);
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, "/"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/io/File;

    #v3=(UninitRef);
    invoke-direct {v3, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    :try_start_0
    #v3=(Reference);
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_0

    const/4 v0, 0x0

    #v0=(Null);
    sput-boolean v0, Lcom/baidu/platform/comapi/d/c;->D:Z

    invoke-static {p0}, Lcom/baidu/platform/comapi/d/c;->k(Landroid/content/Context;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    #v0=(Reference);
    const v1, 0x8000

    :try_start_1
    #v1=(Char);
    invoke-virtual {p0, v2, v1}, Landroid/content/Context;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/io/FileOutputStream;->write([B)V

    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :goto_0
    #v2=(Conflicted);v4=(Conflicted);
    return-object v0

    :cond_0
    #v0=(Boolean);v1=(Null);v2=(Reference);v4=(Uninit);
    const/4 v0, 0x1

    :try_start_2
    #v0=(One);
    sput-boolean v0, Lcom/baidu/platform/comapi/d/c;->D:Z

    invoke-virtual {p0, v2}, Landroid/content/Context;->openFileInput(Ljava/lang/String;)Ljava/io/FileInputStream;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/io/FileInputStream;->available()I

    move-result v2

    #v2=(Integer);
    new-array v3, v2, [B

    invoke-virtual {v0, v3}, Ljava/io/FileInputStream;->read([B)I

    invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V

    new-instance v2, Ljava/lang/String;

    #v2=(UninitRef);
    invoke-direct {v2, v3}, Ljava/lang/String;-><init>([B)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    #v2=(Reference);
    const/16 v0, 0x7c

    :try_start_3
    #v0=(PosByte);
    invoke-virtual {v2, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    #v0=(Integer);
    const/4 v1, 0x0

    invoke-virtual {v2, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    move-result-object v0

    #v0=(Reference);
    goto :goto_0

    :catch_0
    #v0=(Conflicted);v2=(Conflicted);
    move-exception v0

    #v0=(Reference);
    move-object v4, v0

    #v4=(Reference);
    move-object v0, v1

    #v0=(Null);
    move-object v1, v4

    :goto_1
    #v0=(Reference);v1=(Reference);v4=(Conflicted);
    invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0

    :catch_1
    #v1=(Conflicted);v2=(Reference);v4=(Uninit);
    move-exception v1

    #v1=(Reference);
    goto :goto_1

    :catch_2
    #v0=(Integer);v1=(Null);
    move-exception v0

    #v0=(Reference);
    move-object v1, v0

    #v1=(Reference);
    move-object v0, v2

    goto :goto_1
.end method

.method public static k()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/baidu/platform/comapi/d/c;->e:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method private static k(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    const/4 v1, 0x0

    :try_start_0
    #v1=(Null);
    const-string v0, "phone"

    #v0=(Reference);
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/telephony/TelephonyManager;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :goto_0
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_0

    const-string v0, "000000000000000"

    :cond_0
    return-object v0

    :catch_0
    #v0=(Conflicted);v1=(Null);
    move-exception v0

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    :cond_1
    move-object v0, v1

    #v0=(Null);
    goto :goto_0
.end method

.method public static l()I
    .locals 1

    sget v0, Lcom/baidu/platform/comapi/d/c;->j:I

    #v0=(Integer);
    return v0
.end method

.method private static l(Landroid/content/Context;)V
    .locals 1

    invoke-static {p0}, Lcom/baidu/platform/comapi/d/a;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    sput-object v0, Lcom/baidu/platform/comapi/d/c;->p:Ljava/lang/String;

    return-void
.end method

.method public static m()I
    .locals 1

    sget v0, Lcom/baidu/platform/comapi/d/c;->k:I

    #v0=(Integer);
    return v0
.end method

.method public static n()I
    .locals 1

    sget v0, Lcom/baidu/platform/comapi/d/c;->l:I

    #v0=(Integer);
    return v0
.end method

.method public static o()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/baidu/platform/comapi/d/c;->m:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method public static p()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/baidu/platform/comapi/d/c;->s:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method public static q()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/baidu/platform/comapi/d/c;->c:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method public static r()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/baidu/platform/comapi/d/c;->x:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method public static s()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/baidu/platform/comapi/d/c;->v:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method public static t()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/baidu/platform/comapi/d/c;->w:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method private static u()V
    .locals 1

    sget-object v0, Lcom/baidu/platform/comapi/d/c;->a:Lcom/baidu/platform/comjni/map/commonmemcache/a;

    #v0=(Reference);
    if-eqz v0, :cond_0

    sget-object v0, Lcom/baidu/platform/comapi/d/c;->a:Lcom/baidu/platform/comjni/map/commonmemcache/a;

    invoke-virtual {v0}, Lcom/baidu/platform/comjni/map/commonmemcache/a;->a()I

    :cond_0
    return-void
.end method

*/}
