package typings.zingchart.anon

import org.scalablytyped.runtime.StringDictionary
import typings.zingchart.es6Mod.zingchart.contextMenu
import typings.zingchart.es6Mod.zingchart.link
import typings.zingchart.es6Mod.zingchart.node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dictkey
  extends StObject
     with /* key */ StringDictionary[link | node] {
  
  /**
    * To set the layout of the word cloud. "spiral" | "flow-center" | "flow-top"
    */
  var aspect: js.UndefOr[String] = js.undefined
  
  var button: js.UndefOr[Count] = js.undefined
  
  /**
    * When the "color-type" attribute is set to "color", use this attribute to set the color of the text in the word cloud. "red" | "#3F
    * 51B5" | ...
    */
  var color: js.UndefOr[String] = js.undefined
  
  /**
    * To set the type of color arrangement applied to the word cloud. Use the "color" value with the "color" attribute. Use the "palette
    * " value with the "palette" array. "random" (default) | "color" | "palette"
    */
  var `color-type`: js.UndefOr[String] = js.undefined
  
  var colorType: js.UndefOr[String] = js.undefined
  
  var `context-menu`: js.UndefOr[contextMenu] = js.undefined
  
  var contextMenu: js.UndefOr[typings.zingchart.es6Mod.zingchart.contextMenu] = js.undefined
  
  /**
    * To define words to be excluded from the word cloud, e.g., "and" or "the". [...]
    */
  var ignore: js.UndefOr[Any] = js.undefined
  
  var indicator: js.UndefOr[Npv] = js.undefined
  
  var link: js.UndefOr[typings.zingchart.es6Mod.zingchart.link] = js.undefined
  
  var `link[sibling]`: js.UndefOr[link] = js.undefined
  
  var links: js.UndefOr[link] = js.undefined
  
  /**
    * To set the maximum font size. 20 | "30px" | ...
    */
  var `max-font-size`: js.UndefOr[Any] = js.undefined
  
  /**
    * To set the maximum number of items displayed in the word cloud. 100 | 30 | ...
    */
  var `max-items`: js.UndefOr[Any] = js.undefined
  
  var `max-iterations`: js.UndefOr[Any] = js.undefined
  
  /**
    * @description Sets the maximum level the items have to be on so that they will be processed.
    */
  var `max-level`: js.UndefOr[Any] = js.undefined
  
  /**
    * @description Sets the max width for the links between nodes (available in the force directed graphs).
    */
  var `max-link-width`: js.UndefOr[Any] = js.undefined
  
  /**
    * @description Sets the maximum size for the tree nodes.
    */
  var `max-size`: js.UndefOr[Any] = js.undefined
  
  /**
    * @description Sets a maximum value.
    * For heatmap charts, sets a maximum reference value. If not set, the maximum value found in the data is used.
    * For treemap charts, sets a maximum value that a box has to have in order to be evaluated and displayed on the treemap.
    */
  var `max-value`: js.UndefOr[Any] = js.undefined
  
  var maxFontSize: js.UndefOr[Any] = js.undefined
  
  var maxItems: js.UndefOr[Any] = js.undefined
  
  /**
    * @description Sets the maximum level the items have to be on so that they will be processed.
    */
  var maxLevel: js.UndefOr[Any] = js.undefined
  
  /**
    * @description Sets the max width for the links between nodes (available in the force directed graphs).
    */
  var maxLinkWidth: js.UndefOr[Any] = js.undefined
  
  /**
    * @description Sets the maximum size for the tree nodes.
    */
  var maxSize: js.UndefOr[Any] = js.undefined
  
  /**
    * @description Sets a maximum value.
    * For heatmap charts, sets a maximum reference value. If not set, the maximum value found in the data is used.
    * For treemap charts, sets a maximum value that a box has to have in order to be evaluated and displayed on the treemap.
    */
  var maxValue: js.UndefOr[Any] = js.undefined
  
  /**
    * To set the minimum font size. 10 | "12px" | ...
    */
  var `min-font-size`: js.UndefOr[Any] = js.undefined
  
  /**
    * @description When set, filter out words shorter than minLength from the wordcloud
    */
  var `min-length`: js.UndefOr[Any] = js.undefined
  
  /**
    * @description Sets the minimum level the items have to be on so that they will be processed.
    */
  var `min-level`: js.UndefOr[Any] = js.undefined
  
  /**
    * @description Sets the minimum width for the links between nodes (available in the force directed graphs).
    */
  var `min-link-width`: js.UndefOr[Any] = js.undefined
  
  /**
    * @description Sets the minimum size.
    * For tree module charts, sets the minimum size for the tree nodes.
    * For bubble pack charts, sets the minimum pixel-size of bubbles.
    */
  var `min-size`: js.UndefOr[Any] = js.undefined
  
  /**
    * @description Sets a minimum value.
    * For heatmap charts, sets a minimum reference value. If not set, the minimum value found in the data is used.
    * For treemap charts, sets the minimum value box ihas to have in order to be evaluated and displayed on the treemap.
    */
  var `min-value`: js.UndefOr[Any] = js.undefined
  
  var minFontSize: js.UndefOr[Any] = js.undefined
  
  /**
    * @description When set, filter out words shorter than minLength from the wordcloud
    */
  var minLength: js.UndefOr[Any] = js.undefined
  
  /**
    * @description Sets the minimum level the items have to be on so that they will be processed.
    */
  var minLevel: js.UndefOr[Any] = js.undefined
  
  /**
    * @description Sets the minimum width for the links between nodes (available in the force directed graphs).
    */
  var minLinkWidth: js.UndefOr[Any] = js.undefined
  
  /**
    * @description Sets the minimum size.
    * For tree module charts, sets the minimum size for the tree nodes.
    * For bubble pack charts, sets the minimum pixel-size of bubbles.
    */
  var minSize: js.UndefOr[Any] = js.undefined
  
  /**
    * @description Sets a minimum value.
    * For heatmap charts, sets a minimum reference value. If not set, the minimum value found in the data is used.
    * For treemap charts, sets the minimum value box ihas to have in order to be evaluated and displayed on the treemap.
    */
  var minValue: js.UndefOr[Any] = js.undefined
  
  var node: js.UndefOr[typings.zingchart.es6Mod.zingchart.node] = js.undefined
  
  var `node[collapsed]`: js.UndefOr[node] = js.undefined
  
  var `node[leaf]`: js.UndefOr[node] = js.undefined
  
  var `node[parent]`: js.UndefOr[node] = js.undefined
  
  /**
    * When the "color-type" attribute is set to "palette", use this attribute to set the color palette of the word cloud. [...]
    */
  var palette: js.UndefOr[Any] = js.undefined
  
  /**
    * To set whether every one or two words rotates 90 degrees. true | false (default)
    */
  var rotate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * To control the step metering. Use this with the "step-radius" attribute. 45 | 90 | ...
    */
  var `step-angle`: js.UndefOr[Any] = js.undefined
  
  /**
    * To control the step metering. Use this with the "step-angle" attribute. 30 | 50 | ...
    */
  var `step-radius`: js.UndefOr[Any] = js.undefined
  
  var stepAngle: js.UndefOr[Any] = js.undefined
  
  var stepRadius: js.UndefOr[Any] = js.undefined
  
  var style: js.UndefOr[Fontfamily] = js.undefined
  
  /**
    * To provide the data for the word cloud. (Alternatively, data can be provided through a "words" array.) "text data..." | ...
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * To set the type of item to be analyzed: words or characters. "word" (default) | "character"
    */
  var token: js.UndefOr[String] = js.undefined
  
  var violin: js.UndefOr[Jitter] = js.undefined
  
  var words: js.UndefOr[js.Array[Text]] = js.undefined
}
object Dictkey {
  
  inline def apply(): Dictkey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dictkey]
  }
  
  extension [Self <: Dictkey](x: Self) {
    
    inline def setAspect(value: String): Self = StObject.set(x, "aspect", value.asInstanceOf[js.Any])
    
    inline def setAspectUndefined: Self = StObject.set(x, "aspect", js.undefined)
    
    inline def setButton(value: Count): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def `setColor-type`(value: String): Self = StObject.set(x, "color-type", value.asInstanceOf[js.Any])
    
    inline def `setColor-typeUndefined`: Self = StObject.set(x, "color-type", js.undefined)
    
    inline def setColorType(value: String): Self = StObject.set(x, "colorType", value.asInstanceOf[js.Any])
    
    inline def setColorTypeUndefined: Self = StObject.set(x, "colorType", js.undefined)
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def `setContext-menu`(value: contextMenu): Self = StObject.set(x, "context-menu", value.asInstanceOf[js.Any])
    
    inline def `setContext-menuUndefined`: Self = StObject.set(x, "context-menu", js.undefined)
    
    inline def setContextMenu(value: contextMenu): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
    
    inline def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
    
    inline def setIgnore(value: Any): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
    
    inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
    
    inline def setIndicator(value: Npv): Self = StObject.set(x, "indicator", value.asInstanceOf[js.Any])
    
    inline def setIndicatorUndefined: Self = StObject.set(x, "indicator", js.undefined)
    
    inline def setLink(value: link): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    inline def `setLink[sibling]`(value: link): Self = StObject.set(x, "link[sibling]", value.asInstanceOf[js.Any])
    
    inline def `setLink[sibling]Undefined`: Self = StObject.set(x, "link[sibling]", js.undefined)
    
    inline def setLinks(value: link): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setLinksUndefined: Self = StObject.set(x, "links", js.undefined)
    
    inline def `setMax-font-size`(value: Any): Self = StObject.set(x, "max-font-size", value.asInstanceOf[js.Any])
    
    inline def `setMax-font-sizeUndefined`: Self = StObject.set(x, "max-font-size", js.undefined)
    
    inline def `setMax-items`(value: Any): Self = StObject.set(x, "max-items", value.asInstanceOf[js.Any])
    
    inline def `setMax-itemsUndefined`: Self = StObject.set(x, "max-items", js.undefined)
    
    inline def `setMax-iterations`(value: Any): Self = StObject.set(x, "max-iterations", value.asInstanceOf[js.Any])
    
    inline def `setMax-iterationsUndefined`: Self = StObject.set(x, "max-iterations", js.undefined)
    
    inline def `setMax-level`(value: Any): Self = StObject.set(x, "max-level", value.asInstanceOf[js.Any])
    
    inline def `setMax-levelUndefined`: Self = StObject.set(x, "max-level", js.undefined)
    
    inline def `setMax-link-width`(value: Any): Self = StObject.set(x, "max-link-width", value.asInstanceOf[js.Any])
    
    inline def `setMax-link-widthUndefined`: Self = StObject.set(x, "max-link-width", js.undefined)
    
    inline def `setMax-size`(value: Any): Self = StObject.set(x, "max-size", value.asInstanceOf[js.Any])
    
    inline def `setMax-sizeUndefined`: Self = StObject.set(x, "max-size", js.undefined)
    
    inline def `setMax-value`(value: Any): Self = StObject.set(x, "max-value", value.asInstanceOf[js.Any])
    
    inline def `setMax-valueUndefined`: Self = StObject.set(x, "max-value", js.undefined)
    
    inline def setMaxFontSize(value: Any): Self = StObject.set(x, "maxFontSize", value.asInstanceOf[js.Any])
    
    inline def setMaxFontSizeUndefined: Self = StObject.set(x, "maxFontSize", js.undefined)
    
    inline def setMaxItems(value: Any): Self = StObject.set(x, "maxItems", value.asInstanceOf[js.Any])
    
    inline def setMaxItemsUndefined: Self = StObject.set(x, "maxItems", js.undefined)
    
    inline def setMaxLevel(value: Any): Self = StObject.set(x, "maxLevel", value.asInstanceOf[js.Any])
    
    inline def setMaxLevelUndefined: Self = StObject.set(x, "maxLevel", js.undefined)
    
    inline def setMaxLinkWidth(value: Any): Self = StObject.set(x, "maxLinkWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxLinkWidthUndefined: Self = StObject.set(x, "maxLinkWidth", js.undefined)
    
    inline def setMaxSize(value: Any): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
    
    inline def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
    
    inline def setMaxValue(value: Any): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    inline def `setMin-font-size`(value: Any): Self = StObject.set(x, "min-font-size", value.asInstanceOf[js.Any])
    
    inline def `setMin-font-sizeUndefined`: Self = StObject.set(x, "min-font-size", js.undefined)
    
    inline def `setMin-length`(value: Any): Self = StObject.set(x, "min-length", value.asInstanceOf[js.Any])
    
    inline def `setMin-lengthUndefined`: Self = StObject.set(x, "min-length", js.undefined)
    
    inline def `setMin-level`(value: Any): Self = StObject.set(x, "min-level", value.asInstanceOf[js.Any])
    
    inline def `setMin-levelUndefined`: Self = StObject.set(x, "min-level", js.undefined)
    
    inline def `setMin-link-width`(value: Any): Self = StObject.set(x, "min-link-width", value.asInstanceOf[js.Any])
    
    inline def `setMin-link-widthUndefined`: Self = StObject.set(x, "min-link-width", js.undefined)
    
    inline def `setMin-size`(value: Any): Self = StObject.set(x, "min-size", value.asInstanceOf[js.Any])
    
    inline def `setMin-sizeUndefined`: Self = StObject.set(x, "min-size", js.undefined)
    
    inline def `setMin-value`(value: Any): Self = StObject.set(x, "min-value", value.asInstanceOf[js.Any])
    
    inline def `setMin-valueUndefined`: Self = StObject.set(x, "min-value", js.undefined)
    
    inline def setMinFontSize(value: Any): Self = StObject.set(x, "minFontSize", value.asInstanceOf[js.Any])
    
    inline def setMinFontSizeUndefined: Self = StObject.set(x, "minFontSize", js.undefined)
    
    inline def setMinLength(value: Any): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
    
    inline def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
    
    inline def setMinLevel(value: Any): Self = StObject.set(x, "minLevel", value.asInstanceOf[js.Any])
    
    inline def setMinLevelUndefined: Self = StObject.set(x, "minLevel", js.undefined)
    
    inline def setMinLinkWidth(value: Any): Self = StObject.set(x, "minLinkWidth", value.asInstanceOf[js.Any])
    
    inline def setMinLinkWidthUndefined: Self = StObject.set(x, "minLinkWidth", js.undefined)
    
    inline def setMinSize(value: Any): Self = StObject.set(x, "minSize", value.asInstanceOf[js.Any])
    
    inline def setMinSizeUndefined: Self = StObject.set(x, "minSize", js.undefined)
    
    inline def setMinValue(value: Any): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
    
    inline def setNode(value: node): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
    
    inline def `setNode[collapsed]`(value: node): Self = StObject.set(x, "node[collapsed]", value.asInstanceOf[js.Any])
    
    inline def `setNode[collapsed]Undefined`: Self = StObject.set(x, "node[collapsed]", js.undefined)
    
    inline def `setNode[leaf]`(value: node): Self = StObject.set(x, "node[leaf]", value.asInstanceOf[js.Any])
    
    inline def `setNode[leaf]Undefined`: Self = StObject.set(x, "node[leaf]", js.undefined)
    
    inline def `setNode[parent]`(value: node): Self = StObject.set(x, "node[parent]", value.asInstanceOf[js.Any])
    
    inline def `setNode[parent]Undefined`: Self = StObject.set(x, "node[parent]", js.undefined)
    
    inline def setPalette(value: Any): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
    
    inline def setPaletteUndefined: Self = StObject.set(x, "palette", js.undefined)
    
    inline def setRotate(value: Boolean): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
    
    inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
    
    inline def `setStep-angle`(value: Any): Self = StObject.set(x, "step-angle", value.asInstanceOf[js.Any])
    
    inline def `setStep-angleUndefined`: Self = StObject.set(x, "step-angle", js.undefined)
    
    inline def `setStep-radius`(value: Any): Self = StObject.set(x, "step-radius", value.asInstanceOf[js.Any])
    
    inline def `setStep-radiusUndefined`: Self = StObject.set(x, "step-radius", js.undefined)
    
    inline def setStepAngle(value: Any): Self = StObject.set(x, "stepAngle", value.asInstanceOf[js.Any])
    
    inline def setStepAngleUndefined: Self = StObject.set(x, "stepAngle", js.undefined)
    
    inline def setStepRadius(value: Any): Self = StObject.set(x, "stepRadius", value.asInstanceOf[js.Any])
    
    inline def setStepRadiusUndefined: Self = StObject.set(x, "stepRadius", js.undefined)
    
    inline def setStyle(value: Fontfamily): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    
    inline def setViolin(value: Jitter): Self = StObject.set(x, "violin", value.asInstanceOf[js.Any])
    
    inline def setViolinUndefined: Self = StObject.set(x, "violin", js.undefined)
    
    inline def setWords(value: js.Array[Text]): Self = StObject.set(x, "words", value.asInstanceOf[js.Any])
    
    inline def setWordsUndefined: Self = StObject.set(x, "words", js.undefined)
    
    inline def setWordsVarargs(value: Text*): Self = StObject.set(x, "words", js.Array(value*))
  }
}
