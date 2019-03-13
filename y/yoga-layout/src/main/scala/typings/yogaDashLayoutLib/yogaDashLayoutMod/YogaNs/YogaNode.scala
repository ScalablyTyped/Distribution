package typings
package yogaDashLayoutLib.yogaDashLayoutMod.YogaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait YogaNode extends js.Object {
  def calculateLayout(): scala.Unit = js.native
  def calculateLayout(width: scala.Double): scala.Unit = js.native
  def calculateLayout(width: scala.Double, height: scala.Double): scala.Unit = js.native
  def calculateLayout(width: scala.Double, height: scala.Double, direction: YogaDirection): scala.Unit = js.native
  def copyStyle(node: YogaNode): scala.Unit = js.native
  def free(): scala.Unit = js.native
  def freeRecursive(): scala.Unit = js.native
  def getAlignContent(): YogaAlign = js.native
  def getAlignItems(): YogaAlign = js.native
  def getAlignSelf(): YogaAlign = js.native
  def getAspectRatio(): scala.Double = js.native
  def getBorder(edge: YogaEdge): scala.Double = js.native
  def getChild(index: scala.Double): YogaNode = js.native
  def getChildCount(): scala.Double = js.native
  def getComputedBorder(edge: YogaEdge): scala.Double = js.native
  def getComputedBottom(): scala.Double = js.native
  def getComputedHeight(): scala.Double = js.native
  def getComputedLayout(): yogaDashLayoutLib.yogaDashLayoutMod.Layout = js.native
  def getComputedLeft(): scala.Double = js.native
  def getComputedMargin(edge: YogaEdge): scala.Double = js.native
  def getComputedPadding(edge: YogaEdge): scala.Double = js.native
  def getComputedRight(): scala.Double = js.native
  def getComputedTop(): scala.Double = js.native
  def getComputedWidth(): scala.Double = js.native
  def getDisplay(): YogaDisplay = js.native
  def getFlexBasis(): scala.Double = js.native
  def getFlexDirection(): YogaFlexDirection = js.native
  def getFlexGrow(): scala.Double = js.native
  def getFlexShrink(): scala.Double = js.native
  def getFlexWrap(): YogaFlexWrap = js.native
  def getHeight(): yogaDashLayoutLib.yogaDashLayoutMod.Value = js.native
  def getJustifyContent(): YogaJustifyContent = js.native
  def getMargin(edge: YogaEdge): yogaDashLayoutLib.yogaDashLayoutMod.Value = js.native
  def getMaxHeight(): yogaDashLayoutLib.yogaDashLayoutMod.Value = js.native
  def getMaxWidth(): yogaDashLayoutLib.yogaDashLayoutMod.Value = js.native
  def getMinHeight(): yogaDashLayoutLib.yogaDashLayoutMod.Value = js.native
  def getMinWidth(): yogaDashLayoutLib.yogaDashLayoutMod.Value = js.native
  def getOverflow(): YogaOverflow = js.native
  def getPadding(edge: YogaEdge): yogaDashLayoutLib.yogaDashLayoutMod.Value = js.native
  def getParent(): YogaNode | scala.Null = js.native
  def getPosition(edge: YogaEdge): yogaDashLayoutLib.yogaDashLayoutMod.Value = js.native
  def getPositionType(): YogaPositionType = js.native
  def getWidth(): yogaDashLayoutLib.yogaDashLayoutMod.Value = js.native
  def insertChild(child: YogaNode, index: scala.Double): scala.Unit = js.native
  def isDirty(): scala.Boolean = js.native
  def markDirty(): scala.Unit = js.native
  def removeChild(child: YogaNode): scala.Unit = js.native
  def reset(): scala.Unit = js.native
  def setAlignContent(alignContent: YogaAlign): scala.Unit = js.native
  def setAlignItems(alignItems: YogaAlign): scala.Unit = js.native
  def setAlignSelf(alignSelf: YogaAlign): scala.Unit = js.native
  def setAspectRatio(aspectRatio: scala.Double): scala.Unit = js.native
  def setBorder(edge: YogaEdge, borderWidth: scala.Double): scala.Unit = js.native
  def setDisplay(display: YogaDisplay): scala.Unit = js.native
  def setFlex(flex: scala.Double): scala.Unit = js.native
  def setFlexBasis(flexBasis: java.lang.String): scala.Unit = js.native
  def setFlexBasis(flexBasis: scala.Double): scala.Unit = js.native
  def setFlexBasisPercent(flexBasis: scala.Double): scala.Unit = js.native
  def setFlexDirection(flexDirection: YogaFlexDirection): scala.Unit = js.native
  def setFlexGrow(flexGrow: scala.Double): scala.Unit = js.native
  def setFlexShrink(flexShrink: scala.Double): scala.Unit = js.native
  def setFlexWrap(flexWrap: YogaFlexWrap): scala.Unit = js.native
  def setHeight(height: java.lang.String): scala.Unit = js.native
  def setHeight(height: scala.Double): scala.Unit = js.native
  def setHeightAuto(): scala.Unit = js.native
  def setHeightPercent(height: scala.Double): scala.Unit = js.native
  def setJustifyContent(justifyContent: YogaJustifyContent): scala.Unit = js.native
  def setMargin(edge: YogaEdge, margin: scala.Double): scala.Unit = js.native
  def setMarginAuto(edge: YogaEdge): scala.Unit = js.native
  def setMarginPercent(edge: YogaEdge, margin: scala.Double): scala.Unit = js.native
  def setMaxHeight(maxHeight: java.lang.String): scala.Unit = js.native
  def setMaxHeight(maxHeight: scala.Double): scala.Unit = js.native
  def setMaxHeightPercent(maxHeight: scala.Double): scala.Unit = js.native
  def setMaxWidth(maxWidth: java.lang.String): scala.Unit = js.native
  def setMaxWidth(maxWidth: scala.Double): scala.Unit = js.native
  def setMaxWidthPercent(maxWidth: scala.Double): scala.Unit = js.native
  def setMeasureFunc(): scala.Unit = js.native
  def setMeasureFunc(measureFunc: js.Function0[_]): scala.Unit = js.native
  def setMinHeight(minHeight: java.lang.String): scala.Unit = js.native
  def setMinHeight(minHeight: scala.Double): scala.Unit = js.native
  def setMinHeightPercent(minHeight: scala.Double): scala.Unit = js.native
  def setMinWidth(minWidth: java.lang.String): scala.Unit = js.native
  def setMinWidth(minWidth: scala.Double): scala.Unit = js.native
  def setMinWidthPercent(minWidth: scala.Double): scala.Unit = js.native
  def setOverflow(overflow: YogaOverflow): scala.Unit = js.native
  def setPadding(edge: YogaEdge, padding: java.lang.String): scala.Unit = js.native
  def setPadding(edge: YogaEdge, padding: scala.Double): scala.Unit = js.native
  def setPaddingPercent(edge: YogaEdge, padding: scala.Double): scala.Unit = js.native
  def setPosition(edge: YogaEdge, position: java.lang.String): scala.Unit = js.native
  def setPosition(edge: YogaEdge, position: scala.Double): scala.Unit = js.native
  def setPositionPercent(edge: YogaEdge, position: scala.Double): scala.Unit = js.native
  def setPositionType(positionType: YogaPositionType): scala.Unit = js.native
  def setWidth(width: java.lang.String): scala.Unit = js.native
  def setWidth(width: scala.Double): scala.Unit = js.native
  def setWidthAuto(): scala.Unit = js.native
  def setWidthPercent(width: scala.Double): scala.Unit = js.native
  def unsetMeasureFun(): scala.Unit = js.native
}

