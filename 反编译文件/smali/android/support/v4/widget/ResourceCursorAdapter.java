package android.support.v4.widget; class ResourceCursorAdapter {/*

.class public abstract Landroid/support/v4/widget/ResourceCursorAdapter;
.super Landroid/support/v4/widget/CursorAdapter;
.source "ResourceCursorAdapter.java"


# instance fields
.field private mDropDownLayout:I

.field private mInflater:Landroid/view/LayoutInflater;

.field private mLayout:I


# direct methods
.method public constructor <init>(Landroid/content/Context;ILandroid/database/Cursor;)V
    .locals 1
    .parameter "context"
    .parameter "layout"
    .parameter "c"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 54
    invoke-direct {p0, p1, p3}, Landroid/support/v4/widget/CursorAdapter;-><init>(Landroid/content/Context;Landroid/database/Cursor;)V

    .line 55
    #p0=(Reference);
    iput p2, p0, Landroid/support/v4/widget/ResourceCursorAdapter;->mDropDownLayout:I

    iput p2, p0, Landroid/support/v4/widget/ResourceCursorAdapter;->mLayout:I

    .line 56
    const-string v0, "layout_inflater"

    #v0=(Reference);
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    iput-object v0, p0, Landroid/support/v4/widget/ResourceCursorAdapter;->mInflater:Landroid/view/LayoutInflater;

    .line 57
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;ILandroid/database/Cursor;I)V
    .locals 1
    .parameter "context"
    .parameter "layout"
    .parameter "c"
    .parameter "flags"

    .prologue
    .line 93
    invoke-direct {p0, p1, p3, p4}, Landroid/support/v4/widget/CursorAdapter;-><init>(Landroid/content/Context;Landroid/database/Cursor;I)V

    .line 94
    #p0=(Reference);
    iput p2, p0, Landroid/support/v4/widget/ResourceCursorAdapter;->mDropDownLayout:I

    iput p2, p0, Landroid/support/v4/widget/ResourceCursorAdapter;->mLayout:I

    .line 95
    const-string v0, "layout_inflater"

    #v0=(Reference);
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    iput-object v0, p0, Landroid/support/v4/widget/ResourceCursorAdapter;->mInflater:Landroid/view/LayoutInflater;

    .line 96
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;ILandroid/database/Cursor;Z)V
    .locals 1
    .parameter "context"
    .parameter "layout"
    .parameter "c"
    .parameter "autoRequery"

    .prologue
    .line 76
    invoke-direct {p0, p1, p3, p4}, Landroid/support/v4/widget/CursorAdapter;-><init>(Landroid/content/Context;Landroid/database/Cursor;Z)V

    .line 77
    #p0=(Reference);
    iput p2, p0, Landroid/support/v4/widget/ResourceCursorAdapter;->mDropDownLayout:I

    iput p2, p0, Landroid/support/v4/widget/ResourceCursorAdapter;->mLayout:I

    .line 78
    const-string v0, "layout_inflater"

    #v0=(Reference);
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    iput-object v0, p0, Landroid/support/v4/widget/ResourceCursorAdapter;->mInflater:Landroid/view/LayoutInflater;

    .line 79
    return-void
.end method


# virtual methods
.method public newDropDownView(Landroid/content/Context;Landroid/database/Cursor;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3
    .parameter "context"
    .parameter "cursor"
    .parameter "parent"

    .prologue
    .line 111
    iget-object v0, p0, Landroid/support/v4/widget/ResourceCursorAdapter;->mInflater:Landroid/view/LayoutInflater;

    #v0=(Reference);
    iget v1, p0, Landroid/support/v4/widget/ResourceCursorAdapter;->mDropDownLayout:I

    #v1=(Integer);
    const/4 v2, 0x0

    #v2=(Null);
    invoke-virtual {v0, v1, p3, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public newView(Landroid/content/Context;Landroid/database/Cursor;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 3
    .parameter "context"
    .parameter "cursor"
    .parameter "parent"

    .prologue
    .line 106
    iget-object v0, p0, Landroid/support/v4/widget/ResourceCursorAdapter;->mInflater:Landroid/view/LayoutInflater;

    #v0=(Reference);
    iget v1, p0, Landroid/support/v4/widget/ResourceCursorAdapter;->mLayout:I

    #v1=(Integer);
    const/4 v2, 0x0

    #v2=(Null);
    invoke-virtual {v0, v1, p3, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public setDropDownViewResource(I)V
    .locals 0
    .parameter "dropDownLayout"

    .prologue
    .line 129
    iput p1, p0, Landroid/support/v4/widget/ResourceCursorAdapter;->mDropDownLayout:I

    .line 130
    return-void
.end method

.method public setViewResource(I)V
    .locals 0
    .parameter "layout"

    .prologue
    .line 120
    iput p1, p0, Landroid/support/v4/widget/ResourceCursorAdapter;->mLayout:I

    .line 121
    return-void
.end method

*/}
