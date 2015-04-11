package android.support.v4.util; class LongSparseArray {/*

.class public Landroid/support/v4/util/LongSparseArray;
.super Ljava/lang/Object;
.source "LongSparseArray.java"

# interfaces
.implements Ljava/lang/Cloneable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/Cloneable;"
    }
.end annotation


# static fields
.field private static final DELETED:Ljava/lang/Object;


# instance fields
.field private mGarbage:Z

.field private mKeys:[J

.field private mSize:I

.field private mValues:[Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 25
    new-instance v0, Ljava/lang/Object;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    #v0=(Reference);
    sput-object v0, Landroid/support/v4/util/LongSparseArray;->DELETED:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 36
    .local p0, this:Landroid/support/v4/util/LongSparseArray;,"Landroid/support/v4/util/LongSparseArray<TE;>;"
    const/16 v0, 0xa

    #v0=(PosByte);
    invoke-direct {p0, v0}, Landroid/support/v4/util/LongSparseArray;-><init>(I)V

    .line 37
    #p0=(Reference);
    return-void
.end method

.method public constructor <init>(I)V
    .locals 2
    .parameter "initialCapacity"

    .prologue
    .local p0, this:Landroid/support/v4/util/LongSparseArray;,"Landroid/support/v4/util/LongSparseArray<TE;>;"
    const/4 v1, 0x0

    .line 44
    #v1=(Null);
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    #p0=(Reference);
    iput-boolean v1, p0, Landroid/support/v4/util/LongSparseArray;->mGarbage:Z

    .line 45
    invoke-static {p1}, Landroid/support/v4/util/LongSparseArray;->idealLongArraySize(I)I

    move-result p1

    .line 47
    new-array v0, p1, [J

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J

    .line 48
    new-array v0, p1, [Ljava/lang/Object;

    iput-object v0, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;

    .line 49
    iput v1, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I

    .line 50
    return-void
.end method

.method private static binarySearch([JIIJ)I
    .locals 5
    .parameter "a"
    .parameter "start"
    .parameter "len"
    .parameter "key"

    .prologue
    .line 335
    add-int v1, p1, p2

    .local v1, high:I
    #v1=(Integer);
    add-int/lit8 v2, p1, -0x1

    .line 337
    .local v2, low:I
    :goto_0
    #v0=(Conflicted);v2=(Integer);v3=(Conflicted);v4=(Conflicted);
    sub-int v3, v1, v2

    #v3=(Integer);
    const/4 v4, 0x1

    #v4=(One);
    if-le v3, v4, :cond_1

    .line 338
    add-int v3, v1, v2

    div-int/lit8 v0, v3, 0x2

    .line 340
    .local v0, guess:I
    #v0=(Integer);
    aget-wide v3, p0, v0

    #v3=(LongLo);v4=(LongHi);
    cmp-long v3, v3, p3

    #v3=(Byte);
    if-gez v3, :cond_0

    .line 341
    move v2, v0

    goto :goto_0

    .line 343
    :cond_0
    move v1, v0

    goto :goto_0

    .line 346
    .end local v0           #guess:I
    :cond_1
    #v0=(Conflicted);v3=(Integer);v4=(One);
    add-int v3, p1, p2

    if-ne v1, v3, :cond_3

    .line 347
    add-int v3, p1, p2

    xor-int/lit8 v1, v3, -0x1

    .line 351
    .end local v1           #high:I
    :cond_2
    :goto_1
    #v4=(Conflicted);
    return v1

    .line 348
    .restart local v1       #high:I
    :cond_3
    #v4=(One);
    aget-wide v3, p0, v1

    #v3=(LongLo);v4=(LongHi);
    cmp-long v3, v3, p3

    #v3=(Byte);
    if-eqz v3, :cond_2

    .line 351
    xor-int/lit8 v1, v1, -0x1

    goto :goto_1
.end method

.method private gc()V
    .locals 8

    .prologue
    .line 123
    .local p0, this:Landroid/support/v4/util/LongSparseArray;,"Landroid/support/v4/util/LongSparseArray<TE;>;"
    iget v2, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I

    .line 124
    .local v2, n:I
    #v2=(Integer);
    const/4 v3, 0x0

    .line 125
    .local v3, o:I
    #v3=(Null);
    iget-object v1, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J

    .line 126
    .local v1, keys:[J
    #v1=(Reference);
    iget-object v5, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;

    .line 128
    .local v5, values:[Ljava/lang/Object;
    #v5=(Reference);
    const/4 v0, 0x0

    .local v0, i:I
    :goto_0
    #v0=(Integer);v3=(Integer);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    if-ge v0, v2, :cond_2

    .line 129
    aget-object v4, v5, v0

    .line 131
    .local v4, val:Ljava/lang/Object;
    #v4=(Null);
    sget-object v6, Landroid/support/v4/util/LongSparseArray;->DELETED:Ljava/lang/Object;

    #v6=(Reference);
    if-eq v4, v6, :cond_1

    .line 132
    if-eq v0, v3, :cond_0

    .line 133
    aget-wide v6, v1, v0

    #v6=(LongLo);v7=(LongHi);
    aput-wide v6, v1, v3

    .line 134
    aput-object v4, v5, v3

    .line 135
    const/4 v6, 0x0

    #v6=(Null);
    aput-object v6, v5, v0

    .line 138
    :cond_0
    #v6=(Reference);v7=(Conflicted);
    add-int/lit8 v3, v3, 0x1

    .line 128
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 142
    .end local v4           #val:Ljava/lang/Object;
    :cond_2
    #v4=(Conflicted);v6=(Conflicted);
    const/4 v6, 0x0

    #v6=(Null);
    iput-boolean v6, p0, Landroid/support/v4/util/LongSparseArray;->mGarbage:Z

    .line 143
    iput v3, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I

    .line 146
    return-void
.end method

.method public static idealByteArraySize(I)I
    .locals 3
    .parameter "need"

    .prologue
    const/4 v2, 0x1

    .line 355
    #v2=(One);
    const/4 v0, 0x4

    .local v0, i:I
    :goto_0
    #v0=(Integer);v1=(Conflicted);
    const/16 v1, 0x20

    #v1=(PosByte);
    if-ge v0, v1, :cond_0

    .line 356
    shl-int v1, v2, v0

    #v1=(Integer);
    add-int/lit8 v1, v1, -0xc

    if-gt p0, v1, :cond_1

    .line 357
    shl-int v1, v2, v0

    add-int/lit8 p0, v1, -0xc

    .line 359
    .end local p0
    :cond_0
    return p0

    .line 355
    .restart local p0
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public static idealLongArraySize(I)I
    .locals 1
    .parameter "need"

    .prologue
    .line 363
    mul-int/lit8 v0, p0, 0x8

    #v0=(Integer);
    invoke-static {v0}, Landroid/support/v4/util/LongSparseArray;->idealByteArraySize(I)I

    move-result v0

    div-int/lit8 v0, v0, 0x8

    return v0
.end method


# virtual methods
.method public append(JLjava/lang/Object;)V
    .locals 7
    .parameter "key"
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JTE;)V"
        }
    .end annotation

    .prologue
    .local p0, this:Landroid/support/v4/util/LongSparseArray;,"Landroid/support/v4/util/LongSparseArray<TE;>;"
    .local p3, value:Ljava/lang/Object;,"TE;"
    const/4 v6, 0x0

    .line 305
    #v6=(Null);
    iget v4, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I

    #v4=(Integer);
    if-eqz v4, :cond_0

    iget-object v4, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J

    #v4=(Reference);
    iget v5, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I

    #v5=(Integer);
    add-int/lit8 v5, v5, -0x1

    aget-wide v4, v4, v5

    #v4=(LongLo);v5=(LongHi);
    cmp-long v4, p1, v4

    #v4=(Byte);
    if-gtz v4, :cond_0

    .line 306
    invoke-virtual {p0, p1, p2, p3}, Landroid/support/v4/util/LongSparseArray;->put(JLjava/lang/Object;)V

    .line 332
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Integer);v5=(Conflicted);
    return-void

    .line 310
    :cond_0
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);
    iget-boolean v4, p0, Landroid/support/v4/util/LongSparseArray;->mGarbage:Z

    #v4=(Boolean);
    if-eqz v4, :cond_1

    iget v4, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I

    #v4=(Integer);
    iget-object v5, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J

    #v5=(Reference);
    array-length v5, v5

    #v5=(Integer);
    if-lt v4, v5, :cond_1

    .line 311
    invoke-direct {p0}, Landroid/support/v4/util/LongSparseArray;->gc()V

    .line 314
    :cond_1
    #v5=(Conflicted);
    iget v3, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I

    .line 315
    .local v3, pos:I
    #v3=(Integer);
    iget-object v4, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J

    #v4=(Reference);
    array-length v4, v4

    #v4=(Integer);
    if-lt v3, v4, :cond_2

    .line 316
    add-int/lit8 v4, v3, 0x1

    invoke-static {v4}, Landroid/support/v4/util/LongSparseArray;->idealLongArraySize(I)I

    move-result v0

    .line 318
    .local v0, n:I
    #v0=(Integer);
    new-array v1, v0, [J

    .line 319
    .local v1, nkeys:[J
    #v1=(Reference);
    new-array v2, v0, [Ljava/lang/Object;

    .line 322
    .local v2, nvalues:[Ljava/lang/Object;
    #v2=(Reference);
    iget-object v4, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J

    #v4=(Reference);
    iget-object v5, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J

    #v5=(Reference);
    array-length v5, v5

    #v5=(Integer);
    invoke-static {v4, v6, v1, v6, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 323
    iget-object v4, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;

    iget-object v5, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;

    #v5=(Reference);
    array-length v5, v5

    #v5=(Integer);
    invoke-static {v4, v6, v2, v6, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 325
    iput-object v1, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J

    .line 326
    iput-object v2, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;

    .line 329
    .end local v0           #n:I
    .end local v1           #nkeys:[J
    .end local v2           #nvalues:[Ljava/lang/Object;
    :cond_2
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    iget-object v4, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J

    #v4=(Reference);
    aput-wide p1, v4, v3

    .line 330
    iget-object v4, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;

    aput-object p3, v4, v3

    .line 331
    add-int/lit8 v4, v3, 0x1

    #v4=(Integer);
    iput v4, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I

    goto :goto_0
.end method

.method public clear()V
    .locals 5

    .prologue
    .local p0, this:Landroid/support/v4/util/LongSparseArray;,"Landroid/support/v4/util/LongSparseArray<TE;>;"
    const/4 v4, 0x0

    .line 289
    #v4=(Null);
    iget v1, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I

    .line 290
    .local v1, n:I
    #v1=(Integer);
    iget-object v2, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;

    .line 292
    .local v2, values:[Ljava/lang/Object;
    #v2=(Reference);
    const/4 v0, 0x0

    .local v0, i:I
    :goto_0
    #v0=(Integer);v3=(Conflicted);
    if-ge v0, v1, :cond_0

    .line 293
    const/4 v3, 0x0

    #v3=(Null);
    aput-object v3, v2, v0

    .line 292
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 296
    :cond_0
    #v3=(Conflicted);
    iput v4, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I

    .line 297
    iput-boolean v4, p0, Landroid/support/v4/util/LongSparseArray;->mGarbage:Z

    .line 298
    return-void
.end method

.method public clone()Landroid/support/v4/util/LongSparseArray;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/support/v4/util/LongSparseArray",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 55
    .local p0, this:Landroid/support/v4/util/LongSparseArray;,"Landroid/support/v4/util/LongSparseArray<TE;>;"
    const/4 v1, 0x0

    .line 57
    .local v1, clone:Landroid/support/v4/util/LongSparseArray;,"Landroid/support/v4/util/LongSparseArray<TE;>;"
    :try_start_0
    #v1=(Null);
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v2

    #v2=(Reference);
    move-object v0, v2

    #v0=(Reference);
    check-cast v0, Landroid/support/v4/util/LongSparseArray;

    move-object v1, v0

    .line 58
    #v1=(Reference);
    iget-object v2, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J

    invoke-virtual {v2}, [J->clone()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [J

    iput-object v2, v1, Landroid/support/v4/util/LongSparseArray;->mKeys:[J

    .line 59
    iget-object v2, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;

    invoke-virtual {v2}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ljava/lang/Object;

    iput-object v2, v1, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 63
    :goto_0
    #v0=(Conflicted);
    return-object v1

    .line 60
    :catch_0
    #v2=(Conflicted);
    move-exception v2

    #v2=(Reference);
    goto :goto_0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .prologue
    .line 24
    .local p0, this:Landroid/support/v4/util/LongSparseArray;,"Landroid/support/v4/util/LongSparseArray<TE;>;"
    invoke-virtual {p0}, Landroid/support/v4/util/LongSparseArray;->clone()Landroid/support/v4/util/LongSparseArray;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method public delete(J)V
    .locals 4
    .parameter "key"

    .prologue
    .line 93
    .local p0, this:Landroid/support/v4/util/LongSparseArray;,"Landroid/support/v4/util/LongSparseArray<TE;>;"
    iget-object v1, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J

    #v1=(Reference);
    const/4 v2, 0x0

    #v2=(Null);
    iget v3, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I

    #v3=(Integer);
    invoke-static {v1, v2, v3, p1, p2}, Landroid/support/v4/util/LongSparseArray;->binarySearch([JIIJ)I

    move-result v0

    .line 95
    .local v0, i:I
    #v0=(Integer);
    if-ltz v0, :cond_0

    .line 96
    iget-object v1, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;

    aget-object v1, v1, v0

    #v1=(Null);
    sget-object v2, Landroid/support/v4/util/LongSparseArray;->DELETED:Ljava/lang/Object;

    #v2=(Reference);
    if-eq v1, v2, :cond_0

    .line 97
    iget-object v1, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;

    #v1=(Reference);
    sget-object v2, Landroid/support/v4/util/LongSparseArray;->DELETED:Ljava/lang/Object;

    aput-object v2, v1, v0

    .line 98
    const/4 v1, 0x1

    #v1=(One);
    iput-boolean v1, p0, Landroid/support/v4/util/LongSparseArray;->mGarbage:Z

    .line 101
    :cond_0
    #v1=(Conflicted);
    return-void
.end method

.method public get(J)Ljava/lang/Object;
    .locals 1
    .parameter "key"
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)TE;"
        }
    .end annotation

    .prologue
    .line 71
    .local p0, this:Landroid/support/v4/util/LongSparseArray;,"Landroid/support/v4/util/LongSparseArray<TE;>;"
    const/4 v0, 0x0

    #v0=(Null);
    invoke-virtual {p0, p1, p2, v0}, Landroid/support/v4/util/LongSparseArray;->get(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method public get(JLjava/lang/Object;)Ljava/lang/Object;
    .locals 4
    .parameter "key"
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JTE;)TE;"
        }
    .end annotation

    .prologue
    .line 80
    .local p0, this:Landroid/support/v4/util/LongSparseArray;,"Landroid/support/v4/util/LongSparseArray<TE;>;"
    .local p3, valueIfKeyNotFound:Ljava/lang/Object;,"TE;"
    iget-object v1, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J

    #v1=(Reference);
    const/4 v2, 0x0

    #v2=(Null);
    iget v3, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I

    #v3=(Integer);
    invoke-static {v1, v2, v3, p1, p2}, Landroid/support/v4/util/LongSparseArray;->binarySearch([JIIJ)I

    move-result v0

    .line 82
    .local v0, i:I
    #v0=(Integer);
    if-ltz v0, :cond_0

    iget-object v1, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;

    aget-object v1, v1, v0

    #v1=(Null);
    sget-object v2, Landroid/support/v4/util/LongSparseArray;->DELETED:Ljava/lang/Object;

    #v2=(Reference);
    if-ne v1, v2, :cond_1

    .line 85
    .end local p3           #valueIfKeyNotFound:Ljava/lang/Object;,"TE;"
    :cond_0
    :goto_0
    #v1=(Reference);
    return-object p3

    .restart local p3       #valueIfKeyNotFound:Ljava/lang/Object;,"TE;"
    :cond_1
    #v1=(Null);
    iget-object v1, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;

    #v1=(Reference);
    aget-object p3, v1, v0

    #p3=(Null);
    goto :goto_0
.end method

.method public indexOfKey(J)I
    .locals 3
    .parameter "key"

    .prologue
    .line 258
    .local p0, this:Landroid/support/v4/util/LongSparseArray;,"Landroid/support/v4/util/LongSparseArray<TE;>;"
    iget-boolean v0, p0, Landroid/support/v4/util/LongSparseArray;->mGarbage:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 259
    invoke-direct {p0}, Landroid/support/v4/util/LongSparseArray;->gc()V

    .line 262
    :cond_0
    iget-object v0, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J

    #v0=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    iget v2, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I

    #v2=(Integer);
    invoke-static {v0, v1, v2, p1, p2}, Landroid/support/v4/util/LongSparseArray;->binarySearch([JIIJ)I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public indexOfValue(Ljava/lang/Object;)I
    .locals 2
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)I"
        }
    .end annotation

    .prologue
    .line 274
    .local p0, this:Landroid/support/v4/util/LongSparseArray;,"Landroid/support/v4/util/LongSparseArray<TE;>;"
    .local p1, value:Ljava/lang/Object;,"TE;"
    iget-boolean v1, p0, Landroid/support/v4/util/LongSparseArray;->mGarbage:Z

    #v1=(Boolean);
    if-eqz v1, :cond_0

    .line 275
    invoke-direct {p0}, Landroid/support/v4/util/LongSparseArray;->gc()V

    .line 278
    :cond_0
    const/4 v0, 0x0

    .local v0, i:I
    :goto_0
    #v0=(Integer);
    iget v1, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I

    #v1=(Integer);
    if-ge v0, v1, :cond_2

    .line 279
    iget-object v1, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;

    #v1=(Reference);
    aget-object v1, v1, v0

    #v1=(Null);
    if-ne v1, p1, :cond_1

    .line 282
    .end local v0           #i:I
    :goto_1
    #v1=(Integer);
    return v0

    .line 278
    .restart local v0       #i:I
    :cond_1
    #v1=(Null);
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 282
    :cond_2
    #v1=(Integer);
    const/4 v0, -0x1

    #v0=(Byte);
    goto :goto_1
.end method

.method public keyAt(I)J
    .locals 2
    .parameter "index"

    .prologue
    .line 218
    .local p0, this:Landroid/support/v4/util/LongSparseArray;,"Landroid/support/v4/util/LongSparseArray<TE;>;"
    iget-boolean v0, p0, Landroid/support/v4/util/LongSparseArray;->mGarbage:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 219
    invoke-direct {p0}, Landroid/support/v4/util/LongSparseArray;->gc()V

    .line 222
    :cond_0
    iget-object v0, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J

    #v0=(Reference);
    aget-wide v0, v0, p1

    #v0=(LongLo);v1=(LongHi);
    return-wide v0
.end method

.method public put(JLjava/lang/Object;)V
    .locals 8
    .parameter "key"
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JTE;)V"
        }
    .end annotation

    .prologue
    .local p0, this:Landroid/support/v4/util/LongSparseArray;,"Landroid/support/v4/util/LongSparseArray<TE;>;"
    .local p3, value:Ljava/lang/Object;,"TE;"
    const/4 v6, 0x0

    .line 154
    #v6=(Null);
    iget-object v4, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J

    #v4=(Reference);
    iget v5, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I

    #v5=(Integer);
    invoke-static {v4, v6, v5, p1, p2}, Landroid/support/v4/util/LongSparseArray;->binarySearch([JIIJ)I

    move-result v0

    .line 156
    .local v0, i:I
    #v0=(Integer);
    if-ltz v0, :cond_0

    .line 157
    iget-object v4, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;

    aput-object p3, v4, v0

    .line 198
    :goto_0
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Integer);v7=(Conflicted);
    return-void

    .line 159
    :cond_0
    #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Reference);v5=(Integer);v6=(Null);v7=(Uninit);
    xor-int/lit8 v0, v0, -0x1

    .line 161
    iget v4, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I

    #v4=(Integer);
    if-ge v0, v4, :cond_1

    iget-object v4, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;

    #v4=(Reference);
    aget-object v4, v4, v0

    #v4=(Null);
    sget-object v5, Landroid/support/v4/util/LongSparseArray;->DELETED:Ljava/lang/Object;

    #v5=(Reference);
    if-ne v4, v5, :cond_1

    .line 162
    iget-object v4, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J

    #v4=(Reference);
    aput-wide p1, v4, v0

    .line 163
    iget-object v4, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;

    aput-object p3, v4, v0

    goto :goto_0

    .line 167
    :cond_1
    #v4=(Integer);v5=(Conflicted);
    iget-boolean v4, p0, Landroid/support/v4/util/LongSparseArray;->mGarbage:Z

    #v4=(Boolean);
    if-eqz v4, :cond_2

    iget v4, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I

    #v4=(Integer);
    iget-object v5, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J

    #v5=(Reference);
    array-length v5, v5

    #v5=(Integer);
    if-lt v4, v5, :cond_2

    .line 168
    invoke-direct {p0}, Landroid/support/v4/util/LongSparseArray;->gc()V

    .line 171
    iget-object v4, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J

    #v4=(Reference);
    iget v5, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I

    invoke-static {v4, v6, v5, p1, p2}, Landroid/support/v4/util/LongSparseArray;->binarySearch([JIIJ)I

    move-result v4

    #v4=(Integer);
    xor-int/lit8 v0, v4, -0x1

    .line 174
    :cond_2
    #v5=(Conflicted);
    iget v4, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I

    iget-object v5, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J

    #v5=(Reference);
    array-length v5, v5

    #v5=(Integer);
    if-lt v4, v5, :cond_3

    .line 175
    iget v4, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I

    add-int/lit8 v4, v4, 0x1

    invoke-static {v4}, Landroid/support/v4/util/LongSparseArray;->idealLongArraySize(I)I

    move-result v1

    .line 177
    .local v1, n:I
    #v1=(Integer);
    new-array v2, v1, [J

    .line 178
    .local v2, nkeys:[J
    #v2=(Reference);
    new-array v3, v1, [Ljava/lang/Object;

    .line 181
    .local v3, nvalues:[Ljava/lang/Object;
    #v3=(Reference);
    iget-object v4, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J

    #v4=(Reference);
    iget-object v5, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J

    #v5=(Reference);
    array-length v5, v5

    #v5=(Integer);
    invoke-static {v4, v6, v2, v6, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 182
    iget-object v4, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;

    iget-object v5, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;

    #v5=(Reference);
    array-length v5, v5

    #v5=(Integer);
    invoke-static {v4, v6, v3, v6, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 184
    iput-object v2, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J

    .line 185
    iput-object v3, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;

    .line 188
    .end local v1           #n:I
    .end local v2           #nkeys:[J
    .end local v3           #nvalues:[Ljava/lang/Object;
    :cond_3
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    iget v4, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I

    #v4=(Integer);
    sub-int/2addr v4, v0

    if-eqz v4, :cond_4

    .line 190
    iget-object v4, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J

    #v4=(Reference);
    iget-object v5, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J

    #v5=(Reference);
    add-int/lit8 v6, v0, 0x1

    #v6=(Integer);
    iget v7, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I

    #v7=(Integer);
    sub-int/2addr v7, v0

    invoke-static {v4, v0, v5, v6, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 191
    iget-object v4, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;

    iget-object v5, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;

    add-int/lit8 v6, v0, 0x1

    iget v7, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I

    sub-int/2addr v7, v0

    invoke-static {v4, v0, v5, v6, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 194
    :cond_4
    #v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);
    iget-object v4, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J

    #v4=(Reference);
    aput-wide p1, v4, v0

    .line 195
    iget-object v4, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;

    aput-object p3, v4, v0

    .line 196
    iget v4, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I

    #v4=(Integer);
    add-int/lit8 v4, v4, 0x1

    iput v4, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I

    goto/16 :goto_0
.end method

.method public remove(J)V
    .locals 0
    .parameter "key"

    .prologue
    .line 107
    .local p0, this:Landroid/support/v4/util/LongSparseArray;,"Landroid/support/v4/util/LongSparseArray<TE;>;"
    invoke-virtual {p0, p1, p2}, Landroid/support/v4/util/LongSparseArray;->delete(J)V

    .line 108
    return-void
.end method

.method public removeAt(I)V
    .locals 2
    .parameter "index"

    .prologue
    .line 114
    .local p0, this:Landroid/support/v4/util/LongSparseArray;,"Landroid/support/v4/util/LongSparseArray<TE;>;"
    iget-object v0, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;

    #v0=(Reference);
    aget-object v0, v0, p1

    #v0=(Null);
    sget-object v1, Landroid/support/v4/util/LongSparseArray;->DELETED:Ljava/lang/Object;

    #v1=(Reference);
    if-eq v0, v1, :cond_0

    .line 115
    iget-object v0, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;

    #v0=(Reference);
    sget-object v1, Landroid/support/v4/util/LongSparseArray;->DELETED:Ljava/lang/Object;

    aput-object v1, v0, p1

    .line 116
    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Landroid/support/v4/util/LongSparseArray;->mGarbage:Z

    .line 118
    :cond_0
    #v0=(Boolean);
    return-void
.end method

.method public setValueAt(ILjava/lang/Object;)V
    .locals 1
    .parameter "index"
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITE;)V"
        }
    .end annotation

    .prologue
    .line 245
    .local p0, this:Landroid/support/v4/util/LongSparseArray;,"Landroid/support/v4/util/LongSparseArray<TE;>;"
    .local p2, value:Ljava/lang/Object;,"TE;"
    iget-boolean v0, p0, Landroid/support/v4/util/LongSparseArray;->mGarbage:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 246
    invoke-direct {p0}, Landroid/support/v4/util/LongSparseArray;->gc()V

    .line 249
    :cond_0
    iget-object v0, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;

    #v0=(Reference);
    aput-object p2, v0, p1

    .line 250
    return-void
.end method

.method public size()I
    .locals 1

    .prologue
    .line 205
    .local p0, this:Landroid/support/v4/util/LongSparseArray;,"Landroid/support/v4/util/LongSparseArray<TE;>;"
    iget-boolean v0, p0, Landroid/support/v4/util/LongSparseArray;->mGarbage:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 206
    invoke-direct {p0}, Landroid/support/v4/util/LongSparseArray;->gc()V

    .line 209
    :cond_0
    iget v0, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I

    #v0=(Integer);
    return v0
.end method

.method public valueAt(I)Ljava/lang/Object;
    .locals 1
    .parameter "index"
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    .prologue
    .line 232
    .local p0, this:Landroid/support/v4/util/LongSparseArray;,"Landroid/support/v4/util/LongSparseArray<TE;>;"
    iget-boolean v0, p0, Landroid/support/v4/util/LongSparseArray;->mGarbage:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 233
    invoke-direct {p0}, Landroid/support/v4/util/LongSparseArray;->gc()V

    .line 236
    :cond_0
    iget-object v0, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;

    #v0=(Reference);
    aget-object v0, v0, p1

    #v0=(Null);
    return-object v0
.end method

*/}
