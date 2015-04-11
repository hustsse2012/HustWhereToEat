package android.support.v4.view; class GestureDetectorCompat$GestureDetectorCompatImplBase {/*

.class Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;
.super Ljava/lang/Object;
.source "GestureDetectorCompat.java"

# interfaces
.implements Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImpl;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/view/GestureDetectorCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "GestureDetectorCompatImplBase"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase$GestureHandler;
    }
.end annotation


# static fields
#the value of this static final field might be set in the static constructor
.field private static final DOUBLE_TAP_TIMEOUT:I = 0x0

#the value of this static final field might be set in the static constructor
.field private static final LONGPRESS_TIMEOUT:I = 0x0

.field private static final LONG_PRESS:I = 0x2

.field private static final SHOW_PRESS:I = 0x1

.field private static final TAP:I = 0x3

.field private static final TAP_TIMEOUT:I


# instance fields
.field private mAlwaysInBiggerTapRegion:Z

.field private mAlwaysInTapRegion:Z

.field private mCurrentDownEvent:Landroid/view/MotionEvent;

.field private mDoubleTapListener:Landroid/view/GestureDetector$OnDoubleTapListener;

.field private mDoubleTapSlopSquare:I

.field private mDownFocusX:F

.field private mDownFocusY:F

.field private final mHandler:Landroid/os/Handler;

.field private mInLongPress:Z

.field private mIsDoubleTapping:Z

.field private mIsLongpressEnabled:Z

.field private mLastFocusX:F

.field private mLastFocusY:F

.field private final mListener:Landroid/view/GestureDetector$OnGestureListener;

.field private mMaximumFlingVelocity:I

.field private mMinimumFlingVelocity:I

.field private mPreviousUpEvent:Landroid/view/MotionEvent;

.field private mStillDown:Z

.field private mTouchSlopSquare:I

.field private mVelocityTracker:Landroid/view/VelocityTracker;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 62
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    move-result v0

    #v0=(Integer);
    sput v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->LONGPRESS_TIMEOUT:I

    .line 63
    invoke-static {}, Landroid/view/ViewConfiguration;->getTapTimeout()I

    move-result v0

    sput v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->TAP_TIMEOUT:I

    .line 64
    invoke-static {}, Landroid/view/ViewConfiguration;->getDoubleTapTimeout()I

    move-result v0

    sput v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->DOUBLE_TAP_TIMEOUT:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;Landroid/os/Handler;)V
    .locals 1
    .parameter "context"
    .parameter "listener"
    .parameter "handler"

    .prologue
    .line 147
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 148
    #p0=(Reference);
    if-eqz p3, :cond_1

    .line 149
    new-instance v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase$GestureHandler;

    #v0=(UninitRef);
    invoke-direct {v0, p0, p3}, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase$GestureHandler;-><init>(Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;Landroid/os/Handler;)V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mHandler:Landroid/os/Handler;

    .line 153
    :goto_0
    iput-object p2, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mListener:Landroid/view/GestureDetector$OnGestureListener;

    .line 154
    instance-of v0, p2, Landroid/view/GestureDetector$OnDoubleTapListener;

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 155
    check-cast p2, Landroid/view/GestureDetector$OnDoubleTapListener;

    .end local p2
    invoke-virtual {p0, p2}, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->setOnDoubleTapListener(Landroid/view/GestureDetector$OnDoubleTapListener;)V

    .line 157
    :cond_0
    invoke-direct {p0, p1}, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->init(Landroid/content/Context;)V

    .line 158
    return-void

    .line 151
    .restart local p2
    :cond_1
    #v0=(Uninit);
    new-instance v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase$GestureHandler;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase$GestureHandler;-><init>(Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;)V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mHandler:Landroid/os/Handler;

    goto :goto_0
.end method

.method static synthetic access$000(Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;)Landroid/view/MotionEvent;
    .locals 1
    .parameter "x0"

    .prologue
    .line 56
    iget-object v0, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mCurrentDownEvent:Landroid/view/MotionEvent;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$100(Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;)Landroid/view/GestureDetector$OnGestureListener;
    .locals 1
    .parameter "x0"

    .prologue
    .line 56
    iget-object v0, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mListener:Landroid/view/GestureDetector$OnGestureListener;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$200(Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;)V
    .locals 0
    .parameter "x0"

    .prologue
    .line 56
    invoke-direct {p0}, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->dispatchLongPress()V

    return-void
.end method

.method static synthetic access$300(Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;)Landroid/view/GestureDetector$OnDoubleTapListener;
    .locals 1
    .parameter "x0"

    .prologue
    .line 56
    iget-object v0, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mDoubleTapListener:Landroid/view/GestureDetector$OnDoubleTapListener;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$400(Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;)Z
    .locals 1
    .parameter "x0"

    .prologue
    .line 56
    iget-boolean v0, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mStillDown:Z

    #v0=(Boolean);
    return v0
.end method

.method private cancel()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 400
    #v2=(Null);
    iget-object v0, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mHandler:Landroid/os/Handler;

    #v0=(Reference);
    const/4 v1, 0x1

    #v1=(One);
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 401
    iget-object v0, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mHandler:Landroid/os/Handler;

    const/4 v1, 0x2

    #v1=(PosByte);
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 402
    iget-object v0, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mHandler:Landroid/os/Handler;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 403
    iget-object v0, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mVelocityTracker:Landroid/view/VelocityTracker;

    invoke-virtual {v0}, Landroid/view/VelocityTracker;->recycle()V

    .line 404
    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mVelocityTracker:Landroid/view/VelocityTracker;

    .line 405
    iput-boolean v2, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mIsDoubleTapping:Z

    .line 406
    iput-boolean v2, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mStillDown:Z

    .line 407
    iput-boolean v2, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mAlwaysInTapRegion:Z

    .line 408
    iput-boolean v2, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mAlwaysInBiggerTapRegion:Z

    .line 409
    iget-boolean v0, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mInLongPress:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 410
    iput-boolean v2, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mInLongPress:Z

    .line 412
    :cond_0
    return-void
.end method

.method private cancelTaps()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 415
    #v2=(Null);
    iget-object v0, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mHandler:Landroid/os/Handler;

    #v0=(Reference);
    const/4 v1, 0x1

    #v1=(One);
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 416
    iget-object v0, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mHandler:Landroid/os/Handler;

    const/4 v1, 0x2

    #v1=(PosByte);
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 417
    iget-object v0, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mHandler:Landroid/os/Handler;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 418
    iput-boolean v2, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mIsDoubleTapping:Z

    .line 419
    iput-boolean v2, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mAlwaysInTapRegion:Z

    .line 420
    iput-boolean v2, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mAlwaysInBiggerTapRegion:Z

    .line 421
    iget-boolean v0, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mInLongPress:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 422
    iput-boolean v2, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mInLongPress:Z

    .line 424
    :cond_0
    return-void
.end method

.method private dispatchLongPress()V
    .locals 2

    .prologue
    .line 442
    iget-object v0, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mHandler:Landroid/os/Handler;

    #v0=(Reference);
    const/4 v1, 0x3

    #v1=(PosByte);
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    .line 443
    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mInLongPress:Z

    .line 444
    iget-object v0, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mListener:Landroid/view/GestureDetector$OnGestureListener;

    #v0=(Reference);
    iget-object v1, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mCurrentDownEvent:Landroid/view/MotionEvent;

    #v1=(Reference);
    invoke-interface {v0, v1}, Landroid/view/GestureDetector$OnGestureListener;->onLongPress(Landroid/view/MotionEvent;)V

    .line 445
    return-void
.end method

.method private init(Landroid/content/Context;)V
    .locals 5
    .parameter "context"

    .prologue
    .line 161
    if-nez p1, :cond_0

    .line 162
    new-instance v3, Ljava/lang/IllegalArgumentException;

    #v3=(UninitRef);
    const-string v4, "Context must not be null"

    #v4=(Reference);
    invoke-direct {v3, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    #v3=(Reference);
    throw v3

    .line 164
    :cond_0
    #v3=(Uninit);v4=(Uninit);
    iget-object v3, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mListener:Landroid/view/GestureDetector$OnGestureListener;

    #v3=(Reference);
    if-nez v3, :cond_1

    .line 165
    new-instance v3, Ljava/lang/IllegalArgumentException;

    #v3=(UninitRef);
    const-string v4, "OnGestureListener must not be null"

    #v4=(Reference);
    invoke-direct {v3, v4}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    #v3=(Reference);
    throw v3

    .line 167
    :cond_1
    #v4=(Uninit);
    const/4 v3, 0x1

    #v3=(One);
    iput-boolean v3, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mIsLongpressEnabled:Z

    .line 169
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v0

    .line 170
    .local v0, configuration:Landroid/view/ViewConfiguration;
    #v0=(Reference);
    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v2

    .line 171
    .local v2, touchSlop:I
    #v2=(Integer);
    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledDoubleTapSlop()I

    move-result v1

    .line 172
    .local v1, doubleTapSlop:I
    #v1=(Integer);
    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledMinimumFlingVelocity()I

    move-result v3

    #v3=(Integer);
    iput v3, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mMinimumFlingVelocity:I

    .line 173
    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledMaximumFlingVelocity()I

    move-result v3

    iput v3, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mMaximumFlingVelocity:I

    .line 175
    mul-int v3, v2, v2

    iput v3, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mTouchSlopSquare:I

    .line 176
    mul-int v3, v1, v1

    iput v3, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mDoubleTapSlopSquare:I

    .line 177
    return-void
.end method

.method private isConsideredDoubleTap(Landroid/view/MotionEvent;Landroid/view/MotionEvent;Landroid/view/MotionEvent;)Z
    .locals 7
    .parameter "firstDown"
    .parameter "firstUp"
    .parameter "secondDown"

    .prologue
    const/4 v2, 0x0

    .line 428
    #v2=(Null);
    iget-boolean v3, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mAlwaysInBiggerTapRegion:Z

    #v3=(Boolean);
    if-nez v3, :cond_1

    .line 438
    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Boolean);v3=(Integer);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    return v2

    .line 432
    :cond_1
    #v0=(Uninit);v1=(Uninit);v2=(Null);v3=(Boolean);v4=(Uninit);v5=(Uninit);v6=(Uninit);
    invoke-virtual {p3}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v3

    #v3=(LongLo);v4=(LongHi);
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getEventTime()J

    move-result-wide v5

    #v5=(LongLo);v6=(LongHi);
    sub-long/2addr v3, v5

    sget v5, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->DOUBLE_TAP_TIMEOUT:I

    #v5=(Integer);
    int-to-long v5, v5

    #v5=(LongLo);
    cmp-long v3, v3, v5

    #v3=(Byte);
    if-gtz v3, :cond_0

    .line 436
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    #v3=(Float);
    float-to-int v3, v3

    #v3=(Integer);
    invoke-virtual {p3}, Landroid/view/MotionEvent;->getX()F

    move-result v4

    #v4=(Float);
    float-to-int v4, v4

    #v4=(Integer);
    sub-int v0, v3, v4

    .line 437
    .local v0, deltaX:I
    #v0=(Integer);
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v3

    #v3=(Float);
    float-to-int v3, v3

    #v3=(Integer);
    invoke-virtual {p3}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    #v4=(Float);
    float-to-int v4, v4

    #v4=(Integer);
    sub-int v1, v3, v4

    .line 438
    .local v1, deltaY:I
    #v1=(Integer);
    mul-int v3, v0, v0

    mul-int v4, v1, v1

    add-int/2addr v3, v4

    iget v4, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mDoubleTapSlopSquare:I

    if-ge v3, v4, :cond_0

    const/4 v2, 0x1

    #v2=(One);
    goto :goto_0
.end method


# virtual methods
.method public isLongpressEnabled()Z
    .locals 1

    .prologue
    .line 207
    iget-boolean v0, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mIsLongpressEnabled:Z

    #v0=(Boolean);
    return v0
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 41
    .parameter "ev"

    .prologue
    .line 219
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v5

    .line 221
    .local v5, action:I
    #v5=(Integer);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mVelocityTracker:Landroid/view/VelocityTracker;

    move-object/from16 v35, v0

    #v35=(Reference);
    if-nez v35, :cond_0

    .line 222
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v35

    move-object/from16 v0, v35

    move-object/from16 v1, p0

    #v1=(Reference);
    iput-object v0, v1, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mVelocityTracker:Landroid/view/VelocityTracker;

    .line 224
    :cond_0
    #v1=(Conflicted);
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mVelocityTracker:Landroid/view/VelocityTracker;

    move-object/from16 v35, v0

    move-object/from16 v0, v35

    move-object/from16 v1, p1

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 226
    and-int/lit16 v0, v5, 0xff

    #v0=(Integer);
    move/from16 v35, v0

    #v35=(Integer);
    const/16 v36, 0x6

    #v36=(PosByte);
    move/from16 v0, v35

    move/from16 v1, v36

    #v1=(PosByte);
    if-ne v0, v1, :cond_1

    const/16 v21, 0x1

    .line 228
    .local v21, pointerUp:Z
    :goto_0
    #v21=(Boolean);
    if-eqz v21, :cond_2

    invoke-static/range {p1 .. p1}, Landroid/support/v4/view/MotionEventCompat;->getActionIndex(Landroid/view/MotionEvent;)I

    move-result v24

    .line 231
    .local v24, skipIndex:I
    :goto_1
    #v24=(Integer);
    const/16 v25, 0x0

    .local v25, sumX:F
    #v25=(Null);
    const/16 v26, 0x0

    .line 232
    .local v26, sumY:F
    #v26=(Null);
    invoke-static/range {p1 .. p1}, Landroid/support/v4/view/MotionEventCompat;->getPointerCount(Landroid/view/MotionEvent;)I

    move-result v6

    .line 233
    .local v6, count:I
    #v6=(Integer);
    const/16 v17, 0x0

    .local v17, i:I
    :goto_2
    #v0=(Conflicted);v1=(Integer);v17=(Integer);v25=(Float);v26=(Float);
    move/from16 v0, v17

    #v0=(Integer);
    if-ge v0, v6, :cond_4

    .line 234
    move/from16 v0, v24

    move/from16 v1, v17

    if-ne v0, v1, :cond_3

    .line 233
    :goto_3
    #v0=(Conflicted);
    add-int/lit8 v17, v17, 0x1

    goto :goto_2

    .line 226
    .end local v6           #count:I
    .end local v17           #i:I
    .end local v21           #pointerUp:Z
    .end local v24           #skipIndex:I
    .end local v25           #sumX:F
    .end local v26           #sumY:F
    :cond_1
    #v0=(Integer);v1=(PosByte);v6=(Uninit);v17=(Uninit);v21=(Uninit);v24=(Uninit);v25=(Uninit);v26=(Uninit);
    const/16 v21, 0x0

    #v21=(Null);
    goto :goto_0

    .line 228
    .restart local v21       #pointerUp:Z
    :cond_2
    #v21=(Boolean);
    const/16 v24, -0x1

    #v24=(Byte);
    goto :goto_1

    .line 235
    .restart local v6       #count:I
    .restart local v17       #i:I
    .restart local v24       #skipIndex:I
    .restart local v25       #sumX:F
    .restart local v26       #sumY:F
    :cond_3
    #v1=(Integer);v6=(Integer);v17=(Integer);v24=(Integer);v25=(Float);v26=(Float);
    move-object/from16 v0, p1

    #v0=(Reference);
    move/from16 v1, v17

    invoke-static {v0, v1}, Landroid/support/v4/view/MotionEventCompat;->getX(Landroid/view/MotionEvent;I)F

    move-result v35

    #v35=(Float);
    add-float v25, v25, v35

    .line 236
    move-object/from16 v0, p1

    move/from16 v1, v17

    invoke-static {v0, v1}, Landroid/support/v4/view/MotionEventCompat;->getY(Landroid/view/MotionEvent;I)F

    move-result v35

    add-float v26, v26, v35

    goto :goto_3

    .line 238
    :cond_4
    #v0=(Integer);v35=(Integer);
    if-eqz v21, :cond_6

    add-int/lit8 v11, v6, -0x1

    .line 239
    .local v11, div:I
    :goto_4
    #v11=(Integer);
    int-to-float v0, v11

    #v0=(Float);
    move/from16 v35, v0

    #v35=(Float);
    div-float v13, v25, v35

    .line 240
    .local v13, focusX:F
    #v13=(Float);
    int-to-float v0, v11

    move/from16 v35, v0

    div-float v14, v26, v35

    .line 242
    .local v14, focusY:F
    #v14=(Float);
    const/16 v16, 0x0

    .line 244
    .local v16, handled:Z
    #v16=(Null);
    and-int/lit16 v0, v5, 0xff

    #v0=(Integer);
    move/from16 v35, v0

    #v35=(Integer);
    packed-switch v35, :pswitch_data_0

    .line 396
    :cond_5
    :goto_5
    :pswitch_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v12=(Conflicted);v15=(Conflicted);v16=(Boolean);v18=(Conflicted);v19=(Conflicted);v20=(Conflicted);v22=(Conflicted);v23=(Conflicted);v27=(Conflicted);v28=(Conflicted);v29=(Conflicted);v30=(Conflicted);v31=(Conflicted);v32=(Conflicted);v33=(Conflicted);v34=(Conflicted);v35=(Conflicted);v36=(Conflicted);v37=(Conflicted);v38=(Conflicted);v39=(Conflicted);v40=(Conflicted);
    return v16

    .end local v11           #div:I
    .end local v13           #focusX:F
    .end local v14           #focusY:F
    .end local v16           #handled:Z
    :cond_6
    #v0=(Integer);v1=(Integer);v2=(Uninit);v3=(Uninit);v4=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v18=(Uninit);v19=(Uninit);v20=(Uninit);v22=(Uninit);v23=(Uninit);v27=(Uninit);v28=(Uninit);v29=(Uninit);v30=(Uninit);v31=(Uninit);v32=(Uninit);v33=(Uninit);v34=(Uninit);v35=(Integer);v36=(PosByte);v37=(Uninit);v38=(Uninit);v39=(Uninit);v40=(Uninit);
    move v11, v6

    .line 238
    #v11=(Integer);
    goto :goto_4

    .line 246
    .restart local v11       #div:I
    .restart local v13       #focusX:F
    .restart local v14       #focusY:F
    .restart local v16       #handled:Z
    :pswitch_1
    #v13=(Float);v14=(Float);v16=(Null);
    move-object/from16 v0, p0

    #v0=(Reference);
    iput v13, v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mLastFocusX:F

    move-object/from16 v0, p0

    iput v13, v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mDownFocusX:F

    .line 247
    move-object/from16 v0, p0

    iput v14, v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mLastFocusY:F

    move-object/from16 v0, p0

    iput v14, v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mDownFocusY:F

    .line 249
    invoke-direct/range {p0 .. p0}, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->cancelTaps()V

    goto :goto_5

    .line 253
    :pswitch_2
    #v0=(Integer);
    move-object/from16 v0, p0

    #v0=(Reference);
    iput v13, v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mLastFocusX:F

    move-object/from16 v0, p0

    iput v13, v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mDownFocusX:F

    .line 254
    move-object/from16 v0, p0

    iput v14, v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mLastFocusY:F

    move-object/from16 v0, p0

    iput v14, v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mDownFocusY:F

    .line 258
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mVelocityTracker:Landroid/view/VelocityTracker;

    move-object/from16 v35, v0

    #v35=(Reference);
    const/16 v36, 0x3e8

    #v36=(PosShort);
    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mMaximumFlingVelocity:I

    #v0=(Integer);
    move/from16 v37, v0

    #v37=(Integer);
    move/from16 v0, v37

    int-to-float v0, v0

    #v0=(Float);
    move/from16 v37, v0

    #v37=(Float);
    invoke-virtual/range {v35 .. v37}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V

    .line 259
    invoke-static/range {p1 .. p1}, Landroid/support/v4/view/MotionEventCompat;->getActionIndex(Landroid/view/MotionEvent;)I

    move-result v27

    .line 260
    .local v27, upIndex:I
    #v27=(Integer);
    move-object/from16 v0, p1

    #v0=(Reference);
    move/from16 v1, v27

    invoke-static {v0, v1}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I

    move-result v18

    .line 261
    .local v18, id1:I
    #v18=(Integer);
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mVelocityTracker:Landroid/view/VelocityTracker;

    move-object/from16 v35, v0

    move-object/from16 v0, v35

    move/from16 v1, v18

    invoke-static {v0, v1}, Landroid/support/v4/view/VelocityTrackerCompat;->getXVelocity(Landroid/view/VelocityTracker;I)F

    move-result v32

    .line 262
    .local v32, x1:F
    #v32=(Float);
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mVelocityTracker:Landroid/view/VelocityTracker;

    move-object/from16 v35, v0

    move-object/from16 v0, v35

    move/from16 v1, v18

    invoke-static {v0, v1}, Landroid/support/v4/view/VelocityTrackerCompat;->getYVelocity(Landroid/view/VelocityTracker;I)F

    move-result v34

    .line 263
    .local v34, y1:F
    #v34=(Float);
    const/16 v17, 0x0

    :goto_6
    #v0=(Conflicted);v12=(Conflicted);v19=(Conflicted);v31=(Conflicted);v33=(Conflicted);v35=(Conflicted);
    move/from16 v0, v17

    #v0=(Integer);
    if-ge v0, v6, :cond_5

    .line 264
    move/from16 v0, v17

    move/from16 v1, v27

    if-ne v0, v1, :cond_8

    .line 263
    :cond_7
    #v0=(Conflicted);
    add-int/lit8 v17, v17, 0x1

    goto :goto_6

    .line 266
    :cond_8
    #v0=(Integer);
    move-object/from16 v0, p1

    #v0=(Reference);
    move/from16 v1, v17

    invoke-static {v0, v1}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I

    move-result v19

    .line 267
    .local v19, id2:I
    #v19=(Integer);
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mVelocityTracker:Landroid/view/VelocityTracker;

    move-object/from16 v35, v0

    #v35=(Reference);
    move-object/from16 v0, v35

    move/from16 v1, v19

    invoke-static {v0, v1}, Landroid/support/v4/view/VelocityTrackerCompat;->getXVelocity(Landroid/view/VelocityTracker;I)F

    move-result v35

    #v35=(Float);
    mul-float v31, v32, v35

    .line 268
    .local v31, x:F
    #v31=(Float);
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mVelocityTracker:Landroid/view/VelocityTracker;

    move-object/from16 v35, v0

    #v35=(Reference);
    move-object/from16 v0, v35

    move/from16 v1, v19

    invoke-static {v0, v1}, Landroid/support/v4/view/VelocityTrackerCompat;->getYVelocity(Landroid/view/VelocityTracker;I)F

    move-result v35

    #v35=(Float);
    mul-float v33, v34, v35

    .line 270
    .local v33, y:F
    #v33=(Float);
    add-float v12, v31, v33

    .line 271
    .local v12, dot:F
    #v12=(Float);
    const/16 v35, 0x0

    #v35=(Null);
    cmpg-float v35, v12, v35

    #v35=(Byte);
    if-gez v35, :cond_7

    .line 272
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mVelocityTracker:Landroid/view/VelocityTracker;

    move-object/from16 v35, v0

    #v35=(Reference);
    invoke-virtual/range {v35 .. v35}, Landroid/view/VelocityTracker;->clear()V

    goto/16 :goto_5

    .line 279
    .end local v12           #dot:F
    .end local v18           #id1:I
    .end local v19           #id2:I
    .end local v27           #upIndex:I
    .end local v31           #x:F
    .end local v32           #x1:F
    .end local v33           #y:F
    .end local v34           #y1:F
    :pswitch_3
    #v0=(Integer);v12=(Uninit);v18=(Uninit);v19=(Uninit);v27=(Uninit);v31=(Uninit);v32=(Uninit);v33=(Uninit);v34=(Uninit);v35=(Integer);v36=(PosByte);v37=(Uninit);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mDoubleTapListener:Landroid/view/GestureDetector$OnDoubleTapListener;

    move-object/from16 v35, v0

    #v35=(Reference);
    if-eqz v35, :cond_a

    .line 280
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mHandler:Landroid/os/Handler;

    move-object/from16 v35, v0

    const/16 v36, 0x3

    invoke-virtual/range {v35 .. v36}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v15

    .line 281
    .local v15, hadTapMessage:Z
    #v15=(Boolean);
    if-eqz v15, :cond_9

    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mHandler:Landroid/os/Handler;

    move-object/from16 v35, v0

    const/16 v36, 0x3

    invoke-virtual/range {v35 .. v36}, Landroid/os/Handler;->removeMessages(I)V

    .line 282
    :cond_9
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mCurrentDownEvent:Landroid/view/MotionEvent;

    move-object/from16 v35, v0

    if-eqz v35, :cond_d

    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mPreviousUpEvent:Landroid/view/MotionEvent;

    move-object/from16 v35, v0

    if-eqz v35, :cond_d

    if-eqz v15, :cond_d

    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mCurrentDownEvent:Landroid/view/MotionEvent;

    move-object/from16 v35, v0

    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mPreviousUpEvent:Landroid/view/MotionEvent;

    move-object/from16 v36, v0

    #v36=(Reference);
    move-object/from16 v0, p0

    move-object/from16 v1, v35

    #v1=(Reference);
    move-object/from16 v2, v36

    #v2=(Reference);
    move-object/from16 v3, p1

    #v3=(Reference);
    invoke-direct {v0, v1, v2, v3}, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->isConsideredDoubleTap(Landroid/view/MotionEvent;Landroid/view/MotionEvent;Landroid/view/MotionEvent;)Z

    move-result v35

    #v35=(Boolean);
    if-eqz v35, :cond_d

    .line 285
    const/16 v35, 0x1

    #v35=(One);
    move/from16 v0, v35

    #v0=(One);
    move-object/from16 v1, p0

    iput-boolean v0, v1, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mIsDoubleTapping:Z

    .line 287
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mDoubleTapListener:Landroid/view/GestureDetector$OnDoubleTapListener;

    move-object/from16 v35, v0

    #v35=(Reference);
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mCurrentDownEvent:Landroid/view/MotionEvent;

    move-object/from16 v36, v0

    invoke-interface/range {v35 .. v36}, Landroid/view/GestureDetector$OnDoubleTapListener;->onDoubleTap(Landroid/view/MotionEvent;)Z

    move-result v35

    #v35=(Boolean);
    or-int v16, v16, v35

    .line 289
    #v16=(Boolean);
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mDoubleTapListener:Landroid/view/GestureDetector$OnDoubleTapListener;

    move-object/from16 v35, v0

    #v35=(Reference);
    move-object/from16 v0, v35

    move-object/from16 v1, p1

    invoke-interface {v0, v1}, Landroid/view/GestureDetector$OnDoubleTapListener;->onDoubleTapEvent(Landroid/view/MotionEvent;)Z

    move-result v35

    #v35=(Boolean);
    or-int v16, v16, v35

    .line 296
    .end local v15           #hadTapMessage:Z
    :cond_a
    :goto_7
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v15=(Conflicted);v35=(Conflicted);v36=(Conflicted);v37=(Conflicted);v38=(Conflicted);
    move-object/from16 v0, p0

    #v0=(Reference);
    iput v13, v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mLastFocusX:F

    move-object/from16 v0, p0

    iput v13, v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mDownFocusX:F

    .line 297
    move-object/from16 v0, p0

    iput v14, v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mLastFocusY:F

    move-object/from16 v0, p0

    iput v14, v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mDownFocusY:F

    .line 298
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mCurrentDownEvent:Landroid/view/MotionEvent;

    move-object/from16 v35, v0

    #v35=(Reference);
    if-eqz v35, :cond_b

    .line 299
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mCurrentDownEvent:Landroid/view/MotionEvent;

    move-object/from16 v35, v0

    invoke-virtual/range {v35 .. v35}, Landroid/view/MotionEvent;->recycle()V

    .line 301
    :cond_b
    invoke-static/range {p1 .. p1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v35

    move-object/from16 v0, v35

    move-object/from16 v1, p0

    #v1=(Reference);
    iput-object v0, v1, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mCurrentDownEvent:Landroid/view/MotionEvent;

    .line 302
    const/16 v35, 0x1

    #v35=(One);
    move/from16 v0, v35

    #v0=(One);
    move-object/from16 v1, p0

    iput-boolean v0, v1, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mAlwaysInTapRegion:Z

    .line 303
    const/16 v35, 0x1

    move/from16 v0, v35

    move-object/from16 v1, p0

    iput-boolean v0, v1, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mAlwaysInBiggerTapRegion:Z

    .line 304
    const/16 v35, 0x1

    move/from16 v0, v35

    move-object/from16 v1, p0

    iput-boolean v0, v1, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mStillDown:Z

    .line 305
    const/16 v35, 0x0

    #v35=(Null);
    move/from16 v0, v35

    #v0=(Null);
    move-object/from16 v1, p0

    iput-boolean v0, v1, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mInLongPress:Z

    .line 307
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-boolean v0, v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mIsLongpressEnabled:Z

    #v0=(Boolean);
    move/from16 v35, v0

    #v35=(Boolean);
    if-eqz v35, :cond_c

    .line 308
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mHandler:Landroid/os/Handler;

    move-object/from16 v35, v0

    #v35=(Reference);
    const/16 v36, 0x2

    #v36=(PosByte);
    invoke-virtual/range {v35 .. v36}, Landroid/os/Handler;->removeMessages(I)V

    .line 309
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mHandler:Landroid/os/Handler;

    move-object/from16 v35, v0

    const/16 v36, 0x2

    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mCurrentDownEvent:Landroid/view/MotionEvent;

    move-object/from16 v37, v0

    #v37=(Reference);
    invoke-virtual/range {v37 .. v37}, Landroid/view/MotionEvent;->getDownTime()J

    move-result-wide v37

    #v37=(LongLo);v38=(LongHi);
    sget v39, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->TAP_TIMEOUT:I

    #v39=(Integer);
    move/from16 v0, v39

    #v0=(Integer);
    int-to-long v0, v0

    #v0=(LongLo);v1=(LongHi);
    move-wide/from16 v39, v0

    #v39=(LongLo);v40=(LongHi);
    add-long v37, v37, v39

    sget v39, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->LONGPRESS_TIMEOUT:I

    #v39=(Integer);
    move/from16 v0, v39

    #v0=(Integer);
    int-to-long v0, v0

    #v0=(LongLo);
    move-wide/from16 v39, v0

    #v39=(LongLo);
    add-long v37, v37, v39

    invoke-virtual/range {v35 .. v38}, Landroid/os/Handler;->sendEmptyMessageAtTime(IJ)Z

    .line 312
    :cond_c
    #v0=(Conflicted);v1=(Conflicted);v35=(Conflicted);v36=(Conflicted);v37=(Conflicted);v38=(Conflicted);v39=(Conflicted);v40=(Conflicted);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mHandler:Landroid/os/Handler;

    move-object/from16 v35, v0

    #v35=(Reference);
    const/16 v36, 0x1

    #v36=(One);
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mCurrentDownEvent:Landroid/view/MotionEvent;

    move-object/from16 v37, v0

    #v37=(Reference);
    invoke-virtual/range {v37 .. v37}, Landroid/view/MotionEvent;->getDownTime()J

    move-result-wide v37

    #v37=(LongLo);v38=(LongHi);
    sget v39, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->TAP_TIMEOUT:I

    #v39=(Integer);
    move/from16 v0, v39

    #v0=(Integer);
    int-to-long v0, v0

    #v0=(LongLo);v1=(LongHi);
    move-wide/from16 v39, v0

    #v39=(LongLo);v40=(LongHi);
    add-long v37, v37, v39

    invoke-virtual/range {v35 .. v38}, Landroid/os/Handler;->sendEmptyMessageAtTime(IJ)Z

    .line 313
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mListener:Landroid/view/GestureDetector$OnGestureListener;

    move-object/from16 v35, v0

    move-object/from16 v0, v35

    move-object/from16 v1, p1

    #v1=(Reference);
    invoke-interface {v0, v1}, Landroid/view/GestureDetector$OnGestureListener;->onDown(Landroid/view/MotionEvent;)Z

    move-result v35

    #v35=(Boolean);
    or-int v16, v16, v35

    .line 314
    goto/16 :goto_5

    .line 292
    .restart local v15       #hadTapMessage:Z
    :cond_d
    #v1=(Conflicted);v15=(Boolean);v16=(Null);v35=(Conflicted);v36=(Conflicted);v37=(Uninit);v38=(Uninit);v39=(Uninit);v40=(Uninit);
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mHandler:Landroid/os/Handler;

    move-object/from16 v35, v0

    #v35=(Reference);
    const/16 v36, 0x3

    #v36=(PosByte);
    sget v37, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->DOUBLE_TAP_TIMEOUT:I

    #v37=(Integer);
    move/from16 v0, v37

    #v0=(Integer);
    int-to-long v0, v0

    #v0=(LongLo);v1=(LongHi);
    move-wide/from16 v37, v0

    #v37=(LongLo);v38=(LongHi);
    invoke-virtual/range {v35 .. v38}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    goto/16 :goto_7

    .line 317
    .end local v15           #hadTapMessage:Z
    :pswitch_4
    #v0=(Integer);v1=(Integer);v2=(Uninit);v3=(Uninit);v15=(Uninit);v35=(Integer);v37=(Uninit);v38=(Uninit);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-boolean v0, v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mInLongPress:Z

    #v0=(Boolean);
    move/from16 v35, v0

    #v35=(Boolean);
    if-nez v35, :cond_5

    .line 320
    move-object/from16 v0, p0

    #v0=(Reference);
    iget v0, v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mLastFocusX:F

    #v0=(Integer);
    move/from16 v35, v0

    #v35=(Integer);
    sub-float v22, v35, v13

    .line 321
    .local v22, scrollX:F
    #v22=(Float);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget v0, v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mLastFocusY:F

    #v0=(Integer);
    move/from16 v35, v0

    sub-float v23, v35, v14

    .line 322
    .local v23, scrollY:F
    #v23=(Float);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-boolean v0, v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mIsDoubleTapping:Z

    #v0=(Boolean);
    move/from16 v35, v0

    #v35=(Boolean);
    if-eqz v35, :cond_e

    .line 324
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mDoubleTapListener:Landroid/view/GestureDetector$OnDoubleTapListener;

    move-object/from16 v35, v0

    #v35=(Reference);
    move-object/from16 v0, v35

    move-object/from16 v1, p1

    #v1=(Reference);
    invoke-interface {v0, v1}, Landroid/view/GestureDetector$OnDoubleTapListener;->onDoubleTapEvent(Landroid/view/MotionEvent;)Z

    move-result v35

    #v35=(Boolean);
    or-int v16, v16, v35

    #v16=(Boolean);
    goto/16 :goto_5

    .line 325
    :cond_e
    #v0=(Boolean);v1=(Integer);v16=(Null);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-boolean v0, v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mAlwaysInTapRegion:Z

    #v0=(Boolean);
    move/from16 v35, v0

    if-eqz v35, :cond_10

    .line 326
    move-object/from16 v0, p0

    #v0=(Reference);
    iget v0, v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mDownFocusX:F

    #v0=(Integer);
    move/from16 v35, v0

    #v35=(Integer);
    sub-float v35, v13, v35

    #v35=(Float);
    move/from16 v0, v35

    #v0=(Float);
    float-to-int v8, v0

    .line 327
    .local v8, deltaX:I
    #v8=(Integer);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget v0, v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mDownFocusY:F

    #v0=(Integer);
    move/from16 v35, v0

    #v35=(Integer);
    sub-float v35, v14, v35

    #v35=(Float);
    move/from16 v0, v35

    #v0=(Float);
    float-to-int v9, v0

    .line 328
    .local v9, deltaY:I
    #v9=(Integer);
    mul-int v35, v8, v8

    #v35=(Integer);
    mul-int v36, v9, v9

    #v36=(Integer);
    add-int v10, v35, v36

    .line 329
    .local v10, distance:I
    #v10=(Integer);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget v0, v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mTouchSlopSquare:I

    #v0=(Integer);
    move/from16 v35, v0

    move/from16 v0, v35

    if-le v10, v0, :cond_f

    .line 330
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mListener:Landroid/view/GestureDetector$OnGestureListener;

    move-object/from16 v35, v0

    #v35=(Reference);
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mCurrentDownEvent:Landroid/view/MotionEvent;

    move-object/from16 v36, v0

    #v36=(Reference);
    move-object/from16 v0, v35

    move-object/from16 v1, v36

    #v1=(Reference);
    move-object/from16 v2, p1

    #v2=(Reference);
    move/from16 v3, v22

    #v3=(Float);
    move/from16 v4, v23

    #v4=(Float);
    invoke-interface {v0, v1, v2, v3, v4}, Landroid/view/GestureDetector$OnGestureListener;->onScroll(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z

    move-result v16

    .line 331
    #v16=(Boolean);
    move-object/from16 v0, p0

    iput v13, v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mLastFocusX:F

    .line 332
    move-object/from16 v0, p0

    iput v14, v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mLastFocusY:F

    .line 333
    const/16 v35, 0x0

    #v35=(Null);
    move/from16 v0, v35

    #v0=(Null);
    move-object/from16 v1, p0

    iput-boolean v0, v1, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mAlwaysInTapRegion:Z

    .line 334
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mHandler:Landroid/os/Handler;

    move-object/from16 v35, v0

    #v35=(Reference);
    const/16 v36, 0x3

    #v36=(PosByte);
    invoke-virtual/range {v35 .. v36}, Landroid/os/Handler;->removeMessages(I)V

    .line 335
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mHandler:Landroid/os/Handler;

    move-object/from16 v35, v0

    const/16 v36, 0x1

    #v36=(One);
    invoke-virtual/range {v35 .. v36}, Landroid/os/Handler;->removeMessages(I)V

    .line 336
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mHandler:Landroid/os/Handler;

    move-object/from16 v35, v0

    const/16 v36, 0x2

    #v36=(PosByte);
    invoke-virtual/range {v35 .. v36}, Landroid/os/Handler;->removeMessages(I)V

    .line 338
    :cond_f
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v35=(Conflicted);v36=(Integer);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget v0, v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mTouchSlopSquare:I

    #v0=(Integer);
    move/from16 v35, v0

    #v35=(Integer);
    move/from16 v0, v35

    if-le v10, v0, :cond_5

    .line 339
    const/16 v35, 0x0

    #v35=(Null);
    move/from16 v0, v35

    #v0=(Null);
    move-object/from16 v1, p0

    #v1=(Reference);
    iput-boolean v0, v1, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mAlwaysInBiggerTapRegion:Z

    goto/16 :goto_5

    .line 341
    .end local v8           #deltaX:I
    .end local v9           #deltaY:I
    .end local v10           #distance:I
    :cond_10
    #v0=(Boolean);v1=(Integer);v2=(Uninit);v3=(Uninit);v4=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v16=(Null);v35=(Boolean);v36=(PosByte);
    invoke-static/range {v22 .. v22}, Ljava/lang/Math;->abs(F)F

    move-result v35

    #v35=(Float);
    const/high16 v36, 0x3f80

    #v36=(Integer);
    cmpl-float v35, v35, v36

    #v35=(Byte);
    if-gez v35, :cond_11

    invoke-static/range {v23 .. v23}, Ljava/lang/Math;->abs(F)F

    move-result v35

    #v35=(Float);
    const/high16 v36, 0x3f80

    cmpl-float v35, v35, v36

    #v35=(Byte);
    if-ltz v35, :cond_5

    .line 342
    :cond_11
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mListener:Landroid/view/GestureDetector$OnGestureListener;

    move-object/from16 v35, v0

    #v35=(Reference);
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mCurrentDownEvent:Landroid/view/MotionEvent;

    move-object/from16 v36, v0

    #v36=(Reference);
    move-object/from16 v0, v35

    move-object/from16 v1, v36

    #v1=(Reference);
    move-object/from16 v2, p1

    #v2=(Reference);
    move/from16 v3, v22

    #v3=(Float);
    move/from16 v4, v23

    #v4=(Float);
    invoke-interface {v0, v1, v2, v3, v4}, Landroid/view/GestureDetector$OnGestureListener;->onScroll(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z

    move-result v16

    .line 343
    #v16=(Boolean);
    move-object/from16 v0, p0

    iput v13, v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mLastFocusX:F

    .line 344
    move-object/from16 v0, p0

    iput v14, v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mLastFocusY:F

    goto/16 :goto_5

    .line 349
    .end local v22           #scrollX:F
    .end local v23           #scrollY:F
    :pswitch_5
    #v0=(Integer);v1=(Integer);v2=(Uninit);v3=(Uninit);v4=(Uninit);v16=(Null);v22=(Uninit);v23=(Uninit);v35=(Integer);v36=(PosByte);
    const/16 v35, 0x0

    #v35=(Null);
    move/from16 v0, v35

    #v0=(Null);
    move-object/from16 v1, p0

    #v1=(Reference);
    iput-boolean v0, v1, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mStillDown:Z

    .line 350
    invoke-static/range {p1 .. p1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    move-result-object v7

    .line 351
    .local v7, currentUpEvent:Landroid/view/MotionEvent;
    #v7=(Reference);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-boolean v0, v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mIsDoubleTapping:Z

    #v0=(Boolean);
    move/from16 v35, v0

    #v35=(Boolean);
    if-eqz v35, :cond_15

    .line 353
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mDoubleTapListener:Landroid/view/GestureDetector$OnDoubleTapListener;

    move-object/from16 v35, v0

    #v35=(Reference);
    move-object/from16 v0, v35

    move-object/from16 v1, p1

    invoke-interface {v0, v1}, Landroid/view/GestureDetector$OnDoubleTapListener;->onDoubleTapEvent(Landroid/view/MotionEvent;)Z

    move-result v35

    #v35=(Boolean);
    or-int v16, v16, v35

    .line 375
    :cond_12
    :goto_8
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v16=(Boolean);v20=(Conflicted);v28=(Conflicted);v29=(Conflicted);v30=(Conflicted);v35=(Conflicted);v36=(Conflicted);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mPreviousUpEvent:Landroid/view/MotionEvent;

    move-object/from16 v35, v0

    #v35=(Reference);
    if-eqz v35, :cond_13

    .line 376
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mPreviousUpEvent:Landroid/view/MotionEvent;

    move-object/from16 v35, v0

    invoke-virtual/range {v35 .. v35}, Landroid/view/MotionEvent;->recycle()V

    .line 379
    :cond_13
    move-object/from16 v0, p0

    iput-object v7, v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mPreviousUpEvent:Landroid/view/MotionEvent;

    .line 380
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mVelocityTracker:Landroid/view/VelocityTracker;

    move-object/from16 v35, v0

    if-eqz v35, :cond_14

    .line 383
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mVelocityTracker:Landroid/view/VelocityTracker;

    move-object/from16 v35, v0

    invoke-virtual/range {v35 .. v35}, Landroid/view/VelocityTracker;->recycle()V

    .line 384
    const/16 v35, 0x0

    #v35=(Null);
    move-object/from16 v0, v35

    #v0=(Null);
    move-object/from16 v1, p0

    #v1=(Reference);
    iput-object v0, v1, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mVelocityTracker:Landroid/view/VelocityTracker;

    .line 386
    :cond_14
    #v0=(Reference);v1=(Conflicted);v35=(Reference);
    const/16 v35, 0x0

    #v35=(Null);
    move/from16 v0, v35

    #v0=(Null);
    move-object/from16 v1, p0

    #v1=(Reference);
    iput-boolean v0, v1, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mIsDoubleTapping:Z

    .line 387
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mHandler:Landroid/os/Handler;

    move-object/from16 v35, v0

    #v35=(Reference);
    const/16 v36, 0x1

    #v36=(One);
    invoke-virtual/range {v35 .. v36}, Landroid/os/Handler;->removeMessages(I)V

    .line 388
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mHandler:Landroid/os/Handler;

    move-object/from16 v35, v0

    const/16 v36, 0x2

    #v36=(PosByte);
    invoke-virtual/range {v35 .. v36}, Landroid/os/Handler;->removeMessages(I)V

    goto/16 :goto_5

    .line 354
    :cond_15
    #v0=(Boolean);v2=(Uninit);v3=(Uninit);v4=(Uninit);v16=(Null);v20=(Uninit);v28=(Uninit);v29=(Uninit);v30=(Uninit);v35=(Boolean);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-boolean v0, v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mInLongPress:Z

    #v0=(Boolean);
    move/from16 v35, v0

    if-eqz v35, :cond_16

    .line 355
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mHandler:Landroid/os/Handler;

    move-object/from16 v35, v0

    #v35=(Reference);
    const/16 v36, 0x3

    invoke-virtual/range {v35 .. v36}, Landroid/os/Handler;->removeMessages(I)V

    .line 356
    const/16 v35, 0x0

    #v35=(Null);
    move/from16 v0, v35

    #v0=(Null);
    move-object/from16 v1, p0

    iput-boolean v0, v1, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mInLongPress:Z

    goto :goto_8

    .line 357
    :cond_16
    #v0=(Boolean);v35=(Boolean);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-boolean v0, v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mAlwaysInTapRegion:Z

    #v0=(Boolean);
    move/from16 v35, v0

    if-eqz v35, :cond_17

    .line 358
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mListener:Landroid/view/GestureDetector$OnGestureListener;

    move-object/from16 v35, v0

    #v35=(Reference);
    move-object/from16 v0, v35

    move-object/from16 v1, p1

    invoke-interface {v0, v1}, Landroid/view/GestureDetector$OnGestureListener;->onSingleTapUp(Landroid/view/MotionEvent;)Z

    move-result v16

    #v16=(Boolean);
    goto :goto_8

    .line 362
    :cond_17
    #v0=(Boolean);v16=(Null);v35=(Boolean);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mVelocityTracker:Landroid/view/VelocityTracker;

    move-object/from16 v28, v0

    .line 363
    .local v28, velocityTracker:Landroid/view/VelocityTracker;
    #v28=(Reference);
    const/16 v35, 0x0

    #v35=(Null);
    move-object/from16 v0, p1

    move/from16 v1, v35

    #v1=(Null);
    invoke-static {v0, v1}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I

    move-result v20

    .line 364
    .local v20, pointerId:I
    #v20=(Integer);
    const/16 v35, 0x3e8

    #v35=(PosShort);
    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mMaximumFlingVelocity:I

    #v0=(Integer);
    move/from16 v36, v0

    #v36=(Integer);
    move/from16 v0, v36

    int-to-float v0, v0

    #v0=(Float);
    move/from16 v36, v0

    #v36=(Float);
    move-object/from16 v0, v28

    #v0=(Reference);
    move/from16 v1, v35

    #v1=(PosShort);
    move/from16 v2, v36

    #v2=(Float);
    invoke-virtual {v0, v1, v2}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V

    .line 365
    move-object/from16 v0, v28

    move/from16 v1, v20

    #v1=(Integer);
    invoke-static {v0, v1}, Landroid/support/v4/view/VelocityTrackerCompat;->getYVelocity(Landroid/view/VelocityTracker;I)F

    move-result v30

    .line 367
    .local v30, velocityY:F
    #v30=(Float);
    move-object/from16 v0, v28

    move/from16 v1, v20

    invoke-static {v0, v1}, Landroid/support/v4/view/VelocityTrackerCompat;->getXVelocity(Landroid/view/VelocityTracker;I)F

    move-result v29

    .line 370
    .local v29, velocityX:F
    #v29=(Float);
    invoke-static/range {v30 .. v30}, Ljava/lang/Math;->abs(F)F

    move-result v35

    #v35=(Float);
    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mMinimumFlingVelocity:I

    #v0=(Integer);
    move/from16 v36, v0

    #v36=(Integer);
    move/from16 v0, v36

    int-to-float v0, v0

    #v0=(Float);
    move/from16 v36, v0

    #v36=(Float);
    cmpl-float v35, v35, v36

    #v35=(Byte);
    if-gtz v35, :cond_18

    invoke-static/range {v29 .. v29}, Ljava/lang/Math;->abs(F)F

    move-result v35

    #v35=(Float);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget v0, v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mMinimumFlingVelocity:I

    #v0=(Integer);
    move/from16 v36, v0

    #v36=(Integer);
    move/from16 v0, v36

    int-to-float v0, v0

    #v0=(Float);
    move/from16 v36, v0

    #v36=(Float);
    cmpl-float v35, v35, v36

    #v35=(Byte);
    if-lez v35, :cond_12

    .line 372
    :cond_18
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mListener:Landroid/view/GestureDetector$OnGestureListener;

    move-object/from16 v35, v0

    #v35=(Reference);
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mCurrentDownEvent:Landroid/view/MotionEvent;

    move-object/from16 v36, v0

    #v36=(Reference);
    move-object/from16 v0, v35

    move-object/from16 v1, v36

    #v1=(Reference);
    move-object/from16 v2, p1

    #v2=(Reference);
    move/from16 v3, v29

    #v3=(Float);
    move/from16 v4, v30

    #v4=(Float);
    invoke-interface {v0, v1, v2, v3, v4}, Landroid/view/GestureDetector$OnGestureListener;->onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z

    move-result v16

    #v16=(Boolean);
    goto/16 :goto_8

    .line 392
    .end local v7           #currentUpEvent:Landroid/view/MotionEvent;
    .end local v20           #pointerId:I
    .end local v28           #velocityTracker:Landroid/view/VelocityTracker;
    .end local v29           #velocityX:F
    .end local v30           #velocityY:F
    :pswitch_6
    #v0=(Integer);v1=(Integer);v2=(Uninit);v3=(Uninit);v4=(Uninit);v7=(Uninit);v16=(Null);v20=(Uninit);v28=(Uninit);v29=(Uninit);v30=(Uninit);v35=(Integer);v36=(PosByte);
    invoke-direct/range {p0 .. p0}, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->cancel()V

    goto/16 :goto_5

    .line 244
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_5
        :pswitch_4
        :pswitch_6
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public setIsLongpressEnabled(Z)V
    .locals 0
    .parameter "isLongpressEnabled"

    .prologue
    .line 200
    iput-boolean p1, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mIsLongpressEnabled:Z

    .line 201
    return-void
.end method

.method public setOnDoubleTapListener(Landroid/view/GestureDetector$OnDoubleTapListener;)V
    .locals 0
    .parameter "onDoubleTapListener"

    .prologue
    .line 187
    iput-object p1, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;->mDoubleTapListener:Landroid/view/GestureDetector$OnDoubleTapListener;

    .line 188
    return-void
.end method

*/}
