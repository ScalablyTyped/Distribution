package typings.zingchart.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Active extends StObject {
  
  var active: js.UndefOr[AlphaBackgroundColorBackgroundcolor] = js.undefined
  
  /**
    * Forces the plotarea to consider the preview object positioning and prevent overlapping with it. true | false | 1 | 0
    */
  var `adjust-layout`: js.UndefOr[Boolean] = js.undefined
  
  var adjustLayout: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sets the transparency level of the object. Values must range between 0.0 and 1.0, with 0.0 being completely transparent and 1.0 be
    * ing completely opaque. Note that values require the leading 0 before the decimal point. 0.3 | 0.4 | 0.9 | ...
    */
  var alpha: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets the background color of the object. Colors can be entered by name (e.g., "purple", "blue"), hexadecimal notation (e.g., "#666
    * 699", #33ccff"), or RGB notation (e.g., "rgb(255,0,0)", "rgb(0,0,255)"). "none" | "transparent" | "purple" | "#33ccff" | "rgb(100,
    *  15, 15)" | ...
    */
  var `background-color`: js.UndefOr[String] = js.undefined
  
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the border color of the object. "none" | "transparent" | "purple" | "#33ccff" | ...
    */
  var `border-color`: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the border width of the object. 4 | "6px" | ...
    */
  var `border-width`: js.UndefOr[Any] = js.undefined
  
  var borderColor: js.UndefOr[String] = js.undefined
  
  var borderWidth: js.UndefOr[Any] = js.undefined
  
  var handle: js.UndefOr[BorderRight] = js.undefined
  
  /**
    * Sets the object's height. 10 | "20px" | 0.3 | "30%" | ...
    */
  var height: js.UndefOr[Any] = js.undefined
  
  var label: js.UndefOr[BackgroundFit_] = js.undefined
  
  /**
    * Sets whether the chart is updated when the preview active area is being moved. Default is false for classic theme and true for lig
    * ht/dark themes. The graph will update only when a the mouse is released. true | false | 1 | 0
    */
  var live: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sets the object's margins. 10 | "5px" | "10 20" | "5px 10px 15px 20px" | ...
    */
  var margin: js.UndefOr[Any] = js.undefined
  
  var mask: js.UndefOr[AlphaBackgroundColorBackgroundcolor] = js.undefined
  
  /**
    * Sets the minimum width of preview's active area. 5 | 10 | ...
    */
  var `min-distance`: js.UndefOr[Double] = js.undefined
  
  var minDistance: js.UndefOr[Double] = js.undefined
  
  /**
    * Sets the object's position relative to its container. Similar results can be obtained by setting marginand margin-... attributes.
    */
  var position: js.UndefOr[String] = js.undefined
  
  /**
    * Sets whether the zoom level is preserved when a chart is altered or reloaded. true | false | 1 | 0
    */
  var `preserve-zoom`: js.UndefOr[Boolean] = js.undefined
  
  var preserveZoom: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sets the visibility of the object. Allows you to turn off the object without removing lines of JSON. true | false | 1 | 0
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sets the object's width. 10 | "20px" | 0.3 | "30%" | ...
    */
  var width: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets the "x" position of the object. 10 | "20px" | 0.3 | "30%" | ...
    */
  var x: js.UndefOr[Any] = js.undefined
  
  /**
    * Sets the "y" position of the object. 10 | "20px" | 0.3 | "30%" | ...
    */
  var y: js.UndefOr[Any] = js.undefined
}
object Active {
  
  inline def apply(): Active = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Active]
  }
  
  extension [Self <: Active](x: Self) {
    
    inline def setActive(value: AlphaBackgroundColorBackgroundcolor): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def `setAdjust-layout`(value: Boolean): Self = StObject.set(x, "adjust-layout", value.asInstanceOf[js.Any])
    
    inline def `setAdjust-layoutUndefined`: Self = StObject.set(x, "adjust-layout", js.undefined)
    
    inline def setAdjustLayout(value: Boolean): Self = StObject.set(x, "adjustLayout", value.asInstanceOf[js.Any])
    
    inline def setAdjustLayoutUndefined: Self = StObject.set(x, "adjustLayout", js.undefined)
    
    inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    inline def `setBackground-color`(value: String): Self = StObject.set(x, "background-color", value.asInstanceOf[js.Any])
    
    inline def `setBackground-colorUndefined`: Self = StObject.set(x, "background-color", js.undefined)
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def `setBorder-color`(value: String): Self = StObject.set(x, "border-color", value.asInstanceOf[js.Any])
    
    inline def `setBorder-colorUndefined`: Self = StObject.set(x, "border-color", js.undefined)
    
    inline def `setBorder-width`(value: Any): Self = StObject.set(x, "border-width", value.asInstanceOf[js.Any])
    
    inline def `setBorder-widthUndefined`: Self = StObject.set(x, "border-width", js.undefined)
    
    inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    inline def setBorderWidth(value: Any): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    inline def setHandle(value: BorderRight): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
    
    inline def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
    
    inline def setHeight(value: Any): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setLabel(value: BackgroundFit_): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLive(value: Boolean): Self = StObject.set(x, "live", value.asInstanceOf[js.Any])
    
    inline def setLiveUndefined: Self = StObject.set(x, "live", js.undefined)
    
    inline def setMargin(value: Any): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setMask(value: AlphaBackgroundColorBackgroundcolor): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
    
    inline def `setMin-distance`(value: Double): Self = StObject.set(x, "min-distance", value.asInstanceOf[js.Any])
    
    inline def `setMin-distanceUndefined`: Self = StObject.set(x, "min-distance", js.undefined)
    
    inline def setMinDistance(value: Double): Self = StObject.set(x, "minDistance", value.asInstanceOf[js.Any])
    
    inline def setMinDistanceUndefined: Self = StObject.set(x, "minDistance", js.undefined)
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def `setPreserve-zoom`(value: Boolean): Self = StObject.set(x, "preserve-zoom", value.asInstanceOf[js.Any])
    
    inline def `setPreserve-zoomUndefined`: Self = StObject.set(x, "preserve-zoom", js.undefined)
    
    inline def setPreserveZoom(value: Boolean): Self = StObject.set(x, "preserveZoom", value.asInstanceOf[js.Any])
    
    inline def setPreserveZoomUndefined: Self = StObject.set(x, "preserveZoom", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    
    inline def setWidth(value: Any): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setX(value: Any): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Any): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
