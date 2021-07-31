package typings.yogaLayout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait YogaStatic
  extends StObject
     with ConstantsStatic {
  
  var Config: ConfigStatic
  
  var Node: NodeStatic
  
  def getInstanceCount(): Double
}
object YogaStatic {
  
  @scala.inline
  def apply(Config: ConfigStatic, Node: NodeStatic, getInstanceCount: () => Double): YogaStatic = {
    val __obj = js.Dynamic.literal(ALIGN_AUTO = 0, ALIGN_BASELINE = 5, ALIGN_CENTER = 2, ALIGN_COUNT = 8, ALIGN_FLEX_END = 3, ALIGN_FLEX_START = 1, ALIGN_SPACE_AROUND = 7, ALIGN_SPACE_BETWEEN = 6, ALIGN_STRETCH = 4, Config = Config.asInstanceOf[js.Any], DIMENSION_COUNT = 2, DIMENSION_HEIGHT = 1, DIMENSION_WIDTH = 0, DIRECTION_COUNT = 3, DIRECTION_INHERIT = 0, DIRECTION_LTR = 1, DIRECTION_RTL = 2, DISPLAY_COUNT = 2, DISPLAY_FLEX = 0, DISPLAY_NONE = 1, EDGE_ALL = 8, EDGE_BOTTOM = 3, EDGE_COUNT = 9, EDGE_END = 5, EDGE_HORIZONTAL = 6, EDGE_LEFT = 0, EDGE_RIGHT = 2, EDGE_START = 4, EDGE_TOP = 1, EDGE_VERTICAL = 7, EXPERIMENTAL_FEATURE_COUNT = 1, EXPERIMENTAL_FEATURE_WEB_FLEX_BASIS = 0, FLEX_DIRECTION_COLUMN = 0, FLEX_DIRECTION_COLUMN_REVERSE = 1, FLEX_DIRECTION_COUNT = 4, FLEX_DIRECTION_ROW = 2, FLEX_DIRECTION_ROW_REVERSE = 3, JUSTIFY_CENTER = 1, JUSTIFY_COUNT = 6, JUSTIFY_FLEX_END = 2, JUSTIFY_FLEX_START = 0, JUSTIFY_SPACE_AROUND = 4, JUSTIFY_SPACE_BETWEEN = 3, JUSTIFY_SPACE_EVENLY = 5, LOG_LEVEL_COUNT = 6, LOG_LEVEL_DEBUG = 3, LOG_LEVEL_ERROR = 0, LOG_LEVEL_FATAL = 5, LOG_LEVEL_INFO = 2, LOG_LEVEL_VERBOSE = 4, LOG_LEVEL_WARN = 1, MEASURE_MODE_AT_MOST = 2, MEASURE_MODE_COUNT = 3, MEASURE_MODE_EXACTLY = 1, MEASURE_MODE_UNDEFINED = 0, NODE_TYPE_COUNT = 2, NODE_TYPE_DEFAULT = 0, NODE_TYPE_TEXT = 1, Node = Node.asInstanceOf[js.Any], OVERFLOW_COUNT = 3, OVERFLOW_HIDDEN = 1, OVERFLOW_SCROLL = 2, OVERFLOW_VISIBLE = 0, POSITION_TYPE_ABSOLUTE = 1, POSITION_TYPE_COUNT = 2, POSITION_TYPE_RELATIVE = 0, PRINT_OPTIONS_CHILDREN = 4, PRINT_OPTIONS_COUNT = 3, PRINT_OPTIONS_LAYOUT = 1, PRINT_OPTIONS_STYLE = 2, UNIT_AUTO = 3, UNIT_COUNT = 4, UNIT_PERCENT = 2, UNIT_POINT = 1, UNIT_UNDEFINED = 0, WRAP_COUNT = 3, WRAP_NO_WRAP = 0, WRAP_WRAP = 1, WRAP_WRAP_REVERSE = 2, getInstanceCount = js.Any.fromFunction0(getInstanceCount))
    __obj.asInstanceOf[YogaStatic]
  }
  
  @scala.inline
  implicit class YogaStaticMutableBuilder[Self <: YogaStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfig(value: ConfigStatic): Self = StObject.set(x, "Config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetInstanceCount(value: () => Double): Self = StObject.set(x, "getInstanceCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNode(value: NodeStatic): Self = StObject.set(x, "Node", value.asInstanceOf[js.Any])
  }
}
