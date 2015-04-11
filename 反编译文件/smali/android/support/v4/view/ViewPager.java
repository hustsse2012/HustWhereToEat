package android.support.v4.view; class ViewPager {/*

.class public Landroid/support/v4/view/ViewPager;
.super Landroid/view/ViewGroup;
.source "ViewPager.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/view/ViewPager$ViewPositionComparator;,
        Landroid/support/v4/view/ViewPager$LayoutParams;,
        Landroid/support/v4/view/ViewPager$PagerObserver;,
        Landroid/support/v4/view/ViewPager$MyAccessibilityDelegate;,
        Landroid/support/v4/view/ViewPager$SavedState;,
        Landroid/support/v4/view/ViewPager$Decor;,
        Landroid/support/v4/view/ViewPager$OnAdapterChangeListener;,
        Landroid/support/v4/view/ViewPager$PageTransformer;,
        Landroid/support/v4/view/ViewPager$SimpleOnPageChangeListener;,
        Landroid/support/v4/view/ViewPager$OnPageChangeListener;,
        Landroid/support/v4/view/ViewPager$ItemInfo;
    }
.end annotation


# static fields
.field private static final CLOSE_ENOUGH:I = 0x2

.field private static final COMPARATOR:Ljava/util/Comparator; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator",
            "<",
            "Landroid/support/v4/view/ViewPager$ItemInfo;",
            ">;"
        }
    .end annotation
.end field

.field private static final DEBUG:Z = false

.field private static final DEFAULT_GUTTER_SIZE:I = 0x10

.field private static final DEFAULT_OFFSCREEN_PAGES:I = 0x1

.field private static final DRAW_ORDER_DEFAULT:I = 0x0

.field private static final DRAW_ORDER_FORWARD:I = 0x1

.field private static final DRAW_ORDER_REVERSE:I = 0x2

.field private static final INVALID_POINTER:I = -0x1

.field private static final LAYOUT_ATTRS:[I = null

.field private static final MAX_SETTLE_DURATION:I = 0x258

.field private static final MIN_DISTANCE_FOR_FLING:I = 0x19

.field private static final MIN_FLING_VELOCITY:I = 0x190

.field public static final SCROLL_STATE_DRAGGING:I = 0x1

.field public static final SCROLL_STATE_IDLE:I = 0x0

.field public static final SCROLL_STATE_SETTLING:I = 0x2

.field private static final TAG:Ljava/lang/String; = "ViewPager"

.field private static final USE_CACHE:Z

.field private static final sInterpolator:Landroid/view/animation/Interpolator;

.field private static final sPositionComparator:Landroid/support/v4/view/ViewPager$ViewPositionComparator;


# instance fields
.field private mActivePointerId:I

.field private mAdapter:Landroid/support/v4/view/PagerAdapter;

.field private mAdapterChangeListener:Landroid/support/v4/view/ViewPager$OnAdapterChangeListener;

.field private mBottomPageBounds:I

.field private mCalledSuper:Z

.field private mChildHeightMeasureSpec:I

.field private mChildWidthMeasureSpec:I

.field private mCloseEnough:I

.field private mCurItem:I

.field private mDecorChildCount:I

.field private mDefaultGutterSize:I

.field private mDrawingOrder:I

.field private mDrawingOrderedChildren:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field private final mEndScrollRunnable:Ljava/lang/Runnable;

.field private mFakeDragBeginTime:J

.field private mFakeDragging:Z

.field private mFirstLayout:Z

.field private mFirstOffset:F

.field private mFlingDistance:I

.field private mGutterSize:I

.field private mIgnoreGutter:Z

.field private mInLayout:Z

.field private mInitialMotionX:F

.field private mInitialMotionY:F

.field private mInternalPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;

.field private mIsBeingDragged:Z

.field private mIsUnableToDrag:Z

.field private final mItems:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/v4/view/ViewPager$ItemInfo;",
            ">;"
        }
    .end annotation
.end field

.field private mLastMotionX:F

.field private mLastMotionY:F

.field private mLastOffset:F

.field private mLeftEdge:Landroid/support/v4/widget/EdgeEffectCompat;

.field private mMarginDrawable:Landroid/graphics/drawable/Drawable;

.field private mMaximumVelocity:I

.field private mMinimumVelocity:I

.field private mNeedCalculatePageOffsets:Z

.field private mObserver:Landroid/support/v4/view/ViewPager$PagerObserver;

.field private mOffscreenPageLimit:I

.field private mOnPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;

.field private mPageMargin:I

.field private mPageTransformer:Landroid/support/v4/view/ViewPager$PageTransformer;

.field private mPopulatePending:Z

.field private mRestoredAdapterState:Landroid/os/Parcelable;

.field private mRestoredClassLoader:Ljava/lang/ClassLoader;

.field private mRestoredCurItem:I

.field private mRightEdge:Landroid/support/v4/widget/EdgeEffectCompat;

.field private mScrollState:I

.field private mScroller:Landroid/widget/Scroller;

.field private mScrollingCacheEnabled:Z

.field private mSetChildrenDrawingOrderEnabled:Ljava/lang/reflect/Method;

.field private final mTempItem:Landroid/support/v4/view/ViewPager$ItemInfo;

.field private final mTempRect:Landroid/graphics/Rect;

.field private mTopPageBounds:I

.field private mTouchSlop:I

.field private mVelocityTracker:Landroid/view/VelocityTracker;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 98
    const/4 v0, 0x1

    #v0=(One);
    new-array v0, v0, [I

    #v0=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    const v2, 0x10100b3

    #v2=(Integer);
    aput v2, v0, v1

    sput-object v0, Landroid/support/v4/view/ViewPager;->LAYOUT_ATTRS:[I

    .line 110
    new-instance v0, Landroid/support/v4/view/ViewPager$1;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/support/v4/view/ViewPager$1;-><init>()V

    #v0=(Reference);
    sput-object v0, Landroid/support/v4/view/ViewPager;->COMPARATOR:Ljava/util/Comparator;

    .line 117
    new-instance v0, Landroid/support/v4/view/ViewPager$2;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/support/v4/view/ViewPager$2;-><init>()V

    #v0=(Reference);
    sput-object v0, Landroid/support/v4/view/ViewPager;->sInterpolator:Landroid/view/animation/Interpolator;

    .line 217
    new-instance v0, Landroid/support/v4/view/ViewPager$ViewPositionComparator;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/support/v4/view/ViewPager$ViewPositionComparator;-><init>()V

    #v0=(Reference);
    sput-object v0, Landroid/support/v4/view/ViewPager;->sPositionComparator:Landroid/support/v4/view/ViewPager$ViewPositionComparator;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 5
    .parameter "context"

    .prologue
    const/4 v4, 0x0

    #v4=(Null);
    const/4 v3, 0x1

    #v3=(One);
    const/4 v2, 0x0

    #v2=(Null);
    const/4 v1, -0x1

    .line 338
    #v1=(Byte);
    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    .line 124
    #p0=(Reference);
    new-instance v0, Ljava/util/ArrayList;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;

    .line 125
    new-instance v0, Landroid/support/v4/view/ViewPager$ItemInfo;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/support/v4/view/ViewPager$ItemInfo;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/view/ViewPager;->mTempItem:Landroid/support/v4/view/ViewPager$ItemInfo;

    .line 127
    new-instance v0, Landroid/graphics/Rect;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/view/ViewPager;->mTempRect:Landroid/graphics/Rect;

    .line 131
    iput v1, p0, Landroid/support/v4/view/ViewPager;->mRestoredCurItem:I

    .line 132
    iput-object v4, p0, Landroid/support/v4/view/ViewPager;->mRestoredAdapterState:Landroid/os/Parcelable;

    .line 133
    iput-object v4, p0, Landroid/support/v4/view/ViewPager;->mRestoredClassLoader:Ljava/lang/ClassLoader;

    .line 145
    const v0, -0x800001

    #v0=(Integer);
    iput v0, p0, Landroid/support/v4/view/ViewPager;->mFirstOffset:F

    .line 146
    const v0, 0x7f7fffff

    iput v0, p0, Landroid/support/v4/view/ViewPager;->mLastOffset:F

    .line 155
    iput v3, p0, Landroid/support/v4/view/ViewPager;->mOffscreenPageLimit:I

    .line 174
    iput v1, p0, Landroid/support/v4/view/ViewPager;->mActivePointerId:I

    .line 201
    iput-boolean v3, p0, Landroid/support/v4/view/ViewPager;->mFirstLayout:Z

    .line 202
    iput-boolean v2, p0, Landroid/support/v4/view/ViewPager;->mNeedCalculatePageOffsets:Z

    .line 235
    new-instance v0, Landroid/support/v4/view/ViewPager$3;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Landroid/support/v4/view/ViewPager$3;-><init>(Landroid/support/v4/view/ViewPager;)V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/view/ViewPager;->mEndScrollRunnable:Ljava/lang/Runnable;

    .line 242
    iput v2, p0, Landroid/support/v4/view/ViewPager;->mScrollState:I

    .line 339
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->initViewPager()V

    .line 340
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 5
    .parameter "context"
    .parameter "attrs"

    .prologue
    const/4 v4, 0x0

    #v4=(Null);
    const/4 v3, 0x1

    #v3=(One);
    const/4 v2, 0x0

    #v2=(Null);
    const/4 v1, -0x1

    .line 343
    #v1=(Byte);
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 124
    #p0=(Reference);
    new-instance v0, Ljava/util/ArrayList;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;

    .line 125
    new-instance v0, Landroid/support/v4/view/ViewPager$ItemInfo;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/support/v4/view/ViewPager$ItemInfo;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/view/ViewPager;->mTempItem:Landroid/support/v4/view/ViewPager$ItemInfo;

    .line 127
    new-instance v0, Landroid/graphics/Rect;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/view/ViewPager;->mTempRect:Landroid/graphics/Rect;

    .line 131
    iput v1, p0, Landroid/support/v4/view/ViewPager;->mRestoredCurItem:I

    .line 132
    iput-object v4, p0, Landroid/support/v4/view/ViewPager;->mRestoredAdapterState:Landroid/os/Parcelable;

    .line 133
    iput-object v4, p0, Landroid/support/v4/view/ViewPager;->mRestoredClassLoader:Ljava/lang/ClassLoader;

    .line 145
    const v0, -0x800001

    #v0=(Integer);
    iput v0, p0, Landroid/support/v4/view/ViewPager;->mFirstOffset:F

    .line 146
    const v0, 0x7f7fffff

    iput v0, p0, Landroid/support/v4/view/ViewPager;->mLastOffset:F

    .line 155
    iput v3, p0, Landroid/support/v4/view/ViewPager;->mOffscreenPageLimit:I

    .line 174
    iput v1, p0, Landroid/support/v4/view/ViewPager;->mActivePointerId:I

    .line 201
    iput-boolean v3, p0, Landroid/support/v4/view/ViewPager;->mFirstLayout:Z

    .line 202
    iput-boolean v2, p0, Landroid/support/v4/view/ViewPager;->mNeedCalculatePageOffsets:Z

    .line 235
    new-instance v0, Landroid/support/v4/view/ViewPager$3;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Landroid/support/v4/view/ViewPager$3;-><init>(Landroid/support/v4/view/ViewPager;)V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/view/ViewPager;->mEndScrollRunnable:Ljava/lang/Runnable;

    .line 242
    iput v2, p0, Landroid/support/v4/view/ViewPager;->mScrollState:I

    .line 344
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->initViewPager()V

    .line 345
    return-void
.end method

.method static synthetic access$000(Landroid/support/v4/view/ViewPager;I)V
    .locals 0
    .parameter "x0"
    .parameter "x1"

    .prologue
    .line 84
    invoke-direct {p0, p1}, Landroid/support/v4/view/ViewPager;->setScrollState(I)V

    return-void
.end method

.method static synthetic access$200(Landroid/support/v4/view/ViewPager;)Landroid/support/v4/view/PagerAdapter;
    .locals 1
    .parameter "x0"

    .prologue
    .line 84
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$300(Landroid/support/v4/view/ViewPager;)I
    .locals 1
    .parameter "x0"

    .prologue
    .line 84
    iget v0, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I

    #v0=(Integer);
    return v0
.end method

.method static synthetic access$400()[I
    .locals 1

    .prologue
    .line 84
    sget-object v0, Landroid/support/v4/view/ViewPager;->LAYOUT_ATTRS:[I

    #v0=(Reference);
    return-object v0
.end method

.method private calculatePageOffsets(Landroid/support/v4/view/ViewPager$ItemInfo;ILandroid/support/v4/view/ViewPager$ItemInfo;)V
    .locals 14
    .parameter "curItem"
    .parameter "curIndex"
    .parameter "oldCurInfo"

    .prologue
    .line 1060
    iget-object v12, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;

    #v12=(Reference);
    invoke-virtual {v12}, Landroid/support/v4/view/PagerAdapter;->getCount()I

    move-result v1

    .line 1061
    .local v1, N:I
    #v1=(Integer);
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getWidth()I

    move-result v11

    .line 1062
    .local v11, width:I
    #v11=(Integer);
    if-lez v11, :cond_0

    iget v12, p0, Landroid/support/v4/view/ViewPager;->mPageMargin:I

    #v12=(Integer);
    int-to-float v12, v12

    #v12=(Float);
    int-to-float v13, v11

    #v13=(Float);
    div-float v6, v12, v13

    .line 1064
    .local v6, marginOffset:F
    :goto_0
    #v6=(Float);v12=(Conflicted);v13=(Conflicted);
    if-eqz p3, :cond_6

    .line 1065
    move-object/from16 v0, p3

    #v0=(Reference);
    iget v8, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I

    .line 1067
    .local v8, oldCurPosition:I
    #v8=(Integer);
    iget v12, p1, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I

    #v12=(Integer);
    if-ge v8, v12, :cond_3

    .line 1068
    const/4 v5, 0x0

    .line 1069
    .local v5, itemIndex:I
    #v5=(Null);
    const/4 v3, 0x0

    .line 1070
    .local v3, ii:Landroid/support/v4/view/ViewPager$ItemInfo;
    #v3=(Null);
    move-object/from16 v0, p3

    iget v12, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F

    move-object/from16 v0, p3

    iget v13, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F

    #v13=(Integer);
    add-float/2addr v12, v13

    #v12=(Float);
    add-float v7, v12, v6

    .line 1071
    .local v7, offset:F
    #v7=(Float);
    add-int/lit8 v9, v8, 0x1

    .line 1072
    .local v9, pos:I
    :goto_1
    #v3=(Reference);v5=(Integer);v9=(Integer);
    iget v12, p1, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I

    #v12=(Integer);
    if-gt v9, v12, :cond_6

    iget-object v12, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;

    #v12=(Reference);
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    move-result v12

    #v12=(Integer);
    if-ge v5, v12, :cond_6

    .line 1073
    iget-object v12, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;

    #v12=(Reference);
    invoke-virtual {v12, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    .end local v3           #ii:Landroid/support/v4/view/ViewPager$ItemInfo;
    check-cast v3, Landroid/support/v4/view/ViewPager$ItemInfo;

    .line 1074
    .restart local v3       #ii:Landroid/support/v4/view/ViewPager$ItemInfo;
    :goto_2
    iget v12, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I

    #v12=(Integer);
    if-le v9, v12, :cond_1

    iget-object v12, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;

    #v12=(Reference);
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    move-result v12

    #v12=(Integer);
    add-int/lit8 v12, v12, -0x1

    if-ge v5, v12, :cond_1

    .line 1075
    add-int/lit8 v5, v5, 0x1

    .line 1076
    iget-object v12, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;

    #v12=(Reference);
    invoke-virtual {v12, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    .end local v3           #ii:Landroid/support/v4/view/ViewPager$ItemInfo;
    check-cast v3, Landroid/support/v4/view/ViewPager$ItemInfo;

    .restart local v3       #ii:Landroid/support/v4/view/ViewPager$ItemInfo;
    goto :goto_2

    .line 1062
    .end local v3           #ii:Landroid/support/v4/view/ViewPager$ItemInfo;
    .end local v5           #itemIndex:I
    .end local v6           #marginOffset:F
    .end local v7           #offset:F
    .end local v8           #oldCurPosition:I
    .end local v9           #pos:I
    :cond_0
    #v0=(Uninit);v3=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v13=(Uninit);
    const/4 v6, 0x0

    #v6=(Null);
    goto :goto_0

    .line 1078
    .restart local v3       #ii:Landroid/support/v4/view/ViewPager$ItemInfo;
    .restart local v5       #itemIndex:I
    .restart local v6       #marginOffset:F
    .restart local v7       #offset:F
    .restart local v8       #oldCurPosition:I
    .restart local v9       #pos:I
    :cond_1
    :goto_3
    #v0=(Reference);v3=(Reference);v5=(Integer);v6=(Float);v7=(Float);v8=(Integer);v9=(Integer);v12=(Integer);v13=(Integer);
    iget v12, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I

    if-ge v9, v12, :cond_2

    .line 1081
    iget-object v12, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;

    #v12=(Reference);
    invoke-virtual {v12, v9}, Landroid/support/v4/view/PagerAdapter;->getPageWidth(I)F

    move-result v12

    #v12=(Float);
    add-float/2addr v12, v6

    add-float/2addr v7, v12

    .line 1082
    add-int/lit8 v9, v9, 0x1

    goto :goto_3

    .line 1084
    :cond_2
    #v12=(Integer);
    iput v7, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F

    .line 1085
    iget v12, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F

    add-float/2addr v12, v6

    #v12=(Float);
    add-float/2addr v7, v12

    .line 1072
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    .line 1087
    .end local v3           #ii:Landroid/support/v4/view/ViewPager$ItemInfo;
    .end local v5           #itemIndex:I
    .end local v7           #offset:F
    .end local v9           #pos:I
    :cond_3
    #v3=(Uninit);v5=(Uninit);v7=(Uninit);v9=(Uninit);v12=(Integer);v13=(Conflicted);
    iget v12, p1, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I

    if-le v8, v12, :cond_6

    .line 1088
    iget-object v12, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;

    #v12=(Reference);
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    move-result v12

    #v12=(Integer);
    add-int/lit8 v5, v12, -0x1

    .line 1089
    .restart local v5       #itemIndex:I
    #v5=(Integer);
    const/4 v3, 0x0

    .line 1090
    .restart local v3       #ii:Landroid/support/v4/view/ViewPager$ItemInfo;
    #v3=(Null);
    move-object/from16 v0, p3

    iget v7, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F

    .line 1091
    .restart local v7       #offset:F
    #v7=(Integer);
    add-int/lit8 v9, v8, -0x1

    .line 1092
    .restart local v9       #pos:I
    :goto_4
    #v3=(Reference);v9=(Integer);
    iget v12, p1, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I

    if-lt v9, v12, :cond_6

    if-ltz v5, :cond_6

    .line 1093
    iget-object v12, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;

    #v12=(Reference);
    invoke-virtual {v12, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    .end local v3           #ii:Landroid/support/v4/view/ViewPager$ItemInfo;
    check-cast v3, Landroid/support/v4/view/ViewPager$ItemInfo;

    .line 1094
    .restart local v3       #ii:Landroid/support/v4/view/ViewPager$ItemInfo;
    :goto_5
    iget v12, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I

    #v12=(Integer);
    if-ge v9, v12, :cond_4

    if-lez v5, :cond_4

    .line 1095
    add-int/lit8 v5, v5, -0x1

    .line 1096
    iget-object v12, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;

    #v12=(Reference);
    invoke-virtual {v12, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    .end local v3           #ii:Landroid/support/v4/view/ViewPager$ItemInfo;
    check-cast v3, Landroid/support/v4/view/ViewPager$ItemInfo;

    .restart local v3       #ii:Landroid/support/v4/view/ViewPager$ItemInfo;
    goto :goto_5

    .line 1098
    :cond_4
    :goto_6
    #v12=(Integer);
    iget v12, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I

    if-le v9, v12, :cond_5

    .line 1101
    iget-object v12, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;

    #v12=(Reference);
    invoke-virtual {v12, v9}, Landroid/support/v4/view/PagerAdapter;->getPageWidth(I)F

    move-result v12

    #v12=(Float);
    add-float/2addr v12, v6

    sub-float/2addr v7, v12

    .line 1102
    #v7=(Float);
    add-int/lit8 v9, v9, -0x1

    goto :goto_6

    .line 1104
    :cond_5
    #v7=(Integer);v12=(Integer);
    iget v12, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F

    add-float/2addr v12, v6

    #v12=(Float);
    sub-float/2addr v7, v12

    .line 1105
    #v7=(Float);
    iput v7, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F

    .line 1092
    add-int/lit8 v9, v9, -0x1

    goto :goto_4

    .line 1111
    .end local v3           #ii:Landroid/support/v4/view/ViewPager$ItemInfo;
    .end local v5           #itemIndex:I
    .end local v7           #offset:F
    .end local v8           #oldCurPosition:I
    .end local v9           #pos:I
    :cond_6
    #v0=(Conflicted);v3=(Conflicted);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v12=(Conflicted);
    iget-object v12, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;

    #v12=(Reference);
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    move-result v4

    .line 1112
    .local v4, itemCount:I
    #v4=(Integer);
    iget v7, p1, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F

    .line 1113
    .restart local v7       #offset:F
    #v7=(Integer);
    iget v12, p1, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I

    #v12=(Integer);
    add-int/lit8 v9, v12, -0x1

    .line 1114
    .restart local v9       #pos:I
    #v9=(Integer);
    iget v12, p1, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I

    if-nez v12, :cond_7

    iget v12, p1, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F

    :goto_7
    iput v12, p0, Landroid/support/v4/view/ViewPager;->mFirstOffset:F

    .line 1115
    iget v12, p1, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I

    add-int/lit8 v13, v1, -0x1

    #v13=(Integer);
    if-ne v12, v13, :cond_8

    iget v12, p1, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F

    iget v13, p1, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F

    add-float/2addr v12, v13

    #v12=(Float);
    const/high16 v13, 0x3f80

    sub-float/2addr v12, v13

    :goto_8
    #v12=(Integer);
    iput v12, p0, Landroid/support/v4/view/ViewPager;->mLastOffset:F

    .line 1118
    add-int/lit8 v2, p2, -0x1

    .local v2, i:I
    :goto_9
    #v2=(Integer);v10=(Conflicted);
    if-ltz v2, :cond_b

    .line 1119
    iget-object v12, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;

    #v12=(Reference);
    invoke-virtual {v12, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    #v3=(Reference);
    check-cast v3, Landroid/support/v4/view/ViewPager$ItemInfo;

    .line 1120
    .restart local v3       #ii:Landroid/support/v4/view/ViewPager$ItemInfo;
    :goto_a
    #v12=(Conflicted);
    iget v12, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I

    #v12=(Integer);
    if-le v9, v12, :cond_9

    .line 1121
    iget-object v12, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;

    #v12=(Reference);
    add-int/lit8 v10, v9, -0x1

    .end local v9           #pos:I
    .local v10, pos:I
    #v10=(Integer);
    invoke-virtual {v12, v9}, Landroid/support/v4/view/PagerAdapter;->getPageWidth(I)F

    move-result v12

    #v12=(Float);
    add-float/2addr v12, v6

    sub-float/2addr v7, v12

    #v7=(Float);
    move v9, v10

    .end local v10           #pos:I
    .restart local v9       #pos:I
    goto :goto_a

    .line 1114
    .end local v2           #i:I
    .end local v3           #ii:Landroid/support/v4/view/ViewPager$ItemInfo;
    :cond_7
    #v2=(Uninit);v3=(Conflicted);v7=(Integer);v10=(Uninit);v12=(Integer);v13=(Conflicted);
    const v12, -0x800001

    goto :goto_7

    .line 1115
    :cond_8
    #v13=(Integer);
    const v12, 0x7f7fffff

    goto :goto_8

    .line 1123
    .restart local v2       #i:I
    .restart local v3       #ii:Landroid/support/v4/view/ViewPager$ItemInfo;
    :cond_9
    #v2=(Integer);v3=(Reference);v10=(Conflicted);
    iget v12, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F

    add-float/2addr v12, v6

    #v12=(Float);
    sub-float/2addr v7, v12

    .line 1124
    #v7=(Float);
    iput v7, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F

    .line 1125
    iget v12, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I

    #v12=(Integer);
    if-nez v12, :cond_a

    iput v7, p0, Landroid/support/v4/view/ViewPager;->mFirstOffset:F

    .line 1118
    :cond_a
    add-int/lit8 v2, v2, -0x1

    add-int/lit8 v9, v9, -0x1

    goto :goto_9

    .line 1127
    .end local v3           #ii:Landroid/support/v4/view/ViewPager$ItemInfo;
    :cond_b
    #v3=(Conflicted);v7=(Integer);
    iget v12, p1, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F

    iget v13, p1, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F

    add-float/2addr v12, v13

    #v12=(Float);
    add-float v7, v12, v6

    .line 1128
    #v7=(Float);
    iget v12, p1, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I

    #v12=(Integer);
    add-int/lit8 v9, v12, 0x1

    .line 1130
    add-int/lit8 v2, p2, 0x1

    :goto_b
    if-ge v2, v4, :cond_e

    .line 1131
    iget-object v12, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;

    #v12=(Reference);
    invoke-virtual {v12, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    #v3=(Reference);
    check-cast v3, Landroid/support/v4/view/ViewPager$ItemInfo;

    .line 1132
    .restart local v3       #ii:Landroid/support/v4/view/ViewPager$ItemInfo;
    :goto_c
    #v12=(Conflicted);
    iget v12, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I

    #v12=(Integer);
    if-ge v9, v12, :cond_c

    .line 1133
    iget-object v12, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;

    #v12=(Reference);
    add-int/lit8 v10, v9, 0x1

    .end local v9           #pos:I
    .restart local v10       #pos:I
    #v10=(Integer);
    invoke-virtual {v12, v9}, Landroid/support/v4/view/PagerAdapter;->getPageWidth(I)F

    move-result v12

    #v12=(Float);
    add-float/2addr v12, v6

    add-float/2addr v7, v12

    move v9, v10

    .end local v10           #pos:I
    .restart local v9       #pos:I
    goto :goto_c

    .line 1135
    :cond_c
    #v10=(Conflicted);v12=(Integer);
    iget v12, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I

    add-int/lit8 v13, v1, -0x1

    if-ne v12, v13, :cond_d

    .line 1136
    iget v12, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F

    add-float/2addr v12, v7

    #v12=(Float);
    const/high16 v13, 0x3f80

    sub-float/2addr v12, v13

    iput v12, p0, Landroid/support/v4/view/ViewPager;->mLastOffset:F

    .line 1138
    :cond_d
    #v12=(Integer);
    iput v7, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F

    .line 1139
    iget v12, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F

    add-float/2addr v12, v6

    #v12=(Float);
    add-float/2addr v7, v12

    .line 1130
    add-int/lit8 v2, v2, 0x1

    add-int/lit8 v9, v9, 0x1

    goto :goto_b

    .line 1142
    .end local v3           #ii:Landroid/support/v4/view/ViewPager$ItemInfo;
    :cond_e
    #v3=(Conflicted);v12=(Integer);
    const/4 v12, 0x0

    #v12=(Null);
    iput-boolean v12, p0, Landroid/support/v4/view/ViewPager;->mNeedCalculatePageOffsets:Z

    .line 1143
    return-void
.end method

.method private completeScroll(Z)V
    .locals 10
    .parameter "postEvents"

    .prologue
    const/4 v7, 0x0

    .line 1671
    #v7=(Null);
    iget v8, p0, Landroid/support/v4/view/ViewPager;->mScrollState:I

    #v8=(Integer);
    const/4 v9, 0x2

    #v9=(PosByte);
    if-ne v8, v9, :cond_3

    const/4 v2, 0x1

    .line 1672
    .local v2, needPopulate:Z
    :goto_0
    #v2=(Boolean);
    if-eqz v2, :cond_1

    .line 1674
    invoke-direct {p0, v7}, Landroid/support/v4/view/ViewPager;->setScrollingCacheEnabled(Z)V

    .line 1675
    iget-object v8, p0, Landroid/support/v4/view/ViewPager;->mScroller:Landroid/widget/Scroller;

    #v8=(Reference);
    invoke-virtual {v8}, Landroid/widget/Scroller;->abortAnimation()V

    .line 1676
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getScrollX()I

    move-result v3

    .line 1677
    .local v3, oldX:I
    #v3=(Integer);
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getScrollY()I

    move-result v4

    .line 1678
    .local v4, oldY:I
    #v4=(Integer);
    iget-object v8, p0, Landroid/support/v4/view/ViewPager;->mScroller:Landroid/widget/Scroller;

    invoke-virtual {v8}, Landroid/widget/Scroller;->getCurrX()I

    move-result v5

    .line 1679
    .local v5, x:I
    #v5=(Integer);
    iget-object v8, p0, Landroid/support/v4/view/ViewPager;->mScroller:Landroid/widget/Scroller;

    invoke-virtual {v8}, Landroid/widget/Scroller;->getCurrY()I

    move-result v6

    .line 1680
    .local v6, y:I
    #v6=(Integer);
    if-ne v3, v5, :cond_0

    if-eq v4, v6, :cond_1

    .line 1681
    :cond_0
    invoke-virtual {p0, v5, v6}, Landroid/support/v4/view/ViewPager;->scrollTo(II)V

    .line 1684
    .end local v3           #oldX:I
    .end local v4           #oldY:I
    .end local v5           #x:I
    .end local v6           #y:I
    :cond_1
    #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v8=(Conflicted);
    iput-boolean v7, p0, Landroid/support/v4/view/ViewPager;->mPopulatePending:Z

    .line 1685
    const/4 v0, 0x0

    .local v0, i:I
    :goto_1
    #v0=(Integer);v1=(Conflicted);
    iget-object v8, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;

    #v8=(Reference);
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v8

    #v8=(Integer);
    if-ge v0, v8, :cond_4

    .line 1686
    iget-object v8, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;

    #v8=(Reference);
    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    #v1=(Reference);
    check-cast v1, Landroid/support/v4/view/ViewPager$ItemInfo;

    .line 1687
    .local v1, ii:Landroid/support/v4/view/ViewPager$ItemInfo;
    iget-boolean v8, v1, Landroid/support/v4/view/ViewPager$ItemInfo;->scrolling:Z

    #v8=(Boolean);
    if-eqz v8, :cond_2

    .line 1688
    const/4 v2, 0x1

    .line 1689
    #v2=(One);
    iput-boolean v7, v1, Landroid/support/v4/view/ViewPager$ItemInfo;->scrolling:Z

    .line 1685
    :cond_2
    #v2=(Boolean);
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .end local v0           #i:I
    .end local v1           #ii:Landroid/support/v4/view/ViewPager$ItemInfo;
    .end local v2           #needPopulate:Z
    :cond_3
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v8=(Integer);
    move v2, v7

    .line 1671
    #v2=(Null);
    goto :goto_0

    .line 1692
    .restart local v0       #i:I
    .restart local v2       #needPopulate:Z
    :cond_4
    #v0=(Integer);v1=(Conflicted);v2=(Boolean);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    if-eqz v2, :cond_5

    .line 1693
    if-eqz p1, :cond_6

    .line 1694
    iget-object v7, p0, Landroid/support/v4/view/ViewPager;->mEndScrollRunnable:Ljava/lang/Runnable;

    #v7=(Reference);
    invoke-static {p0, v7}, Landroid/support/v4/view/ViewCompat;->postOnAnimation(Landroid/view/View;Ljava/lang/Runnable;)V

    .line 1699
    :cond_5
    :goto_2
    return-void

    .line 1696
    :cond_6
    #v7=(Null);
    iget-object v7, p0, Landroid/support/v4/view/ViewPager;->mEndScrollRunnable:Ljava/lang/Runnable;

    #v7=(Reference);
    invoke-interface {v7}, Ljava/lang/Runnable;->run()V

    goto :goto_2
.end method

.method private determineTargetPage(IFII)I
    .locals 6
    .parameter "currentPage"
    .parameter "pageOffset"
    .parameter "velocity"
    .parameter "deltaX"

    .prologue
    .line 2072
    invoke-static {p4}, Ljava/lang/Math;->abs(I)I

    move-result v4

    #v4=(Integer);
    iget v5, p0, Landroid/support/v4/view/ViewPager;->mFlingDistance:I

    #v5=(Integer);
    if-le v4, v5, :cond_2

    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    move-result v4

    iget v5, p0, Landroid/support/v4/view/ViewPager;->mMinimumVelocity:I

    if-le v4, v5, :cond_2

    .line 2073
    if-lez p3, :cond_1

    move v2, p1

    .line 2079
    .local v2, targetPage:I
    :goto_0
    #v2=(Integer);v3=(Conflicted);
    iget-object v4, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;

    #v4=(Reference);
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    #v4=(Integer);
    if-lez v4, :cond_0

    .line 2080
    iget-object v4, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;

    #v4=(Reference);
    const/4 v5, 0x0

    #v5=(Null);
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Landroid/support/v4/view/ViewPager$ItemInfo;

    .line 2081
    .local v0, firstItem:Landroid/support/v4/view/ViewPager$ItemInfo;
    iget-object v4, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;

    iget-object v5, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;

    #v5=(Reference);
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v5

    #v5=(Integer);
    add-int/lit8 v5, v5, -0x1

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    #v1=(Reference);
    check-cast v1, Landroid/support/v4/view/ViewPager$ItemInfo;

    .line 2084
    .local v1, lastItem:Landroid/support/v4/view/ViewPager$ItemInfo;
    iget v4, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I

    #v4=(Integer);
    iget v5, v1, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I

    invoke-static {v2, v5}, Ljava/lang/Math;->min(II)I

    move-result v5

    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 2087
    .end local v0           #firstItem:Landroid/support/v4/view/ViewPager$ItemInfo;
    .end local v1           #lastItem:Landroid/support/v4/view/ViewPager$ItemInfo;
    :cond_0
    #v0=(Conflicted);v1=(Conflicted);
    return v2

    .line 2073
    .end local v2           #targetPage:I
    :cond_1
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);
    add-int/lit8 v2, p1, 0x1

    #v2=(Integer);
    goto :goto_0

    .line 2075
    :cond_2
    #v2=(Uninit);
    iget v4, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I

    if-lt p1, v4, :cond_3

    const v3, 0x3ecccccd

    .line 2076
    .local v3, truncator:F
    :goto_1
    #v3=(Integer);
    int-to-float v4, p1

    #v4=(Float);
    add-float/2addr v4, p2

    add-float/2addr v4, v3

    float-to-int v2, v4

    .restart local v2       #targetPage:I
    #v2=(Integer);
    goto :goto_0

    .line 2075
    .end local v2           #targetPage:I
    .end local v3           #truncator:F
    :cond_3
    #v2=(Uninit);v3=(Uninit);v4=(Integer);
    const v3, 0x3f19999a

    #v3=(Integer);
    goto :goto_1
.end method

.method private enableLayers(Z)V
    .locals 5
    .parameter "enable"

    .prologue
    .line 1706
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getChildCount()I

    move-result v0

    .line 1707
    .local v0, childCount:I
    #v0=(Integer);
    const/4 v1, 0x0

    .local v1, i:I
    :goto_0
    #v1=(Integer);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    if-ge v1, v0, :cond_1

    .line 1708
    if-eqz p1, :cond_0

    const/4 v2, 0x2

    .line 1710
    .local v2, layerType:I
    :goto_1
    #v2=(PosByte);
    invoke-virtual {p0, v1}, Landroid/support/v4/view/ViewPager;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    #v3=(Reference);
    const/4 v4, 0x0

    #v4=(Null);
    invoke-static {v3, v2, v4}, Landroid/support/v4/view/ViewCompat;->setLayerType(Landroid/view/View;ILandroid/graphics/Paint;)V

    .line 1707
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 1708
    .end local v2           #layerType:I
    :cond_0
    #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    const/4 v2, 0x0

    #v2=(Null);
    goto :goto_1

    .line 1712
    :cond_1
    #v2=(Conflicted);
    return-void
.end method

.method private endDrag()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 2320
    #v0=(Null);
    iput-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mIsBeingDragged:Z

    .line 2321
    iput-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mIsUnableToDrag:Z

    .line 2323
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;

    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 2324
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;

    invoke-virtual {v0}, Landroid/view/VelocityTracker;->recycle()V

    .line 2325
    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;

    .line 2327
    :cond_0
    #v0=(Reference);
    return-void
.end method

.method private getChildRectInPagerCoordinates(Landroid/graphics/Rect;Landroid/view/View;)Landroid/graphics/Rect;
    .locals 4
    .parameter "outRect"
    .parameter "child"

    .prologue
    const/4 v2, 0x0

    .line 2462
    #v2=(Null);
    if-nez p1, :cond_0

    .line 2463
    new-instance p1, Landroid/graphics/Rect;

    .end local p1
    #p1=(UninitRef);
    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    .line 2465
    .restart local p1
    :cond_0
    #p1=(Reference);
    if-nez p2, :cond_2

    .line 2466
    invoke-virtual {p1, v2, v2, v2, v2}, Landroid/graphics/Rect;->set(IIII)V

    .line 2484
    :cond_1
    #v0=(Conflicted);v1=(Conflicted);v2=(Boolean);v3=(Conflicted);
    return-object p1

    .line 2469
    :cond_2
    #v0=(Uninit);v1=(Uninit);v2=(Null);v3=(Uninit);
    invoke-virtual {p2}, Landroid/view/View;->getLeft()I

    move-result v2

    #v2=(Integer);
    iput v2, p1, Landroid/graphics/Rect;->left:I

    .line 2470
    invoke-virtual {p2}, Landroid/view/View;->getRight()I

    move-result v2

    iput v2, p1, Landroid/graphics/Rect;->right:I

    .line 2471
    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    move-result v2

    iput v2, p1, Landroid/graphics/Rect;->top:I

    .line 2472
    invoke-virtual {p2}, Landroid/view/View;->getBottom()I

    move-result v2

    iput v2, p1, Landroid/graphics/Rect;->bottom:I

    .line 2474
    invoke-virtual {p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    .line 2475
    .local v1, parent:Landroid/view/ViewParent;
    :goto_0
    #v0=(Conflicted);v1=(Reference);v3=(Conflicted);
    instance-of v2, v1, Landroid/view/ViewGroup;

    #v2=(Boolean);
    if-eqz v2, :cond_1

    if-eq v1, p0, :cond_1

    move-object v0, v1

    .line 2476
    #v0=(Reference);
    check-cast v0, Landroid/view/ViewGroup;

    .line 2477
    .local v0, group:Landroid/view/ViewGroup;
    iget v2, p1, Landroid/graphics/Rect;->left:I

    #v2=(Integer);
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getLeft()I

    move-result v3

    #v3=(Integer);
    add-int/2addr v2, v3

    iput v2, p1, Landroid/graphics/Rect;->left:I

    .line 2478
    iget v2, p1, Landroid/graphics/Rect;->right:I

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getRight()I

    move-result v3

    add-int/2addr v2, v3

    iput v2, p1, Landroid/graphics/Rect;->right:I

    .line 2479
    iget v2, p1, Landroid/graphics/Rect;->top:I

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getTop()I

    move-result v3

    add-int/2addr v2, v3

    iput v2, p1, Landroid/graphics/Rect;->top:I

    .line 2480
    iget v2, p1, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getBottom()I

    move-result v3

    add-int/2addr v2, v3

    iput v2, p1, Landroid/graphics/Rect;->bottom:I

    .line 2482
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    .line 2483
    goto :goto_0
.end method

.method private infoForCurrentScrollPosition()Landroid/support/v4/view/ViewPager$ItemInfo;
    .locals 15

    .prologue
    const/4 v8, 0x0

    .line 2029
    #v8=(Null);
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getWidth()I

    move-result v12

    .line 2030
    .local v12, width:I
    #v12=(Integer);
    if-lez v12, :cond_5

    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getScrollX()I

    move-result v13

    #v13=(Integer);
    int-to-float v13, v13

    #v13=(Float);
    int-to-float v14, v12

    #v14=(Float);
    div-float v11, v13, v14

    .line 2031
    .local v11, scrollOffset:F
    :goto_0
    #v11=(Float);v13=(Conflicted);v14=(Conflicted);
    if-lez v12, :cond_0

    iget v13, p0, Landroid/support/v4/view/ViewPager;->mPageMargin:I

    #v13=(Integer);
    int-to-float v13, v13

    #v13=(Float);
    int-to-float v14, v12

    #v14=(Float);
    div-float v8, v13, v14

    .line 2032
    .local v8, marginOffset:F
    :cond_0
    #v8=(Float);v13=(Conflicted);v14=(Conflicted);
    const/4 v5, -0x1

    .line 2033
    .local v5, lastPos:I
    #v5=(Byte);
    const/4 v4, 0x0

    .line 2034
    .local v4, lastOffset:F
    #v4=(Null);
    const/4 v6, 0x0

    .line 2035
    .local v6, lastWidth:F
    #v6=(Null);
    const/4 v0, 0x1

    .line 2037
    .local v0, first:Z
    #v0=(One);
    const/4 v3, 0x0

    .line 2038
    .local v3, lastItem:Landroid/support/v4/view/ViewPager$ItemInfo;
    #v3=(Null);
    const/4 v1, 0x0

    .local v1, i:I
    :goto_1
    #v0=(Boolean);v1=(Integer);v2=(Conflicted);v3=(Reference);v4=(Integer);v5=(Integer);v6=(Integer);v7=(Conflicted);v9=(Conflicted);v10=(Conflicted);
    iget-object v13, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;

    #v13=(Reference);
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    move-result v13

    #v13=(Integer);
    if-ge v1, v13, :cond_4

    .line 2039
    iget-object v13, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;

    #v13=(Reference);
    invoke-virtual {v13, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    #v2=(Reference);
    check-cast v2, Landroid/support/v4/view/ViewPager$ItemInfo;

    .line 2041
    .local v2, ii:Landroid/support/v4/view/ViewPager$ItemInfo;
    if-nez v0, :cond_1

    iget v13, v2, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I

    #v13=(Integer);
    add-int/lit8 v14, v5, 0x1

    #v14=(Integer);
    if-eq v13, v14, :cond_1

    .line 2043
    iget-object v2, p0, Landroid/support/v4/view/ViewPager;->mTempItem:Landroid/support/v4/view/ViewPager$ItemInfo;

    .line 2044
    add-float v13, v4, v6

    #v13=(Float);
    add-float/2addr v13, v8

    iput v13, v2, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F

    .line 2045
    add-int/lit8 v13, v5, 0x1

    #v13=(Integer);
    iput v13, v2, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I

    .line 2046
    iget-object v13, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;

    #v13=(Reference);
    iget v14, v2, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I

    invoke-virtual {v13, v14}, Landroid/support/v4/view/PagerAdapter;->getPageWidth(I)F

    move-result v13

    #v13=(Float);
    iput v13, v2, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F

    .line 2047
    add-int/lit8 v1, v1, -0x1

    .line 2049
    :cond_1
    #v13=(Conflicted);v14=(Conflicted);
    iget v9, v2, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F

    .line 2051
    .local v9, offset:F
    #v9=(Integer);
    move v7, v9

    .line 2052
    .local v7, leftBound:F
    #v7=(Integer);
    iget v13, v2, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F

    #v13=(Integer);
    add-float/2addr v13, v9

    #v13=(Float);
    add-float v10, v13, v8

    .line 2053
    .local v10, rightBound:F
    #v10=(Float);
    if-nez v0, :cond_2

    cmpl-float v13, v11, v7

    #v13=(Byte);
    if-ltz v13, :cond_4

    .line 2054
    :cond_2
    #v13=(Float);
    cmpg-float v13, v11, v10

    #v13=(Byte);
    if-ltz v13, :cond_3

    iget-object v13, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;

    #v13=(Reference);
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    move-result v13

    #v13=(Integer);
    add-int/lit8 v13, v13, -0x1

    if-ne v1, v13, :cond_6

    :cond_3
    move-object v3, v2

    .line 2067
    .end local v2           #ii:Landroid/support/v4/view/ViewPager$ItemInfo;
    .end local v3           #lastItem:Landroid/support/v4/view/ViewPager$ItemInfo;
    .end local v7           #leftBound:F
    .end local v9           #offset:F
    .end local v10           #rightBound:F
    :cond_4
    #v2=(Conflicted);v7=(Conflicted);v9=(Conflicted);v10=(Conflicted);
    return-object v3

    .end local v0           #first:Z
    .end local v1           #i:I
    .end local v4           #lastOffset:F
    .end local v5           #lastPos:I
    .end local v6           #lastWidth:F
    .end local v8           #marginOffset:F
    .end local v11           #scrollOffset:F
    :cond_5
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Null);v9=(Uninit);v10=(Uninit);v11=(Uninit);v13=(Uninit);v14=(Uninit);
    move v11, v8

    .line 2030
    #v11=(Null);
    goto :goto_0

    .line 2060
    .restart local v0       #first:Z
    .restart local v1       #i:I
    .restart local v2       #ii:Landroid/support/v4/view/ViewPager$ItemInfo;
    .restart local v3       #lastItem:Landroid/support/v4/view/ViewPager$ItemInfo;
    .restart local v4       #lastOffset:F
    .restart local v5       #lastPos:I
    .restart local v6       #lastWidth:F
    .restart local v7       #leftBound:F
    .restart local v8       #marginOffset:F
    .restart local v9       #offset:F
    .restart local v10       #rightBound:F
    .restart local v11       #scrollOffset:F
    :cond_6
    #v0=(Boolean);v1=(Integer);v2=(Reference);v3=(Reference);v4=(Integer);v5=(Integer);v6=(Integer);v7=(Integer);v8=(Float);v9=(Integer);v10=(Float);v11=(Float);v13=(Integer);v14=(Conflicted);
    const/4 v0, 0x0

    .line 2061
    #v0=(Null);
    iget v5, v2, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I

    .line 2062
    move v4, v9

    .line 2063
    iget v6, v2, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F

    .line 2064
    move-object v3, v2

    .line 2038
    add-int/lit8 v1, v1, 0x1

    goto :goto_1
.end method

.method private isGutterDrag(FF)Z
    .locals 3
    .parameter "x"
    .parameter "dx"

    .prologue
    const/4 v2, 0x0

    .line 1702
    #v2=(Null);
    iget v0, p0, Landroid/support/v4/view/ViewPager;->mGutterSize:I

    #v0=(Integer);
    int-to-float v0, v0

    #v0=(Float);
    cmpg-float v0, p1, v0

    #v0=(Byte);
    if-gez v0, :cond_0

    cmpl-float v0, p2, v2

    if-gtz v0, :cond_1

    :cond_0
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getWidth()I

    move-result v0

    #v0=(Integer);
    iget v1, p0, Landroid/support/v4/view/ViewPager;->mGutterSize:I

    #v1=(Integer);
    sub-int/2addr v0, v1

    int-to-float v0, v0

    #v0=(Float);
    cmpl-float v0, p1, v0

    #v0=(Byte);
    if-lez v0, :cond_2

    cmpg-float v0, p2, v2

    if-gez v0, :cond_2

    :cond_1
    #v1=(Conflicted);
    const/4 v0, 0x1

    :goto_0
    #v0=(Boolean);
    return v0

    :cond_2
    #v0=(Byte);v1=(Integer);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method private onSecondaryPointerUp(Landroid/view/MotionEvent;)V
    .locals 4
    .parameter "ev"

    .prologue
    .line 2305
    invoke-static {p1}, Landroid/support/v4/view/MotionEventCompat;->getActionIndex(Landroid/view/MotionEvent;)I

    move-result v2

    .line 2306
    .local v2, pointerIndex:I
    #v2=(Integer);
    invoke-static {p1, v2}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I

    move-result v1

    .line 2307
    .local v1, pointerId:I
    #v1=(Integer);
    iget v3, p0, Landroid/support/v4/view/ViewPager;->mActivePointerId:I

    #v3=(Integer);
    if-ne v1, v3, :cond_0

    .line 2310
    if-nez v2, :cond_1

    const/4 v0, 0x1

    .line 2311
    .local v0, newPointerIndex:I
    :goto_0
    #v0=(Boolean);
    invoke-static {p1, v0}, Landroid/support/v4/view/MotionEventCompat;->getX(Landroid/view/MotionEvent;I)F

    move-result v3

    #v3=(Float);
    iput v3, p0, Landroid/support/v4/view/ViewPager;->mLastMotionX:F

    .line 2312
    invoke-static {p1, v0}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I

    move-result v3

    #v3=(Integer);
    iput v3, p0, Landroid/support/v4/view/ViewPager;->mActivePointerId:I

    .line 2313
    iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;

    #v3=(Reference);
    if-eqz v3, :cond_0

    .line 2314
    iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;

    invoke-virtual {v3}, Landroid/view/VelocityTracker;->clear()V

    .line 2317
    .end local v0           #newPointerIndex:I
    :cond_0
    #v0=(Conflicted);v3=(Conflicted);
    return-void

    .line 2310
    :cond_1
    #v0=(Uninit);v3=(Integer);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method private pageScrolled(I)Z
    .locals 10
    .parameter "xpos"

    .prologue
    const/4 v7, 0x0

    .line 1566
    #v7=(Null);
    iget-object v8, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;

    #v8=(Reference);
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v8

    #v8=(Integer);
    if-nez v8, :cond_0

    .line 1567
    iput-boolean v7, p0, Landroid/support/v4/view/ViewPager;->mCalledSuper:Z

    .line 1568
    const/4 v8, 0x0

    #v8=(Null);
    invoke-virtual {p0, v7, v8, v7}, Landroid/support/v4/view/ViewPager;->onPageScrolled(IFI)V

    .line 1569
    iget-boolean v8, p0, Landroid/support/v4/view/ViewPager;->mCalledSuper:Z

    #v8=(Boolean);
    if-nez v8, :cond_2

    .line 1570
    new-instance v7, Ljava/lang/IllegalStateException;

    #v7=(UninitRef);
    const-string v8, "onPageScrolled did not call superclass implementation"

    #v8=(Reference);
    invoke-direct {v7, v8}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    #v7=(Reference);
    throw v7

    .line 1575
    :cond_0
    #v7=(Null);v8=(Integer);
    invoke-direct {p0}, Landroid/support/v4/view/ViewPager;->infoForCurrentScrollPosition()Landroid/support/v4/view/ViewPager$ItemInfo;

    move-result-object v1

    .line 1576
    .local v1, ii:Landroid/support/v4/view/ViewPager$ItemInfo;
    #v1=(Reference);
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getWidth()I

    move-result v5

    .line 1577
    .local v5, width:I
    #v5=(Integer);
    iget v8, p0, Landroid/support/v4/view/ViewPager;->mPageMargin:I

    add-int v6, v5, v8

    .line 1578
    .local v6, widthWithMargin:I
    #v6=(Integer);
    iget v8, p0, Landroid/support/v4/view/ViewPager;->mPageMargin:I

    int-to-float v8, v8

    #v8=(Float);
    int-to-float v9, v5

    #v9=(Float);
    div-float v2, v8, v9

    .line 1579
    .local v2, marginOffset:F
    #v2=(Float);
    iget v0, v1, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I

    .line 1580
    .local v0, currentPage:I
    #v0=(Integer);
    int-to-float v8, p1

    int-to-float v9, v5

    div-float/2addr v8, v9

    iget v9, v1, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F

    #v9=(Integer);
    sub-float/2addr v8, v9

    iget v9, v1, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F

    add-float/2addr v9, v2

    #v9=(Float);
    div-float v4, v8, v9

    .line 1582
    .local v4, pageOffset:F
    #v4=(Float);
    int-to-float v8, v6

    mul-float/2addr v8, v4

    float-to-int v3, v8

    .line 1584
    .local v3, offsetPixels:I
    #v3=(Integer);
    iput-boolean v7, p0, Landroid/support/v4/view/ViewPager;->mCalledSuper:Z

    .line 1585
    invoke-virtual {p0, v0, v4, v3}, Landroid/support/v4/view/ViewPager;->onPageScrolled(IFI)V

    .line 1586
    iget-boolean v7, p0, Landroid/support/v4/view/ViewPager;->mCalledSuper:Z

    #v7=(Boolean);
    if-nez v7, :cond_1

    .line 1587
    new-instance v7, Ljava/lang/IllegalStateException;

    #v7=(UninitRef);
    const-string v8, "onPageScrolled did not call superclass implementation"

    #v8=(Reference);
    invoke-direct {v7, v8}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    #v7=(Reference);
    throw v7

    .line 1590
    :cond_1
    #v7=(Boolean);v8=(Float);
    const/4 v7, 0x1

    .end local v0           #currentPage:I
    .end local v1           #ii:Landroid/support/v4/view/ViewPager$ItemInfo;
    .end local v2           #marginOffset:F
    .end local v3           #offsetPixels:I
    .end local v4           #pageOffset:F
    .end local v5           #width:I
    .end local v6           #widthWithMargin:I
    :cond_2
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v9=(Conflicted);
    return v7
.end method

.method private performDrag(F)Z
    .locals 17
    .parameter "x"

    .prologue
    .line 1978
    const/4 v7, 0x0

    .line 1980
    .local v7, needsInvalidate:Z
    #v7=(Null);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget v14, v0, Landroid/support/v4/view/ViewPager;->mLastMotionX:F

    #v14=(Integer);
    sub-float v2, v14, p1

    .line 1981
    .local v2, deltaX:F
    #v2=(Float);
    move/from16 v0, p1

    #v0=(Float);
    move-object/from16 v1, p0

    #v1=(Reference);
    iput v0, v1, Landroid/support/v4/view/ViewPager;->mLastMotionX:F

    .line 1983
    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getScrollX()I

    move-result v14

    int-to-float v8, v14

    .line 1984
    .local v8, oldScrollX:F
    #v8=(Float);
    add-float v12, v8, v2

    .line 1985
    .local v12, scrollX:F
    #v12=(Float);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getWidth()I

    move-result v13

    .line 1987
    .local v13, width:I
    #v13=(Integer);
    int-to-float v14, v13

    #v14=(Float);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget v15, v0, Landroid/support/v4/view/ViewPager;->mFirstOffset:F

    #v15=(Integer);
    mul-float v6, v14, v15

    .line 1988
    .local v6, leftBound:F
    #v6=(Float);
    int-to-float v14, v13

    move-object/from16 v0, p0

    iget v15, v0, Landroid/support/v4/view/ViewPager;->mLastOffset:F

    mul-float v11, v14, v15

    .line 1989
    .local v11, rightBound:F
    #v11=(Float);
    const/4 v5, 0x1

    .line 1990
    .local v5, leftAbsolute:Z
    #v5=(One);
    const/4 v10, 0x1

    .line 1992
    .local v10, rightAbsolute:Z
    #v10=(One);
    move-object/from16 v0, p0

    iget-object v14, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;

    #v14=(Reference);
    const/4 v15, 0x0

    #v15=(Null);
    invoke-virtual {v14, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    #v3=(Reference);
    check-cast v3, Landroid/support/v4/view/ViewPager$ItemInfo;

    .line 1993
    .local v3, firstItem:Landroid/support/v4/view/ViewPager$ItemInfo;
    move-object/from16 v0, p0

    iget-object v14, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;

    move-object/from16 v0, p0

    iget-object v15, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;

    #v15=(Reference);
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    move-result v15

    #v15=(Integer);
    add-int/lit8 v15, v15, -0x1

    invoke-virtual {v14, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    #v4=(Reference);
    check-cast v4, Landroid/support/v4/view/ViewPager$ItemInfo;

    .line 1994
    .local v4, lastItem:Landroid/support/v4/view/ViewPager$ItemInfo;
    iget v14, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I

    #v14=(Integer);
    if-eqz v14, :cond_0

    .line 1995
    const/4 v5, 0x0

    .line 1996
    #v5=(Null);
    iget v14, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F

    int-to-float v15, v13

    #v15=(Float);
    mul-float v6, v14, v15

    .line 1998
    :cond_0
    #v5=(Boolean);v15=(Integer);
    iget v14, v4, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I

    move-object/from16 v0, p0

    iget-object v15, v0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;

    #v15=(Reference);
    invoke-virtual {v15}, Landroid/support/v4/view/PagerAdapter;->getCount()I

    move-result v15

    #v15=(Integer);
    add-int/lit8 v15, v15, -0x1

    if-eq v14, v15, :cond_1

    .line 1999
    const/4 v10, 0x0

    .line 2000
    #v10=(Null);
    iget v14, v4, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F

    int-to-float v15, v13

    #v15=(Float);
    mul-float v11, v14, v15

    .line 2003
    :cond_1
    #v10=(Boolean);v15=(Integer);
    cmpg-float v14, v12, v6

    #v14=(Byte);
    if-gez v14, :cond_4

    .line 2004
    if-eqz v5, :cond_2

    .line 2005
    sub-float v9, v6, v12

    .line 2006
    .local v9, over:F
    #v9=(Float);
    move-object/from16 v0, p0

    iget-object v14, v0, Landroid/support/v4/view/ViewPager;->mLeftEdge:Landroid/support/v4/widget/EdgeEffectCompat;

    #v14=(Reference);
    invoke-static {v9}, Ljava/lang/Math;->abs(F)F

    move-result v15

    #v15=(Float);
    int-to-float v0, v13

    #v0=(Float);
    move/from16 v16, v0

    #v16=(Float);
    div-float v15, v15, v16

    invoke-virtual {v14, v15}, Landroid/support/v4/widget/EdgeEffectCompat;->onPull(F)Z

    move-result v7

    .line 2008
    .end local v9           #over:F
    :cond_2
    #v0=(Conflicted);v7=(Boolean);v9=(Conflicted);v14=(Conflicted);v15=(Integer);v16=(Conflicted);
    move v12, v6

    .line 2017
    :cond_3
    :goto_0
    move-object/from16 v0, p0

    #v0=(Reference);
    iget v14, v0, Landroid/support/v4/view/ViewPager;->mLastMotionX:F

    #v14=(Integer);
    float-to-int v15, v12

    int-to-float v15, v15

    #v15=(Float);
    sub-float v15, v12, v15

    add-float/2addr v14, v15

    #v14=(Float);
    move-object/from16 v0, p0

    iput v14, v0, Landroid/support/v4/view/ViewPager;->mLastMotionX:F

    .line 2018
    float-to-int v14, v12

    #v14=(Integer);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getScrollY()I

    move-result v15

    #v15=(Integer);
    move-object/from16 v0, p0

    invoke-virtual {v0, v14, v15}, Landroid/support/v4/view/ViewPager;->scrollTo(II)V

    .line 2019
    float-to-int v14, v12

    move-object/from16 v0, p0

    invoke-direct {v0, v14}, Landroid/support/v4/view/ViewPager;->pageScrolled(I)Z

    .line 2021
    return v7

    .line 2009
    :cond_4
    #v7=(Null);v9=(Uninit);v14=(Byte);v16=(Uninit);
    cmpl-float v14, v12, v11

    if-lez v14, :cond_3

    .line 2010
    if-eqz v10, :cond_5

    .line 2011
    sub-float v9, v12, v11

    .line 2012
    .restart local v9       #over:F
    #v9=(Float);
    move-object/from16 v0, p0

    iget-object v14, v0, Landroid/support/v4/view/ViewPager;->mRightEdge:Landroid/support/v4/widget/EdgeEffectCompat;

    #v14=(Reference);
    invoke-static {v9}, Ljava/lang/Math;->abs(F)F

    move-result v15

    #v15=(Float);
    int-to-float v0, v13

    #v0=(Float);
    move/from16 v16, v0

    #v16=(Float);
    div-float v15, v15, v16

    invoke-virtual {v14, v15}, Landroid/support/v4/widget/EdgeEffectCompat;->onPull(F)Z

    move-result v7

    .line 2014
    .end local v9           #over:F
    :cond_5
    #v0=(Conflicted);v7=(Boolean);v9=(Conflicted);v14=(Conflicted);v15=(Integer);v16=(Conflicted);
    move v12, v11

    goto :goto_0
.end method

.method private recomputeScrollPosition(IIII)V
    .locals 14
    .parameter "width"
    .parameter "oldWidth"
    .parameter "margin"
    .parameter "oldMargin"

    .prologue
    .line 1406
    if-lez p2, :cond_1

    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_1

    .line 1407
    add-int v12, p1, p3

    .line 1408
    .local v12, widthWithMargin:I
    #v12=(Integer);
    add-int v7, p2, p4

    .line 1409
    .local v7, oldWidthWithMargin:I
    #v7=(Integer);
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getScrollX()I

    move-result v13

    .line 1410
    .local v13, xpos:I
    #v13=(Integer);
    int-to-float v0, v13

    #v0=(Float);
    int-to-float v2, v7

    #v2=(Float);
    div-float v8, v0, v2

    .line 1411
    .local v8, pageOffset:F
    #v8=(Float);
    int-to-float v0, v12

    mul-float/2addr v0, v8

    float-to-int v1, v0

    .line 1413
    .local v1, newOffsetPixels:I
    #v1=(Integer);
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getScrollY()I

    move-result v0

    #v0=(Integer);
    invoke-virtual {p0, v1, v0}, Landroid/support/v4/view/ViewPager;->scrollTo(II)V

    .line 1414
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mScroller:Landroid/widget/Scroller;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/widget/Scroller;->isFinished()Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_0

    .line 1416
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mScroller:Landroid/widget/Scroller;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/widget/Scroller;->getDuration()I

    move-result v0

    #v0=(Integer);
    iget-object v2, p0, Landroid/support/v4/view/ViewPager;->mScroller:Landroid/widget/Scroller;

    #v2=(Reference);
    invoke-virtual {v2}, Landroid/widget/Scroller;->timePassed()I

    move-result v2

    #v2=(Integer);
    sub-int v5, v0, v2

    .line 1417
    .local v5, newDuration:I
    #v5=(Integer);
    iget v0, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I

    invoke-virtual {p0, v0}, Landroid/support/v4/view/ViewPager;->infoForPosition(I)Landroid/support/v4/view/ViewPager$ItemInfo;

    move-result-object v11

    .line 1418
    .local v11, targetInfo:Landroid/support/v4/view/ViewPager$ItemInfo;
    #v11=(Reference);
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mScroller:Landroid/widget/Scroller;

    #v0=(Reference);
    const/4 v2, 0x0

    #v2=(Null);
    iget v3, v11, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F

    #v3=(Integer);
    int-to-float v4, p1

    #v4=(Float);
    mul-float/2addr v3, v4

    #v3=(Float);
    float-to-int v3, v3

    #v3=(Integer);
    const/4 v4, 0x0

    #v4=(Null);
    invoke-virtual/range {v0 .. v5}, Landroid/widget/Scroller;->startScroll(IIIII)V

    .line 1430
    .end local v1           #newOffsetPixels:I
    .end local v5           #newDuration:I
    .end local v7           #oldWidthWithMargin:I
    .end local v8           #pageOffset:F
    .end local v11           #targetInfo:Landroid/support/v4/view/ViewPager$ItemInfo;
    .end local v12           #widthWithMargin:I
    .end local v13           #xpos:I
    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);
    return-void

    .line 1422
    :cond_1
    #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);
    iget v0, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I

    #v0=(Integer);
    invoke-virtual {p0, v0}, Landroid/support/v4/view/ViewPager;->infoForPosition(I)Landroid/support/v4/view/ViewPager$ItemInfo;

    move-result-object v6

    .line 1423
    .local v6, ii:Landroid/support/v4/view/ViewPager$ItemInfo;
    #v6=(Reference);
    if-eqz v6, :cond_2

    iget v0, v6, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F

    iget v2, p0, Landroid/support/v4/view/ViewPager;->mLastOffset:F

    #v2=(Integer);
    invoke-static {v0, v2}, Ljava/lang/Math;->min(FF)F

    move-result v9

    .line 1424
    .local v9, scrollOffset:F
    :goto_1
    #v2=(Conflicted);v9=(Float);
    int-to-float v0, p1

    #v0=(Float);
    mul-float/2addr v0, v9

    float-to-int v10, v0

    .line 1425
    .local v10, scrollPos:I
    #v10=(Integer);
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getScrollX()I

    move-result v0

    #v0=(Integer);
    if-eq v10, v0, :cond_0

    .line 1426
    const/4 v0, 0x0

    #v0=(Null);
    invoke-direct {p0, v0}, Landroid/support/v4/view/ViewPager;->completeScroll(Z)V

    .line 1427
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getScrollY()I

    move-result v0

    #v0=(Integer);
    invoke-virtual {p0, v10, v0}, Landroid/support/v4/view/ViewPager;->scrollTo(II)V

    goto :goto_0

    .line 1423
    .end local v9           #scrollOffset:F
    .end local v10           #scrollPos:I
    :cond_2
    #v2=(Uninit);v9=(Uninit);v10=(Uninit);
    const/4 v9, 0x0

    #v9=(Null);
    goto :goto_1
.end method

.method private removeNonDecorViews()V
    .locals 4

    .prologue
    .line 443
    const/4 v1, 0x0

    .local v1, i:I
    :goto_0
    #v0=(Conflicted);v1=(Integer);v2=(Conflicted);v3=(Conflicted);
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getChildCount()I

    move-result v3

    #v3=(Integer);
    if-ge v1, v3, :cond_1

    .line 444
    invoke-virtual {p0, v1}, Landroid/support/v4/view/ViewPager;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 445
    .local v0, child:Landroid/view/View;
    #v0=(Reference);
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    #v2=(Reference);
    check-cast v2, Landroid/support/v4/view/ViewPager$LayoutParams;

    .line 446
    .local v2, lp:Landroid/support/v4/view/ViewPager$LayoutParams;
    iget-boolean v3, v2, Landroid/support/v4/view/ViewPager$LayoutParams;->isDecor:Z

    #v3=(Boolean);
    if-nez v3, :cond_0

    .line 447
    invoke-virtual {p0, v1}, Landroid/support/v4/view/ViewPager;->removeViewAt(I)V

    .line 448
    add-int/lit8 v1, v1, -0x1

    .line 443
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 451
    .end local v0           #child:Landroid/view/View;
    .end local v2           #lp:Landroid/support/v4/view/ViewPager$LayoutParams;
    :cond_1
    #v0=(Conflicted);v2=(Conflicted);v3=(Integer);
    return-void
.end method

.method private scrollToItem(IZIZ)V
    .locals 8
    .parameter "item"
    .parameter "smoothScroll"
    .parameter "velocity"
    .parameter "dispatchSelected"

    .prologue
    const/4 v7, 0x0

    .line 528
    #v7=(Null);
    invoke-virtual {p0, p1}, Landroid/support/v4/view/ViewPager;->infoForPosition(I)Landroid/support/v4/view/ViewPager$ItemInfo;

    move-result-object v0

    .line 529
    .local v0, curInfo:Landroid/support/v4/view/ViewPager$ItemInfo;
    #v0=(Reference);
    const/4 v1, 0x0

    .line 530
    .local v1, destX:I
    #v1=(Null);
    if-eqz v0, :cond_0

    .line 531
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getWidth()I

    move-result v2

    .line 532
    .local v2, width:I
    #v2=(Integer);
    int-to-float v3, v2

    #v3=(Float);
    iget v4, p0, Landroid/support/v4/view/ViewPager;->mFirstOffset:F

    #v4=(Integer);
    iget v5, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F

    #v5=(Integer);
    iget v6, p0, Landroid/support/v4/view/ViewPager;->mLastOffset:F

    #v6=(Integer);
    invoke-static {v5, v6}, Ljava/lang/Math;->min(FF)F

    move-result v5

    #v5=(Float);
    invoke-static {v4, v5}, Ljava/lang/Math;->max(FF)F

    move-result v4

    #v4=(Float);
    mul-float/2addr v3, v4

    float-to-int v1, v3

    .line 535
    .end local v2           #width:I
    :cond_0
    #v1=(Integer);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    if-eqz p2, :cond_3

    .line 536
    invoke-virtual {p0, v1, v7, p3}, Landroid/support/v4/view/ViewPager;->smoothScrollTo(III)V

    .line 537
    if-eqz p4, :cond_1

    iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mOnPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;

    #v3=(Reference);
    if-eqz v3, :cond_1

    .line 538
    iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mOnPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;

    invoke-interface {v3, p1}, Landroid/support/v4/view/ViewPager$OnPageChangeListener;->onPageSelected(I)V

    .line 540
    :cond_1
    #v3=(Conflicted);
    if-eqz p4, :cond_2

    iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mInternalPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;

    #v3=(Reference);
    if-eqz v3, :cond_2

    .line 541
    iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mInternalPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;

    invoke-interface {v3, p1}, Landroid/support/v4/view/ViewPager$OnPageChangeListener;->onPageSelected(I)V

    .line 553
    :cond_2
    :goto_0
    #v3=(Conflicted);
    return-void

    .line 544
    :cond_3
    if-eqz p4, :cond_4

    iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mOnPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;

    #v3=(Reference);
    if-eqz v3, :cond_4

    .line 545
    iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mOnPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;

    invoke-interface {v3, p1}, Landroid/support/v4/view/ViewPager$OnPageChangeListener;->onPageSelected(I)V

    .line 547
    :cond_4
    #v3=(Conflicted);
    if-eqz p4, :cond_5

    iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mInternalPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;

    #v3=(Reference);
    if-eqz v3, :cond_5

    .line 548
    iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mInternalPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;

    invoke-interface {v3, p1}, Landroid/support/v4/view/ViewPager$OnPageChangeListener;->onPageSelected(I)V

    .line 550
    :cond_5
    #v3=(Conflicted);
    invoke-direct {p0, v7}, Landroid/support/v4/view/ViewPager;->completeScroll(Z)V

    .line 551
    invoke-virtual {p0, v1, v7}, Landroid/support/v4/view/ViewPager;->scrollTo(II)V

    goto :goto_0
.end method

.method private setScrollState(I)V
    .locals 1
    .parameter "newState"

    .prologue
    .line 382
    iget v0, p0, Landroid/support/v4/view/ViewPager;->mScrollState:I

    #v0=(Integer);
    if-ne v0, p1, :cond_1

    .line 394
    :cond_0
    :goto_0
    #v0=(Conflicted);
    return-void

    .line 386
    :cond_1
    #v0=(Integer);
    iput p1, p0, Landroid/support/v4/view/ViewPager;->mScrollState:I

    .line 387
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mPageTransformer:Landroid/support/v4/view/ViewPager$PageTransformer;

    #v0=(Reference);
    if-eqz v0, :cond_2

    .line 389
    if-eqz p1, :cond_3

    const/4 v0, 0x1

    :goto_1
    #v0=(Boolean);
    invoke-direct {p0, v0}, Landroid/support/v4/view/ViewPager;->enableLayers(Z)V

    .line 391
    :cond_2
    #v0=(Conflicted);
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mOnPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;

    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 392
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mOnPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;

    invoke-interface {v0, p1}, Landroid/support/v4/view/ViewPager$OnPageChangeListener;->onPageScrollStateChanged(I)V

    goto :goto_0

    .line 389
    :cond_3
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_1
.end method

.method private setScrollingCacheEnabled(Z)V
    .locals 1
    .parameter "enabled"

    .prologue
    .line 2330
    iget-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mScrollingCacheEnabled:Z

    #v0=(Boolean);
    if-eq v0, p1, :cond_0

    .line 2331
    iput-boolean p1, p0, Landroid/support/v4/view/ViewPager;->mScrollingCacheEnabled:Z

    .line 2342
    :cond_0
    return-void
.end method


# virtual methods
.method public addFocusables(Ljava/util/ArrayList;II)V
    .locals 7
    .parameter
    .parameter "direction"
    .parameter "focusableMode"
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Landroid/view/View;",
            ">;II)V"
        }
    .end annotation

    .prologue
    .line 2508
    .local p1, views:Ljava/util/ArrayList;,"Ljava/util/ArrayList<Landroid/view/View;>;"
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v2

    .line 2510
    .local v2, focusableCount:I
    #v2=(Integer);
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getDescendantFocusability()I

    move-result v1

    .line 2512
    .local v1, descendantFocusability:I
    #v1=(Integer);
    const/high16 v5, 0x6

    #v5=(Integer);
    if-eq v1, v5, :cond_1

    .line 2513
    const/4 v3, 0x0

    .local v3, i:I
    :goto_0
    #v0=(Conflicted);v3=(Integer);v4=(Conflicted);v6=(Conflicted);
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getChildCount()I

    move-result v5

    if-ge v3, v5, :cond_1

    .line 2514
    invoke-virtual {p0, v3}, Landroid/support/v4/view/ViewPager;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 2515
    .local v0, child:Landroid/view/View;
    #v0=(Reference);
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v5

    if-nez v5, :cond_0

    .line 2516
    invoke-virtual {p0, v0}, Landroid/support/v4/view/ViewPager;->infoForChild(Landroid/view/View;)Landroid/support/v4/view/ViewPager$ItemInfo;

    move-result-object v4

    .line 2517
    .local v4, ii:Landroid/support/v4/view/ViewPager$ItemInfo;
    #v4=(Reference);
    if-eqz v4, :cond_0

    iget v5, v4, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I

    iget v6, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I

    #v6=(Integer);
    if-ne v5, v6, :cond_0

    .line 2518
    invoke-virtual {v0, p1, p2, p3}, Landroid/view/View;->addFocusables(Ljava/util/ArrayList;II)V

    .line 2513
    .end local v4           #ii:Landroid/support/v4/view/ViewPager$ItemInfo;
    :cond_0
    #v4=(Conflicted);v6=(Conflicted);
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 2528
    .end local v0           #child:Landroid/view/View;
    .end local v3           #i:I
    :cond_1
    #v0=(Conflicted);v3=(Conflicted);
    const/high16 v5, 0x4

    if-ne v1, v5, :cond_2

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-ne v2, v5, :cond_3

    .line 2534
    :cond_2
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->isFocusable()Z

    move-result v5

    #v5=(Boolean);
    if-nez v5, :cond_4

    .line 2545
    :cond_3
    :goto_1
    #v5=(Integer);
    return-void

    .line 2537
    :cond_4
    #v5=(Boolean);
    and-int/lit8 v5, p3, 0x1

    #v5=(Integer);
    const/4 v6, 0x1

    #v6=(One);
    if-ne v5, v6, :cond_5

    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->isInTouchMode()Z

    move-result v5

    #v5=(Boolean);
    if-eqz v5, :cond_5

    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->isFocusableInTouchMode()Z

    move-result v5

    if-eqz v5, :cond_3

    .line 2541
    :cond_5
    #v5=(Integer);
    if-eqz p1, :cond_3

    .line 2542
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1
.end method

.method addNewItem(II)Landroid/support/v4/view/ViewPager$ItemInfo;
    .locals 2
    .parameter "position"
    .parameter "index"

    .prologue
    .line 798
    new-instance v0, Landroid/support/v4/view/ViewPager$ItemInfo;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/support/v4/view/ViewPager$ItemInfo;-><init>()V

    .line 799
    .local v0, ii:Landroid/support/v4/view/ViewPager$ItemInfo;
    #v0=(Reference);
    iput p1, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I

    .line 800
    iget-object v1, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;

    #v1=(Reference);
    invoke-virtual {v1, p0, p1}, Landroid/support/v4/view/PagerAdapter;->instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->object:Ljava/lang/Object;

    .line 801
    iget-object v1, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;

    invoke-virtual {v1, p1}, Landroid/support/v4/view/PagerAdapter;->getPageWidth(I)F

    move-result v1

    #v1=(Float);
    iput v1, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F

    .line 802
    if-ltz p2, :cond_0

    iget-object v1, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;

    #v1=(Reference);
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    #v1=(Integer);
    if-lt p2, v1, :cond_1

    .line 803
    :cond_0
    iget-object v1, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;

    #v1=(Reference);
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 807
    :goto_0
    return-object v0

    .line 805
    :cond_1
    #v1=(Integer);
    iget-object v1, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;

    #v1=(Reference);
    invoke-virtual {v1, p2, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    goto :goto_0
.end method

.method public addTouchables(Ljava/util/ArrayList;)V
    .locals 5
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Landroid/view/View;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 2555
    .local p1, views:Ljava/util/ArrayList;,"Ljava/util/ArrayList<Landroid/view/View;>;"
    const/4 v1, 0x0

    .local v1, i:I
    :goto_0
    #v0=(Conflicted);v1=(Integer);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getChildCount()I

    move-result v3

    #v3=(Integer);
    if-ge v1, v3, :cond_1

    .line 2556
    invoke-virtual {p0, v1}, Landroid/support/v4/view/ViewPager;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 2557
    .local v0, child:Landroid/view/View;
    #v0=(Reference);
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v3

    if-nez v3, :cond_0

    .line 2558
    invoke-virtual {p0, v0}, Landroid/support/v4/view/ViewPager;->infoForChild(Landroid/view/View;)Landroid/support/v4/view/ViewPager$ItemInfo;

    move-result-object v2

    .line 2559
    .local v2, ii:Landroid/support/v4/view/ViewPager$ItemInfo;
    #v2=(Reference);
    if-eqz v2, :cond_0

    iget v3, v2, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I

    iget v4, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I

    #v4=(Integer);
    if-ne v3, v4, :cond_0

    .line 2560
    invoke-virtual {v0, p1}, Landroid/view/View;->addTouchables(Ljava/util/ArrayList;)V

    .line 2555
    .end local v2           #ii:Landroid/support/v4/view/ViewPager$ItemInfo;
    :cond_0
    #v2=(Conflicted);v4=(Conflicted);
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 2564
    .end local v0           #child:Landroid/view/View;
    :cond_1
    #v0=(Conflicted);
    return-void
.end method

.method public addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 3
    .parameter "child"
    .parameter "index"
    .parameter "params"

    .prologue
    .line 1230
    invoke-virtual {p0, p3}, Landroid/support/v4/view/ViewPager;->checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_0

    .line 1231
    invoke-virtual {p0, p3}, Landroid/support/v4/view/ViewPager;->generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;

    move-result-object p3

    :cond_0
    move-object v0, p3

    .line 1233
    #v0=(Reference);
    check-cast v0, Landroid/support/v4/view/ViewPager$LayoutParams;

    .line 1234
    .local v0, lp:Landroid/support/v4/view/ViewPager$LayoutParams;
    iget-boolean v1, v0, Landroid/support/v4/view/ViewPager$LayoutParams;->isDecor:Z

    instance-of v2, p1, Landroid/support/v4/view/ViewPager$Decor;

    #v2=(Boolean);
    or-int/2addr v1, v2

    iput-boolean v1, v0, Landroid/support/v4/view/ViewPager$LayoutParams;->isDecor:Z

    .line 1235
    iget-boolean v1, p0, Landroid/support/v4/view/ViewPager;->mInLayout:Z

    if-eqz v1, :cond_2

    .line 1236
    if-eqz v0, :cond_1

    iget-boolean v1, v0, Landroid/support/v4/view/ViewPager$LayoutParams;->isDecor:Z

    if-eqz v1, :cond_1

    .line 1237
    new-instance v1, Ljava/lang/IllegalStateException;

    #v1=(UninitRef);
    const-string v2, "Cannot add pager decor view during layout"

    #v2=(Reference);
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    throw v1

    .line 1239
    :cond_1
    #v1=(Boolean);v2=(Boolean);
    const/4 v1, 0x1

    #v1=(One);
    iput-boolean v1, v0, Landroid/support/v4/view/ViewPager$LayoutParams;->needsMeasure:Z

    .line 1240
    invoke-virtual {p0, p1, p2, p3}, Landroid/support/v4/view/ViewPager;->addViewInLayout(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)Z

    .line 1252
    :goto_0
    #v1=(Boolean);
    return-void

    .line 1242
    :cond_2
    invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0
.end method

.method public arrowScroll(I)Z
    .locals 8
    .parameter "direction"

    .prologue
    const/16 v7, 0x42

    #v7=(PosByte);
    const/16 v6, 0x11

    .line 2419
    #v6=(PosByte);
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->findFocus()Landroid/view/View;

    move-result-object v1

    .line 2420
    .local v1, currentFocused:Landroid/view/View;
    #v1=(Reference);
    if-ne v1, p0, :cond_0

    const/4 v1, 0x0

    .line 2422
    :cond_0
    const/4 v2, 0x0

    .line 2424
    .local v2, handled:Z
    #v2=(Null);
    invoke-static {}, Landroid/view/FocusFinder;->getInstance()Landroid/view/FocusFinder;

    move-result-object v5

    #v5=(Reference);
    invoke-virtual {v5, p0, v1, p1}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;

    move-result-object v3

    .line 2426
    .local v3, nextFocused:Landroid/view/View;
    #v3=(Reference);
    if-eqz v3, :cond_6

    if-eq v3, v1, :cond_6

    .line 2427
    if-ne p1, v6, :cond_4

    .line 2430
    iget-object v5, p0, Landroid/support/v4/view/ViewPager;->mTempRect:Landroid/graphics/Rect;

    invoke-direct {p0, v5, v3}, Landroid/support/v4/view/ViewPager;->getChildRectInPagerCoordinates(Landroid/graphics/Rect;Landroid/view/View;)Landroid/graphics/Rect;

    move-result-object v5

    iget v4, v5, Landroid/graphics/Rect;->left:I

    .line 2431
    .local v4, nextLeft:I
    #v4=(Integer);
    iget-object v5, p0, Landroid/support/v4/view/ViewPager;->mTempRect:Landroid/graphics/Rect;

    invoke-direct {p0, v5, v1}, Landroid/support/v4/view/ViewPager;->getChildRectInPagerCoordinates(Landroid/graphics/Rect;Landroid/view/View;)Landroid/graphics/Rect;

    move-result-object v5

    iget v0, v5, Landroid/graphics/Rect;->left:I

    .line 2432
    .local v0, currLeft:I
    #v0=(Integer);
    if-eqz v1, :cond_3

    if-lt v4, v0, :cond_3

    .line 2433
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->pageLeft()Z

    move-result v2

    .line 2455
    .end local v0           #currLeft:I
    .end local v4           #nextLeft:I
    :cond_1
    :goto_0
    #v0=(Conflicted);v2=(Boolean);v4=(Conflicted);v5=(Conflicted);
    if-eqz v2, :cond_2

    .line 2456
    invoke-static {p1}, Landroid/view/SoundEffectConstants;->getContantForFocusDirection(I)I

    move-result v5

    #v5=(Integer);
    invoke-virtual {p0, v5}, Landroid/support/v4/view/ViewPager;->playSoundEffect(I)V

    .line 2458
    :cond_2
    #v5=(Conflicted);
    return v2

    .line 2435
    .restart local v0       #currLeft:I
    .restart local v4       #nextLeft:I
    :cond_3
    #v0=(Integer);v2=(Null);v4=(Integer);v5=(Reference);
    invoke-virtual {v3}, Landroid/view/View;->requestFocus()Z

    move-result v2

    #v2=(Boolean);
    goto :goto_0

    .line 2437
    .end local v0           #currLeft:I
    .end local v4           #nextLeft:I
    :cond_4
    #v0=(Uninit);v2=(Null);v4=(Uninit);
    if-ne p1, v7, :cond_1

    .line 2440
    iget-object v5, p0, Landroid/support/v4/view/ViewPager;->mTempRect:Landroid/graphics/Rect;

    invoke-direct {p0, v5, v3}, Landroid/support/v4/view/ViewPager;->getChildRectInPagerCoordinates(Landroid/graphics/Rect;Landroid/view/View;)Landroid/graphics/Rect;

    move-result-object v5

    iget v4, v5, Landroid/graphics/Rect;->left:I

    .line 2441
    .restart local v4       #nextLeft:I
    #v4=(Integer);
    iget-object v5, p0, Landroid/support/v4/view/ViewPager;->mTempRect:Landroid/graphics/Rect;

    invoke-direct {p0, v5, v1}, Landroid/support/v4/view/ViewPager;->getChildRectInPagerCoordinates(Landroid/graphics/Rect;Landroid/view/View;)Landroid/graphics/Rect;

    move-result-object v5

    iget v0, v5, Landroid/graphics/Rect;->left:I

    .line 2442
    .restart local v0       #currLeft:I
    #v0=(Integer);
    if-eqz v1, :cond_5

    if-gt v4, v0, :cond_5

    .line 2443
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->pageRight()Z

    move-result v2

    #v2=(Boolean);
    goto :goto_0

    .line 2445
    :cond_5
    #v2=(Null);
    invoke-virtual {v3}, Landroid/view/View;->requestFocus()Z

    move-result v2

    #v2=(Boolean);
    goto :goto_0

    .line 2448
    .end local v0           #currLeft:I
    .end local v4           #nextLeft:I
    :cond_6
    #v0=(Uninit);v2=(Null);v4=(Uninit);
    if-eq p1, v6, :cond_7

    const/4 v5, 0x1

    #v5=(One);
    if-ne p1, v5, :cond_8

    .line 2450
    :cond_7
    #v5=(Conflicted);
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->pageLeft()Z

    move-result v2

    #v2=(Boolean);
    goto :goto_0

    .line 2451
    :cond_8
    #v2=(Null);v5=(One);
    if-eq p1, v7, :cond_9

    const/4 v5, 0x2

    #v5=(PosByte);
    if-ne p1, v5, :cond_1

    .line 2453
    :cond_9
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->pageRight()Z

    move-result v2

    #v2=(Boolean);
    goto :goto_0
.end method

.method public beginFakeDrag()Z
    .locals 10

    .prologue
    const/4 v9, 0x1

    #v9=(One);
    const/4 v4, 0x0

    #v4=(Null);
    const/4 v5, 0x0

    .line 2194
    #v5=(Null);
    iget-boolean v2, p0, Landroid/support/v4/view/ViewPager;->mIsBeingDragged:Z

    #v2=(Boolean);
    if-eqz v2, :cond_0

    .line 2210
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Boolean);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    return v4

    .line 2197
    :cond_0
    #v0=(Uninit);v1=(Uninit);v2=(Boolean);v3=(Uninit);v4=(Null);v6=(Uninit);v7=(Uninit);v8=(Uninit);
    iput-boolean v9, p0, Landroid/support/v4/view/ViewPager;->mFakeDragging:Z

    .line 2198
    invoke-direct {p0, v9}, Landroid/support/v4/view/ViewPager;->setScrollState(I)V

    .line 2199
    iput v5, p0, Landroid/support/v4/view/ViewPager;->mLastMotionX:F

    iput v5, p0, Landroid/support/v4/view/ViewPager;->mInitialMotionX:F

    .line 2200
    iget-object v2, p0, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;

    #v2=(Reference);
    if-nez v2, :cond_1

    .line 2201
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v2

    iput-object v2, p0, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;

    .line 2205
    :goto_1
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    .local v0, time:J
    #v0=(LongLo);v1=(LongHi);
    move-wide v2, v0

    #v2=(LongLo);v3=(LongHi);
    move v6, v5

    #v6=(Null);
    move v7, v4

    .line 2206
    #v7=(Null);
    invoke-static/range {v0 .. v7}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    move-result-object v8

    .line 2207
    .local v8, ev:Landroid/view/MotionEvent;
    #v8=(Reference);
    iget-object v2, p0, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;

    #v2=(Reference);
    invoke-virtual {v2, v8}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 2208
    invoke-virtual {v8}, Landroid/view/MotionEvent;->recycle()V

    .line 2209
    iput-wide v0, p0, Landroid/support/v4/view/ViewPager;->mFakeDragBeginTime:J

    move v4, v9

    .line 2210
    #v4=(One);
    goto :goto_0

    .line 2203
    .end local v0           #time:J
    .end local v8           #ev:Landroid/view/MotionEvent;
    :cond_1
    #v0=(Uninit);v1=(Uninit);v3=(Uninit);v4=(Null);v6=(Uninit);v7=(Uninit);v8=(Uninit);
    iget-object v2, p0, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;

    invoke-virtual {v2}, Landroid/view/VelocityTracker;->clear()V

    goto :goto_1
.end method

.method protected canScroll(Landroid/view/View;ZIII)Z
    .locals 11
    .parameter "v"
    .parameter "checkV"
    .parameter "dx"
    .parameter "x"
    .parameter "y"

    .prologue
    .line 2356
    instance-of v0, p1, Landroid/view/ViewGroup;

    #v0=(Boolean);
    if-eqz v0, :cond_1

    move-object v7, p1

    .line 2357
    #v7=(Reference);
    check-cast v7, Landroid/view/ViewGroup;

    .line 2358
    .local v7, group:Landroid/view/ViewGroup;
    invoke-virtual {p1}, Landroid/view/View;->getScrollX()I

    move-result v9

    .line 2359
    .local v9, scrollX:I
    #v9=(Integer);
    invoke-virtual {p1}, Landroid/view/View;->getScrollY()I

    move-result v10

    .line 2360
    .local v10, scrollY:I
    #v10=(Integer);
    invoke-virtual {v7}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v6

    .line 2362
    .local v6, count:I
    #v6=(Integer);
    add-int/lit8 v8, v6, -0x1

    .local v8, i:I
    :goto_0
    #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v8=(Integer);
    if-ltz v8, :cond_1

    .line 2365
    invoke-virtual {v7, v8}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 2366
    .local v1, child:Landroid/view/View;
    #v1=(Reference);
    add-int v0, p4, v9

    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    move-result v2

    #v2=(Integer);
    if-lt v0, v2, :cond_0

    add-int v0, p4, v9

    invoke-virtual {v1}, Landroid/view/View;->getRight()I

    move-result v2

    if-ge v0, v2, :cond_0

    add-int v0, p5, v10

    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v2

    if-lt v0, v2, :cond_0

    add-int v0, p5, v10

    invoke-virtual {v1}, Landroid/view/View;->getBottom()I

    move-result v2

    if-ge v0, v2, :cond_0

    const/4 v2, 0x1

    #v2=(One);
    add-int v0, p4, v9

    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    move-result v3

    #v3=(Integer);
    sub-int v4, v0, v3

    #v4=(Integer);
    add-int v0, p5, v10

    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v3

    sub-int v5, v0, v3

    #v5=(Integer);
    move-object v0, p0

    #v0=(Reference);
    move v3, p3

    invoke-virtual/range {v0 .. v5}, Landroid/support/v4/view/ViewPager;->canScroll(Landroid/view/View;ZIII)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 2370
    const/4 v0, 0x1

    .line 2375
    .end local v1           #child:Landroid/view/View;
    .end local v6           #count:I
    .end local v7           #group:Landroid/view/ViewGroup;
    .end local v8           #i:I
    .end local v9           #scrollX:I
    .end local v10           #scrollY:I
    :goto_1
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
    return v0

    .line 2362
    .restart local v1       #child:Landroid/view/View;
    .restart local v6       #count:I
    .restart local v7       #group:Landroid/view/ViewGroup;
    .restart local v8       #i:I
    .restart local v9       #scrollX:I
    .restart local v10       #scrollY:I
    :cond_0
    #v0=(Integer);v1=(Reference);v2=(Integer);v6=(Integer);v7=(Reference);v8=(Integer);v9=(Integer);v10=(Integer);
    add-int/lit8 v8, v8, -0x1

    goto :goto_0

    .line 2375
    .end local v1           #child:Landroid/view/View;
    .end local v6           #count:I
    .end local v7           #group:Landroid/view/ViewGroup;
    .end local v8           #i:I
    .end local v9           #scrollX:I
    .end local v10           #scrollY:I
    :cond_1
    #v1=(Conflicted);v2=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
    if-eqz p2, :cond_2

    neg-int v0, p3

    invoke-static {p1, v0}, Landroid/support/v4/view/ViewCompat;->canScrollHorizontally(Landroid/view/View;I)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_2

    const/4 v0, 0x1

    #v0=(One);
    goto :goto_1

    :cond_2
    #v0=(Integer);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_1
.end method

.method protected checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .locals 1
    .parameter "p"

    .prologue
    .line 2633
    instance-of v0, p1, Landroid/support/v4/view/ViewPager$LayoutParams;

    #v0=(Boolean);
    if-eqz v0, :cond_0

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public computeScroll()V
    .locals 5

    .prologue
    .line 1542
    iget-object v4, p0, Landroid/support/v4/view/ViewPager;->mScroller:Landroid/widget/Scroller;

    #v4=(Reference);
    invoke-virtual {v4}, Landroid/widget/Scroller;->isFinished()Z

    move-result v4

    #v4=(Boolean);
    if-nez v4, :cond_2

    iget-object v4, p0, Landroid/support/v4/view/ViewPager;->mScroller:Landroid/widget/Scroller;

    #v4=(Reference);
    invoke-virtual {v4}, Landroid/widget/Scroller;->computeScrollOffset()Z

    move-result v4

    #v4=(Boolean);
    if-eqz v4, :cond_2

    .line 1543
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getScrollX()I

    move-result v0

    .line 1544
    .local v0, oldX:I
    #v0=(Integer);
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getScrollY()I

    move-result v1

    .line 1545
    .local v1, oldY:I
    #v1=(Integer);
    iget-object v4, p0, Landroid/support/v4/view/ViewPager;->mScroller:Landroid/widget/Scroller;

    #v4=(Reference);
    invoke-virtual {v4}, Landroid/widget/Scroller;->getCurrX()I

    move-result v2

    .line 1546
    .local v2, x:I
    #v2=(Integer);
    iget-object v4, p0, Landroid/support/v4/view/ViewPager;->mScroller:Landroid/widget/Scroller;

    invoke-virtual {v4}, Landroid/widget/Scroller;->getCurrY()I

    move-result v3

    .line 1548
    .local v3, y:I
    #v3=(Integer);
    if-ne v0, v2, :cond_0

    if-eq v1, v3, :cond_1

    .line 1549
    :cond_0
    invoke-virtual {p0, v2, v3}, Landroid/support/v4/view/ViewPager;->scrollTo(II)V

    .line 1550
    invoke-direct {p0, v2}, Landroid/support/v4/view/ViewPager;->pageScrolled(I)Z

    move-result v4

    #v4=(Boolean);
    if-nez v4, :cond_1

    .line 1551
    iget-object v4, p0, Landroid/support/v4/view/ViewPager;->mScroller:Landroid/widget/Scroller;

    #v4=(Reference);
    invoke-virtual {v4}, Landroid/widget/Scroller;->abortAnimation()V

    .line 1552
    const/4 v4, 0x0

    #v4=(Null);
    invoke-virtual {p0, v4, v3}, Landroid/support/v4/view/ViewPager;->scrollTo(II)V

    .line 1557
    :cond_1
    #v4=(Conflicted);
    invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->postInvalidateOnAnimation(Landroid/view/View;)V

    .line 1563
    .end local v0           #oldX:I
    .end local v1           #oldY:I
    .end local v2           #x:I
    .end local v3           #y:I
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    return-void

    .line 1562
    :cond_2
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Boolean);
    const/4 v4, 0x1

    #v4=(One);
    invoke-direct {p0, v4}, Landroid/support/v4/view/ViewPager;->completeScroll(Z)V

    goto :goto_0
.end method

.method dataSetChanged()V
    .locals 14

    .prologue
    const/4 v9, 0x1

    #v9=(One);
    const/4 v10, 0x0

    .line 813
    #v10=(Null);
    iget-object v11, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;

    #v11=(Reference);
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v11

    #v11=(Integer);
    iget v12, p0, Landroid/support/v4/view/ViewPager;->mOffscreenPageLimit:I

    #v12=(Integer);
    mul-int/lit8 v12, v12, 0x2

    add-int/lit8 v12, v12, 0x1

    if-ge v11, v12, :cond_1

    iget-object v11, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;

    #v11=(Reference);
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v11

    #v11=(Integer);
    iget-object v12, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;

    #v12=(Reference);
    invoke-virtual {v12}, Landroid/support/v4/view/PagerAdapter;->getCount()I

    move-result v12

    #v12=(Integer);
    if-ge v11, v12, :cond_1

    move v6, v9

    .line 815
    .local v6, needPopulate:Z
    :goto_0
    #v6=(Boolean);
    iget v7, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I

    .line 817
    .local v7, newCurrItem:I
    #v7=(Integer);
    const/4 v4, 0x0

    .line 818
    .local v4, isUpdating:Z
    #v4=(Null);
    const/4 v2, 0x0

    .local v2, i:I
    :goto_1
    #v2=(Integer);v3=(Conflicted);v4=(Boolean);v8=(Conflicted);v12=(Conflicted);v13=(Conflicted);
    iget-object v11, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;

    #v11=(Reference);
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v11

    #v11=(Integer);
    if-ge v2, v11, :cond_6

    .line 819
    iget-object v11, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;

    #v11=(Reference);
    invoke-virtual {v11, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    #v3=(Reference);
    check-cast v3, Landroid/support/v4/view/ViewPager$ItemInfo;

    .line 820
    .local v3, ii:Landroid/support/v4/view/ViewPager$ItemInfo;
    iget-object v11, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;

    iget-object v12, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->object:Ljava/lang/Object;

    #v12=(Reference);
    invoke-virtual {v11, v12}, Landroid/support/v4/view/PagerAdapter;->getItemPosition(Ljava/lang/Object;)I

    move-result v8

    .line 822
    .local v8, newPos:I
    #v8=(Integer);
    const/4 v11, -0x1

    #v11=(Byte);
    if-ne v8, v11, :cond_2

    .line 818
    :cond_0
    :goto_2
    #v11=(Integer);v12=(Conflicted);
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .end local v2           #i:I
    .end local v3           #ii:Landroid/support/v4/view/ViewPager$ItemInfo;
    .end local v4           #isUpdating:Z
    .end local v6           #needPopulate:Z
    .end local v7           #newCurrItem:I
    .end local v8           #newPos:I
    :cond_1
    #v2=(Uninit);v3=(Uninit);v4=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v12=(Integer);v13=(Uninit);
    move v6, v10

    .line 813
    #v6=(Null);
    goto :goto_0

    .line 826
    .restart local v2       #i:I
    .restart local v3       #ii:Landroid/support/v4/view/ViewPager$ItemInfo;
    .restart local v4       #isUpdating:Z
    .restart local v6       #needPopulate:Z
    .restart local v7       #newCurrItem:I
    .restart local v8       #newPos:I
    :cond_2
    #v2=(Integer);v3=(Reference);v4=(Boolean);v6=(Boolean);v7=(Integer);v8=(Integer);v11=(Byte);v12=(Reference);v13=(Conflicted);
    const/4 v11, -0x2

    if-ne v8, v11, :cond_4

    .line 827
    iget-object v11, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;

    #v11=(Reference);
    invoke-virtual {v11, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 828
    add-int/lit8 v2, v2, -0x1

    .line 830
    if-nez v4, :cond_3

    .line 831
    iget-object v11, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;

    invoke-virtual {v11, p0}, Landroid/support/v4/view/PagerAdapter;->startUpdate(Landroid/view/ViewGroup;)V

    .line 832
    const/4 v4, 0x1

    .line 835
    :cond_3
    iget-object v11, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;

    iget v12, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I

    #v12=(Integer);
    iget-object v13, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->object:Ljava/lang/Object;

    #v13=(Reference);
    invoke-virtual {v11, p0, v12, v13}, Landroid/support/v4/view/PagerAdapter;->destroyItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V

    .line 836
    const/4 v6, 0x1

    .line 838
    #v6=(One);
    iget v11, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I

    #v11=(Integer);
    iget v12, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I

    if-ne v11, v12, :cond_0

    .line 840
    iget v11, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I

    iget-object v12, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;

    #v12=(Reference);
    invoke-virtual {v12}, Landroid/support/v4/view/PagerAdapter;->getCount()I

    move-result v12

    #v12=(Integer);
    add-int/lit8 v12, v12, -0x1

    invoke-static {v11, v12}, Ljava/lang/Math;->min(II)I

    move-result v11

    invoke-static {v10, v11}, Ljava/lang/Math;->max(II)I

    move-result v7

    .line 841
    const/4 v6, 0x1

    goto :goto_2

    .line 846
    :cond_4
    #v6=(Boolean);v11=(Byte);v12=(Reference);v13=(Conflicted);
    iget v11, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I

    #v11=(Integer);
    if-eq v11, v8, :cond_0

    .line 847
    iget v11, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I

    iget v12, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I

    #v12=(Integer);
    if-ne v11, v12, :cond_5

    .line 849
    move v7, v8

    .line 852
    :cond_5
    iput v8, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I

    .line 853
    const/4 v6, 0x1

    #v6=(One);
    goto :goto_2

    .line 857
    .end local v3           #ii:Landroid/support/v4/view/ViewPager$ItemInfo;
    .end local v8           #newPos:I
    :cond_6
    #v3=(Conflicted);v6=(Boolean);v8=(Conflicted);v12=(Conflicted);
    if-eqz v4, :cond_7

    .line 858
    iget-object v11, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;

    #v11=(Reference);
    invoke-virtual {v11, p0}, Landroid/support/v4/view/PagerAdapter;->finishUpdate(Landroid/view/ViewGroup;)V

    .line 861
    :cond_7
    #v11=(Conflicted);
    iget-object v11, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;

    #v11=(Reference);
    sget-object v12, Landroid/support/v4/view/ViewPager;->COMPARATOR:Ljava/util/Comparator;

    #v12=(Reference);
    invoke-static {v11, v12}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 863
    if-eqz v6, :cond_a

    .line 865
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getChildCount()I

    move-result v1

    .line 866
    .local v1, childCount:I
    #v1=(Integer);
    const/4 v2, 0x0

    :goto_3
    #v0=(Conflicted);v5=(Conflicted);v11=(Conflicted);
    if-ge v2, v1, :cond_9

    .line 867
    invoke-virtual {p0, v2}, Landroid/support/v4/view/ViewPager;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 868
    .local v0, child:Landroid/view/View;
    #v0=(Reference);
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    #v5=(Reference);
    check-cast v5, Landroid/support/v4/view/ViewPager$LayoutParams;

    .line 869
    .local v5, lp:Landroid/support/v4/view/ViewPager$LayoutParams;
    iget-boolean v11, v5, Landroid/support/v4/view/ViewPager$LayoutParams;->isDecor:Z

    #v11=(Boolean);
    if-nez v11, :cond_8

    .line 870
    const/4 v11, 0x0

    #v11=(Null);
    iput v11, v5, Landroid/support/v4/view/ViewPager$LayoutParams;->widthFactor:F

    .line 866
    :cond_8
    #v11=(Boolean);
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    .line 874
    .end local v0           #child:Landroid/view/View;
    .end local v5           #lp:Landroid/support/v4/view/ViewPager$LayoutParams;
    :cond_9
    #v0=(Conflicted);v5=(Conflicted);v11=(Conflicted);
    invoke-virtual {p0, v7, v10, v9}, Landroid/support/v4/view/ViewPager;->setCurrentItemInternal(IZZ)V

    .line 875
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->requestLayout()V

    .line 877
    .end local v1           #childCount:I
    :cond_a
    #v1=(Conflicted);
    return-void
.end method

.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 1
    .parameter "event"

    .prologue
    .line 2381
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_0

    invoke-virtual {p0, p1}, Landroid/support/v4/view/ViewPager;->executeKeyEvent(Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 6
    .parameter "event"

    .prologue
    .line 2606
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getChildCount()I

    move-result v1

    .line 2607
    .local v1, childCount:I
    #v1=(Integer);
    const/4 v2, 0x0

    .local v2, i:I
    :goto_0
    #v0=(Conflicted);v2=(Integer);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    if-ge v2, v1, :cond_1

    .line 2608
    invoke-virtual {p0, v2}, Landroid/support/v4/view/ViewPager;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 2609
    .local v0, child:Landroid/view/View;
    #v0=(Reference);
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v4

    #v4=(Integer);
    if-nez v4, :cond_0

    .line 2610
    invoke-virtual {p0, v0}, Landroid/support/v4/view/ViewPager;->infoForChild(Landroid/view/View;)Landroid/support/v4/view/ViewPager$ItemInfo;

    move-result-object v3

    .line 2611
    .local v3, ii:Landroid/support/v4/view/ViewPager$ItemInfo;
    #v3=(Reference);
    if-eqz v3, :cond_0

    iget v4, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I

    iget v5, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I

    #v5=(Integer);
    if-ne v4, v5, :cond_0

    invoke-virtual {v0, p1}, Landroid/view/View;->dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result v4

    #v4=(Boolean);
    if-eqz v4, :cond_0

    .line 2613
    const/4 v4, 0x1

    .line 2618
    .end local v0           #child:Landroid/view/View;
    .end local v3           #ii:Landroid/support/v4/view/ViewPager$ItemInfo;
    :goto_1
    #v0=(Conflicted);v3=(Conflicted);v5=(Conflicted);
    return v4

    .line 2607
    .restart local v0       #child:Landroid/view/View;
    :cond_0
    #v0=(Reference);v4=(Integer);
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 2618
    .end local v0           #child:Landroid/view/View;
    :cond_1
    #v0=(Conflicted);v4=(Conflicted);
    const/4 v4, 0x0

    #v4=(Null);
    goto :goto_1
.end method

.method distanceInfluenceForSnapDuration(F)F
    .locals 4
    .parameter "f"

    .prologue
    .line 734
    const/high16 v0, 0x3f00

    #v0=(Integer);
    sub-float/2addr p1, v0

    .line 735
    float-to-double v0, p1

    #v0=(DoubleLo);v1=(DoubleHi);
    const-wide v2, 0x3fde28c7460698c7L

    #v2=(LongLo);v3=(LongHi);
    mul-double/2addr v0, v2

    double-to-float p1, v0

    .line 736
    float-to-double v0, p1

    invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D

    move-result-wide v0

    double-to-float v0, v0

    #v0=(Float);
    return v0
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 8
    .parameter "canvas"

    .prologue
    const/4 v6, 0x1

    .line 2092
    #v6=(One);
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->draw(Landroid/graphics/Canvas;)V

    .line 2093
    const/4 v1, 0x0

    .line 2095
    .local v1, needsInvalidate:Z
    #v1=(Null);
    invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->getOverScrollMode(Landroid/view/View;)I

    move-result v2

    .line 2096
    .local v2, overScrollMode:I
    #v2=(Integer);
    if-eqz v2, :cond_0

    if-ne v2, v6, :cond_4

    iget-object v5, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;

    #v5=(Reference);
    if-eqz v5, :cond_4

    iget-object v5, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;

    invoke-virtual {v5}, Landroid/support/v4/view/PagerAdapter;->getCount()I

    move-result v5

    #v5=(Integer);
    if-le v5, v6, :cond_4

    .line 2099
    :cond_0
    #v5=(Conflicted);
    iget-object v5, p0, Landroid/support/v4/view/ViewPager;->mLeftEdge:Landroid/support/v4/widget/EdgeEffectCompat;

    #v5=(Reference);
    invoke-virtual {v5}, Landroid/support/v4/widget/EdgeEffectCompat;->isFinished()Z

    move-result v5

    #v5=(Boolean);
    if-nez v5, :cond_1

    .line 2100
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v3

    .line 2101
    .local v3, restoreCount:I
    #v3=(Integer);
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getHeight()I

    move-result v5

    #v5=(Integer);
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getPaddingTop()I

    move-result v6

    #v6=(Integer);
    sub-int/2addr v5, v6

    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getPaddingBottom()I

    move-result v6

    sub-int v0, v5, v6

    .line 2102
    .local v0, height:I
    #v0=(Integer);
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getWidth()I

    move-result v4

    .line 2104
    .local v4, width:I
    #v4=(Integer);
    const/high16 v5, 0x4387

    invoke-virtual {p1, v5}, Landroid/graphics/Canvas;->rotate(F)V

    .line 2105
    neg-int v5, v0

    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getPaddingTop()I

    move-result v6

    add-int/2addr v5, v6

    int-to-float v5, v5

    #v5=(Float);
    iget v6, p0, Landroid/support/v4/view/ViewPager;->mFirstOffset:F

    int-to-float v7, v4

    #v7=(Float);
    mul-float/2addr v6, v7

    #v6=(Float);
    invoke-virtual {p1, v5, v6}, Landroid/graphics/Canvas;->translate(FF)V

    .line 2106
    iget-object v5, p0, Landroid/support/v4/view/ViewPager;->mLeftEdge:Landroid/support/v4/widget/EdgeEffectCompat;

    #v5=(Reference);
    invoke-virtual {v5, v0, v4}, Landroid/support/v4/widget/EdgeEffectCompat;->setSize(II)V

    .line 2107
    iget-object v5, p0, Landroid/support/v4/view/ViewPager;->mLeftEdge:Landroid/support/v4/widget/EdgeEffectCompat;

    invoke-virtual {v5, p1}, Landroid/support/v4/widget/EdgeEffectCompat;->draw(Landroid/graphics/Canvas;)Z

    move-result v5

    #v5=(Boolean);
    or-int/2addr v1, v5

    .line 2108
    #v1=(Boolean);
    invoke-virtual {p1, v3}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 2110
    .end local v0           #height:I
    .end local v3           #restoreCount:I
    .end local v4           #width:I
    :cond_1
    #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);v7=(Conflicted);
    iget-object v5, p0, Landroid/support/v4/view/ViewPager;->mRightEdge:Landroid/support/v4/widget/EdgeEffectCompat;

    #v5=(Reference);
    invoke-virtual {v5}, Landroid/support/v4/widget/EdgeEffectCompat;->isFinished()Z

    move-result v5

    #v5=(Boolean);
    if-nez v5, :cond_2

    .line 2111
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    move-result v3

    .line 2112
    .restart local v3       #restoreCount:I
    #v3=(Integer);
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getWidth()I

    move-result v4

    .line 2113
    .restart local v4       #width:I
    #v4=(Integer);
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getHeight()I

    move-result v5

    #v5=(Integer);
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getPaddingTop()I

    move-result v6

    #v6=(Integer);
    sub-int/2addr v5, v6

    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getPaddingBottom()I

    move-result v6

    sub-int v0, v5, v6

    .line 2115
    .restart local v0       #height:I
    #v0=(Integer);
    const/high16 v5, 0x42b4

    invoke-virtual {p1, v5}, Landroid/graphics/Canvas;->rotate(F)V

    .line 2116
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getPaddingTop()I

    move-result v5

    neg-int v5, v5

    int-to-float v5, v5

    #v5=(Float);
    iget v6, p0, Landroid/support/v4/view/ViewPager;->mLastOffset:F

    const/high16 v7, 0x3f80

    #v7=(Integer);
    add-float/2addr v6, v7

    #v6=(Float);
    neg-float v6, v6

    int-to-float v7, v4

    #v7=(Float);
    mul-float/2addr v6, v7

    invoke-virtual {p1, v5, v6}, Landroid/graphics/Canvas;->translate(FF)V

    .line 2117
    iget-object v5, p0, Landroid/support/v4/view/ViewPager;->mRightEdge:Landroid/support/v4/widget/EdgeEffectCompat;

    #v5=(Reference);
    invoke-virtual {v5, v0, v4}, Landroid/support/v4/widget/EdgeEffectCompat;->setSize(II)V

    .line 2118
    iget-object v5, p0, Landroid/support/v4/view/ViewPager;->mRightEdge:Landroid/support/v4/widget/EdgeEffectCompat;

    invoke-virtual {v5, p1}, Landroid/support/v4/widget/EdgeEffectCompat;->draw(Landroid/graphics/Canvas;)Z

    move-result v5

    #v5=(Boolean);
    or-int/2addr v1, v5

    .line 2119
    invoke-virtual {p1, v3}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 2126
    .end local v0           #height:I
    .end local v3           #restoreCount:I
    .end local v4           #width:I
    :cond_2
    :goto_0
    #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);
    if-eqz v1, :cond_3

    .line 2128
    invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->postInvalidateOnAnimation(Landroid/view/View;)V

    .line 2130
    :cond_3
    return-void

    .line 2122
    :cond_4
    #v0=(Uninit);v1=(Null);v3=(Uninit);v4=(Uninit);v6=(One);v7=(Uninit);
    iget-object v5, p0, Landroid/support/v4/view/ViewPager;->mLeftEdge:Landroid/support/v4/widget/EdgeEffectCompat;

    #v5=(Reference);
    invoke-virtual {v5}, Landroid/support/v4/widget/EdgeEffectCompat;->finish()V

    .line 2123
    iget-object v5, p0, Landroid/support/v4/view/ViewPager;->mRightEdge:Landroid/support/v4/widget/EdgeEffectCompat;

    invoke-virtual {v5}, Landroid/support/v4/widget/EdgeEffectCompat;->finish()V

    goto :goto_0
.end method

.method protected drawableStateChanged()V
    .locals 2

    .prologue
    .line 722
    invoke-super {p0}, Landroid/view/ViewGroup;->drawableStateChanged()V

    .line 723
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mMarginDrawable:Landroid/graphics/drawable/Drawable;

    .line 724
    .local v0, d:Landroid/graphics/drawable/Drawable;
    #v0=(Reference);
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_0

    .line 725
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getDrawableState()[I

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 727
    :cond_0
    #v1=(Conflicted);
    return-void
.end method

.method public endFakeDrag()V
    .locals 12

    .prologue
    const/4 v11, 0x1

    .line 2220
    #v11=(One);
    iget-boolean v9, p0, Landroid/support/v4/view/ViewPager;->mFakeDragging:Z

    #v9=(Boolean);
    if-nez v9, :cond_0

    .line 2221
    new-instance v9, Ljava/lang/IllegalStateException;

    #v9=(UninitRef);
    const-string v10, "No fake drag in progress. Call beginFakeDrag first."

    #v10=(Reference);
    invoke-direct {v9, v10}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    #v9=(Reference);
    throw v9

    .line 2224
    :cond_0
    #v9=(Boolean);v10=(Uninit);
    iget-object v7, p0, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;

    .line 2225
    .local v7, velocityTracker:Landroid/view/VelocityTracker;
    #v7=(Reference);
    const/16 v9, 0x3e8

    #v9=(PosShort);
    iget v10, p0, Landroid/support/v4/view/ViewPager;->mMaximumVelocity:I

    #v10=(Integer);
    int-to-float v10, v10

    #v10=(Float);
    invoke-virtual {v7, v9, v10}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V

    .line 2226
    iget v9, p0, Landroid/support/v4/view/ViewPager;->mActivePointerId:I

    #v9=(Integer);
    invoke-static {v7, v9}, Landroid/support/v4/view/VelocityTrackerCompat;->getXVelocity(Landroid/view/VelocityTracker;I)F

    move-result v9

    #v9=(Float);
    float-to-int v2, v9

    .line 2228
    .local v2, initialVelocity:I
    #v2=(Integer);
    iput-boolean v11, p0, Landroid/support/v4/view/ViewPager;->mPopulatePending:Z

    .line 2229
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getWidth()I

    move-result v8

    .line 2230
    .local v8, width:I
    #v8=(Integer);
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getScrollX()I

    move-result v5

    .line 2231
    .local v5, scrollX:I
    #v5=(Integer);
    invoke-direct {p0}, Landroid/support/v4/view/ViewPager;->infoForCurrentScrollPosition()Landroid/support/v4/view/ViewPager$ItemInfo;

    move-result-object v1

    .line 2232
    .local v1, ii:Landroid/support/v4/view/ViewPager$ItemInfo;
    #v1=(Reference);
    iget v0, v1, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I

    .line 2233
    .local v0, currentPage:I
    #v0=(Integer);
    int-to-float v9, v5

    int-to-float v10, v8

    div-float/2addr v9, v10

    iget v10, v1, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F

    #v10=(Integer);
    sub-float/2addr v9, v10

    iget v10, v1, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F

    div-float v4, v9, v10

    .line 2234
    .local v4, pageOffset:F
    #v4=(Float);
    iget v9, p0, Landroid/support/v4/view/ViewPager;->mLastMotionX:F

    #v9=(Integer);
    iget v10, p0, Landroid/support/v4/view/ViewPager;->mInitialMotionX:F

    sub-float/2addr v9, v10

    #v9=(Float);
    float-to-int v6, v9

    .line 2235
    .local v6, totalDelta:I
    #v6=(Integer);
    invoke-direct {p0, v0, v4, v2, v6}, Landroid/support/v4/view/ViewPager;->determineTargetPage(IFII)I

    move-result v3

    .line 2237
    .local v3, nextPage:I
    #v3=(Integer);
    invoke-virtual {p0, v3, v11, v11, v2}, Landroid/support/v4/view/ViewPager;->setCurrentItemInternal(IZZI)V

    .line 2238
    invoke-direct {p0}, Landroid/support/v4/view/ViewPager;->endDrag()V

    .line 2240
    const/4 v9, 0x0

    #v9=(Null);
    iput-boolean v9, p0, Landroid/support/v4/view/ViewPager;->mFakeDragging:Z

    .line 2241
    return-void
.end method

.method public executeKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 4
    .parameter "event"

    .prologue
    const/4 v3, 0x1

    .line 2393
    #v3=(One);
    const/4 v0, 0x0

    .line 2394
    .local v0, handled:Z
    #v0=(Null);
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v1

    #v1=(Integer);
    if-nez v1, :cond_0

    .line 2395
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    .line 2415
    :cond_0
    :goto_0
    #v0=(Boolean);v2=(Conflicted);
    return v0

    .line 2397
    :sswitch_0
    #v0=(Null);v2=(Uninit);
    const/16 v1, 0x11

    #v1=(PosByte);
    invoke-virtual {p0, v1}, Landroid/support/v4/view/ViewPager;->arrowScroll(I)Z

    move-result v0

    .line 2398
    #v0=(Boolean);
    goto :goto_0

    .line 2400
    :sswitch_1
    #v0=(Null);v1=(Integer);
    const/16 v1, 0x42

    #v1=(PosByte);
    invoke-virtual {p0, v1}, Landroid/support/v4/view/ViewPager;->arrowScroll(I)Z

    move-result v0

    .line 2401
    #v0=(Boolean);
    goto :goto_0

    .line 2403
    :sswitch_2
    #v0=(Null);v1=(Integer);
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0xb

    #v2=(PosByte);
    if-lt v1, v2, :cond_0

    .line 2406
    invoke-static {p1}, Landroid/support/v4/view/KeyEventCompat;->hasNoModifiers(Landroid/view/KeyEvent;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_1

    .line 2407
    const/4 v1, 0x2

    #v1=(PosByte);
    invoke-virtual {p0, v1}, Landroid/support/v4/view/ViewPager;->arrowScroll(I)Z

    move-result v0

    #v0=(Boolean);
    goto :goto_0

    .line 2408
    :cond_1
    #v0=(Null);v1=(Boolean);
    invoke-static {p1, v3}, Landroid/support/v4/view/KeyEventCompat;->hasModifiers(Landroid/view/KeyEvent;I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 2409
    invoke-virtual {p0, v3}, Landroid/support/v4/view/ViewPager;->arrowScroll(I)Z

    move-result v0

    #v0=(Boolean);
    goto :goto_0

    .line 2395
    #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);p0=(Unknown);p1=(Unknown);
    nop

    :sswitch_data_0
    .sparse-switch
        0x15 -> :sswitch_0
        0x16 -> :sswitch_1
        0x3d -> :sswitch_2
    .end sparse-switch
.end method

.method public fakeDragBy(F)V
    .locals 17
    .parameter "xOffset"

    .prologue
    .line 2251
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-boolean v1, v0, Landroid/support/v4/view/ViewPager;->mFakeDragging:Z

    #v1=(Boolean);
    if-nez v1, :cond_0

    .line 2252
    new-instance v1, Ljava/lang/IllegalStateException;

    #v1=(UninitRef);
    const-string v2, "No fake drag in progress. Call beginFakeDrag first."

    #v2=(Reference);
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    throw v1

    .line 2255
    :cond_0
    #v1=(Boolean);v2=(Uninit);
    move-object/from16 v0, p0

    iget v1, v0, Landroid/support/v4/view/ViewPager;->mLastMotionX:F

    #v1=(Integer);
    add-float v1, v1, p1

    #v1=(Float);
    move-object/from16 v0, p0

    iput v1, v0, Landroid/support/v4/view/ViewPager;->mLastMotionX:F

    .line 2257
    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getScrollX()I

    move-result v1

    #v1=(Integer);
    int-to-float v13, v1

    .line 2258
    .local v13, oldScrollX:F
    #v13=(Float);
    sub-float v15, v13, p1

    .line 2259
    .local v15, scrollX:F
    #v15=(Float);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getWidth()I

    move-result v16

    .line 2261
    .local v16, width:I
    #v16=(Integer);
    move/from16 v0, v16

    #v0=(Integer);
    int-to-float v1, v0

    #v1=(Float);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget v2, v0, Landroid/support/v4/view/ViewPager;->mFirstOffset:F

    #v2=(Integer);
    mul-float v12, v1, v2

    .line 2262
    .local v12, leftBound:F
    #v12=(Float);
    move/from16 v0, v16

    #v0=(Integer);
    int-to-float v1, v0

    move-object/from16 v0, p0

    #v0=(Reference);
    iget v2, v0, Landroid/support/v4/view/ViewPager;->mLastOffset:F

    mul-float v14, v1, v2

    .line 2264
    .local v14, rightBound:F
    #v14=(Float);
    move-object/from16 v0, p0

    iget-object v1, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;

    #v1=(Reference);
    const/4 v2, 0x0

    #v2=(Null);
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    #v10=(Reference);
    check-cast v10, Landroid/support/v4/view/ViewPager$ItemInfo;

    .line 2265
    .local v10, firstItem:Landroid/support/v4/view/ViewPager$ItemInfo;
    move-object/from16 v0, p0

    iget-object v1, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;

    move-object/from16 v0, p0

    iget-object v2, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;

    #v2=(Reference);
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    #v2=(Integer);
    add-int/lit8 v2, v2, -0x1

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    #v11=(Reference);
    check-cast v11, Landroid/support/v4/view/ViewPager$ItemInfo;

    .line 2266
    .local v11, lastItem:Landroid/support/v4/view/ViewPager$ItemInfo;
    iget v1, v10, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I

    #v1=(Integer);
    if-eqz v1, :cond_1

    .line 2267
    iget v1, v10, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F

    move/from16 v0, v16

    #v0=(Integer);
    int-to-float v2, v0

    #v2=(Float);
    mul-float v12, v1, v2

    .line 2269
    :cond_1
    #v0=(Conflicted);v2=(Integer);
    iget v1, v11, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I

    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v2, v0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;

    #v2=(Reference);
    invoke-virtual {v2}, Landroid/support/v4/view/PagerAdapter;->getCount()I

    move-result v2

    #v2=(Integer);
    add-int/lit8 v2, v2, -0x1

    if-eq v1, v2, :cond_2

    .line 2270
    iget v1, v11, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F

    move/from16 v0, v16

    #v0=(Integer);
    int-to-float v2, v0

    #v2=(Float);
    mul-float v14, v1, v2

    .line 2273
    :cond_2
    #v0=(Conflicted);v2=(Integer);
    cmpg-float v1, v15, v12

    #v1=(Byte);
    if-gez v1, :cond_4

    .line 2274
    move v15, v12

    .line 2279
    :cond_3
    :goto_0
    move-object/from16 v0, p0

    #v0=(Reference);
    iget v1, v0, Landroid/support/v4/view/ViewPager;->mLastMotionX:F

    #v1=(Integer);
    float-to-int v2, v15

    int-to-float v2, v2

    #v2=(Float);
    sub-float v2, v15, v2

    add-float/2addr v1, v2

    #v1=(Float);
    move-object/from16 v0, p0

    iput v1, v0, Landroid/support/v4/view/ViewPager;->mLastMotionX:F

    .line 2280
    float-to-int v1, v15

    #v1=(Integer);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getScrollY()I

    move-result v2

    #v2=(Integer);
    move-object/from16 v0, p0

    invoke-virtual {v0, v1, v2}, Landroid/support/v4/view/ViewPager;->scrollTo(II)V

    .line 2281
    float-to-int v1, v15

    move-object/from16 v0, p0

    invoke-direct {v0, v1}, Landroid/support/v4/view/ViewPager;->pageScrolled(I)Z

    .line 2284
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v3

    .line 2285
    .local v3, time:J
    #v3=(LongLo);v4=(LongHi);
    move-object/from16 v0, p0

    iget-wide v1, v0, Landroid/support/v4/view/ViewPager;->mFakeDragBeginTime:J

    #v1=(LongLo);v2=(LongHi);
    const/4 v5, 0x2

    #v5=(PosByte);
    move-object/from16 v0, p0

    iget v6, v0, Landroid/support/v4/view/ViewPager;->mLastMotionX:F

    #v6=(Integer);
    const/4 v7, 0x0

    #v7=(Null);
    const/4 v8, 0x0

    #v8=(Null);
    invoke-static/range {v1 .. v8}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    move-result-object v9

    .line 2287
    .local v9, ev:Landroid/view/MotionEvent;
    #v9=(Reference);
    move-object/from16 v0, p0

    iget-object v1, v0, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;

    #v1=(Reference);
    invoke-virtual {v1, v9}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 2288
    invoke-virtual {v9}, Landroid/view/MotionEvent;->recycle()V

    .line 2289
    return-void

    .line 2275
    .end local v3           #time:J
    .end local v9           #ev:Landroid/view/MotionEvent;
    :cond_4
    #v0=(Conflicted);v1=(Byte);v2=(Integer);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
    cmpl-float v1, v15, v14

    if-lez v1, :cond_3

    .line 2276
    move v15, v14

    goto :goto_0
.end method

.method protected generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    .prologue
    .line 2623
    new-instance v0, Landroid/support/v4/view/ViewPager$LayoutParams;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/support/v4/view/ViewPager$LayoutParams;-><init>()V

    #v0=(Reference);
    return-object v0
.end method

.method public generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 2
    .parameter "attrs"

    .prologue
    .line 2638
    new-instance v0, Landroid/support/v4/view/ViewPager$LayoutParams;

    #v0=(UninitRef);
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getContext()Landroid/content/Context;

    move-result-object v1

    #v1=(Reference);
    invoke-direct {v0, v1, p1}, Landroid/support/v4/view/ViewPager$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    #v0=(Reference);
    return-object v0
.end method

.method protected generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 1
    .parameter "p"

    .prologue
    .line 2628
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method public getAdapter()Landroid/support/v4/view/PagerAdapter;
    .locals 1

    .prologue
    .line 459
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;

    #v0=(Reference);
    return-object v0
.end method

.method protected getChildDrawingOrder(II)I
    .locals 4
    .parameter "childCount"
    .parameter "i"

    .prologue
    .line 610
    iget v2, p0, Landroid/support/v4/view/ViewPager;->mDrawingOrder:I

    #v2=(Integer);
    const/4 v3, 0x2

    #v3=(PosByte);
    if-ne v2, v3, :cond_0

    add-int/lit8 v2, p1, -0x1

    sub-int v0, v2, p2

    .line 611
    .local v0, index:I
    :goto_0
    #v0=(Integer);
    iget-object v2, p0, Landroid/support/v4/view/ViewPager;->mDrawingOrderedChildren:Ljava/util/ArrayList;

    #v2=(Reference);
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroid/support/v4/view/ViewPager$LayoutParams;

    iget v1, v2, Landroid/support/v4/view/ViewPager$LayoutParams;->childIndex:I

    .line 612
    .local v1, result:I
    #v1=(Integer);
    return v1

    .end local v0           #index:I
    .end local v1           #result:I
    :cond_0
    #v0=(Uninit);v1=(Uninit);v2=(Integer);
    move v0, p2

    .line 610
    #v0=(Integer);
    goto :goto_0
.end method

.method public getCurrentItem()I
    .locals 1

    .prologue
    .line 490
    iget v0, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I

    #v0=(Integer);
    return v0
.end method

.method public getOffscreenPageLimit()I
    .locals 1

    .prologue
    .line 635
    iget v0, p0, Landroid/support/v4/view/ViewPager;->mOffscreenPageLimit:I

    #v0=(Integer);
    return v0
.end method

.method public getPageMargin()I
    .locals 1

    .prologue
    .line 691
    iget v0, p0, Landroid/support/v4/view/ViewPager;->mPageMargin:I

    #v0=(Integer);
    return v0
.end method

.method infoForAnyChild(Landroid/view/View;)Landroid/support/v4/view/ViewPager$ItemInfo;
    .locals 2
    .parameter "child"

    .prologue
    .line 1275
    :goto_0
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    .local v0, parent:Landroid/view/ViewParent;
    #v0=(Reference);
    if-eq v0, p0, :cond_2

    .line 1276
    if-eqz v0, :cond_0

    instance-of v1, v0, Landroid/view/View;

    #v1=(Boolean);
    if-nez v1, :cond_1

    .line 1277
    :cond_0
    #v1=(Conflicted);
    const/4 v1, 0x0

    .line 1281
    :goto_1
    #v1=(Reference);
    return-object v1

    :cond_1
    #v1=(Boolean);
    move-object p1, v0

    .line 1279
    check-cast p1, Landroid/view/View;

    goto :goto_0

    .line 1281
    :cond_2
    #v1=(Conflicted);
    invoke-virtual {p0, p1}, Landroid/support/v4/view/ViewPager;->infoForChild(Landroid/view/View;)Landroid/support/v4/view/ViewPager$ItemInfo;

    move-result-object v1

    #v1=(Reference);
    goto :goto_1
.end method

.method infoForChild(Landroid/view/View;)Landroid/support/v4/view/ViewPager$ItemInfo;
    .locals 4
    .parameter "child"

    .prologue
    .line 1264
    const/4 v0, 0x0

    .local v0, i:I
    :goto_0
    #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    iget-object v2, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;

    #v2=(Reference);
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    #v2=(Integer);
    if-ge v0, v2, :cond_1

    .line 1265
    iget-object v2, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;

    #v2=(Reference);
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    #v1=(Reference);
    check-cast v1, Landroid/support/v4/view/ViewPager$ItemInfo;

    .line 1266
    .local v1, ii:Landroid/support/v4/view/ViewPager$ItemInfo;
    iget-object v2, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;

    iget-object v3, v1, Landroid/support/v4/view/ViewPager$ItemInfo;->object:Ljava/lang/Object;

    #v3=(Reference);
    invoke-virtual {v2, p1, v3}, Landroid/support/v4/view/PagerAdapter;->isViewFromObject(Landroid/view/View;Ljava/lang/Object;)Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_0

    .line 1270
    .end local v1           #ii:Landroid/support/v4/view/ViewPager$ItemInfo;
    :goto_1
    #v2=(Integer);v3=(Conflicted);
    return-object v1

    .line 1264
    .restart local v1       #ii:Landroid/support/v4/view/ViewPager$ItemInfo;
    :cond_0
    #v2=(Boolean);v3=(Reference);
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 1270
    .end local v1           #ii:Landroid/support/v4/view/ViewPager$ItemInfo;
    :cond_1
    #v1=(Conflicted);v2=(Integer);v3=(Conflicted);
    const/4 v1, 0x0

    #v1=(Null);
    goto :goto_1
.end method

.method infoForPosition(I)Landroid/support/v4/view/ViewPager$ItemInfo;
    .locals 3
    .parameter "position"

    .prologue
    .line 1285
    const/4 v0, 0x0

    .local v0, i:I
    :goto_0
    #v0=(Integer);v1=(Conflicted);v2=(Conflicted);
    iget-object v2, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;

    #v2=(Reference);
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    #v2=(Integer);
    if-ge v0, v2, :cond_1

    .line 1286
    iget-object v2, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;

    #v2=(Reference);
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    #v1=(Reference);
    check-cast v1, Landroid/support/v4/view/ViewPager$ItemInfo;

    .line 1287
    .local v1, ii:Landroid/support/v4/view/ViewPager$ItemInfo;
    iget v2, v1, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I

    #v2=(Integer);
    if-ne v2, p1, :cond_0

    .line 1291
    .end local v1           #ii:Landroid/support/v4/view/ViewPager$ItemInfo;
    :goto_1
    return-object v1

    .line 1285
    .restart local v1       #ii:Landroid/support/v4/view/ViewPager$ItemInfo;
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 1291
    .end local v1           #ii:Landroid/support/v4/view/ViewPager$ItemInfo;
    :cond_1
    #v1=(Conflicted);
    const/4 v1, 0x0

    #v1=(Null);
    goto :goto_1
.end method

.method initViewPager()V
    .locals 6

    .prologue
    const/4 v5, 0x1

    .line 348
    #v5=(One);
    const/4 v3, 0x0

    #v3=(Null);
    invoke-virtual {p0, v3}, Landroid/support/v4/view/ViewPager;->setWillNotDraw(Z)V

    .line 349
    const/high16 v3, 0x4

    #v3=(Integer);
    invoke-virtual {p0, v3}, Landroid/support/v4/view/ViewPager;->setDescendantFocusability(I)V

    .line 350
    invoke-virtual {p0, v5}, Landroid/support/v4/view/ViewPager;->setFocusable(Z)V

    .line 351
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getContext()Landroid/content/Context;

    move-result-object v1

    .line 352
    .local v1, context:Landroid/content/Context;
    #v1=(Reference);
    new-instance v3, Landroid/widget/Scroller;

    #v3=(UninitRef);
    sget-object v4, Landroid/support/v4/view/ViewPager;->sInterpolator:Landroid/view/animation/Interpolator;

    #v4=(Reference);
    invoke-direct {v3, v1, v4}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V

    #v3=(Reference);
    iput-object v3, p0, Landroid/support/v4/view/ViewPager;->mScroller:Landroid/widget/Scroller;

    .line 353
    invoke-static {v1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v0

    .line 354
    .local v0, configuration:Landroid/view/ViewConfiguration;
    #v0=(Reference);
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    iget v2, v3, Landroid/util/DisplayMetrics;->density:F

    .line 356
    .local v2, density:F
    #v2=(Integer);
    invoke-static {v0}, Landroid/support/v4/view/ViewConfigurationCompat;->getScaledPagingTouchSlop(Landroid/view/ViewConfiguration;)I

    move-result v3

    #v3=(Integer);
    iput v3, p0, Landroid/support/v4/view/ViewPager;->mTouchSlop:I

    .line 357
    const/high16 v3, 0x43c8

    mul-float/2addr v3, v2

    #v3=(Float);
    float-to-int v3, v3

    #v3=(Integer);
    iput v3, p0, Landroid/support/v4/view/ViewPager;->mMinimumVelocity:I

    .line 358
    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledMaximumFlingVelocity()I

    move-result v3

    iput v3, p0, Landroid/support/v4/view/ViewPager;->mMaximumVelocity:I

    .line 359
    new-instance v3, Landroid/support/v4/widget/EdgeEffectCompat;

    #v3=(UninitRef);
    invoke-direct {v3, v1}, Landroid/support/v4/widget/EdgeEffectCompat;-><init>(Landroid/content/Context;)V

    #v3=(Reference);
    iput-object v3, p0, Landroid/support/v4/view/ViewPager;->mLeftEdge:Landroid/support/v4/widget/EdgeEffectCompat;

    .line 360
    new-instance v3, Landroid/support/v4/widget/EdgeEffectCompat;

    #v3=(UninitRef);
    invoke-direct {v3, v1}, Landroid/support/v4/widget/EdgeEffectCompat;-><init>(Landroid/content/Context;)V

    #v3=(Reference);
    iput-object v3, p0, Landroid/support/v4/view/ViewPager;->mRightEdge:Landroid/support/v4/widget/EdgeEffectCompat;

    .line 362
    const/high16 v3, 0x41c8

    #v3=(Integer);
    mul-float/2addr v3, v2

    #v3=(Float);
    float-to-int v3, v3

    #v3=(Integer);
    iput v3, p0, Landroid/support/v4/view/ViewPager;->mFlingDistance:I

    .line 363
    const/high16 v3, 0x4000

    mul-float/2addr v3, v2

    #v3=(Float);
    float-to-int v3, v3

    #v3=(Integer);
    iput v3, p0, Landroid/support/v4/view/ViewPager;->mCloseEnough:I

    .line 364
    const/high16 v3, 0x4180

    mul-float/2addr v3, v2

    #v3=(Float);
    float-to-int v3, v3

    #v3=(Integer);
    iput v3, p0, Landroid/support/v4/view/ViewPager;->mDefaultGutterSize:I

    .line 366
    new-instance v3, Landroid/support/v4/view/ViewPager$MyAccessibilityDelegate;

    #v3=(UninitRef);
    invoke-direct {v3, p0}, Landroid/support/v4/view/ViewPager$MyAccessibilityDelegate;-><init>(Landroid/support/v4/view/ViewPager;)V

    #v3=(Reference);
    invoke-static {p0, v3}, Landroid/support/v4/view/ViewCompat;->setAccessibilityDelegate(Landroid/view/View;Landroid/support/v4/view/AccessibilityDelegateCompat;)V

    .line 368
    invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->getImportantForAccessibility(Landroid/view/View;)I

    move-result v3

    #v3=(Integer);
    if-nez v3, :cond_0

    .line 370
    invoke-static {p0, v5}, Landroid/support/v4/view/ViewCompat;->setImportantForAccessibility(Landroid/view/View;I)V

    .line 373
    :cond_0
    return-void
.end method

.method public isFakeDragging()Z
    .locals 1

    .prologue
    .line 2301
    iget-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mFakeDragging:Z

    #v0=(Boolean);
    return v0
.end method

.method protected onAttachedToWindow()V
    .locals 1

    .prologue
    .line 1296
    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    .line 1297
    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mFirstLayout:Z

    .line 1298
    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    .prologue
    .line 377
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mEndScrollRunnable:Ljava/lang/Runnable;

    #v0=(Reference);
    invoke-virtual {p0, v0}, Landroid/support/v4/view/ViewPager;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 378
    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    .line 379
    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 18
    .parameter "canvas"

    .prologue
    .line 2134
    invoke-super/range {p0 .. p1}, Landroid/view/ViewGroup;->onDraw(Landroid/graphics/Canvas;)V

    .line 2137
    move-object/from16 v0, p0

    #v0=(Reference);
    iget v13, v0, Landroid/support/v4/view/ViewPager;->mPageMargin:I

    #v13=(Integer);
    if-lez v13, :cond_2

    move-object/from16 v0, p0

    iget-object v13, v0, Landroid/support/v4/view/ViewPager;->mMarginDrawable:Landroid/graphics/drawable/Drawable;

    #v13=(Reference);
    if-eqz v13, :cond_2

    move-object/from16 v0, p0

    iget-object v13, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;

    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    move-result v13

    #v13=(Integer);
    if-lez v13, :cond_2

    move-object/from16 v0, p0

    iget-object v13, v0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;

    #v13=(Reference);
    if-eqz v13, :cond_2

    .line 2138
    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getScrollX()I

    move-result v10

    .line 2139
    .local v10, scrollX:I
    #v10=(Integer);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getWidth()I

    move-result v11

    .line 2141
    .local v11, width:I
    #v11=(Integer);
    move-object/from16 v0, p0

    iget v13, v0, Landroid/support/v4/view/ViewPager;->mPageMargin:I

    #v13=(Integer);
    int-to-float v13, v13

    #v13=(Float);
    int-to-float v14, v11

    #v14=(Float);
    div-float v7, v13, v14

    .line 2142
    .local v7, marginOffset:F
    #v7=(Float);
    const/4 v5, 0x0

    .line 2143
    .local v5, itemIndex:I
    #v5=(Null);
    move-object/from16 v0, p0

    iget-object v13, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;

    #v13=(Reference);
    const/4 v14, 0x0

    #v14=(Null);
    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    #v3=(Reference);
    check-cast v3, Landroid/support/v4/view/ViewPager$ItemInfo;

    .line 2144
    .local v3, ii:Landroid/support/v4/view/ViewPager$ItemInfo;
    iget v8, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F

    .line 2145
    .local v8, offset:F
    #v8=(Integer);
    move-object/from16 v0, p0

    iget-object v13, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;

    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    move-result v4

    .line 2146
    .local v4, itemCount:I
    #v4=(Integer);
    iget v2, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I

    .line 2147
    .local v2, firstPos:I
    #v2=(Integer);
    move-object/from16 v0, p0

    iget-object v13, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;

    add-int/lit8 v14, v4, -0x1

    #v14=(Integer);
    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Landroid/support/v4/view/ViewPager$ItemInfo;

    iget v6, v13, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I

    .line 2148
    .local v6, lastPos:I
    #v6=(Integer);
    move v9, v2

    .local v9, pos:I
    :goto_0
    #v1=(Conflicted);v5=(Integer);v9=(Integer);v12=(Conflicted);v13=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);
    if-ge v9, v6, :cond_2

    .line 2149
    :goto_1
    iget v13, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I

    #v13=(Integer);
    if-le v9, v13, :cond_0

    if-ge v5, v4, :cond_0

    .line 2150
    move-object/from16 v0, p0

    iget-object v13, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;

    #v13=(Reference);
    add-int/lit8 v5, v5, 0x1

    invoke-virtual {v13, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    .end local v3           #ii:Landroid/support/v4/view/ViewPager$ItemInfo;
    check-cast v3, Landroid/support/v4/view/ViewPager$ItemInfo;

    .restart local v3       #ii:Landroid/support/v4/view/ViewPager$ItemInfo;
    goto :goto_1

    .line 2154
    :cond_0
    #v13=(Integer);
    iget v13, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I

    if-ne v9, v13, :cond_3

    .line 2155
    iget v13, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F

    iget v14, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F

    add-float/2addr v13, v14

    #v13=(Float);
    int-to-float v14, v11

    #v14=(Float);
    mul-float v1, v13, v14

    .line 2156
    .local v1, drawAt:F
    #v1=(Float);
    iget v13, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F

    #v13=(Integer);
    iget v14, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F

    #v14=(Integer);
    add-float/2addr v13, v14

    #v13=(Float);
    add-float v8, v13, v7

    .line 2163
    :goto_2
    #v8=(Float);
    move-object/from16 v0, p0

    iget v13, v0, Landroid/support/v4/view/ViewPager;->mPageMargin:I

    #v13=(Integer);
    int-to-float v13, v13

    #v13=(Float);
    add-float/2addr v13, v1

    int-to-float v14, v10

    #v14=(Float);
    cmpl-float v13, v13, v14

    #v13=(Byte);
    if-lez v13, :cond_1

    .line 2164
    move-object/from16 v0, p0

    iget-object v13, v0, Landroid/support/v4/view/ViewPager;->mMarginDrawable:Landroid/graphics/drawable/Drawable;

    #v13=(Reference);
    float-to-int v14, v1

    #v14=(Integer);
    move-object/from16 v0, p0

    iget v15, v0, Landroid/support/v4/view/ViewPager;->mTopPageBounds:I

    #v15=(Integer);
    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v4/view/ViewPager;->mPageMargin:I

    #v0=(Integer);
    move/from16 v16, v0

    #v16=(Integer);
    move/from16 v0, v16

    int-to-float v0, v0

    #v0=(Float);
    move/from16 v16, v0

    #v16=(Float);
    add-float v16, v16, v1

    const/high16 v17, 0x3f00

    #v17=(Integer);
    add-float v16, v16, v17

    move/from16 v0, v16

    float-to-int v0, v0

    #v0=(Integer);
    move/from16 v16, v0

    #v16=(Integer);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget v0, v0, Landroid/support/v4/view/ViewPager;->mBottomPageBounds:I

    #v0=(Integer);
    move/from16 v17, v0

    invoke-virtual/range {v13 .. v17}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 2166
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v13, v0, Landroid/support/v4/view/ViewPager;->mMarginDrawable:Landroid/graphics/drawable/Drawable;

    move-object/from16 v0, p1

    invoke-virtual {v13, v0}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 2169
    :cond_1
    #v13=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);
    add-int v13, v10, v11

    #v13=(Integer);
    int-to-float v13, v13

    #v13=(Float);
    cmpl-float v13, v1, v13

    #v13=(Byte);
    if-lez v13, :cond_4

    .line 2174
    .end local v1           #drawAt:F
    .end local v2           #firstPos:I
    .end local v3           #ii:Landroid/support/v4/view/ViewPager$ItemInfo;
    .end local v4           #itemCount:I
    .end local v5           #itemIndex:I
    .end local v6           #lastPos:I
    .end local v7           #marginOffset:F
    .end local v8           #offset:F
    .end local v9           #pos:I
    .end local v10           #scrollX:I
    .end local v11           #width:I
    :cond_2
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v13=(Conflicted);v14=(Conflicted);
    return-void

    .line 2158
    .restart local v2       #firstPos:I
    .restart local v3       #ii:Landroid/support/v4/view/ViewPager$ItemInfo;
    .restart local v4       #itemCount:I
    .restart local v5       #itemIndex:I
    .restart local v6       #lastPos:I
    .restart local v7       #marginOffset:F
    .restart local v8       #offset:F
    .restart local v9       #pos:I
    .restart local v10       #scrollX:I
    .restart local v11       #width:I
    :cond_3
    #v2=(Integer);v3=(Reference);v4=(Integer);v5=(Integer);v6=(Integer);v7=(Float);v8=(Integer);v9=(Integer);v10=(Integer);v11=(Integer);v13=(Integer);v14=(Integer);
    move-object/from16 v0, p0

    iget-object v13, v0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;

    #v13=(Reference);
    invoke-virtual {v13, v9}, Landroid/support/v4/view/PagerAdapter;->getPageWidth(I)F

    move-result v12

    .line 2159
    .local v12, widthFactor:F
    #v12=(Float);
    add-float v13, v8, v12

    #v13=(Float);
    int-to-float v14, v11

    #v14=(Float);
    mul-float v1, v13, v14

    .line 2160
    .restart local v1       #drawAt:F
    #v1=(Float);
    add-float v13, v12, v7

    add-float/2addr v8, v13

    #v8=(Float);
    goto :goto_2

    .line 2148
    .end local v12           #widthFactor:F
    :cond_4
    #v12=(Conflicted);v13=(Byte);v14=(Integer);
    add-int/lit8 v9, v9, 0x1

    goto :goto_0
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 14
    .parameter "ev"

    .prologue
    .line 1722
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    #v0=(Integer);
    and-int/lit16 v6, v0, 0xff

    .line 1725
    .local v6, action:I
    #v6=(Integer);
    const/4 v0, 0x3

    #v0=(PosByte);
    if-eq v6, v0, :cond_0

    const/4 v0, 0x1

    #v0=(One);
    if-ne v6, v0, :cond_2

    .line 1728
    :cond_0
    #v0=(PosByte);
    const/4 v0, 0x0

    #v0=(Null);
    iput-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mIsBeingDragged:Z

    .line 1729
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mIsUnableToDrag:Z

    .line 1730
    const/4 v0, -0x1

    #v0=(Byte);
    iput v0, p0, Landroid/support/v4/view/ViewPager;->mActivePointerId:I

    .line 1731
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;

    #v0=(Reference);
    if-eqz v0, :cond_1

    .line 1732
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;

    invoke-virtual {v0}, Landroid/view/VelocityTracker;->recycle()V

    .line 1733
    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;

    .line 1735
    :cond_1
    #v0=(Reference);
    const/4 v0, 0x0

    .line 1853
    :goto_0
    #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);
    return v0

    .line 1740
    :cond_2
    #v0=(One);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);
    if-eqz v6, :cond_4

    .line 1741
    iget-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mIsBeingDragged:Z

    #v0=(Boolean);
    if-eqz v0, :cond_3

    .line 1743
    const/4 v0, 0x1

    #v0=(One);
    goto :goto_0

    .line 1745
    :cond_3
    #v0=(Boolean);
    iget-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mIsUnableToDrag:Z

    if-eqz v0, :cond_4

    .line 1747
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0

    .line 1751
    :cond_4
    #v0=(Boolean);
    sparse-switch v6, :sswitch_data_0

    .line 1844
    :cond_5
    :goto_1
    #v0=(Byte);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;

    #v0=(Reference);
    if-nez v0, :cond_6

    .line 1845
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;

    .line 1847
    :cond_6
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;

    invoke-virtual {v0, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 1853
    iget-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mIsBeingDragged:Z

    #v0=(Boolean);
    goto :goto_0

    .line 1762
    :sswitch_0
    #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);
    iget v7, p0, Landroid/support/v4/view/ViewPager;->mActivePointerId:I

    .line 1763
    .local v7, activePointerId:I
    #v7=(Integer);
    const/4 v0, -0x1

    #v0=(Byte);
    if-eq v7, v0, :cond_5

    .line 1768
    invoke-static {p1, v7}, Landroid/support/v4/view/MotionEventCompat;->findPointerIndex(Landroid/view/MotionEvent;I)I

    move-result v9

    .line 1769
    .local v9, pointerIndex:I
    #v9=(Integer);
    invoke-static {p1, v9}, Landroid/support/v4/view/MotionEventCompat;->getX(Landroid/view/MotionEvent;I)F

    move-result v10

    .line 1770
    .local v10, x:F
    #v10=(Float);
    iget v0, p0, Landroid/support/v4/view/ViewPager;->mLastMotionX:F

    #v0=(Integer);
    sub-float v8, v10, v0

    .line 1771
    .local v8, dx:F
    #v8=(Float);
    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    move-result v11

    .line 1772
    .local v11, xDiff:F
    #v11=(Float);
    invoke-static {p1, v9}, Landroid/support/v4/view/MotionEventCompat;->getY(Landroid/view/MotionEvent;I)F

    move-result v12

    .line 1773
    .local v12, y:F
    #v12=(Float);
    iget v0, p0, Landroid/support/v4/view/ViewPager;->mInitialMotionY:F

    sub-float v0, v12, v0

    #v0=(Float);
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v13

    .line 1776
    .local v13, yDiff:F
    #v13=(Float);
    const/4 v0, 0x0

    #v0=(Null);
    cmpl-float v0, v8, v0

    #v0=(Byte);
    if-eqz v0, :cond_7

    iget v0, p0, Landroid/support/v4/view/ViewPager;->mLastMotionX:F

    #v0=(Integer);
    invoke-direct {p0, v0, v8}, Landroid/support/v4/view/ViewPager;->isGutterDrag(FF)Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_7

    const/4 v2, 0x0

    #v2=(Null);
    float-to-int v3, v8

    #v3=(Integer);
    float-to-int v4, v10

    #v4=(Integer);
    float-to-int v5, v12

    #v5=(Integer);
    move-object v0, p0

    #v0=(Reference);
    move-object v1, p0

    #v1=(Reference);
    invoke-virtual/range {v0 .. v5}, Landroid/support/v4/view/ViewPager;->canScroll(Landroid/view/View;ZIII)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_7

    .line 1779
    iput v10, p0, Landroid/support/v4/view/ViewPager;->mLastMotionX:F

    .line 1780
    iput v12, p0, Landroid/support/v4/view/ViewPager;->mLastMotionY:F

    .line 1781
    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mIsUnableToDrag:Z

    .line 1782
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0

    .line 1784
    :cond_7
    #v0=(Byte);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    iget v0, p0, Landroid/support/v4/view/ViewPager;->mTouchSlop:I

    #v0=(Integer);
    int-to-float v0, v0

    #v0=(Float);
    cmpl-float v0, v11, v0

    #v0=(Byte);
    if-lez v0, :cond_a

    const/high16 v0, 0x3f00

    #v0=(Integer);
    mul-float/2addr v0, v11

    #v0=(Float);
    cmpl-float v0, v0, v13

    #v0=(Byte);
    if-lez v0, :cond_a

    .line 1786
    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mIsBeingDragged:Z

    .line 1787
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Landroid/support/v4/view/ViewPager;->setScrollState(I)V

    .line 1788
    const/4 v0, 0x0

    #v0=(Null);
    cmpl-float v0, v8, v0

    #v0=(Byte);
    if-lez v0, :cond_9

    iget v0, p0, Landroid/support/v4/view/ViewPager;->mInitialMotionX:F

    #v0=(Integer);
    iget v1, p0, Landroid/support/v4/view/ViewPager;->mTouchSlop:I

    #v1=(Integer);
    int-to-float v1, v1

    #v1=(Float);
    add-float/2addr v0, v1

    :goto_2
    #v0=(Float);
    iput v0, p0, Landroid/support/v4/view/ViewPager;->mLastMotionX:F

    .line 1790
    iput v12, p0, Landroid/support/v4/view/ViewPager;->mLastMotionY:F

    .line 1791
    const/4 v0, 0x1

    #v0=(One);
    invoke-direct {p0, v0}, Landroid/support/v4/view/ViewPager;->setScrollingCacheEnabled(Z)V

    .line 1800
    :cond_8
    :goto_3
    #v0=(Byte);v1=(Conflicted);
    iget-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mIsBeingDragged:Z

    #v0=(Boolean);
    if-eqz v0, :cond_5

    .line 1802
    invoke-direct {p0, v10}, Landroid/support/v4/view/ViewPager;->performDrag(F)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1803
    invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->postInvalidateOnAnimation(Landroid/view/View;)V

    goto/16 :goto_1

    .line 1788
    :cond_9
    #v0=(Byte);
    iget v0, p0, Landroid/support/v4/view/ViewPager;->mInitialMotionX:F

    #v0=(Integer);
    iget v1, p0, Landroid/support/v4/view/ViewPager;->mTouchSlop:I

    #v1=(Integer);
    int-to-float v1, v1

    #v1=(Float);
    sub-float/2addr v0, v1

    #v0=(Float);
    goto :goto_2

    .line 1792
    :cond_a
    #v0=(Byte);v1=(Conflicted);
    iget v0, p0, Landroid/support/v4/view/ViewPager;->mTouchSlop:I

    #v0=(Integer);
    int-to-float v0, v0

    #v0=(Float);
    cmpl-float v0, v13, v0

    #v0=(Byte);
    if-lez v0, :cond_8

    .line 1798
    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mIsUnableToDrag:Z

    goto :goto_3

    .line 1814
    .end local v7           #activePointerId:I
    .end local v8           #dx:F
    .end local v9           #pointerIndex:I
    .end local v10           #x:F
    .end local v11           #xDiff:F
    .end local v12           #y:F
    .end local v13           #yDiff:F
    :sswitch_1
    #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    #v0=(Float);
    iput v0, p0, Landroid/support/v4/view/ViewPager;->mInitialMotionX:F

    iput v0, p0, Landroid/support/v4/view/ViewPager;->mLastMotionX:F

    .line 1815
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    iput v0, p0, Landroid/support/v4/view/ViewPager;->mInitialMotionY:F

    iput v0, p0, Landroid/support/v4/view/ViewPager;->mLastMotionY:F

    .line 1816
    const/4 v0, 0x0

    #v0=(Null);
    invoke-static {p1, v0}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I

    move-result v0

    #v0=(Integer);
    iput v0, p0, Landroid/support/v4/view/ViewPager;->mActivePointerId:I

    .line 1817
    const/4 v0, 0x0

    #v0=(Null);
    iput-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mIsUnableToDrag:Z

    .line 1819
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mScroller:Landroid/widget/Scroller;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/widget/Scroller;->computeScrollOffset()Z

    .line 1820
    iget v0, p0, Landroid/support/v4/view/ViewPager;->mScrollState:I

    #v0=(Integer);
    const/4 v1, 0x2

    #v1=(PosByte);
    if-ne v0, v1, :cond_b

    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mScroller:Landroid/widget/Scroller;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/widget/Scroller;->getFinalX()I

    move-result v0

    #v0=(Integer);
    iget-object v1, p0, Landroid/support/v4/view/ViewPager;->mScroller:Landroid/widget/Scroller;

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/widget/Scroller;->getCurrX()I

    move-result v1

    #v1=(Integer);
    sub-int/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    iget v1, p0, Landroid/support/v4/view/ViewPager;->mCloseEnough:I

    if-le v0, v1, :cond_b

    .line 1823
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mScroller:Landroid/widget/Scroller;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/widget/Scroller;->abortAnimation()V

    .line 1824
    const/4 v0, 0x0

    #v0=(Null);
    iput-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mPopulatePending:Z

    .line 1825
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->populate()V

    .line 1826
    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mIsBeingDragged:Z

    .line 1827
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Landroid/support/v4/view/ViewPager;->setScrollState(I)V

    goto/16 :goto_1

    .line 1829
    :cond_b
    #v0=(Integer);
    const/4 v0, 0x0

    #v0=(Null);
    invoke-direct {p0, v0}, Landroid/support/v4/view/ViewPager;->completeScroll(Z)V

    .line 1830
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mIsBeingDragged:Z

    goto/16 :goto_1

    .line 1840
    :sswitch_2
    #v0=(Boolean);v1=(Uninit);
    invoke-direct {p0, p1}, Landroid/support/v4/view/ViewPager;->onSecondaryPointerUp(Landroid/view/MotionEvent;)V

    goto/16 :goto_1

    .line 1751
    #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);v9=(Unknown);v10=(Unknown);v11=(Unknown);v12=(Unknown);v13=(Unknown);p0=(Unknown);p1=(Unknown);
    nop

    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_1
        0x2 -> :sswitch_0
        0x6 -> :sswitch_2
    .end sparse-switch
.end method

.method protected onLayout(ZIIII)V
    .locals 24
    .parameter "changed"
    .parameter "l"
    .parameter "t"
    .parameter "r"
    .parameter "b"

    .prologue
    .line 1434
    const/16 v22, 0x1

    #v22=(One);
    move/from16 v0, v22

    #v0=(One);
    move-object/from16 v1, p0

    #v1=(Reference);
    iput-boolean v0, v1, Landroid/support/v4/view/ViewPager;->mInLayout:Z

    .line 1435
    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->populate()V

    .line 1436
    const/16 v22, 0x0

    #v22=(Null);
    move/from16 v0, v22

    #v0=(Null);
    move-object/from16 v1, p0

    iput-boolean v0, v1, Landroid/support/v4/view/ViewPager;->mInLayout:Z

    .line 1438
    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getChildCount()I

    move-result v5

    .line 1439
    .local v5, count:I
    #v5=(Integer);
    sub-int v20, p4, p2

    .line 1440
    .local v20, width:I
    #v20=(Integer);
    sub-int v7, p5, p3

    .line 1441
    .local v7, height:I
    #v7=(Integer);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getPaddingLeft()I

    move-result v15

    .line 1442
    .local v15, paddingLeft:I
    #v15=(Integer);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getPaddingTop()I

    move-result v17

    .line 1443
    .local v17, paddingTop:I
    #v17=(Integer);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getPaddingRight()I

    move-result v16

    .line 1444
    .local v16, paddingRight:I
    #v16=(Integer);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getPaddingBottom()I

    move-result v14

    .line 1445
    .local v14, paddingBottom:I
    #v14=(Integer);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getScrollX()I

    move-result v18

    .line 1447
    .local v18, scrollX:I
    #v18=(Integer);
    const/4 v6, 0x0

    .line 1451
    .local v6, decorCount:I
    #v6=(Null);
    const/4 v10, 0x0

    .local v10, i:I
    :goto_0
    #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Integer);v9=(Conflicted);v10=(Integer);v13=(Conflicted);v19=(Conflicted);v22=(Integer);v23=(Conflicted);
    if-ge v10, v5, :cond_1

    .line 1452
    move-object/from16 v0, p0

    #v0=(Reference);
    invoke-virtual {v0, v10}, Landroid/support/v4/view/ViewPager;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 1453
    .local v2, child:Landroid/view/View;
    #v2=(Reference);
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v22

    const/16 v23, 0x8

    #v23=(PosByte);
    move/from16 v0, v22

    #v0=(Integer);
    move/from16 v1, v23

    #v1=(PosByte);
    if-eq v0, v1, :cond_0

    .line 1454
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v13

    #v13=(Reference);
    check-cast v13, Landroid/support/v4/view/ViewPager$LayoutParams;

    .line 1455
    .local v13, lp:Landroid/support/v4/view/ViewPager$LayoutParams;
    const/4 v3, 0x0

    .line 1456
    .local v3, childLeft:I
    #v3=(Null);
    const/4 v4, 0x0

    .line 1457
    .local v4, childTop:I
    #v4=(Null);
    iget-boolean v0, v13, Landroid/support/v4/view/ViewPager$LayoutParams;->isDecor:Z

    #v0=(Boolean);
    move/from16 v22, v0

    #v22=(Boolean);
    if-eqz v22, :cond_0

    .line 1458
    iget v0, v13, Landroid/support/v4/view/ViewPager$LayoutParams;->gravity:I

    #v0=(Integer);
    move/from16 v22, v0

    #v22=(Integer);
    and-int/lit8 v9, v22, 0x7

    .line 1459
    .local v9, hgrav:I
    #v9=(Integer);
    iget v0, v13, Landroid/support/v4/view/ViewPager$LayoutParams;->gravity:I

    move/from16 v22, v0

    and-int/lit8 v19, v22, 0x70

    .line 1460
    .local v19, vgrav:I
    #v19=(Integer);
    packed-switch v9, :pswitch_data_0

    .line 1462
    :pswitch_0
    move v3, v15

    .line 1477
    :goto_1
    #v3=(Integer);v23=(Integer);
    sparse-switch v19, :sswitch_data_0

    .line 1479
    move/from16 v4, v17

    .line 1494
    :goto_2
    #v1=(Integer);v4=(Integer);
    add-int v3, v3, v18

    .line 1495
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    move-result v22

    add-int v22, v22, v3

    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    move-result v23

    add-int v23, v23, v4

    move/from16 v0, v22

    move/from16 v1, v23

    invoke-virtual {v2, v3, v4, v0, v1}, Landroid/view/View;->layout(IIII)V

    .line 1498
    add-int/lit8 v6, v6, 0x1

    .line 1451
    .end local v3           #childLeft:I
    .end local v4           #childTop:I
    .end local v9           #hgrav:I
    .end local v13           #lp:Landroid/support/v4/view/ViewPager$LayoutParams;
    .end local v19           #vgrav:I
    :cond_0
    #v3=(Conflicted);v4=(Conflicted);v9=(Conflicted);v13=(Conflicted);v19=(Conflicted);
    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    .line 1465
    .restart local v3       #childLeft:I
    .restart local v4       #childTop:I
    .restart local v9       #hgrav:I
    .restart local v13       #lp:Landroid/support/v4/view/ViewPager$LayoutParams;
    .restart local v19       #vgrav:I
    :pswitch_1
    #v1=(PosByte);v3=(Null);v4=(Null);v9=(Integer);v13=(Reference);v19=(Integer);v23=(PosByte);
    move v3, v15

    .line 1466
    #v3=(Integer);
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    move-result v22

    add-int v15, v15, v22

    .line 1467
    goto :goto_1

    .line 1469
    :pswitch_2
    #v3=(Null);
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    move-result v22

    sub-int v22, v20, v22

    div-int/lit8 v22, v22, 0x2

    move/from16 v0, v22

    invoke-static {v0, v15}, Ljava/lang/Math;->max(II)I

    move-result v3

    .line 1471
    #v3=(Integer);
    goto :goto_1

    .line 1473
    :pswitch_3
    #v3=(Null);
    sub-int v22, v20, v16

    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    move-result v23

    #v23=(Integer);
    sub-int v3, v22, v23

    .line 1474
    #v3=(Integer);
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    move-result v22

    add-int v16, v16, v22

    goto :goto_1

    .line 1482
    :sswitch_0
    move/from16 v4, v17

    .line 1483
    #v4=(Integer);
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    move-result v22

    add-int v17, v17, v22

    .line 1484
    goto :goto_2

    .line 1486
    :sswitch_1
    #v4=(Null);
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    move-result v22

    sub-int v22, v7, v22

    div-int/lit8 v22, v22, 0x2

    move/from16 v0, v22

    move/from16 v1, v17

    #v1=(Integer);
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v4

    .line 1488
    #v4=(Integer);
    goto :goto_2

    .line 1490
    :sswitch_2
    #v1=(PosByte);v4=(Null);
    sub-int v22, v7, v14

    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    move-result v23

    sub-int v4, v22, v23

    .line 1491
    #v4=(Integer);
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    move-result v22

    add-int v14, v14, v22

    goto :goto_2

    .line 1504
    .end local v2           #child:Landroid/view/View;
    .end local v3           #childLeft:I
    .end local v4           #childTop:I
    .end local v9           #hgrav:I
    .end local v13           #lp:Landroid/support/v4/view/ViewPager$LayoutParams;
    .end local v19           #vgrav:I
    :cond_1
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v9=(Conflicted);v13=(Conflicted);v19=(Conflicted);v23=(Conflicted);
    const/4 v10, 0x0

    :goto_3
    #v0=(Conflicted);v8=(Conflicted);v11=(Conflicted);v12=(Conflicted);v21=(Conflicted);
    if-ge v10, v5, :cond_4

    .line 1505
    move-object/from16 v0, p0

    #v0=(Reference);
    invoke-virtual {v0, v10}, Landroid/support/v4/view/ViewPager;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 1506
    .restart local v2       #child:Landroid/view/View;
    #v2=(Reference);
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v22

    const/16 v23, 0x8

    #v23=(PosByte);
    move/from16 v0, v22

    #v0=(Integer);
    move/from16 v1, v23

    #v1=(PosByte);
    if-eq v0, v1, :cond_3

    .line 1507
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v13

    #v13=(Reference);
    check-cast v13, Landroid/support/v4/view/ViewPager$LayoutParams;

    .line 1509
    .restart local v13       #lp:Landroid/support/v4/view/ViewPager$LayoutParams;
    iget-boolean v0, v13, Landroid/support/v4/view/ViewPager$LayoutParams;->isDecor:Z

    #v0=(Boolean);
    move/from16 v22, v0

    #v22=(Boolean);
    if-nez v22, :cond_3

    move-object/from16 v0, p0

    #v0=(Reference);
    invoke-virtual {v0, v2}, Landroid/support/v4/view/ViewPager;->infoForChild(Landroid/view/View;)Landroid/support/v4/view/ViewPager$ItemInfo;

    move-result-object v11

    .local v11, ii:Landroid/support/v4/view/ViewPager$ItemInfo;
    #v11=(Reference);
    if-eqz v11, :cond_3

    .line 1510
    move/from16 v0, v20

    #v0=(Integer);
    int-to-float v0, v0

    #v0=(Float);
    move/from16 v22, v0

    #v22=(Float);
    iget v0, v11, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F

    #v0=(Integer);
    move/from16 v23, v0

    #v23=(Integer);
    mul-float v22, v22, v23

    move/from16 v0, v22

    #v0=(Float);
    float-to-int v12, v0

    .line 1511
    .local v12, loff:I
    #v12=(Integer);
    add-int v3, v15, v12

    .line 1512
    .restart local v3       #childLeft:I
    #v3=(Integer);
    move/from16 v4, v17

    .line 1513
    .restart local v4       #childTop:I
    #v4=(Integer);
    iget-boolean v0, v13, Landroid/support/v4/view/ViewPager$LayoutParams;->needsMeasure:Z

    #v0=(Boolean);
    move/from16 v22, v0

    #v22=(Boolean);
    if-eqz v22, :cond_2

    .line 1516
    const/16 v22, 0x0

    #v22=(Null);
    move/from16 v0, v22

    #v0=(Null);
    iput-boolean v0, v13, Landroid/support/v4/view/ViewPager$LayoutParams;->needsMeasure:Z

    .line 1517
    sub-int v22, v20, v15

    #v22=(Integer);
    sub-int v22, v22, v16

    move/from16 v0, v22

    #v0=(Integer);
    int-to-float v0, v0

    #v0=(Float);
    move/from16 v22, v0

    #v22=(Float);
    iget v0, v13, Landroid/support/v4/view/ViewPager$LayoutParams;->widthFactor:F

    #v0=(Integer);
    move/from16 v23, v0

    mul-float v22, v22, v23

    move/from16 v0, v22

    #v0=(Float);
    float-to-int v0, v0

    #v0=(Integer);
    move/from16 v22, v0

    #v22=(Integer);
    const/high16 v23, 0x4000

    invoke-static/range {v22 .. v23}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v21

    .line 1520
    .local v21, widthSpec:I
    #v21=(Integer);
    sub-int v22, v7, v17

    sub-int v22, v22, v14

    const/high16 v23, 0x4000

    invoke-static/range {v22 .. v23}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v8

    .line 1523
    .local v8, heightSpec:I
    #v8=(Integer);
    move/from16 v0, v21

    invoke-virtual {v2, v0, v8}, Landroid/view/View;->measure(II)V

    .line 1528
    .end local v8           #heightSpec:I
    .end local v21           #widthSpec:I
    :cond_2
    #v8=(Conflicted);v21=(Conflicted);
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    move-result v22

    add-int v22, v22, v3

    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    move-result v23

    add-int v23, v23, v4

    move/from16 v0, v22

    move/from16 v1, v23

    #v1=(Integer);
    invoke-virtual {v2, v3, v4, v0, v1}, Landroid/view/View;->layout(IIII)V

    .line 1504
    .end local v3           #childLeft:I
    .end local v4           #childTop:I
    .end local v11           #ii:Landroid/support/v4/view/ViewPager$ItemInfo;
    .end local v12           #loff:I
    .end local v13           #lp:Landroid/support/v4/view/ViewPager$LayoutParams;
    :cond_3
    #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);
    add-int/lit8 v10, v10, 0x1

    goto/16 :goto_3

    .line 1534
    .end local v2           #child:Landroid/view/View;
    :cond_4
    #v1=(Conflicted);v2=(Conflicted);v23=(Conflicted);
    move/from16 v0, v17

    #v0=(Integer);
    move-object/from16 v1, p0

    #v1=(Reference);
    iput v0, v1, Landroid/support/v4/view/ViewPager;->mTopPageBounds:I

    .line 1535
    sub-int v22, v7, v14

    move/from16 v0, v22

    move-object/from16 v1, p0

    iput v0, v1, Landroid/support/v4/view/ViewPager;->mBottomPageBounds:I

    .line 1536
    move-object/from16 v0, p0

    #v0=(Reference);
    iput v6, v0, Landroid/support/v4/view/ViewPager;->mDecorChildCount:I

    .line 1537
    const/16 v22, 0x0

    #v22=(Null);
    move/from16 v0, v22

    #v0=(Null);
    move-object/from16 v1, p0

    iput-boolean v0, v1, Landroid/support/v4/view/ViewPager;->mFirstLayout:Z

    .line 1538
    return-void

    .line 1460
    #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);v9=(Unknown);v10=(Unknown);v11=(Unknown);v12=(Unknown);v13=(Unknown);v14=(Unknown);v15=(Unknown);v16=(Unknown);v17=(Unknown);v18=(Unknown);v19=(Unknown);v20=(Unknown);v21=(Unknown);v22=(Unknown);v23=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);p3=(Unknown);p4=(Unknown);p5=(Unknown);
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_3
    .end packed-switch

    .line 1477
    :sswitch_data_0
    .sparse-switch
        0x10 -> :sswitch_1
        0x30 -> :sswitch_0
        0x50 -> :sswitch_2
    .end sparse-switch
.end method

.method protected onMeasure(II)V
    .locals 23
    .parameter "widthMeasureSpec"
    .parameter "heightMeasureSpec"

    .prologue
    .line 1307
    const/16 v21, 0x0

    #v21=(Null);
    move/from16 v0, v21

    #v0=(Null);
    move/from16 v1, p1

    #v1=(Integer);
    invoke-static {v0, v1}, Landroid/support/v4/view/ViewPager;->getDefaultSize(II)I

    move-result v21

    #v21=(Integer);
    const/16 v22, 0x0

    #v22=(Null);
    move/from16 v0, v22

    move/from16 v1, p2

    invoke-static {v0, v1}, Landroid/support/v4/view/ViewPager;->getDefaultSize(II)I

    move-result v22

    #v22=(Integer);
    move-object/from16 v0, p0

    #v0=(Reference);
    move/from16 v1, v21

    move/from16 v2, v22

    #v2=(Integer);
    invoke-virtual {v0, v1, v2}, Landroid/support/v4/view/ViewPager;->setMeasuredDimension(II)V

    .line 1310
    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getMeasuredWidth()I

    move-result v15

    .line 1311
    .local v15, measuredWidth:I
    #v15=(Integer);
    div-int/lit8 v14, v15, 0xa

    .line 1312
    .local v14, maxGutterSize:I
    #v14=(Integer);
    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v4/view/ViewPager;->mDefaultGutterSize:I

    #v0=(Integer);
    move/from16 v21, v0

    move/from16 v0, v21

    invoke-static {v14, v0}, Ljava/lang/Math;->min(II)I

    move-result v21

    move/from16 v0, v21

    move-object/from16 v1, p0

    #v1=(Reference);
    iput v0, v1, Landroid/support/v4/view/ViewPager;->mGutterSize:I

    .line 1315
    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getPaddingLeft()I

    move-result v21

    sub-int v21, v15, v21

    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getPaddingRight()I

    move-result v22

    sub-int v5, v21, v22

    .line 1316
    .local v5, childWidthSize:I
    #v5=(Integer);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getMeasuredHeight()I

    move-result v21

    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getPaddingTop()I

    move-result v22

    sub-int v21, v21, v22

    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getPaddingBottom()I

    move-result v22

    sub-int v4, v21, v22

    .line 1323
    .local v4, childHeightSize:I
    #v4=(Integer);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getChildCount()I

    move-result v16

    .line 1324
    .local v16, size:I
    #v16=(Integer);
    const/4 v12, 0x0

    .local v12, i:I
    :goto_0
    #v1=(Conflicted);v3=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Integer);v13=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);v20=(Conflicted);
    move/from16 v0, v16

    if-ge v12, v0, :cond_a

    .line 1325
    move-object/from16 v0, p0

    #v0=(Reference);
    invoke-virtual {v0, v12}, Landroid/support/v4/view/ViewPager;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 1326
    .local v3, child:Landroid/view/View;
    #v3=(Reference);
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    move-result v21

    const/16 v22, 0x8

    #v22=(PosByte);
    move/from16 v0, v21

    #v0=(Integer);
    move/from16 v1, v22

    #v1=(PosByte);
    if-eq v0, v1, :cond_5

    .line 1327
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v13

    #v13=(Reference);
    check-cast v13, Landroid/support/v4/view/ViewPager$LayoutParams;

    .line 1328
    .local v13, lp:Landroid/support/v4/view/ViewPager$LayoutParams;
    if-eqz v13, :cond_5

    iget-boolean v0, v13, Landroid/support/v4/view/ViewPager$LayoutParams;->isDecor:Z

    #v0=(Boolean);
    move/from16 v21, v0

    #v21=(Boolean);
    if-eqz v21, :cond_5

    .line 1329
    iget v0, v13, Landroid/support/v4/view/ViewPager$LayoutParams;->gravity:I

    #v0=(Integer);
    move/from16 v21, v0

    #v21=(Integer);
    and-int/lit8 v11, v21, 0x7

    .line 1330
    .local v11, hgrav:I
    #v11=(Integer);
    iget v0, v13, Landroid/support/v4/view/ViewPager$LayoutParams;->gravity:I

    move/from16 v21, v0

    and-int/lit8 v17, v21, 0x70

    .line 1331
    .local v17, vgrav:I
    #v17=(Integer);
    const/high16 v18, -0x8000

    .line 1332
    .local v18, widthMode:I
    #v18=(Integer);
    const/high16 v8, -0x8000

    .line 1333
    .local v8, heightMode:I
    #v8=(Integer);
    const/16 v21, 0x30

    #v21=(PosByte);
    move/from16 v0, v17

    move/from16 v1, v21

    if-eq v0, v1, :cond_0

    const/16 v21, 0x50

    move/from16 v0, v17

    move/from16 v1, v21

    if-ne v0, v1, :cond_6

    :cond_0
    const/4 v7, 0x1

    .line 1334
    .local v7, consumeVertical:Z
    :goto_1
    #v7=(Boolean);
    const/16 v21, 0x3

    move/from16 v0, v21

    #v0=(PosByte);
    if-eq v11, v0, :cond_1

    const/16 v21, 0x5

    move/from16 v0, v21

    if-ne v11, v0, :cond_7

    :cond_1
    const/4 v6, 0x1

    .line 1336
    .local v6, consumeHorizontal:Z
    :goto_2
    #v6=(Boolean);
    if-eqz v7, :cond_8

    .line 1337
    const/high16 v18, 0x4000

    .line 1342
    :cond_2
    :goto_3
    move/from16 v19, v5

    .line 1343
    .local v19, widthSize:I
    #v19=(Integer);
    move v9, v4

    .line 1344
    .local v9, heightSize:I
    #v9=(Integer);
    iget v0, v13, Landroid/support/v4/view/ViewPager$LayoutParams;->width:I

    #v0=(Integer);
    move/from16 v21, v0

    #v21=(Integer);
    const/16 v22, -0x2

    #v22=(Byte);
    move/from16 v0, v21

    move/from16 v1, v22

    #v1=(Byte);
    if-eq v0, v1, :cond_3

    .line 1345
    const/high16 v18, 0x4000

    .line 1346
    iget v0, v13, Landroid/support/v4/view/ViewPager$LayoutParams;->width:I

    move/from16 v21, v0

    const/16 v22, -0x1

    move/from16 v0, v21

    move/from16 v1, v22

    if-eq v0, v1, :cond_3

    .line 1347
    iget v0, v13, Landroid/support/v4/view/ViewPager$LayoutParams;->width:I

    move/from16 v19, v0

    .line 1350
    :cond_3
    iget v0, v13, Landroid/support/v4/view/ViewPager$LayoutParams;->height:I

    move/from16 v21, v0

    const/16 v22, -0x2

    move/from16 v0, v21

    move/from16 v1, v22

    if-eq v0, v1, :cond_4

    .line 1351
    const/high16 v8, 0x4000

    .line 1352
    iget v0, v13, Landroid/support/v4/view/ViewPager$LayoutParams;->height:I

    move/from16 v21, v0

    const/16 v22, -0x1

    move/from16 v0, v21

    move/from16 v1, v22

    if-eq v0, v1, :cond_4

    .line 1353
    iget v9, v13, Landroid/support/v4/view/ViewPager$LayoutParams;->height:I

    .line 1356
    :cond_4
    move/from16 v0, v19

    move/from16 v1, v18

    #v1=(Integer);
    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v20

    .line 1357
    .local v20, widthSpec:I
    #v20=(Integer);
    invoke-static {v9, v8}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v10

    .line 1358
    .local v10, heightSpec:I
    #v10=(Integer);
    move/from16 v0, v20

    invoke-virtual {v3, v0, v10}, Landroid/view/View;->measure(II)V

    .line 1360
    if-eqz v7, :cond_9

    .line 1361
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    move-result v21

    sub-int v4, v4, v21

    .line 1324
    .end local v6           #consumeHorizontal:Z
    .end local v7           #consumeVertical:Z
    .end local v8           #heightMode:I
    .end local v9           #heightSize:I
    .end local v10           #heightSpec:I
    .end local v11           #hgrav:I
    .end local v13           #lp:Landroid/support/v4/view/ViewPager$LayoutParams;
    .end local v17           #vgrav:I
    .end local v18           #widthMode:I
    .end local v19           #widthSize:I
    .end local v20           #widthSpec:I
    :cond_5
    :goto_4
    #v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v13=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);v20=(Conflicted);
    add-int/lit8 v12, v12, 0x1

    goto/16 :goto_0

    .line 1333
    .restart local v8       #heightMode:I
    .restart local v11       #hgrav:I
    .restart local v13       #lp:Landroid/support/v4/view/ViewPager$LayoutParams;
    .restart local v17       #vgrav:I
    .restart local v18       #widthMode:I
    :cond_6
    #v1=(PosByte);v8=(Integer);v11=(Integer);v13=(Reference);v17=(Integer);v18=(Integer);v21=(PosByte);v22=(PosByte);
    const/4 v7, 0x0

    #v7=(Null);
    goto :goto_1

    .line 1334
    .restart local v7       #consumeVertical:Z
    :cond_7
    #v0=(PosByte);v7=(Boolean);
    const/4 v6, 0x0

    #v6=(Null);
    goto :goto_2

    .line 1338
    .restart local v6       #consumeHorizontal:Z
    :cond_8
    #v6=(Boolean);
    if-eqz v6, :cond_2

    .line 1339
    const/high16 v8, 0x4000

    goto :goto_3

    .line 1362
    .restart local v9       #heightSize:I
    .restart local v10       #heightSpec:I
    .restart local v19       #widthSize:I
    .restart local v20       #widthSpec:I
    :cond_9
    #v0=(Integer);v1=(Integer);v9=(Integer);v10=(Integer);v19=(Integer);v20=(Integer);v21=(Integer);v22=(Byte);
    if-eqz v6, :cond_5

    .line 1363
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    move-result v21

    sub-int v5, v5, v21

    goto :goto_4

    .line 1369
    .end local v3           #child:Landroid/view/View;
    .end local v6           #consumeHorizontal:Z
    .end local v7           #consumeVertical:Z
    .end local v8           #heightMode:I
    .end local v9           #heightSize:I
    .end local v10           #heightSpec:I
    .end local v11           #hgrav:I
    .end local v13           #lp:Landroid/support/v4/view/ViewPager$LayoutParams;
    .end local v17           #vgrav:I
    .end local v18           #widthMode:I
    .end local v19           #widthSize:I
    .end local v20           #widthSpec:I
    :cond_a
    #v1=(Conflicted);v3=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v13=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);v20=(Conflicted);v22=(Integer);
    const/high16 v21, 0x4000

    move/from16 v0, v21

    invoke-static {v5, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v21

    move/from16 v0, v21

    move-object/from16 v1, p0

    #v1=(Reference);
    iput v0, v1, Landroid/support/v4/view/ViewPager;->mChildWidthMeasureSpec:I

    .line 1370
    const/high16 v21, 0x4000

    move/from16 v0, v21

    invoke-static {v4, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v21

    move/from16 v0, v21

    move-object/from16 v1, p0

    iput v0, v1, Landroid/support/v4/view/ViewPager;->mChildHeightMeasureSpec:I

    .line 1373
    const/16 v21, 0x1

    #v21=(One);
    move/from16 v0, v21

    #v0=(One);
    move-object/from16 v1, p0

    iput-boolean v0, v1, Landroid/support/v4/view/ViewPager;->mInLayout:Z

    .line 1374
    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->populate()V

    .line 1375
    const/16 v21, 0x0

    #v21=(Null);
    move/from16 v0, v21

    #v0=(Null);
    move-object/from16 v1, p0

    iput-boolean v0, v1, Landroid/support/v4/view/ViewPager;->mInLayout:Z

    .line 1378
    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getChildCount()I

    move-result v16

    .line 1379
    const/4 v12, 0x0

    :goto_5
    #v0=(Integer);v1=(Conflicted);v21=(Integer);
    move/from16 v0, v16

    if-ge v12, v0, :cond_d

    .line 1380
    move-object/from16 v0, p0

    #v0=(Reference);
    invoke-virtual {v0, v12}, Landroid/support/v4/view/ViewPager;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 1381
    .restart local v3       #child:Landroid/view/View;
    #v3=(Reference);
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    move-result v21

    const/16 v22, 0x8

    #v22=(PosByte);
    move/from16 v0, v21

    #v0=(Integer);
    move/from16 v1, v22

    #v1=(PosByte);
    if-eq v0, v1, :cond_c

    .line 1385
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v13

    #v13=(Reference);
    check-cast v13, Landroid/support/v4/view/ViewPager$LayoutParams;

    .line 1386
    .restart local v13       #lp:Landroid/support/v4/view/ViewPager$LayoutParams;
    if-eqz v13, :cond_b

    iget-boolean v0, v13, Landroid/support/v4/view/ViewPager$LayoutParams;->isDecor:Z

    #v0=(Boolean);
    move/from16 v21, v0

    #v21=(Boolean);
    if-nez v21, :cond_c

    .line 1387
    :cond_b
    #v0=(Integer);v21=(Integer);
    int-to-float v0, v5

    #v0=(Float);
    move/from16 v21, v0

    #v21=(Float);
    iget v0, v13, Landroid/support/v4/view/ViewPager$LayoutParams;->widthFactor:F

    #v0=(Integer);
    move/from16 v22, v0

    #v22=(Integer);
    mul-float v21, v21, v22

    move/from16 v0, v21

    #v0=(Float);
    float-to-int v0, v0

    #v0=(Integer);
    move/from16 v21, v0

    #v21=(Integer);
    const/high16 v22, 0x4000

    invoke-static/range {v21 .. v22}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v20

    .line 1389
    .restart local v20       #widthSpec:I
    #v20=(Integer);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget v0, v0, Landroid/support/v4/view/ViewPager;->mChildHeightMeasureSpec:I

    #v0=(Integer);
    move/from16 v21, v0

    move/from16 v0, v20

    move/from16 v1, v21

    #v1=(Integer);
    invoke-virtual {v3, v0, v1}, Landroid/view/View;->measure(II)V

    .line 1379
    .end local v13           #lp:Landroid/support/v4/view/ViewPager$LayoutParams;
    .end local v20           #widthSpec:I
    :cond_c
    #v13=(Conflicted);v20=(Conflicted);
    add-int/lit8 v12, v12, 0x1

    goto :goto_5

    .line 1393
    .end local v3           #child:Landroid/view/View;
    :cond_d
    #v1=(Conflicted);v3=(Conflicted);
    return-void
.end method

.method protected onPageScrolled(IFI)V
    .locals 17
    .parameter "position"
    .parameter "offset"
    .parameter "offsetPixels"

    .prologue
    .line 1607
    move-object/from16 v0, p0

    #v0=(Reference);
    iget v15, v0, Landroid/support/v4/view/ViewPager;->mDecorChildCount:I

    #v15=(Integer);
    if-lez v15, :cond_2

    .line 1608
    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getScrollX()I

    move-result v12

    .line 1609
    .local v12, scrollX:I
    #v12=(Integer);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getPaddingLeft()I

    move-result v10

    .line 1610
    .local v10, paddingLeft:I
    #v10=(Integer);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getPaddingRight()I

    move-result v11

    .line 1611
    .local v11, paddingRight:I
    #v11=(Integer);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getWidth()I

    move-result v14

    .line 1612
    .local v14, width:I
    #v14=(Integer);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getChildCount()I

    move-result v4

    .line 1613
    .local v4, childCount:I
    #v4=(Integer);
    const/4 v8, 0x0

    .local v8, i:I
    :goto_0
    #v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Integer);v9=(Conflicted);v16=(Conflicted);
    if-ge v8, v4, :cond_2

    .line 1614
    move-object/from16 v0, p0

    invoke-virtual {v0, v8}, Landroid/support/v4/view/ViewPager;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 1615
    .local v3, child:Landroid/view/View;
    #v3=(Reference);
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v9

    #v9=(Reference);
    check-cast v9, Landroid/support/v4/view/ViewPager$LayoutParams;

    .line 1616
    .local v9, lp:Landroid/support/v4/view/ViewPager$LayoutParams;
    iget-boolean v15, v9, Landroid/support/v4/view/ViewPager$LayoutParams;->isDecor:Z

    #v15=(Boolean);
    if-nez v15, :cond_1

    .line 1613
    :cond_0
    :goto_1
    #v15=(Integer);
    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    .line 1618
    :cond_1
    #v15=(Boolean);
    iget v15, v9, Landroid/support/v4/view/ViewPager$LayoutParams;->gravity:I

    #v15=(Integer);
    and-int/lit8 v7, v15, 0x7

    .line 1619
    .local v7, hgrav:I
    #v7=(Integer);
    const/4 v5, 0x0

    .line 1620
    .local v5, childLeft:I
    #v5=(Null);
    packed-switch v7, :pswitch_data_0

    .line 1622
    :pswitch_0
    move v5, v10

    .line 1637
    :goto_2
    #v5=(Integer);
    add-int/2addr v5, v12

    .line 1639
    invoke-virtual {v3}, Landroid/view/View;->getLeft()I

    move-result v15

    sub-int v6, v5, v15

    .line 1640
    .local v6, childOffset:I
    #v6=(Integer);
    if-eqz v6, :cond_0

    .line 1641
    invoke-virtual {v3, v6}, Landroid/view/View;->offsetLeftAndRight(I)V

    goto :goto_1

    .line 1625
    .end local v6           #childOffset:I
    :pswitch_1
    #v5=(Null);v6=(Conflicted);
    move v5, v10

    .line 1626
    #v5=(Integer);
    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    move-result v15

    add-int/2addr v10, v15

    .line 1627
    goto :goto_2

    .line 1629
    :pswitch_2
    #v5=(Null);
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    move-result v15

    sub-int v15, v14, v15

    div-int/lit8 v15, v15, 0x2

    invoke-static {v15, v10}, Ljava/lang/Math;->max(II)I

    move-result v5

    .line 1631
    #v5=(Integer);
    goto :goto_2

    .line 1633
    :pswitch_3
    #v5=(Null);
    sub-int v15, v14, v11

    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    move-result v16

    #v16=(Integer);
    sub-int v5, v15, v16

    .line 1634
    #v5=(Integer);
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    move-result v15

    add-int/2addr v11, v15

    goto :goto_2

    .line 1646
    .end local v3           #child:Landroid/view/View;
    .end local v4           #childCount:I
    .end local v5           #childLeft:I
    .end local v7           #hgrav:I
    .end local v8           #i:I
    .end local v9           #lp:Landroid/support/v4/view/ViewPager$LayoutParams;
    .end local v10           #paddingLeft:I
    .end local v11           #paddingRight:I
    .end local v12           #scrollX:I
    .end local v14           #width:I
    :cond_2
    #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v14=(Conflicted);v16=(Conflicted);
    move-object/from16 v0, p0

    iget-object v15, v0, Landroid/support/v4/view/ViewPager;->mOnPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;

    #v15=(Reference);
    if-eqz v15, :cond_3

    .line 1647
    move-object/from16 v0, p0

    iget-object v15, v0, Landroid/support/v4/view/ViewPager;->mOnPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;

    move/from16 v0, p1

    #v0=(Integer);
    move/from16 v1, p2

    #v1=(Float);
    move/from16 v2, p3

    #v2=(Integer);
    invoke-interface {v15, v0, v1, v2}, Landroid/support/v4/view/ViewPager$OnPageChangeListener;->onPageScrolled(IFI)V

    .line 1649
    :cond_3
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v15, v0, Landroid/support/v4/view/ViewPager;->mInternalPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;

    if-eqz v15, :cond_4

    .line 1650
    move-object/from16 v0, p0

    iget-object v15, v0, Landroid/support/v4/view/ViewPager;->mInternalPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;

    move/from16 v0, p1

    #v0=(Integer);
    move/from16 v1, p2

    #v1=(Float);
    move/from16 v2, p3

    #v2=(Integer);
    invoke-interface {v15, v0, v1, v2}, Landroid/support/v4/view/ViewPager$OnPageChangeListener;->onPageScrolled(IFI)V

    .line 1653
    :cond_4
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v15, v0, Landroid/support/v4/view/ViewPager;->mPageTransformer:Landroid/support/v4/view/ViewPager$PageTransformer;

    if-eqz v15, :cond_6

    .line 1654
    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getScrollX()I

    move-result v12

    .line 1655
    .restart local v12       #scrollX:I
    #v12=(Integer);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getChildCount()I

    move-result v4

    .line 1656
    .restart local v4       #childCount:I
    #v4=(Integer);
    const/4 v8, 0x0

    .restart local v8       #i:I
    :goto_3
    #v8=(Integer);v13=(Conflicted);v15=(Conflicted);
    if-ge v8, v4, :cond_6

    .line 1657
    move-object/from16 v0, p0

    invoke-virtual {v0, v8}, Landroid/support/v4/view/ViewPager;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    .line 1658
    .restart local v3       #child:Landroid/view/View;
    #v3=(Reference);
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v9

    #v9=(Reference);
    check-cast v9, Landroid/support/v4/view/ViewPager$LayoutParams;

    .line 1660
    .restart local v9       #lp:Landroid/support/v4/view/ViewPager$LayoutParams;
    iget-boolean v15, v9, Landroid/support/v4/view/ViewPager$LayoutParams;->isDecor:Z

    #v15=(Boolean);
    if-eqz v15, :cond_5

    .line 1656
    :goto_4
    #v15=(Conflicted);
    add-int/lit8 v8, v8, 0x1

    goto :goto_3

    .line 1662
    :cond_5
    #v15=(Boolean);
    invoke-virtual {v3}, Landroid/view/View;->getLeft()I

    move-result v15

    #v15=(Integer);
    sub-int/2addr v15, v12

    int-to-float v15, v15

    #v15=(Float);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getWidth()I

    move-result v16

    #v16=(Integer);
    move/from16 v0, v16

    #v0=(Integer);
    int-to-float v0, v0

    #v0=(Float);
    move/from16 v16, v0

    #v16=(Float);
    div-float v13, v15, v16

    .line 1663
    .local v13, transformPos:F
    #v13=(Float);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v15, v0, Landroid/support/v4/view/ViewPager;->mPageTransformer:Landroid/support/v4/view/ViewPager$PageTransformer;

    #v15=(Reference);
    invoke-interface {v15, v3, v13}, Landroid/support/v4/view/ViewPager$PageTransformer;->transformPage(Landroid/view/View;F)V

    goto :goto_4

    .line 1667
    .end local v3           #child:Landroid/view/View;
    .end local v4           #childCount:I
    .end local v8           #i:I
    .end local v9           #lp:Landroid/support/v4/view/ViewPager$LayoutParams;
    .end local v12           #scrollX:I
    .end local v13           #transformPos:F
    :cond_6
    #v3=(Conflicted);v4=(Conflicted);v8=(Conflicted);v9=(Conflicted);v12=(Conflicted);v13=(Conflicted);v15=(Conflicted);v16=(Conflicted);
    const/4 v15, 0x1

    #v15=(One);
    move-object/from16 v0, p0

    iput-boolean v15, v0, Landroid/support/v4/view/ViewPager;->mCalledSuper:Z

    .line 1668
    return-void

    .line 1620
    #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);v9=(Unknown);v10=(Unknown);v11=(Unknown);v12=(Unknown);v13=(Unknown);v14=(Unknown);v15=(Unknown);v16=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);p3=(Unknown);
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_3
    .end packed-switch
.end method

.method protected onRequestFocusInDescendants(ILandroid/graphics/Rect;)Z
    .locals 9
    .parameter "direction"
    .parameter "previouslyFocusedRect"

    .prologue
    .line 2575
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getChildCount()I

    move-result v1

    .line 2576
    .local v1, count:I
    #v1=(Integer);
    and-int/lit8 v7, p1, 0x2

    #v7=(Integer);
    if-eqz v7, :cond_0

    .line 2577
    const/4 v6, 0x0

    .line 2578
    .local v6, index:I
    #v6=(Null);
    const/4 v5, 0x1

    .line 2579
    .local v5, increment:I
    #v5=(One);
    move v2, v1

    .line 2585
    .local v2, end:I
    :goto_0
    #v2=(Integer);v5=(Byte);v6=(Integer);
    move v3, v6

    .local v3, i:I
    :goto_1
    #v0=(Conflicted);v3=(Integer);v4=(Conflicted);v8=(Conflicted);
    if-eq v3, v2, :cond_2

    .line 2586
    invoke-virtual {p0, v3}, Landroid/support/v4/view/ViewPager;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 2587
    .local v0, child:Landroid/view/View;
    #v0=(Reference);
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v7

    if-nez v7, :cond_1

    .line 2588
    invoke-virtual {p0, v0}, Landroid/support/v4/view/ViewPager;->infoForChild(Landroid/view/View;)Landroid/support/v4/view/ViewPager$ItemInfo;

    move-result-object v4

    .line 2589
    .local v4, ii:Landroid/support/v4/view/ViewPager$ItemInfo;
    #v4=(Reference);
    if-eqz v4, :cond_1

    iget v7, v4, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I

    iget v8, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I

    #v8=(Integer);
    if-ne v7, v8, :cond_1

    .line 2590
    invoke-virtual {v0, p1, p2}, Landroid/view/View;->requestFocus(ILandroid/graphics/Rect;)Z

    move-result v7

    #v7=(Boolean);
    if-eqz v7, :cond_1

    .line 2591
    const/4 v7, 0x1

    .line 2596
    .end local v0           #child:Landroid/view/View;
    .end local v4           #ii:Landroid/support/v4/view/ViewPager$ItemInfo;
    :goto_2
    #v0=(Conflicted);v4=(Conflicted);v8=(Conflicted);
    return v7

    .line 2581
    .end local v2           #end:I
    .end local v3           #i:I
    .end local v5           #increment:I
    .end local v6           #index:I
    :cond_0
    #v0=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Integer);v8=(Uninit);
    add-int/lit8 v6, v1, -0x1

    .line 2582
    .restart local v6       #index:I
    #v6=(Integer);
    const/4 v5, -0x1

    .line 2583
    .restart local v5       #increment:I
    #v5=(Byte);
    const/4 v2, -0x1

    .restart local v2       #end:I
    #v2=(Byte);
    goto :goto_0

    .line 2585
    .restart local v0       #child:Landroid/view/View;
    .restart local v3       #i:I
    :cond_1
    #v0=(Reference);v2=(Integer);v3=(Integer);v4=(Conflicted);v8=(Conflicted);
    add-int/2addr v3, v5

    goto :goto_1

    .line 2596
    .end local v0           #child:Landroid/view/View;
    :cond_2
    #v0=(Conflicted);
    const/4 v7, 0x0

    #v7=(Null);
    goto :goto_2
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 4
    .parameter "state"

    .prologue
    .line 1210
    instance-of v1, p1, Landroid/support/v4/view/ViewPager$SavedState;

    #v1=(Boolean);
    if-nez v1, :cond_0

    .line 1211
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 1226
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    return-void

    :cond_0
    #v0=(Uninit);v1=(Boolean);v2=(Uninit);v3=(Uninit);
    move-object v0, p1

    .line 1215
    #v0=(Reference);
    check-cast v0, Landroid/support/v4/view/ViewPager$SavedState;

    .line 1216
    .local v0, ss:Landroid/support/v4/view/ViewPager$SavedState;
    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager$SavedState;->getSuperState()Landroid/os/Parcelable;

    move-result-object v1

    #v1=(Reference);
    invoke-super {p0, v1}, Landroid/view/ViewGroup;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 1218
    iget-object v1, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;

    if-eqz v1, :cond_1

    .line 1219
    iget-object v1, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;

    iget-object v2, v0, Landroid/support/v4/view/ViewPager$SavedState;->adapterState:Landroid/os/Parcelable;

    #v2=(Reference);
    iget-object v3, v0, Landroid/support/v4/view/ViewPager$SavedState;->loader:Ljava/lang/ClassLoader;

    #v3=(Reference);
    invoke-virtual {v1, v2, v3}, Landroid/support/v4/view/PagerAdapter;->restoreState(Landroid/os/Parcelable;Ljava/lang/ClassLoader;)V

    .line 1220
    iget v1, v0, Landroid/support/v4/view/ViewPager$SavedState;->position:I

    #v1=(Integer);
    const/4 v2, 0x0

    #v2=(Null);
    const/4 v3, 0x1

    #v3=(One);
    invoke-virtual {p0, v1, v2, v3}, Landroid/support/v4/view/ViewPager;->setCurrentItemInternal(IZZ)V

    goto :goto_0

    .line 1222
    :cond_1
    #v1=(Reference);v2=(Uninit);v3=(Uninit);
    iget v1, v0, Landroid/support/v4/view/ViewPager$SavedState;->position:I

    #v1=(Integer);
    iput v1, p0, Landroid/support/v4/view/ViewPager;->mRestoredCurItem:I

    .line 1223
    iget-object v1, v0, Landroid/support/v4/view/ViewPager$SavedState;->adapterState:Landroid/os/Parcelable;

    #v1=(Reference);
    iput-object v1, p0, Landroid/support/v4/view/ViewPager;->mRestoredAdapterState:Landroid/os/Parcelable;

    .line 1224
    iget-object v1, v0, Landroid/support/v4/view/ViewPager$SavedState;->loader:Ljava/lang/ClassLoader;

    iput-object v1, p0, Landroid/support/v4/view/ViewPager;->mRestoredClassLoader:Ljava/lang/ClassLoader;

    goto :goto_0
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 3

    .prologue
    .line 1199
    invoke-super {p0}, Landroid/view/ViewGroup;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v1

    .line 1200
    .local v1, superState:Landroid/os/Parcelable;
    #v1=(Reference);
    new-instance v0, Landroid/support/v4/view/ViewPager$SavedState;

    #v0=(UninitRef);
    invoke-direct {v0, v1}, Landroid/support/v4/view/ViewPager$SavedState;-><init>(Landroid/os/Parcelable;)V

    .line 1201
    .local v0, ss:Landroid/support/v4/view/ViewPager$SavedState;
    #v0=(Reference);
    iget v2, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I

    #v2=(Integer);
    iput v2, v0, Landroid/support/v4/view/ViewPager$SavedState;->position:I

    .line 1202
    iget-object v2, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;

    #v2=(Reference);
    if-eqz v2, :cond_0

    .line 1203
    iget-object v2, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;

    invoke-virtual {v2}, Landroid/support/v4/view/PagerAdapter;->saveState()Landroid/os/Parcelable;

    move-result-object v2

    iput-object v2, v0, Landroid/support/v4/view/ViewPager$SavedState;->adapterState:Landroid/os/Parcelable;

    .line 1205
    :cond_0
    return-object v0
.end method

.method protected onSizeChanged(IIII)V
    .locals 2
    .parameter "w"
    .parameter "h"
    .parameter "oldw"
    .parameter "oldh"

    .prologue
    .line 1397
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/ViewGroup;->onSizeChanged(IIII)V

    .line 1400
    if-eq p1, p3, :cond_0

    .line 1401
    iget v0, p0, Landroid/support/v4/view/ViewPager;->mPageMargin:I

    #v0=(Integer);
    iget v1, p0, Landroid/support/v4/view/ViewPager;->mPageMargin:I

    #v1=(Integer);
    invoke-direct {p0, p1, p3, v0, v1}, Landroid/support/v4/view/ViewPager;->recomputeScrollPosition(IIII)V

    .line 1403
    :cond_0
    #v0=(Conflicted);v1=(Conflicted);
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 27
    .parameter "ev"

    .prologue
    .line 1858
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-boolean v0, v0, Landroid/support/v4/view/ViewPager;->mFakeDragging:Z

    #v0=(Boolean);
    move/from16 v23, v0

    #v23=(Boolean);
    if-eqz v23, :cond_0

    .line 1862
    const/16 v23, 0x1

    .line 1974
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);v20=(Conflicted);v21=(Conflicted);v22=(Conflicted);v24=(Conflicted);v25=(Conflicted);v26=(Conflicted);
    return v23

    .line 1865
    :cond_0
    #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);v20=(Uninit);v21=(Uninit);v22=(Uninit);v24=(Uninit);v25=(Uninit);v26=(Uninit);
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v23

    #v23=(Integer);
    if-nez v23, :cond_1

    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getEdgeFlags()I

    move-result v23

    if-eqz v23, :cond_1

    .line 1868
    const/16 v23, 0x0

    #v23=(Null);
    goto :goto_0

    .line 1871
    :cond_1
    #v23=(Integer);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;

    move-object/from16 v23, v0

    #v23=(Reference);
    if-eqz v23, :cond_2

    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;

    move-object/from16 v23, v0

    invoke-virtual/range {v23 .. v23}, Landroid/support/v4/view/PagerAdapter;->getCount()I

    move-result v23

    #v23=(Integer);
    if-nez v23, :cond_3

    .line 1873
    :cond_2
    #v23=(Conflicted);
    const/16 v23, 0x0

    #v23=(Null);
    goto :goto_0

    .line 1876
    :cond_3
    #v23=(Integer);
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;

    move-object/from16 v23, v0

    #v23=(Reference);
    if-nez v23, :cond_4

    .line 1877
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v23

    move-object/from16 v0, v23

    move-object/from16 v1, p0

    #v1=(Reference);
    iput-object v0, v1, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;

    .line 1879
    :cond_4
    #v1=(Conflicted);
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;

    move-object/from16 v23, v0

    move-object/from16 v0, v23

    move-object/from16 v1, p1

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 1881
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v5

    .line 1882
    .local v5, action:I
    #v5=(Integer);
    const/4 v11, 0x0

    .line 1884
    .local v11, needsInvalidate:Z
    #v11=(Null);
    and-int/lit16 v0, v5, 0xff

    #v0=(Integer);
    move/from16 v23, v0

    #v23=(Integer);
    packed-switch v23, :pswitch_data_0

    .line 1971
    :cond_5
    :goto_1
    :pswitch_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Boolean);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);v20=(Conflicted);v21=(Conflicted);v22=(Conflicted);v24=(Conflicted);v25=(Conflicted);v26=(Conflicted);
    if-eqz v11, :cond_6

    .line 1972
    invoke-static/range {p0 .. p0}, Landroid/support/v4/view/ViewCompat;->postInvalidateOnAnimation(Landroid/view/View;)V

    .line 1974
    :cond_6
    const/16 v23, 0x1

    #v23=(One);
    goto :goto_0

    .line 1886
    :pswitch_1
    #v0=(Integer);v1=(Reference);v2=(Uninit);v3=(Uninit);v4=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Null);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);v20=(Uninit);v21=(Uninit);v22=(Uninit);v23=(Integer);v24=(Uninit);v25=(Uninit);v26=(Uninit);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mScroller:Landroid/widget/Scroller;

    move-object/from16 v23, v0

    #v23=(Reference);
    invoke-virtual/range {v23 .. v23}, Landroid/widget/Scroller;->abortAnimation()V

    .line 1887
    const/16 v23, 0x0

    #v23=(Null);
    move/from16 v0, v23

    #v0=(Null);
    move-object/from16 v1, p0

    iput-boolean v0, v1, Landroid/support/v4/view/ViewPager;->mPopulatePending:Z

    .line 1888
    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->populate()V

    .line 1889
    const/16 v23, 0x1

    #v23=(One);
    move/from16 v0, v23

    #v0=(One);
    move-object/from16 v1, p0

    iput-boolean v0, v1, Landroid/support/v4/view/ViewPager;->mIsBeingDragged:Z

    .line 1890
    const/16 v23, 0x1

    move-object/from16 v0, p0

    #v0=(Reference);
    move/from16 v1, v23

    #v1=(One);
    invoke-direct {v0, v1}, Landroid/support/v4/view/ViewPager;->setScrollState(I)V

    .line 1893
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    move-result v23

    #v23=(Float);
    move/from16 v0, v23

    #v0=(Float);
    move-object/from16 v1, p0

    #v1=(Reference);
    iput v0, v1, Landroid/support/v4/view/ViewPager;->mInitialMotionX:F

    move/from16 v0, v23

    move-object/from16 v1, p0

    iput v0, v1, Landroid/support/v4/view/ViewPager;->mLastMotionX:F

    .line 1894
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    move-result v23

    move/from16 v0, v23

    move-object/from16 v1, p0

    iput v0, v1, Landroid/support/v4/view/ViewPager;->mInitialMotionY:F

    move/from16 v0, v23

    move-object/from16 v1, p0

    iput v0, v1, Landroid/support/v4/view/ViewPager;->mLastMotionY:F

    .line 1895
    const/16 v23, 0x0

    #v23=(Null);
    move-object/from16 v0, p1

    #v0=(Reference);
    move/from16 v1, v23

    #v1=(Null);
    invoke-static {v0, v1}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I

    move-result v23

    #v23=(Integer);
    move/from16 v0, v23

    #v0=(Integer);
    move-object/from16 v1, p0

    #v1=(Reference);
    iput v0, v1, Landroid/support/v4/view/ViewPager;->mActivePointerId:I

    goto :goto_1

    .line 1899
    :pswitch_2
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-boolean v0, v0, Landroid/support/v4/view/ViewPager;->mIsBeingDragged:Z

    #v0=(Boolean);
    move/from16 v23, v0

    #v23=(Boolean);
    if-nez v23, :cond_7

    .line 1900
    move-object/from16 v0, p0

    #v0=(Reference);
    iget v0, v0, Landroid/support/v4/view/ViewPager;->mActivePointerId:I

    #v0=(Integer);
    move/from16 v23, v0

    #v23=(Integer);
    move-object/from16 v0, p1

    #v0=(Reference);
    move/from16 v1, v23

    #v1=(Integer);
    invoke-static {v0, v1}, Landroid/support/v4/view/MotionEventCompat;->findPointerIndex(Landroid/view/MotionEvent;I)I

    move-result v14

    .line 1901
    .local v14, pointerIndex:I
    #v14=(Integer);
    move-object/from16 v0, p1

    invoke-static {v0, v14}, Landroid/support/v4/view/MotionEventCompat;->getX(Landroid/view/MotionEvent;I)F

    move-result v19

    .line 1902
    .local v19, x:F
    #v19=(Float);
    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v4/view/ViewPager;->mLastMotionX:F

    #v0=(Integer);
    move/from16 v23, v0

    sub-float v23, v19, v23

    #v23=(Float);
    invoke-static/range {v23 .. v23}, Ljava/lang/Math;->abs(F)F

    move-result v20

    .line 1903
    .local v20, xDiff:F
    #v20=(Float);
    move-object/from16 v0, p1

    #v0=(Reference);
    invoke-static {v0, v14}, Landroid/support/v4/view/MotionEventCompat;->getY(Landroid/view/MotionEvent;I)F

    move-result v21

    .line 1904
    .local v21, y:F
    #v21=(Float);
    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v4/view/ViewPager;->mLastMotionY:F

    #v0=(Integer);
    move/from16 v23, v0

    #v23=(Integer);
    sub-float v23, v21, v23

    #v23=(Float);
    invoke-static/range {v23 .. v23}, Ljava/lang/Math;->abs(F)F

    move-result v22

    .line 1906
    .local v22, yDiff:F
    #v22=(Float);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget v0, v0, Landroid/support/v4/view/ViewPager;->mTouchSlop:I

    #v0=(Integer);
    move/from16 v23, v0

    #v23=(Integer);
    move/from16 v0, v23

    int-to-float v0, v0

    #v0=(Float);
    move/from16 v23, v0

    #v23=(Float);
    cmpl-float v23, v20, v23

    #v23=(Byte);
    if-lez v23, :cond_7

    cmpl-float v23, v20, v22

    if-lez v23, :cond_7

    .line 1908
    const/16 v23, 0x1

    #v23=(One);
    move/from16 v0, v23

    #v0=(One);
    move-object/from16 v1, p0

    #v1=(Reference);
    iput-boolean v0, v1, Landroid/support/v4/view/ViewPager;->mIsBeingDragged:Z

    .line 1909
    move-object/from16 v0, p0

    #v0=(Reference);
    iget v0, v0, Landroid/support/v4/view/ViewPager;->mInitialMotionX:F

    #v0=(Integer);
    move/from16 v23, v0

    #v23=(Integer);
    sub-float v23, v19, v23

    #v23=(Float);
    const/16 v24, 0x0

    #v24=(Null);
    cmpl-float v23, v23, v24

    #v23=(Byte);
    if-lez v23, :cond_8

    move-object/from16 v0, p0

    #v0=(Reference);
    iget v0, v0, Landroid/support/v4/view/ViewPager;->mInitialMotionX:F

    #v0=(Integer);
    move/from16 v23, v0

    #v23=(Integer);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget v0, v0, Landroid/support/v4/view/ViewPager;->mTouchSlop:I

    #v0=(Integer);
    move/from16 v24, v0

    #v24=(Integer);
    move/from16 v0, v24

    int-to-float v0, v0

    #v0=(Float);
    move/from16 v24, v0

    #v24=(Float);
    add-float v23, v23, v24

    :goto_2
    #v23=(Float);
    move/from16 v0, v23

    move-object/from16 v1, p0

    iput v0, v1, Landroid/support/v4/view/ViewPager;->mLastMotionX:F

    .line 1911
    move/from16 v0, v21

    move-object/from16 v1, p0

    iput v0, v1, Landroid/support/v4/view/ViewPager;->mLastMotionY:F

    .line 1912
    const/16 v23, 0x1

    #v23=(One);
    move-object/from16 v0, p0

    #v0=(Reference);
    move/from16 v1, v23

    #v1=(One);
    invoke-direct {v0, v1}, Landroid/support/v4/view/ViewPager;->setScrollState(I)V

    .line 1913
    const/16 v23, 0x1

    move-object/from16 v0, p0

    move/from16 v1, v23

    invoke-direct {v0, v1}, Landroid/support/v4/view/ViewPager;->setScrollingCacheEnabled(Z)V

    .line 1917
    .end local v14           #pointerIndex:I
    .end local v19           #x:F
    .end local v20           #xDiff:F
    .end local v21           #y:F
    .end local v22           #yDiff:F
    :cond_7
    #v0=(Conflicted);v1=(Conflicted);v14=(Conflicted);v19=(Conflicted);v20=(Conflicted);v21=(Conflicted);v22=(Conflicted);v23=(Byte);v24=(Conflicted);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-boolean v0, v0, Landroid/support/v4/view/ViewPager;->mIsBeingDragged:Z

    #v0=(Boolean);
    move/from16 v23, v0

    #v23=(Boolean);
    if-eqz v23, :cond_5

    .line 1919
    move-object/from16 v0, p0

    #v0=(Reference);
    iget v0, v0, Landroid/support/v4/view/ViewPager;->mActivePointerId:I

    #v0=(Integer);
    move/from16 v23, v0

    #v23=(Integer);
    move-object/from16 v0, p1

    #v0=(Reference);
    move/from16 v1, v23

    #v1=(Integer);
    invoke-static {v0, v1}, Landroid/support/v4/view/MotionEventCompat;->findPointerIndex(Landroid/view/MotionEvent;I)I

    move-result v6

    .line 1921
    .local v6, activePointerIndex:I
    #v6=(Integer);
    move-object/from16 v0, p1

    invoke-static {v0, v6}, Landroid/support/v4/view/MotionEventCompat;->getX(Landroid/view/MotionEvent;I)F

    move-result v19

    .line 1922
    .restart local v19       #x:F
    #v19=(Float);
    move-object/from16 v0, p0

    move/from16 v1, v19

    #v1=(Float);
    invoke-direct {v0, v1}, Landroid/support/v4/view/ViewPager;->performDrag(F)Z

    move-result v23

    #v23=(Boolean);
    or-int v11, v11, v23

    .line 1923
    #v11=(Boolean);
    goto/16 :goto_1

    .line 1909
    .end local v6           #activePointerIndex:I
    .restart local v14       #pointerIndex:I
    .restart local v20       #xDiff:F
    .restart local v21       #y:F
    .restart local v22       #yDiff:F
    :cond_8
    #v0=(Integer);v1=(Reference);v6=(Uninit);v11=(Null);v14=(Integer);v20=(Float);v21=(Float);v22=(Float);v23=(Byte);v24=(Null);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget v0, v0, Landroid/support/v4/view/ViewPager;->mInitialMotionX:F

    #v0=(Integer);
    move/from16 v23, v0

    #v23=(Integer);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget v0, v0, Landroid/support/v4/view/ViewPager;->mTouchSlop:I

    #v0=(Integer);
    move/from16 v24, v0

    #v24=(Integer);
    move/from16 v0, v24

    int-to-float v0, v0

    #v0=(Float);
    move/from16 v24, v0

    #v24=(Float);
    sub-float v23, v23, v24

    #v23=(Float);
    goto :goto_2

    .line 1926
    .end local v14           #pointerIndex:I
    .end local v19           #x:F
    .end local v20           #xDiff:F
    .end local v21           #y:F
    .end local v22           #yDiff:F
    :pswitch_3
    #v0=(Integer);v14=(Uninit);v19=(Uninit);v20=(Uninit);v21=(Uninit);v22=(Uninit);v23=(Integer);v24=(Uninit);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-boolean v0, v0, Landroid/support/v4/view/ViewPager;->mIsBeingDragged:Z

    #v0=(Boolean);
    move/from16 v23, v0

    #v23=(Boolean);
    if-eqz v23, :cond_5

    .line 1927
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;

    move-object/from16 v17, v0

    .line 1928
    .local v17, velocityTracker:Landroid/view/VelocityTracker;
    #v17=(Reference);
    const/16 v23, 0x3e8

    #v23=(PosShort);
    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v4/view/ViewPager;->mMaximumVelocity:I

    #v0=(Integer);
    move/from16 v24, v0

    #v24=(Integer);
    move/from16 v0, v24

    int-to-float v0, v0

    #v0=(Float);
    move/from16 v24, v0

    #v24=(Float);
    move-object/from16 v0, v17

    #v0=(Reference);
    move/from16 v1, v23

    #v1=(PosShort);
    move/from16 v2, v24

    #v2=(Float);
    invoke-virtual {v0, v1, v2}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V

    .line 1929
    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v4/view/ViewPager;->mActivePointerId:I

    #v0=(Integer);
    move/from16 v23, v0

    #v23=(Integer);
    move-object/from16 v0, v17

    #v0=(Reference);
    move/from16 v1, v23

    #v1=(Integer);
    invoke-static {v0, v1}, Landroid/support/v4/view/VelocityTrackerCompat;->getXVelocity(Landroid/view/VelocityTracker;I)F

    move-result v23

    #v23=(Float);
    move/from16 v0, v23

    #v0=(Float);
    float-to-int v10, v0

    .line 1931
    .local v10, initialVelocity:I
    #v10=(Integer);
    const/16 v23, 0x1

    #v23=(One);
    move/from16 v0, v23

    #v0=(One);
    move-object/from16 v1, p0

    #v1=(Reference);
    iput-boolean v0, v1, Landroid/support/v4/view/ViewPager;->mPopulatePending:Z

    .line 1932
    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getWidth()I

    move-result v18

    .line 1933
    .local v18, width:I
    #v18=(Integer);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getScrollX()I

    move-result v15

    .line 1934
    .local v15, scrollX:I
    #v15=(Integer);
    invoke-direct/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->infoForCurrentScrollPosition()Landroid/support/v4/view/ViewPager$ItemInfo;

    move-result-object v8

    .line 1935
    .local v8, ii:Landroid/support/v4/view/ViewPager$ItemInfo;
    #v8=(Reference);
    iget v7, v8, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I

    .line 1936
    .local v7, currentPage:I
    #v7=(Integer);
    int-to-float v0, v15

    #v0=(Float);
    move/from16 v23, v0

    #v23=(Float);
    move/from16 v0, v18

    #v0=(Integer);
    int-to-float v0, v0

    #v0=(Float);
    move/from16 v24, v0

    div-float v23, v23, v24

    iget v0, v8, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F

    #v0=(Integer);
    move/from16 v24, v0

    #v24=(Integer);
    sub-float v23, v23, v24

    iget v0, v8, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F

    move/from16 v24, v0

    div-float v13, v23, v24

    .line 1937
    .local v13, pageOffset:F
    #v13=(Float);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget v0, v0, Landroid/support/v4/view/ViewPager;->mActivePointerId:I

    #v0=(Integer);
    move/from16 v23, v0

    #v23=(Integer);
    move-object/from16 v0, p1

    #v0=(Reference);
    move/from16 v1, v23

    #v1=(Integer);
    invoke-static {v0, v1}, Landroid/support/v4/view/MotionEventCompat;->findPointerIndex(Landroid/view/MotionEvent;I)I

    move-result v6

    .line 1939
    .restart local v6       #activePointerIndex:I
    #v6=(Integer);
    move-object/from16 v0, p1

    invoke-static {v0, v6}, Landroid/support/v4/view/MotionEventCompat;->getX(Landroid/view/MotionEvent;I)F

    move-result v19

    .line 1940
    .restart local v19       #x:F
    #v19=(Float);
    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v4/view/ViewPager;->mInitialMotionX:F

    #v0=(Integer);
    move/from16 v23, v0

    sub-float v23, v19, v23

    #v23=(Float);
    move/from16 v0, v23

    #v0=(Float);
    float-to-int v0, v0

    #v0=(Integer);
    move/from16 v16, v0

    .line 1941
    .local v16, totalDelta:I
    #v16=(Integer);
    move-object/from16 v0, p0

    #v0=(Reference);
    move/from16 v1, v16

    invoke-direct {v0, v7, v13, v10, v1}, Landroid/support/v4/view/ViewPager;->determineTargetPage(IFII)I

    move-result v12

    .line 1943
    .local v12, nextPage:I
    #v12=(Integer);
    const/16 v23, 0x1

    #v23=(One);
    const/16 v24, 0x1

    #v24=(One);
    move-object/from16 v0, p0

    move/from16 v1, v23

    #v1=(One);
    move/from16 v2, v24

    #v2=(One);
    invoke-virtual {v0, v12, v1, v2, v10}, Landroid/support/v4/view/ViewPager;->setCurrentItemInternal(IZZI)V

    .line 1945
    const/16 v23, -0x1

    #v23=(Byte);
    move/from16 v0, v23

    #v0=(Byte);
    move-object/from16 v1, p0

    #v1=(Reference);
    iput v0, v1, Landroid/support/v4/view/ViewPager;->mActivePointerId:I

    .line 1946
    invoke-direct/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->endDrag()V

    .line 1947
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mLeftEdge:Landroid/support/v4/widget/EdgeEffectCompat;

    move-object/from16 v23, v0

    #v23=(Reference);
    invoke-virtual/range {v23 .. v23}, Landroid/support/v4/widget/EdgeEffectCompat;->onRelease()Z

    move-result v23

    #v23=(Boolean);
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mRightEdge:Landroid/support/v4/widget/EdgeEffectCompat;

    move-object/from16 v24, v0

    #v24=(Reference);
    invoke-virtual/range {v24 .. v24}, Landroid/support/v4/widget/EdgeEffectCompat;->onRelease()Z

    move-result v24

    #v24=(Boolean);
    or-int v11, v23, v24

    .line 1948
    #v11=(Boolean);
    goto/16 :goto_1

    .line 1951
    .end local v6           #activePointerIndex:I
    .end local v7           #currentPage:I
    .end local v8           #ii:Landroid/support/v4/view/ViewPager$ItemInfo;
    .end local v10           #initialVelocity:I
    .end local v12           #nextPage:I
    .end local v13           #pageOffset:F
    .end local v15           #scrollX:I
    .end local v16           #totalDelta:I
    .end local v17           #velocityTracker:Landroid/view/VelocityTracker;
    .end local v18           #width:I
    .end local v19           #x:F
    :pswitch_4
    #v0=(Integer);v2=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v10=(Uninit);v11=(Null);v12=(Uninit);v13=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);v23=(Integer);v24=(Uninit);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-boolean v0, v0, Landroid/support/v4/view/ViewPager;->mIsBeingDragged:Z

    #v0=(Boolean);
    move/from16 v23, v0

    #v23=(Boolean);
    if-eqz v23, :cond_5

    .line 1952
    move-object/from16 v0, p0

    #v0=(Reference);
    iget v0, v0, Landroid/support/v4/view/ViewPager;->mCurItem:I

    #v0=(Integer);
    move/from16 v23, v0

    #v23=(Integer);
    const/16 v24, 0x1

    #v24=(One);
    const/16 v25, 0x0

    #v25=(Null);
    const/16 v26, 0x0

    #v26=(Null);
    move-object/from16 v0, p0

    #v0=(Reference);
    move/from16 v1, v23

    #v1=(Integer);
    move/from16 v2, v24

    #v2=(One);
    move/from16 v3, v25

    #v3=(Null);
    move/from16 v4, v26

    #v4=(Null);
    invoke-direct {v0, v1, v2, v3, v4}, Landroid/support/v4/view/ViewPager;->scrollToItem(IZIZ)V

    .line 1953
    const/16 v23, -0x1

    #v23=(Byte);
    move/from16 v0, v23

    #v0=(Byte);
    move-object/from16 v1, p0

    #v1=(Reference);
    iput v0, v1, Landroid/support/v4/view/ViewPager;->mActivePointerId:I

    .line 1954
    invoke-direct/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->endDrag()V

    .line 1955
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mLeftEdge:Landroid/support/v4/widget/EdgeEffectCompat;

    move-object/from16 v23, v0

    #v23=(Reference);
    invoke-virtual/range {v23 .. v23}, Landroid/support/v4/widget/EdgeEffectCompat;->onRelease()Z

    move-result v23

    #v23=(Boolean);
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mRightEdge:Landroid/support/v4/widget/EdgeEffectCompat;

    move-object/from16 v24, v0

    #v24=(Reference);
    invoke-virtual/range {v24 .. v24}, Landroid/support/v4/widget/EdgeEffectCompat;->onRelease()Z

    move-result v24

    #v24=(Boolean);
    or-int v11, v23, v24

    #v11=(Boolean);
    goto/16 :goto_1

    .line 1959
    :pswitch_5
    #v0=(Integer);v2=(Uninit);v3=(Uninit);v4=(Uninit);v11=(Null);v23=(Integer);v24=(Uninit);v25=(Uninit);v26=(Uninit);
    invoke-static/range {p1 .. p1}, Landroid/support/v4/view/MotionEventCompat;->getActionIndex(Landroid/view/MotionEvent;)I

    move-result v9

    .line 1960
    .local v9, index:I
    #v9=(Integer);
    move-object/from16 v0, p1

    #v0=(Reference);
    invoke-static {v0, v9}, Landroid/support/v4/view/MotionEventCompat;->getX(Landroid/view/MotionEvent;I)F

    move-result v19

    .line 1961
    .restart local v19       #x:F
    #v19=(Float);
    move/from16 v0, v19

    #v0=(Float);
    move-object/from16 v1, p0

    iput v0, v1, Landroid/support/v4/view/ViewPager;->mLastMotionX:F

    .line 1962
    move-object/from16 v0, p1

    #v0=(Reference);
    invoke-static {v0, v9}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I

    move-result v23

    move/from16 v0, v23

    #v0=(Integer);
    move-object/from16 v1, p0

    iput v0, v1, Landroid/support/v4/view/ViewPager;->mActivePointerId:I

    goto/16 :goto_1

    .line 1966
    .end local v9           #index:I
    .end local v19           #x:F
    :pswitch_6
    #v9=(Uninit);v19=(Uninit);
    invoke-direct/range {p0 .. p1}, Landroid/support/v4/view/ViewPager;->onSecondaryPointerUp(Landroid/view/MotionEvent;)V

    .line 1967
    move-object/from16 v0, p0

    #v0=(Reference);
    iget v0, v0, Landroid/support/v4/view/ViewPager;->mActivePointerId:I

    #v0=(Integer);
    move/from16 v23, v0

    move-object/from16 v0, p1

    #v0=(Reference);
    move/from16 v1, v23

    #v1=(Integer);
    invoke-static {v0, v1}, Landroid/support/v4/view/MotionEventCompat;->findPointerIndex(Landroid/view/MotionEvent;I)I

    move-result v23

    move-object/from16 v0, p1

    move/from16 v1, v23

    invoke-static {v0, v1}, Landroid/support/v4/view/MotionEventCompat;->getX(Landroid/view/MotionEvent;I)F

    move-result v23

    #v23=(Float);
    move/from16 v0, v23

    #v0=(Float);
    move-object/from16 v1, p0

    #v1=(Reference);
    iput v0, v1, Landroid/support/v4/view/ViewPager;->mLastMotionX:F

    goto/16 :goto_1

    .line 1884
    #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);v9=(Unknown);v10=(Unknown);v11=(Unknown);v12=(Unknown);v13=(Unknown);v14=(Unknown);v15=(Unknown);v16=(Unknown);v17=(Unknown);v18=(Unknown);v19=(Unknown);v20=(Unknown);v21=(Unknown);v22=(Unknown);v23=(Unknown);v24=(Unknown);v25=(Unknown);v26=(Unknown);p0=(Unknown);p1=(Unknown);
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_3
        :pswitch_2
        :pswitch_4
        :pswitch_0
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method

.method pageLeft()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 2488
    #v0=(One);
    iget v1, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I

    #v1=(Integer);
    if-lez v1, :cond_0

    .line 2489
    iget v1, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {p0, v1, v0}, Landroid/support/v4/view/ViewPager;->setCurrentItem(IZ)V

    .line 2492
    :goto_0
    #v0=(Boolean);
    return v0

    :cond_0
    #v0=(One);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method pageRight()Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 2496
    #v0=(One);
    iget-object v1, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;

    #v1=(Reference);
    if-eqz v1, :cond_0

    iget v1, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I

    #v1=(Integer);
    iget-object v2, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;

    #v2=(Reference);
    invoke-virtual {v2}, Landroid/support/v4/view/PagerAdapter;->getCount()I

    move-result v2

    #v2=(Integer);
    add-int/lit8 v2, v2, -0x1

    if-ge v1, v2, :cond_0

    .line 2497
    iget v1, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {p0, v1, v0}, Landroid/support/v4/view/ViewPager;->setCurrentItem(IZ)V

    .line 2500
    :goto_0
    #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);
    return v0

    :cond_0
    #v0=(One);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method populate()V
    .locals 1

    .prologue
    .line 880
    iget v0, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I

    #v0=(Integer);
    invoke-virtual {p0, v0}, Landroid/support/v4/view/ViewPager;->populate(I)V

    .line 881
    return-void
.end method

.method populate(I)V
    .locals 26
    .parameter "newCurrentItem"

    .prologue
    .line 884
    const/16 v18, 0x0

    .line 885
    .local v18, oldCurInfo:Landroid/support/v4/view/ViewPager$ItemInfo;
    #v18=(Null);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget v0, v0, Landroid/support/v4/view/ViewPager;->mCurItem:I

    #v0=(Integer);
    move/from16 v23, v0

    #v23=(Integer);
    move/from16 v0, v23

    move/from16 v1, p1

    #v1=(Integer);
    if-eq v0, v1, :cond_0

    .line 886
    move-object/from16 v0, p0

    #v0=(Reference);
    iget v0, v0, Landroid/support/v4/view/ViewPager;->mCurItem:I

    #v0=(Integer);
    move/from16 v23, v0

    move-object/from16 v0, p0

    #v0=(Reference);
    move/from16 v1, v23

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->infoForPosition(I)Landroid/support/v4/view/ViewPager$ItemInfo;

    move-result-object v18

    .line 887
    #v18=(Reference);
    move/from16 v0, p1

    #v0=(Integer);
    move-object/from16 v1, p0

    #v1=(Reference);
    iput v0, v1, Landroid/support/v4/view/ViewPager;->mCurItem:I

    .line 890
    :cond_0
    #v1=(Conflicted);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;

    move-object/from16 v23, v0

    #v23=(Reference);
    if-nez v23, :cond_2

    .line 1057
    :cond_1
    #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v19=(Conflicted);v20=(Conflicted);v21=(Conflicted);v22=(Conflicted);v23=(Conflicted);v24=(Conflicted);v25=(Conflicted);
    return-void

    .line 898
    :cond_2
    #v0=(Reference);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v19=(Uninit);v20=(Uninit);v21=(Uninit);v22=(Uninit);v23=(Reference);v24=(Uninit);v25=(Uninit);
    move-object/from16 v0, p0

    iget-boolean v0, v0, Landroid/support/v4/view/ViewPager;->mPopulatePending:Z

    #v0=(Boolean);
    move/from16 v23, v0

    #v23=(Boolean);
    if-nez v23, :cond_1

    .line 906
    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getWindowToken()Landroid/os/IBinder;

    move-result-object v23

    #v23=(Reference);
    if-eqz v23, :cond_1

    .line 910
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;

    move-object/from16 v23, v0

    move-object/from16 v0, v23

    move-object/from16 v1, p0

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/support/v4/view/PagerAdapter;->startUpdate(Landroid/view/ViewGroup;)V

    .line 912
    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v4/view/ViewPager;->mOffscreenPageLimit:I

    #v0=(Integer);
    move/from16 v19, v0

    .line 913
    .local v19, pageLimit:I
    #v19=(Integer);
    const/16 v23, 0x0

    #v23=(Null);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget v0, v0, Landroid/support/v4/view/ViewPager;->mCurItem:I

    #v0=(Integer);
    move/from16 v24, v0

    #v24=(Integer);
    sub-int v24, v24, v19

    invoke-static/range {v23 .. v24}, Ljava/lang/Math;->max(II)I

    move-result v22

    .line 914
    .local v22, startPos:I
    #v22=(Integer);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;

    move-object/from16 v23, v0

    #v23=(Reference);
    invoke-virtual/range {v23 .. v23}, Landroid/support/v4/view/PagerAdapter;->getCount()I

    move-result v4

    .line 915
    .local v4, N:I
    #v4=(Integer);
    add-int/lit8 v23, v4, -0x1

    #v23=(Integer);
    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v4/view/ViewPager;->mCurItem:I

    #v0=(Integer);
    move/from16 v24, v0

    add-int v24, v24, v19

    invoke-static/range {v23 .. v24}, Ljava/lang/Math;->min(II)I

    move-result v10

    .line 918
    .local v10, endPos:I
    #v10=(Integer);
    const/4 v7, -0x1

    .line 919
    .local v7, curIndex:I
    #v7=(Byte);
    const/4 v8, 0x0

    .line 920
    .local v8, curItem:Landroid/support/v4/view/ViewPager$ItemInfo;
    #v8=(Null);
    const/4 v7, 0x0

    :goto_0
    #v1=(Conflicted);v7=(Integer);v14=(Conflicted);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;

    move-object/from16 v23, v0

    #v23=(Reference);
    invoke-virtual/range {v23 .. v23}, Ljava/util/ArrayList;->size()I

    move-result v23

    #v23=(Integer);
    move/from16 v0, v23

    #v0=(Integer);
    if-ge v7, v0, :cond_3

    .line 921
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;

    move-object/from16 v23, v0

    #v23=(Reference);
    move-object/from16 v0, v23

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    #v14=(Reference);
    check-cast v14, Landroid/support/v4/view/ViewPager$ItemInfo;

    .line 922
    .local v14, ii:Landroid/support/v4/view/ViewPager$ItemInfo;
    iget v0, v14, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I

    #v0=(Integer);
    move/from16 v23, v0

    #v23=(Integer);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget v0, v0, Landroid/support/v4/view/ViewPager;->mCurItem:I

    #v0=(Integer);
    move/from16 v24, v0

    move/from16 v0, v23

    move/from16 v1, v24

    #v1=(Integer);
    if-lt v0, v1, :cond_b

    .line 923
    iget v0, v14, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I

    move/from16 v23, v0

    move-object/from16 v0, p0

    #v0=(Reference);
    iget v0, v0, Landroid/support/v4/view/ViewPager;->mCurItem:I

    #v0=(Integer);
    move/from16 v24, v0

    move/from16 v0, v23

    move/from16 v1, v24

    if-ne v0, v1, :cond_3

    move-object v8, v14

    .line 928
    .end local v14           #ii:Landroid/support/v4/view/ViewPager$ItemInfo;
    :cond_3
    #v1=(Conflicted);v8=(Reference);v14=(Conflicted);
    if-nez v8, :cond_4

    if-lez v4, :cond_4

    .line 929
    move-object/from16 v0, p0

    #v0=(Reference);
    iget v0, v0, Landroid/support/v4/view/ViewPager;->mCurItem:I

    #v0=(Integer);
    move/from16 v23, v0

    move-object/from16 v0, p0

    #v0=(Reference);
    move/from16 v1, v23

    #v1=(Integer);
    invoke-virtual {v0, v1, v7}, Landroid/support/v4/view/ViewPager;->addNewItem(II)Landroid/support/v4/view/ViewPager$ItemInfo;

    move-result-object v8

    .line 935
    :cond_4
    #v0=(Conflicted);v1=(Conflicted);
    if-eqz v8, :cond_7

    .line 936
    const/4 v11, 0x0

    .line 937
    .local v11, extraWidthLeft:F
    #v11=(Null);
    add-int/lit8 v15, v7, -0x1

    .line 938
    .local v15, itemIndex:I
    #v15=(Integer);
    if-ltz v15, :cond_c

    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;

    move-object/from16 v23, v0

    #v23=(Reference);
    move-object/from16 v0, v23

    invoke-virtual {v0, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v23

    check-cast v23, Landroid/support/v4/view/ViewPager$ItemInfo;

    move-object/from16 v14, v23

    .line 939
    .restart local v14       #ii:Landroid/support/v4/view/ViewPager$ItemInfo;
    :goto_1
    #v0=(Conflicted);v14=(Reference);v23=(Conflicted);
    const/high16 v23, 0x4000

    #v23=(Integer);
    iget v0, v8, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F

    #v0=(Integer);
    move/from16 v24, v0

    sub-float v16, v23, v24

    .line 940
    .local v16, leftWidthNeeded:F
    #v16=(Float);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget v0, v0, Landroid/support/v4/view/ViewPager;->mCurItem:I

    #v0=(Integer);
    move/from16 v23, v0

    add-int/lit8 v20, v23, -0x1

    .local v20, pos:I
    :goto_2
    #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v11=(Float);v20=(Integer);v23=(Conflicted);v24=(Conflicted);
    if-ltz v20, :cond_5

    .line 941
    cmpl-float v23, v11, v16

    #v23=(Byte);
    if-ltz v23, :cond_10

    move/from16 v0, v20

    #v0=(Integer);
    move/from16 v1, v22

    #v1=(Integer);
    if-ge v0, v1, :cond_10

    .line 942
    if-nez v14, :cond_d

    .line 968
    :cond_5
    #v0=(Conflicted);v1=(Conflicted);v23=(Conflicted);
    iget v12, v8, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F

    .line 969
    .local v12, extraWidthRight:F
    #v12=(Integer);
    add-int/lit8 v15, v7, 0x1

    .line 970
    const/high16 v23, 0x4000

    #v23=(Integer);
    cmpg-float v23, v12, v23

    #v23=(Byte);
    if-gez v23, :cond_6

    .line 971
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;

    move-object/from16 v23, v0

    #v23=(Reference);
    invoke-virtual/range {v23 .. v23}, Ljava/util/ArrayList;->size()I

    move-result v23

    #v23=(Integer);
    move/from16 v0, v23

    #v0=(Integer);
    if-ge v15, v0, :cond_14

    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;

    move-object/from16 v23, v0

    #v23=(Reference);
    move-object/from16 v0, v23

    invoke-virtual {v0, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v23

    check-cast v23, Landroid/support/v4/view/ViewPager$ItemInfo;

    move-object/from16 v14, v23

    .line 972
    :goto_3
    #v0=(Conflicted);v23=(Conflicted);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget v0, v0, Landroid/support/v4/view/ViewPager;->mCurItem:I

    #v0=(Integer);
    move/from16 v23, v0

    #v23=(Integer);
    add-int/lit8 v20, v23, 0x1

    :goto_4
    #v0=(Conflicted);v23=(Conflicted);
    move/from16 v0, v20

    #v0=(Integer);
    if-ge v0, v4, :cond_6

    .line 973
    const/high16 v23, 0x4000

    #v23=(Integer);
    cmpl-float v23, v12, v23

    #v23=(Byte);
    if-ltz v23, :cond_18

    move/from16 v0, v20

    if-le v0, v10, :cond_18

    .line 974
    if-nez v14, :cond_15

    .line 999
    :cond_6
    #v0=(Conflicted);v23=(Conflicted);
    move-object/from16 v0, p0

    #v0=(Reference);
    move-object/from16 v1, v18

    #v1=(Reference);
    invoke-direct {v0, v8, v7, v1}, Landroid/support/v4/view/ViewPager;->calculatePageOffsets(Landroid/support/v4/view/ViewPager$ItemInfo;ILandroid/support/v4/view/ViewPager$ItemInfo;)V

    .line 1009
    .end local v11           #extraWidthLeft:F
    .end local v12           #extraWidthRight:F
    .end local v14           #ii:Landroid/support/v4/view/ViewPager$ItemInfo;
    .end local v15           #itemIndex:I
    .end local v16           #leftWidthNeeded:F
    .end local v20           #pos:I
    :cond_7
    #v0=(Conflicted);v1=(Conflicted);v11=(Conflicted);v12=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v20=(Conflicted);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;

    move-object/from16 v24, v0

    #v24=(Reference);
    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v4/view/ViewPager;->mCurItem:I

    #v0=(Integer);
    move/from16 v25, v0

    #v25=(Integer);
    if-eqz v8, :cond_1c

    iget-object v0, v8, Landroid/support/v4/view/ViewPager$ItemInfo;->object:Ljava/lang/Object;

    #v0=(Reference);
    move-object/from16 v23, v0

    :goto_5
    #v0=(Conflicted);v23=(Reference);
    move-object/from16 v0, v24

    #v0=(Reference);
    move-object/from16 v1, p0

    #v1=(Reference);
    move/from16 v2, v25

    #v2=(Integer);
    move-object/from16 v3, v23

    #v3=(Reference);
    invoke-virtual {v0, v1, v2, v3}, Landroid/support/v4/view/PagerAdapter;->setPrimaryItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V

    .line 1011
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;

    move-object/from16 v23, v0

    move-object/from16 v0, v23

    move-object/from16 v1, p0

    invoke-virtual {v0, v1}, Landroid/support/v4/view/PagerAdapter;->finishUpdate(Landroid/view/ViewGroup;)V

    .line 1015
    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v4/view/ViewPager;->mDrawingOrder:I

    #v0=(Integer);
    move/from16 v23, v0

    #v23=(Integer);
    if-eqz v23, :cond_1d

    const/16 v21, 0x1

    .line 1016
    .local v21, sort:Z
    :goto_6
    #v21=(Boolean);
    if-eqz v21, :cond_8

    .line 1017
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mDrawingOrderedChildren:Ljava/util/ArrayList;

    move-object/from16 v23, v0

    #v23=(Reference);
    if-nez v23, :cond_1e

    .line 1018
    new-instance v23, Ljava/util/ArrayList;

    #v23=(UninitRef);
    invoke-direct/range {v23 .. v23}, Ljava/util/ArrayList;-><init>()V

    #v23=(Reference);
    move-object/from16 v0, v23

    move-object/from16 v1, p0

    iput-object v0, v1, Landroid/support/v4/view/ViewPager;->mDrawingOrderedChildren:Ljava/util/ArrayList;

    .line 1023
    :cond_8
    :goto_7
    #v0=(Conflicted);v23=(Conflicted);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getChildCount()I

    move-result v6

    .line 1024
    .local v6, childCount:I
    #v6=(Integer);
    const/4 v13, 0x0

    .local v13, i:I
    :goto_8
    #v5=(Conflicted);v13=(Integer);v17=(Conflicted);
    if-ge v13, v6, :cond_1f

    .line 1025
    move-object/from16 v0, p0

    #v0=(Reference);
    invoke-virtual {v0, v13}, Landroid/support/v4/view/ViewPager;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    .line 1026
    .local v5, child:Landroid/view/View;
    #v5=(Reference);
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v17

    #v17=(Reference);
    check-cast v17, Landroid/support/v4/view/ViewPager$LayoutParams;

    .line 1027
    .local v17, lp:Landroid/support/v4/view/ViewPager$LayoutParams;
    move-object/from16 v0, v17

    iput v13, v0, Landroid/support/v4/view/ViewPager$LayoutParams;->childIndex:I

    .line 1028
    move-object/from16 v0, v17

    iget-boolean v0, v0, Landroid/support/v4/view/ViewPager$LayoutParams;->isDecor:Z

    #v0=(Boolean);
    move/from16 v23, v0

    #v23=(Boolean);
    if-nez v23, :cond_9

    move-object/from16 v0, v17

    #v0=(Reference);
    iget v0, v0, Landroid/support/v4/view/ViewPager$LayoutParams;->widthFactor:F

    #v0=(Integer);
    move/from16 v23, v0

    #v23=(Integer);
    const/16 v24, 0x0

    #v24=(Null);
    cmpl-float v23, v23, v24

    #v23=(Byte);
    if-nez v23, :cond_9

    .line 1030
    move-object/from16 v0, p0

    #v0=(Reference);
    invoke-virtual {v0, v5}, Landroid/support/v4/view/ViewPager;->infoForChild(Landroid/view/View;)Landroid/support/v4/view/ViewPager$ItemInfo;

    move-result-object v14

    .line 1031
    .restart local v14       #ii:Landroid/support/v4/view/ViewPager$ItemInfo;
    #v14=(Reference);
    if-eqz v14, :cond_9

    .line 1032
    iget v0, v14, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F

    #v0=(Integer);
    move/from16 v23, v0

    #v23=(Integer);
    move/from16 v0, v23

    move-object/from16 v1, v17

    iput v0, v1, Landroid/support/v4/view/ViewPager$LayoutParams;->widthFactor:F

    .line 1033
    iget v0, v14, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I

    move/from16 v23, v0

    move/from16 v0, v23

    move-object/from16 v1, v17

    iput v0, v1, Landroid/support/v4/view/ViewPager$LayoutParams;->position:I

    .line 1036
    .end local v14           #ii:Landroid/support/v4/view/ViewPager$ItemInfo;
    :cond_9
    #v0=(Conflicted);v14=(Conflicted);v24=(Reference);
    if-eqz v21, :cond_a

    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mDrawingOrderedChildren:Ljava/util/ArrayList;

    move-object/from16 v23, v0

    #v23=(Reference);
    move-object/from16 v0, v23

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1024
    :cond_a
    #v0=(Conflicted);v23=(Conflicted);
    add-int/lit8 v13, v13, 0x1

    goto :goto_8

    .line 920
    .end local v5           #child:Landroid/view/View;
    .end local v6           #childCount:I
    .end local v13           #i:I
    .end local v17           #lp:Landroid/support/v4/view/ViewPager$LayoutParams;
    .end local v21           #sort:Z
    .restart local v14       #ii:Landroid/support/v4/view/ViewPager$ItemInfo;
    :cond_b
    #v0=(Integer);v1=(Integer);v2=(Uninit);v3=(Uninit);v5=(Uninit);v6=(Uninit);v8=(Null);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Reference);v15=(Uninit);v16=(Uninit);v17=(Uninit);v20=(Uninit);v21=(Uninit);v23=(Integer);v24=(Integer);v25=(Uninit);
    add-int/lit8 v7, v7, 0x1

    goto/16 :goto_0

    .line 938
    .end local v14           #ii:Landroid/support/v4/view/ViewPager$ItemInfo;
    .restart local v11       #extraWidthLeft:F
    .restart local v15       #itemIndex:I
    :cond_c
    #v0=(Conflicted);v1=(Conflicted);v8=(Reference);v11=(Null);v14=(Conflicted);v15=(Integer);
    const/4 v14, 0x0

    #v14=(Null);
    goto/16 :goto_1

    .line 945
    .restart local v14       #ii:Landroid/support/v4/view/ViewPager$ItemInfo;
    .restart local v16       #leftWidthNeeded:F
    .restart local v20       #pos:I
    :cond_d
    #v0=(Integer);v1=(Integer);v2=(Conflicted);v3=(Conflicted);v11=(Float);v14=(Reference);v16=(Float);v20=(Integer);v23=(Byte);v24=(Conflicted);
    iget v0, v14, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I

    move/from16 v23, v0

    #v23=(Integer);
    move/from16 v0, v20

    move/from16 v1, v23

    if-ne v0, v1, :cond_e

    iget-boolean v0, v14, Landroid/support/v4/view/ViewPager$ItemInfo;->scrolling:Z

    #v0=(Boolean);
    move/from16 v23, v0

    #v23=(Boolean);
    if-nez v23, :cond_e

    .line 946
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;

    move-object/from16 v23, v0

    #v23=(Reference);
    move-object/from16 v0, v23

    invoke-virtual {v0, v15}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 947
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;

    move-object/from16 v23, v0

    iget-object v0, v14, Landroid/support/v4/view/ViewPager$ItemInfo;->object:Ljava/lang/Object;

    move-object/from16 v24, v0

    #v24=(Reference);
    move-object/from16 v0, v23

    move-object/from16 v1, p0

    #v1=(Reference);
    move/from16 v2, v20

    #v2=(Integer);
    move-object/from16 v3, v24

    #v3=(Reference);
    invoke-virtual {v0, v1, v2, v3}, Landroid/support/v4/view/PagerAdapter;->destroyItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V

    .line 952
    add-int/lit8 v15, v15, -0x1

    .line 953
    add-int/lit8 v7, v7, -0x1

    .line 954
    if-ltz v15, :cond_f

    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;

    move-object/from16 v23, v0

    move-object/from16 v0, v23

    invoke-virtual {v0, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v23

    check-cast v23, Landroid/support/v4/view/ViewPager$ItemInfo;

    move-object/from16 v14, v23

    .line 940
    :cond_e
    :goto_9
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v23=(Conflicted);v24=(Conflicted);
    add-int/lit8 v20, v20, -0x1

    goto/16 :goto_2

    .line 954
    :cond_f
    #v0=(Reference);v1=(Reference);v2=(Integer);v3=(Reference);v23=(Reference);v24=(Reference);
    const/4 v14, 0x0

    #v14=(Null);
    goto :goto_9

    .line 956
    :cond_10
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v14=(Reference);v23=(Byte);v24=(Conflicted);
    if-eqz v14, :cond_12

    iget v0, v14, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I

    #v0=(Integer);
    move/from16 v23, v0

    #v23=(Integer);
    move/from16 v0, v20

    move/from16 v1, v23

    #v1=(Integer);
    if-ne v0, v1, :cond_12

    .line 957
    iget v0, v14, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F

    move/from16 v23, v0

    add-float v11, v11, v23

    .line 958
    add-int/lit8 v15, v15, -0x1

    .line 959
    if-ltz v15, :cond_11

    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;

    move-object/from16 v23, v0

    #v23=(Reference);
    move-object/from16 v0, v23

    invoke-virtual {v0, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v23

    check-cast v23, Landroid/support/v4/view/ViewPager$ItemInfo;

    move-object/from16 v14, v23

    :goto_a
    #v0=(Conflicted);v23=(Conflicted);
    goto :goto_9

    :cond_11
    #v0=(Integer);v23=(Integer);
    const/4 v14, 0x0

    #v14=(Null);
    goto :goto_a

    .line 961
    :cond_12
    #v0=(Conflicted);v1=(Conflicted);v14=(Reference);
    add-int/lit8 v23, v15, 0x1

    move-object/from16 v0, p0

    #v0=(Reference);
    move/from16 v1, v20

    #v1=(Integer);
    move/from16 v2, v23

    #v2=(Integer);
    invoke-virtual {v0, v1, v2}, Landroid/support/v4/view/ViewPager;->addNewItem(II)Landroid/support/v4/view/ViewPager$ItemInfo;

    move-result-object v14

    .line 962
    iget v0, v14, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F

    #v0=(Integer);
    move/from16 v23, v0

    add-float v11, v11, v23

    .line 963
    add-int/lit8 v7, v7, 0x1

    .line 964
    if-ltz v15, :cond_13

    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;

    move-object/from16 v23, v0

    #v23=(Reference);
    move-object/from16 v0, v23

    invoke-virtual {v0, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v23

    check-cast v23, Landroid/support/v4/view/ViewPager$ItemInfo;

    move-object/from16 v14, v23

    :goto_b
    #v0=(Conflicted);v23=(Conflicted);
    goto :goto_9

    :cond_13
    #v0=(Integer);v23=(Integer);
    const/4 v14, 0x0

    #v14=(Null);
    goto :goto_b

    .line 971
    .restart local v12       #extraWidthRight:F
    :cond_14
    #v1=(Conflicted);v2=(Conflicted);v12=(Integer);v14=(Reference);
    const/4 v14, 0x0

    #v14=(Null);
    goto/16 :goto_3

    .line 977
    :cond_15
    #v14=(Reference);v23=(Byte);
    iget v0, v14, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I

    move/from16 v23, v0

    #v23=(Integer);
    move/from16 v0, v20

    move/from16 v1, v23

    #v1=(Integer);
    if-ne v0, v1, :cond_16

    iget-boolean v0, v14, Landroid/support/v4/view/ViewPager$ItemInfo;->scrolling:Z

    #v0=(Boolean);
    move/from16 v23, v0

    #v23=(Boolean);
    if-nez v23, :cond_16

    .line 978
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;

    move-object/from16 v23, v0

    #v23=(Reference);
    move-object/from16 v0, v23

    invoke-virtual {v0, v15}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 979
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;

    move-object/from16 v23, v0

    iget-object v0, v14, Landroid/support/v4/view/ViewPager$ItemInfo;->object:Ljava/lang/Object;

    move-object/from16 v24, v0

    #v24=(Reference);
    move-object/from16 v0, v23

    move-object/from16 v1, p0

    #v1=(Reference);
    move/from16 v2, v20

    #v2=(Integer);
    move-object/from16 v3, v24

    #v3=(Reference);
    invoke-virtual {v0, v1, v2, v3}, Landroid/support/v4/view/PagerAdapter;->destroyItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V

    .line 984
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;

    move-object/from16 v23, v0

    invoke-virtual/range {v23 .. v23}, Ljava/util/ArrayList;->size()I

    move-result v23

    #v23=(Integer);
    move/from16 v0, v23

    #v0=(Integer);
    if-ge v15, v0, :cond_17

    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;

    move-object/from16 v23, v0

    #v23=(Reference);
    move-object/from16 v0, v23

    invoke-virtual {v0, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v23

    check-cast v23, Landroid/support/v4/view/ViewPager$ItemInfo;

    move-object/from16 v14, v23

    .line 972
    :cond_16
    :goto_c
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v23=(Conflicted);v24=(Conflicted);
    add-int/lit8 v20, v20, 0x1

    goto/16 :goto_4

    .line 984
    :cond_17
    #v0=(Integer);v1=(Reference);v2=(Integer);v3=(Reference);v23=(Integer);v24=(Reference);
    const/4 v14, 0x0

    #v14=(Null);
    goto :goto_c

    .line 986
    :cond_18
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v14=(Reference);v23=(Byte);v24=(Conflicted);
    if-eqz v14, :cond_1a

    iget v0, v14, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I

    move/from16 v23, v0

    #v23=(Integer);
    move/from16 v0, v20

    move/from16 v1, v23

    #v1=(Integer);
    if-ne v0, v1, :cond_1a

    .line 987
    iget v0, v14, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F

    move/from16 v23, v0

    add-float v12, v12, v23

    .line 988
    #v12=(Float);
    add-int/lit8 v15, v15, 0x1

    .line 989
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;

    move-object/from16 v23, v0

    #v23=(Reference);
    invoke-virtual/range {v23 .. v23}, Ljava/util/ArrayList;->size()I

    move-result v23

    #v23=(Integer);
    move/from16 v0, v23

    #v0=(Integer);
    if-ge v15, v0, :cond_19

    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;

    move-object/from16 v23, v0

    #v23=(Reference);
    move-object/from16 v0, v23

    invoke-virtual {v0, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v23

    check-cast v23, Landroid/support/v4/view/ViewPager$ItemInfo;

    move-object/from16 v14, v23

    :goto_d
    #v0=(Conflicted);v23=(Conflicted);
    goto :goto_c

    :cond_19
    #v0=(Integer);v23=(Integer);
    const/4 v14, 0x0

    #v14=(Null);
    goto :goto_d

    .line 991
    :cond_1a
    #v1=(Conflicted);v12=(Integer);v14=(Reference);
    move-object/from16 v0, p0

    #v0=(Reference);
    move/from16 v1, v20

    #v1=(Integer);
    invoke-virtual {v0, v1, v15}, Landroid/support/v4/view/ViewPager;->addNewItem(II)Landroid/support/v4/view/ViewPager$ItemInfo;

    move-result-object v14

    .line 992
    add-int/lit8 v15, v15, 0x1

    .line 993
    iget v0, v14, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F

    #v0=(Integer);
    move/from16 v23, v0

    add-float v12, v12, v23

    .line 994
    #v12=(Float);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;

    move-object/from16 v23, v0

    #v23=(Reference);
    invoke-virtual/range {v23 .. v23}, Ljava/util/ArrayList;->size()I

    move-result v23

    #v23=(Integer);
    move/from16 v0, v23

    #v0=(Integer);
    if-ge v15, v0, :cond_1b

    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;

    move-object/from16 v23, v0

    #v23=(Reference);
    move-object/from16 v0, v23

    invoke-virtual {v0, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v23

    check-cast v23, Landroid/support/v4/view/ViewPager$ItemInfo;

    move-object/from16 v14, v23

    :goto_e
    #v0=(Conflicted);v23=(Conflicted);
    goto :goto_c

    :cond_1b
    #v0=(Integer);v23=(Integer);
    const/4 v14, 0x0

    #v14=(Null);
    goto :goto_e

    .line 1009
    .end local v11           #extraWidthLeft:F
    .end local v12           #extraWidthRight:F
    .end local v14           #ii:Landroid/support/v4/view/ViewPager$ItemInfo;
    .end local v15           #itemIndex:I
    .end local v16           #leftWidthNeeded:F
    .end local v20           #pos:I
    :cond_1c
    #v1=(Conflicted);v11=(Conflicted);v12=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v20=(Conflicted);v23=(Conflicted);v24=(Reference);v25=(Integer);
    const/16 v23, 0x0

    #v23=(Null);
    goto/16 :goto_5

    .line 1015
    :cond_1d
    #v1=(Reference);v2=(Integer);v3=(Reference);v23=(Integer);
    const/16 v21, 0x0

    #v21=(Null);
    goto/16 :goto_6

    .line 1020
    .restart local v21       #sort:Z
    :cond_1e
    #v0=(Reference);v21=(Boolean);v23=(Reference);
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mDrawingOrderedChildren:Ljava/util/ArrayList;

    move-object/from16 v23, v0

    invoke-virtual/range {v23 .. v23}, Ljava/util/ArrayList;->clear()V

    goto/16 :goto_7

    .line 1038
    .restart local v6       #childCount:I
    .restart local v13       #i:I
    :cond_1f
    #v0=(Conflicted);v5=(Conflicted);v6=(Integer);v13=(Integer);v17=(Conflicted);v23=(Conflicted);
    if-eqz v21, :cond_20

    .line 1039
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mDrawingOrderedChildren:Ljava/util/ArrayList;

    move-object/from16 v23, v0

    #v23=(Reference);
    sget-object v24, Landroid/support/v4/view/ViewPager;->sPositionComparator:Landroid/support/v4/view/ViewPager$ViewPositionComparator;

    invoke-static/range {v23 .. v24}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 1042
    :cond_20
    #v0=(Conflicted);v23=(Conflicted);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->hasFocus()Z

    move-result v23

    #v23=(Boolean);
    if-eqz v23, :cond_1

    .line 1043
    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->findFocus()Landroid/view/View;

    move-result-object v9

    .line 1044
    .local v9, currentFocused:Landroid/view/View;
    #v9=(Reference);
    if-eqz v9, :cond_23

    move-object/from16 v0, p0

    #v0=(Reference);
    invoke-virtual {v0, v9}, Landroid/support/v4/view/ViewPager;->infoForAnyChild(Landroid/view/View;)Landroid/support/v4/view/ViewPager$ItemInfo;

    move-result-object v14

    .line 1045
    .restart local v14       #ii:Landroid/support/v4/view/ViewPager$ItemInfo;
    :goto_f
    #v0=(Conflicted);v14=(Reference);
    if-eqz v14, :cond_21

    iget v0, v14, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I

    #v0=(Integer);
    move/from16 v23, v0

    #v23=(Integer);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget v0, v0, Landroid/support/v4/view/ViewPager;->mCurItem:I

    #v0=(Integer);
    move/from16 v24, v0

    #v24=(Integer);
    move/from16 v0, v23

    move/from16 v1, v24

    #v1=(Integer);
    if-eq v0, v1, :cond_1

    .line 1046
    :cond_21
    #v0=(Conflicted);v1=(Conflicted);v24=(Conflicted);
    const/4 v13, 0x0

    :goto_10
    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getChildCount()I

    move-result v23

    move/from16 v0, v23

    #v0=(Integer);
    if-ge v13, v0, :cond_1

    .line 1047
    move-object/from16 v0, p0

    #v0=(Reference);
    invoke-virtual {v0, v13}, Landroid/support/v4/view/ViewPager;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    .line 1048
    .restart local v5       #child:Landroid/view/View;
    #v5=(Reference);
    move-object/from16 v0, p0

    invoke-virtual {v0, v5}, Landroid/support/v4/view/ViewPager;->infoForChild(Landroid/view/View;)Landroid/support/v4/view/ViewPager$ItemInfo;

    move-result-object v14

    .line 1049
    if-eqz v14, :cond_22

    iget v0, v14, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I

    #v0=(Integer);
    move/from16 v23, v0

    move-object/from16 v0, p0

    #v0=(Reference);
    iget v0, v0, Landroid/support/v4/view/ViewPager;->mCurItem:I

    #v0=(Integer);
    move/from16 v24, v0

    #v24=(Integer);
    move/from16 v0, v23

    move/from16 v1, v24

    #v1=(Integer);
    if-ne v0, v1, :cond_22

    .line 1050
    const/16 v23, 0x2

    #v23=(PosByte);
    move/from16 v0, v23

    #v0=(PosByte);
    invoke-virtual {v5, v0}, Landroid/view/View;->requestFocus(I)Z

    move-result v23

    #v23=(Boolean);
    if-nez v23, :cond_1

    .line 1046
    :cond_22
    #v0=(Conflicted);v1=(Conflicted);v23=(Integer);v24=(Conflicted);
    add-int/lit8 v13, v13, 0x1

    goto :goto_10

    .line 1044
    .end local v5           #child:Landroid/view/View;
    .end local v14           #ii:Landroid/support/v4/view/ViewPager$ItemInfo;
    :cond_23
    #v1=(Reference);v5=(Conflicted);v14=(Conflicted);v23=(Boolean);v24=(Reference);
    const/4 v14, 0x0

    #v14=(Null);
    goto :goto_f
.end method

.method public removeView(Landroid/view/View;)V
    .locals 1
    .parameter "view"

    .prologue
    .line 1256
    iget-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mInLayout:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 1257
    invoke-virtual {p0, p1}, Landroid/support/v4/view/ViewPager;->removeViewInLayout(Landroid/view/View;)V

    .line 1261
    :goto_0
    return-void

    .line 1259
    :cond_0
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    goto :goto_0
.end method

.method public setAdapter(Landroid/support/v4/view/PagerAdapter;)V
    .locals 9
    .parameter "adapter"

    .prologue
    const/4 v8, 0x1

    #v8=(One);
    const/4 v7, 0x0

    #v7=(Null);
    const/4 v6, 0x0

    .line 402
    #v6=(Null);
    iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;

    #v3=(Reference);
    if-eqz v3, :cond_1

    .line 403
    iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;

    iget-object v4, p0, Landroid/support/v4/view/ViewPager;->mObserver:Landroid/support/v4/view/ViewPager$PagerObserver;

    #v4=(Reference);
    invoke-virtual {v3, v4}, Landroid/support/v4/view/PagerAdapter;->unregisterDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 404
    iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;

    invoke-virtual {v3, p0}, Landroid/support/v4/view/PagerAdapter;->startUpdate(Landroid/view/ViewGroup;)V

    .line 405
    const/4 v0, 0x0

    .local v0, i:I
    :goto_0
    #v0=(Integer);v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    #v3=(Integer);
    if-ge v0, v3, :cond_0

    .line 406
    iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;

    #v3=(Reference);
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    #v1=(Reference);
    check-cast v1, Landroid/support/v4/view/ViewPager$ItemInfo;

    .line 407
    .local v1, ii:Landroid/support/v4/view/ViewPager$ItemInfo;
    iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;

    iget v4, v1, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I

    #v4=(Integer);
    iget-object v5, v1, Landroid/support/v4/view/ViewPager$ItemInfo;->object:Ljava/lang/Object;

    #v5=(Reference);
    invoke-virtual {v3, p0, v4, v5}, Landroid/support/v4/view/PagerAdapter;->destroyItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V

    .line 405
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 409
    .end local v1           #ii:Landroid/support/v4/view/ViewPager$ItemInfo;
    :cond_0
    #v1=(Conflicted);v3=(Integer);v4=(Conflicted);v5=(Conflicted);
    iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;

    #v3=(Reference);
    invoke-virtual {v3, p0}, Landroid/support/v4/view/PagerAdapter;->finishUpdate(Landroid/view/ViewGroup;)V

    .line 410
    iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 411
    invoke-direct {p0}, Landroid/support/v4/view/ViewPager;->removeNonDecorViews()V

    .line 412
    iput v6, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I

    .line 413
    invoke-virtual {p0, v6, v6}, Landroid/support/v4/view/ViewPager;->scrollTo(II)V

    .line 416
    .end local v0           #i:I
    :cond_1
    #v0=(Conflicted);
    iget-object v2, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;

    .line 417
    .local v2, oldAdapter:Landroid/support/v4/view/PagerAdapter;
    #v2=(Reference);
    iput-object p1, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;

    .line 419
    iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;

    if-eqz v3, :cond_3

    .line 420
    iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mObserver:Landroid/support/v4/view/ViewPager$PagerObserver;

    if-nez v3, :cond_2

    .line 421
    new-instance v3, Landroid/support/v4/view/ViewPager$PagerObserver;

    #v3=(UninitRef);
    invoke-direct {v3, p0, v7}, Landroid/support/v4/view/ViewPager$PagerObserver;-><init>(Landroid/support/v4/view/ViewPager;Landroid/support/v4/view/ViewPager$1;)V

    #v3=(Reference);
    iput-object v3, p0, Landroid/support/v4/view/ViewPager;->mObserver:Landroid/support/v4/view/ViewPager$PagerObserver;

    .line 423
    :cond_2
    iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;

    iget-object v4, p0, Landroid/support/v4/view/ViewPager;->mObserver:Landroid/support/v4/view/ViewPager$PagerObserver;

    #v4=(Reference);
    invoke-virtual {v3, v4}, Landroid/support/v4/view/PagerAdapter;->registerDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 424
    iput-boolean v6, p0, Landroid/support/v4/view/ViewPager;->mPopulatePending:Z

    .line 425
    iput-boolean v8, p0, Landroid/support/v4/view/ViewPager;->mFirstLayout:Z

    .line 426
    iget v3, p0, Landroid/support/v4/view/ViewPager;->mRestoredCurItem:I

    #v3=(Integer);
    if-ltz v3, :cond_5

    .line 427
    iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;

    #v3=(Reference);
    iget-object v4, p0, Landroid/support/v4/view/ViewPager;->mRestoredAdapterState:Landroid/os/Parcelable;

    iget-object v5, p0, Landroid/support/v4/view/ViewPager;->mRestoredClassLoader:Ljava/lang/ClassLoader;

    #v5=(Reference);
    invoke-virtual {v3, v4, v5}, Landroid/support/v4/view/PagerAdapter;->restoreState(Landroid/os/Parcelable;Ljava/lang/ClassLoader;)V

    .line 428
    iget v3, p0, Landroid/support/v4/view/ViewPager;->mRestoredCurItem:I

    #v3=(Integer);
    invoke-virtual {p0, v3, v6, v8}, Landroid/support/v4/view/ViewPager;->setCurrentItemInternal(IZZ)V

    .line 429
    const/4 v3, -0x1

    #v3=(Byte);
    iput v3, p0, Landroid/support/v4/view/ViewPager;->mRestoredCurItem:I

    .line 430
    iput-object v7, p0, Landroid/support/v4/view/ViewPager;->mRestoredAdapterState:Landroid/os/Parcelable;

    .line 431
    iput-object v7, p0, Landroid/support/v4/view/ViewPager;->mRestoredClassLoader:Ljava/lang/ClassLoader;

    .line 437
    :cond_3
    :goto_1
    #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mAdapterChangeListener:Landroid/support/v4/view/ViewPager$OnAdapterChangeListener;

    #v3=(Reference);
    if-eqz v3, :cond_4

    if-eq v2, p1, :cond_4

    .line 438
    iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mAdapterChangeListener:Landroid/support/v4/view/ViewPager$OnAdapterChangeListener;

    invoke-interface {v3, v2, p1}, Landroid/support/v4/view/ViewPager$OnAdapterChangeListener;->onAdapterChanged(Landroid/support/v4/view/PagerAdapter;Landroid/support/v4/view/PagerAdapter;)V

    .line 440
    :cond_4
    return-void

    .line 433
    :cond_5
    #v3=(Integer);v4=(Reference);
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->populate()V

    goto :goto_1
.end method

.method setChildrenDrawingOrderEnabledCompat(Z)V
    .locals 6
    .parameter "enable"

    .prologue
    .line 593
    iget-object v1, p0, Landroid/support/v4/view/ViewPager;->mSetChildrenDrawingOrderEnabled:Ljava/lang/reflect/Method;

    #v1=(Reference);
    if-nez v1, :cond_0

    .line 595
    :try_start_0
    const-class v1, Landroid/view/ViewGroup;

    const-string v2, "setChildrenDrawingOrderEnabled"

    #v2=(Reference);
    const/4 v3, 0x1

    #v3=(One);
    new-array v3, v3, [Ljava/lang/Class;

    #v3=(Reference);
    const/4 v4, 0x0

    #v4=(Null);
    sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    #v5=(Reference);
    aput-object v5, v3, v4

    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    iput-object v1, p0, Landroid/support/v4/view/ViewPager;->mSetChildrenDrawingOrderEnabled:Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 602
    :cond_0
    :goto_0
    :try_start_1
    #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    iget-object v1, p0, Landroid/support/v4/view/ViewPager;->mSetChildrenDrawingOrderEnabled:Ljava/lang/reflect/Method;

    const/4 v2, 0x1

    #v2=(One);
    new-array v2, v2, [Ljava/lang/Object;

    #v2=(Reference);
    const/4 v3, 0x0

    #v3=(Null);
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    #v4=(Reference);
    aput-object v4, v2, v3

    invoke-virtual {v1, p0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 606
    :goto_1
    #v3=(Conflicted);v4=(Conflicted);
    return-void

    .line 597
    :catch_0
    #v0=(Uninit);v2=(Conflicted);
    move-exception v0

    .line 598
    .local v0, e:Ljava/lang/NoSuchMethodException;
    #v0=(Reference);
    const-string v1, "ViewPager"

    const-string v2, "Can\'t find setChildrenDrawingOrderEnabled"

    #v2=(Reference);
    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0

    .line 603
    .end local v0           #e:Ljava/lang/NoSuchMethodException;
    :catch_1
    #v0=(Conflicted);v2=(Conflicted);
    move-exception v0

    .line 604
    .local v0, e:Ljava/lang/Exception;
    #v0=(Reference);
    const-string v1, "ViewPager"

    const-string v2, "Error changing children drawing order"

    #v2=(Reference);
    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1
.end method

.method public setCurrentItem(I)V
    .locals 2
    .parameter "item"

    .prologue
    const/4 v1, 0x0

    .line 474
    #v1=(Null);
    iput-boolean v1, p0, Landroid/support/v4/view/ViewPager;->mPopulatePending:Z

    .line 475
    iget-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mFirstLayout:Z

    #v0=(Boolean);
    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-virtual {p0, p1, v0, v1}, Landroid/support/v4/view/ViewPager;->setCurrentItemInternal(IZZ)V

    .line 476
    return-void

    :cond_0
    move v0, v1

    .line 475
    #v0=(Null);
    goto :goto_0
.end method

.method public setCurrentItem(IZ)V
    .locals 1
    .parameter "item"
    .parameter "smoothScroll"

    .prologue
    const/4 v0, 0x0

    .line 485
    #v0=(Null);
    iput-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mPopulatePending:Z

    .line 486
    invoke-virtual {p0, p1, p2, v0}, Landroid/support/v4/view/ViewPager;->setCurrentItemInternal(IZZ)V

    .line 487
    return-void
.end method

.method setCurrentItemInternal(IZZ)V
    .locals 1
    .parameter "item"
    .parameter "smoothScroll"
    .parameter "always"

    .prologue
    .line 494
    const/4 v0, 0x0

    #v0=(Null);
    invoke-virtual {p0, p1, p2, p3, v0}, Landroid/support/v4/view/ViewPager;->setCurrentItemInternal(IZZI)V

    .line 495
    return-void
.end method

.method setCurrentItemInternal(IZZI)V
    .locals 5
    .parameter "item"
    .parameter "smoothScroll"
    .parameter "always"
    .parameter "velocity"

    .prologue
    const/4 v0, 0x1

    #v0=(One);
    const/4 v4, 0x0

    .line 498
    #v4=(Null);
    iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;

    #v3=(Reference);
    if-eqz v3, :cond_0

    iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;

    invoke-virtual {v3}, Landroid/support/v4/view/PagerAdapter;->getCount()I

    move-result v3

    #v3=(Integer);
    if-gtz v3, :cond_1

    .line 499
    :cond_0
    #v3=(Conflicted);
    invoke-direct {p0, v4}, Landroid/support/v4/view/ViewPager;->setScrollingCacheEnabled(Z)V

    .line 524
    :goto_0
    #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);
    return-void

    .line 502
    :cond_1
    #v0=(One);v1=(Uninit);v2=(Uninit);v3=(Integer);
    if-nez p3, :cond_2

    iget v3, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I

    if-ne v3, p1, :cond_2

    iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;

    #v3=(Reference);
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    #v3=(Integer);
    if-eqz v3, :cond_2

    .line 503
    invoke-direct {p0, v4}, Landroid/support/v4/view/ViewPager;->setScrollingCacheEnabled(Z)V

    goto :goto_0

    .line 507
    :cond_2
    if-gez p1, :cond_5

    .line 508
    const/4 p1, 0x0

    .line 512
    :cond_3
    :goto_1
    iget v2, p0, Landroid/support/v4/view/ViewPager;->mOffscreenPageLimit:I

    .line 513
    .local v2, pageLimit:I
    #v2=(Integer);
    iget v3, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I

    add-int/2addr v3, v2

    if-gt p1, v3, :cond_4

    iget v3, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I

    sub-int/2addr v3, v2

    if-ge p1, v3, :cond_6

    .line 517
    :cond_4
    const/4 v1, 0x0

    .local v1, i:I
    :goto_2
    #v1=(Integer);v3=(Conflicted);
    iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;

    #v3=(Reference);
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    #v3=(Integer);
    if-ge v1, v3, :cond_6

    .line 518
    iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;

    #v3=(Reference);
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/support/v4/view/ViewPager$ItemInfo;

    iput-boolean v0, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->scrolling:Z

    .line 517
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 509
    .end local v1           #i:I
    .end local v2           #pageLimit:I
    :cond_5
    #v1=(Uninit);v2=(Uninit);v3=(Integer);
    iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;

    #v3=(Reference);
    invoke-virtual {v3}, Landroid/support/v4/view/PagerAdapter;->getCount()I

    move-result v3

    #v3=(Integer);
    if-lt p1, v3, :cond_3

    .line 510
    iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;

    #v3=(Reference);
    invoke-virtual {v3}, Landroid/support/v4/view/PagerAdapter;->getCount()I

    move-result v3

    #v3=(Integer);
    add-int/lit8 p1, v3, -0x1

    goto :goto_1

    .line 521
    .restart local v2       #pageLimit:I
    :cond_6
    #v1=(Conflicted);v2=(Integer);
    iget v3, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I

    if-eq v3, p1, :cond_7

    .line 522
    .local v0, dispatchSelected:Z
    :goto_3
    #v0=(Boolean);
    invoke-virtual {p0, p1}, Landroid/support/v4/view/ViewPager;->populate(I)V

    .line 523
    invoke-direct {p0, p1, p2, p4, v0}, Landroid/support/v4/view/ViewPager;->scrollToItem(IZIZ)V

    goto :goto_0

    .end local v0           #dispatchSelected:Z
    :cond_7
    #v0=(One);
    move v0, v4

    .line 521
    #v0=(Null);
    goto :goto_3
.end method

.method setInternalPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)Landroid/support/v4/view/ViewPager$OnPageChangeListener;
    .locals 1
    .parameter "listener"

    .prologue
    .line 622
    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mInternalPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;

    .line 623
    .local v0, oldListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
    #v0=(Reference);
    iput-object p1, p0, Landroid/support/v4/view/ViewPager;->mInternalPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;

    .line 624
    return-object v0
.end method

.method public setOffscreenPageLimit(I)V
    .locals 4
    .parameter "limit"

    .prologue
    const/4 v3, 0x1

    .line 656
    #v3=(One);
    if-ge p1, v3, :cond_0

    .line 657
    const-string v0, "ViewPager"

    #v0=(Reference);
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #v1=(Reference);
    const-string v2, "Requested offscreen page limit "

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " too small; defaulting to "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 659
    const/4 p1, 0x1

    .line 661
    :cond_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    iget v0, p0, Landroid/support/v4/view/ViewPager;->mOffscreenPageLimit:I

    #v0=(Integer);
    if-eq p1, v0, :cond_1

    .line 662
    iput p1, p0, Landroid/support/v4/view/ViewPager;->mOffscreenPageLimit:I

    .line 663
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->populate()V

    .line 665
    :cond_1
    return-void
.end method

.method setOnAdapterChangeListener(Landroid/support/v4/view/ViewPager$OnAdapterChangeListener;)V
    .locals 0
    .parameter "listener"

    .prologue
    .line 463
    iput-object p1, p0, Landroid/support/v4/view/ViewPager;->mAdapterChangeListener:Landroid/support/v4/view/ViewPager$OnAdapterChangeListener;

    .line 464
    return-void
.end method

.method public setOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V
    .locals 0
    .parameter "listener"

    .prologue
    .line 562
    iput-object p1, p0, Landroid/support/v4/view/ViewPager;->mOnPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;

    .line 563
    return-void
.end method

.method public setPageMargin(I)V
    .locals 2
    .parameter "marginPixels"

    .prologue
    .line 676
    iget v0, p0, Landroid/support/v4/view/ViewPager;->mPageMargin:I

    .line 677
    .local v0, oldMargin:I
    #v0=(Integer);
    iput p1, p0, Landroid/support/v4/view/ViewPager;->mPageMargin:I

    .line 679
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getWidth()I

    move-result v1

    .line 680
    .local v1, width:I
    #v1=(Integer);
    invoke-direct {p0, v1, v1, p1, v0}, Landroid/support/v4/view/ViewPager;->recomputeScrollPosition(IIII)V

    .line 682
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->requestLayout()V

    .line 683
    return-void
.end method

.method public setPageMarginDrawable(I)V
    .locals 1
    .parameter "resId"

    .prologue
    .line 712
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getContext()Landroid/content/Context;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/support/v4/view/ViewPager;->setPageMarginDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 713
    return-void
.end method

.method public setPageMarginDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1
    .parameter "d"

    .prologue
    .line 700
    iput-object p1, p0, Landroid/support/v4/view/ViewPager;->mMarginDrawable:Landroid/graphics/drawable/Drawable;

    .line 701
    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->refreshDrawableState()V

    .line 702
    :cond_0
    if-nez p1, :cond_1

    const/4 v0, 0x1

    :goto_0
    #v0=(Boolean);
    invoke-virtual {p0, v0}, Landroid/support/v4/view/ViewPager;->setWillNotDraw(Z)V

    .line 703
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->invalidate()V

    .line 704
    return-void

    .line 702
    :cond_1
    #v0=(Uninit);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public setPageTransformer(ZLandroid/support/v4/view/ViewPager$PageTransformer;)V
    .locals 6
    .parameter "reverseDrawingOrder"
    .parameter "transformer"

    .prologue
    const/4 v2, 0x1

    #v2=(One);
    const/4 v3, 0x0

    .line 578
    #v3=(Null);
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    #v4=(Integer);
    const/16 v5, 0xb

    #v5=(PosByte);
    if-lt v4, v5, :cond_1

    .line 579
    if-eqz p2, :cond_2

    move v0, v2

    .line 580
    .local v0, hasTransformer:Z
    :goto_0
    #v0=(Boolean);
    iget-object v4, p0, Landroid/support/v4/view/ViewPager;->mPageTransformer:Landroid/support/v4/view/ViewPager$PageTransformer;

    #v4=(Reference);
    if-eqz v4, :cond_3

    move v4, v2

    :goto_1
    #v4=(Boolean);
    if-eq v0, v4, :cond_4

    move v1, v2

    .line 581
    .local v1, needsPopulate:Z
    :goto_2
    #v1=(Boolean);
    iput-object p2, p0, Landroid/support/v4/view/ViewPager;->mPageTransformer:Landroid/support/v4/view/ViewPager$PageTransformer;

    .line 582
    invoke-virtual {p0, v0}, Landroid/support/v4/view/ViewPager;->setChildrenDrawingOrderEnabledCompat(Z)V

    .line 583
    if-eqz v0, :cond_5

    .line 584
    if-eqz p1, :cond_0

    const/4 v2, 0x2

    :cond_0
    #v2=(PosByte);
    iput v2, p0, Landroid/support/v4/view/ViewPager;->mDrawingOrder:I

    .line 588
    :goto_3
    if-eqz v1, :cond_1

    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->populate()V

    .line 590
    .end local v0           #hasTransformer:Z
    .end local v1           #needsPopulate:Z
    :cond_1
    #v0=(Conflicted);v1=(Conflicted);v4=(Integer);
    return-void

    :cond_2
    #v0=(Uninit);v1=(Uninit);v2=(One);
    move v0, v3

    .line 579
    #v0=(Null);
    goto :goto_0

    .restart local v0       #hasTransformer:Z
    :cond_3
    #v0=(Boolean);v4=(Reference);
    move v4, v3

    .line 580
    #v4=(Null);
    goto :goto_1

    :cond_4
    #v4=(Boolean);
    move v1, v3

    #v1=(Null);
    goto :goto_2

    .line 586
    .restart local v1       #needsPopulate:Z
    :cond_5
    #v1=(Boolean);
    iput v3, p0, Landroid/support/v4/view/ViewPager;->mDrawingOrder:I

    goto :goto_3
.end method

.method smoothScrollTo(II)V
    .locals 1
    .parameter "x"
    .parameter "y"

    .prologue
    .line 746
    const/4 v0, 0x0

    #v0=(Null);
    invoke-virtual {p0, p1, p2, v0}, Landroid/support/v4/view/ViewPager;->smoothScrollTo(III)V

    .line 747
    return-void
.end method

.method smoothScrollTo(III)V
    .locals 15
    .parameter "x"
    .parameter "y"
    .parameter "velocity"

    .prologue
    .line 757
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getChildCount()I

    move-result v1

    #v1=(Integer);
    if-nez v1, :cond_0

    .line 759
    const/4 v1, 0x0

    #v1=(Null);
    invoke-direct {p0, v1}, Landroid/support/v4/view/ViewPager;->setScrollingCacheEnabled(Z)V

    .line 795
    :goto_0
    #v0=(Conflicted);v1=(Reference);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);
    return-void

    .line 762
    :cond_0
    #v0=(Uninit);v1=(Integer);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getScrollX()I

    move-result v2

    .line 763
    .local v2, sx:I
    #v2=(Integer);
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getScrollY()I

    move-result v3

    .line 764
    .local v3, sy:I
    #v3=(Integer);
    sub-int v4, p1, v2

    .line 765
    .local v4, dx:I
    #v4=(Integer);
    sub-int v5, p2, v3

    .line 766
    .local v5, dy:I
    #v5=(Integer);
    if-nez v4, :cond_1

    if-nez v5, :cond_1

    .line 767
    const/4 v1, 0x0

    #v1=(Null);
    invoke-direct {p0, v1}, Landroid/support/v4/view/ViewPager;->completeScroll(Z)V

    .line 768
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->populate()V

    .line 769
    const/4 v1, 0x0

    invoke-direct {p0, v1}, Landroid/support/v4/view/ViewPager;->setScrollState(I)V

    goto :goto_0

    .line 773
    :cond_1
    #v1=(Integer);
    const/4 v1, 0x1

    #v1=(One);
    invoke-direct {p0, v1}, Landroid/support/v4/view/ViewPager;->setScrollingCacheEnabled(Z)V

    .line 774
    const/4 v1, 0x2

    #v1=(PosByte);
    invoke-direct {p0, v1}, Landroid/support/v4/view/ViewPager;->setScrollState(I)V

    .line 776
    invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getWidth()I

    move-result v12

    .line 777
    .local v12, width:I
    #v12=(Integer);
    div-int/lit8 v9, v12, 0x2

    .line 778
    .local v9, halfWidth:I
    #v9=(Integer);
    const/high16 v1, 0x3f80

    #v1=(Integer);
    const/high16 v13, 0x3f80

    #v13=(Integer);
    invoke-static {v4}, Ljava/lang/Math;->abs(I)I

    move-result v14

    #v14=(Integer);
    int-to-float v14, v14

    #v14=(Float);
    mul-float/2addr v13, v14

    #v13=(Float);
    int-to-float v14, v12

    div-float/2addr v13, v14

    invoke-static {v1, v13}, Ljava/lang/Math;->min(FF)F

    move-result v8

    .line 779
    .local v8, distanceRatio:F
    #v8=(Float);
    int-to-float v1, v9

    #v1=(Float);
    int-to-float v13, v9

    invoke-virtual {p0, v8}, Landroid/support/v4/view/ViewPager;->distanceInfluenceForSnapDuration(F)F

    move-result v14

    mul-float/2addr v13, v14

    add-float v7, v1, v13

    .line 782
    .local v7, distance:F
    #v7=(Float);
    const/4 v6, 0x0

    .line 783
    .local v6, duration:I
    #v6=(Null);
    invoke-static/range {p3 .. p3}, Ljava/lang/Math;->abs(I)I

    move-result p3

    .line 784
    if-lez p3, :cond_2

    .line 785
    const/high16 v1, 0x447a

    #v1=(Integer);
    move/from16 v0, p3

    #v0=(Integer);
    int-to-float v13, v0

    div-float v13, v7, v13

    invoke-static {v13}, Ljava/lang/Math;->abs(F)F

    move-result v13

    mul-float/2addr v1, v13

    #v1=(Float);
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    #v1=(Integer);
    mul-int/lit8 v6, v1, 0x4

    .line 791
    :goto_1
    #v0=(Conflicted);v6=(Integer);v10=(Conflicted);v11=(Conflicted);v13=(Integer);v14=(Integer);
    const/16 v1, 0x258

    #v1=(PosShort);
    invoke-static {v6, v1}, Ljava/lang/Math;->min(II)I

    move-result v6

    .line 793
    iget-object v1, p0, Landroid/support/v4/view/ViewPager;->mScroller:Landroid/widget/Scroller;

    #v1=(Reference);
    invoke-virtual/range {v1 .. v6}, Landroid/widget/Scroller;->startScroll(IIIII)V

    .line 794
    invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->postInvalidateOnAnimation(Landroid/view/View;)V

    goto :goto_0

    .line 787
    :cond_2
    #v0=(Uninit);v1=(Float);v6=(Null);v10=(Uninit);v11=(Uninit);v13=(Float);v14=(Float);
    int-to-float v1, v12

    iget-object v13, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;

    #v13=(Reference);
    iget v14, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I

    #v14=(Integer);
    invoke-virtual {v13, v14}, Landroid/support/v4/view/PagerAdapter;->getPageWidth(I)F

    move-result v13

    #v13=(Float);
    mul-float v11, v1, v13

    .line 788
    .local v11, pageWidth:F
    #v11=(Float);
    invoke-static {v4}, Ljava/lang/Math;->abs(I)I

    move-result v1

    #v1=(Integer);
    int-to-float v1, v1

    #v1=(Float);
    iget v13, p0, Landroid/support/v4/view/ViewPager;->mPageMargin:I

    #v13=(Integer);
    int-to-float v13, v13

    #v13=(Float);
    add-float/2addr v13, v11

    div-float v10, v1, v13

    .line 789
    .local v10, pageDelta:F
    #v10=(Float);
    const/high16 v1, 0x3f80

    #v1=(Integer);
    add-float/2addr v1, v10

    #v1=(Float);
    const/high16 v13, 0x42c8

    #v13=(Integer);
    mul-float/2addr v1, v13

    float-to-int v6, v1

    #v6=(Integer);
    goto :goto_1
.end method

.method protected verifyDrawable(Landroid/graphics/drawable/Drawable;)Z
    .locals 1
    .parameter "who"

    .prologue
    .line 717
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->verifyDrawable(Landroid/graphics/drawable/Drawable;)Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mMarginDrawable:Landroid/graphics/drawable/Drawable;

    #v0=(Reference);
    if-ne p1, v0, :cond_1

    :cond_0
    #v0=(Conflicted);
    const/4 v0, 0x1

    :goto_0
    #v0=(Boolean);
    return v0

    :cond_1
    #v0=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

*/}
