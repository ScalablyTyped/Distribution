package typings.yogaLayout.mod

import typings.yogaLayout.yogaLayoutNumbers.`0`
import typings.yogaLayout.yogaLayoutNumbers.`1`
import typings.yogaLayout.yogaLayoutNumbers.`2`
import typings.yogaLayout.yogaLayoutNumbers.`3`
import typings.yogaLayout.yogaLayoutNumbers.`4`
import typings.yogaLayout.yogaLayoutNumbers.`5`
import typings.yogaLayout.yogaLayoutNumbers.`6`
import typings.yogaLayout.yogaLayoutNumbers.`7`
import typings.yogaLayout.yogaLayoutNumbers.`8`
import typings.yogaLayout.yogaLayoutNumbers.`9`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait YogaStatic extends ConstantsStatic {
  var Config: ConfigStatic = js.native
  var Node: NodeStatic = js.native
  def getInstanceCount(): Double = js.native
}

object YogaStatic {
  @scala.inline
  def apply(
    ALIGN_AUTO: `0`,
    ALIGN_BASELINE: `5`,
    ALIGN_CENTER: `2`,
    ALIGN_COUNT: `8`,
    ALIGN_FLEX_END: `3`,
    ALIGN_FLEX_START: `1`,
    ALIGN_SPACE_AROUND: `7`,
    ALIGN_SPACE_BETWEEN: `6`,
    ALIGN_STRETCH: `4`,
    Config: ConfigStatic,
    DIMENSION_COUNT: `2`,
    DIMENSION_HEIGHT: `1`,
    DIMENSION_WIDTH: `0`,
    DIRECTION_COUNT: `3`,
    DIRECTION_INHERIT: `0`,
    DIRECTION_LTR: `1`,
    DIRECTION_RTL: `2`,
    DISPLAY_COUNT: `2`,
    DISPLAY_FLEX: `0`,
    DISPLAY_NONE: `1`,
    EDGE_ALL: `8`,
    EDGE_BOTTOM: `3`,
    EDGE_COUNT: `9`,
    EDGE_END: `5`,
    EDGE_HORIZONTAL: `6`,
    EDGE_LEFT: `0`,
    EDGE_RIGHT: `2`,
    EDGE_START: `4`,
    EDGE_TOP: `1`,
    EDGE_VERTICAL: `7`,
    EXPERIMENTAL_FEATURE_COUNT: `1`,
    EXPERIMENTAL_FEATURE_WEB_FLEX_BASIS: `0`,
    FLEX_DIRECTION_COLUMN: `0`,
    FLEX_DIRECTION_COLUMN_REVERSE: `1`,
    FLEX_DIRECTION_COUNT: `4`,
    FLEX_DIRECTION_ROW: `2`,
    FLEX_DIRECTION_ROW_REVERSE: `3`,
    JUSTIFY_CENTER: `1`,
    JUSTIFY_COUNT: `6`,
    JUSTIFY_FLEX_END: `2`,
    JUSTIFY_FLEX_START: `0`,
    JUSTIFY_SPACE_AROUND: `4`,
    JUSTIFY_SPACE_BETWEEN: `3`,
    JUSTIFY_SPACE_EVENLY: `5`,
    LOG_LEVEL_COUNT: `6`,
    LOG_LEVEL_DEBUG: `3`,
    LOG_LEVEL_ERROR: `0`,
    LOG_LEVEL_FATAL: `5`,
    LOG_LEVEL_INFO: `2`,
    LOG_LEVEL_VERBOSE: `4`,
    LOG_LEVEL_WARN: `1`,
    MEASURE_MODE_AT_MOST: `2`,
    MEASURE_MODE_COUNT: `3`,
    MEASURE_MODE_EXACTLY: `1`,
    MEASURE_MODE_UNDEFINED: `0`,
    NODE_TYPE_COUNT: `2`,
    NODE_TYPE_DEFAULT: `0`,
    NODE_TYPE_TEXT: `1`,
    Node: NodeStatic,
    OVERFLOW_COUNT: `3`,
    OVERFLOW_HIDDEN: `1`,
    OVERFLOW_SCROLL: `2`,
    OVERFLOW_VISIBLE: `0`,
    POSITION_TYPE_ABSOLUTE: `1`,
    POSITION_TYPE_COUNT: `2`,
    POSITION_TYPE_RELATIVE: `0`,
    PRINT_OPTIONS_CHILDREN: `4`,
    PRINT_OPTIONS_COUNT: `3`,
    PRINT_OPTIONS_LAYOUT: `1`,
    PRINT_OPTIONS_STYLE: `2`,
    UNIT_AUTO: `3`,
    UNIT_COUNT: `4`,
    UNIT_PERCENT: `2`,
    UNIT_POINT: `1`,
    UNIT_UNDEFINED: `0`,
    WRAP_COUNT: `3`,
    WRAP_NO_WRAP: `0`,
    WRAP_WRAP: `1`,
    WRAP_WRAP_REVERSE: `2`,
    getInstanceCount: () => Double
  ): YogaStatic = {
    val __obj = js.Dynamic.literal(ALIGN_AUTO = ALIGN_AUTO.asInstanceOf[js.Any], ALIGN_BASELINE = ALIGN_BASELINE.asInstanceOf[js.Any], ALIGN_CENTER = ALIGN_CENTER.asInstanceOf[js.Any], ALIGN_COUNT = ALIGN_COUNT.asInstanceOf[js.Any], ALIGN_FLEX_END = ALIGN_FLEX_END.asInstanceOf[js.Any], ALIGN_FLEX_START = ALIGN_FLEX_START.asInstanceOf[js.Any], ALIGN_SPACE_AROUND = ALIGN_SPACE_AROUND.asInstanceOf[js.Any], ALIGN_SPACE_BETWEEN = ALIGN_SPACE_BETWEEN.asInstanceOf[js.Any], ALIGN_STRETCH = ALIGN_STRETCH.asInstanceOf[js.Any], Config = Config.asInstanceOf[js.Any], DIMENSION_COUNT = DIMENSION_COUNT.asInstanceOf[js.Any], DIMENSION_HEIGHT = DIMENSION_HEIGHT.asInstanceOf[js.Any], DIMENSION_WIDTH = DIMENSION_WIDTH.asInstanceOf[js.Any], DIRECTION_COUNT = DIRECTION_COUNT.asInstanceOf[js.Any], DIRECTION_INHERIT = DIRECTION_INHERIT.asInstanceOf[js.Any], DIRECTION_LTR = DIRECTION_LTR.asInstanceOf[js.Any], DIRECTION_RTL = DIRECTION_RTL.asInstanceOf[js.Any], DISPLAY_COUNT = DISPLAY_COUNT.asInstanceOf[js.Any], DISPLAY_FLEX = DISPLAY_FLEX.asInstanceOf[js.Any], DISPLAY_NONE = DISPLAY_NONE.asInstanceOf[js.Any], EDGE_ALL = EDGE_ALL.asInstanceOf[js.Any], EDGE_BOTTOM = EDGE_BOTTOM.asInstanceOf[js.Any], EDGE_COUNT = EDGE_COUNT.asInstanceOf[js.Any], EDGE_END = EDGE_END.asInstanceOf[js.Any], EDGE_HORIZONTAL = EDGE_HORIZONTAL.asInstanceOf[js.Any], EDGE_LEFT = EDGE_LEFT.asInstanceOf[js.Any], EDGE_RIGHT = EDGE_RIGHT.asInstanceOf[js.Any], EDGE_START = EDGE_START.asInstanceOf[js.Any], EDGE_TOP = EDGE_TOP.asInstanceOf[js.Any], EDGE_VERTICAL = EDGE_VERTICAL.asInstanceOf[js.Any], EXPERIMENTAL_FEATURE_COUNT = EXPERIMENTAL_FEATURE_COUNT.asInstanceOf[js.Any], EXPERIMENTAL_FEATURE_WEB_FLEX_BASIS = EXPERIMENTAL_FEATURE_WEB_FLEX_BASIS.asInstanceOf[js.Any], FLEX_DIRECTION_COLUMN = FLEX_DIRECTION_COLUMN.asInstanceOf[js.Any], FLEX_DIRECTION_COLUMN_REVERSE = FLEX_DIRECTION_COLUMN_REVERSE.asInstanceOf[js.Any], FLEX_DIRECTION_COUNT = FLEX_DIRECTION_COUNT.asInstanceOf[js.Any], FLEX_DIRECTION_ROW = FLEX_DIRECTION_ROW.asInstanceOf[js.Any], FLEX_DIRECTION_ROW_REVERSE = FLEX_DIRECTION_ROW_REVERSE.asInstanceOf[js.Any], JUSTIFY_CENTER = JUSTIFY_CENTER.asInstanceOf[js.Any], JUSTIFY_COUNT = JUSTIFY_COUNT.asInstanceOf[js.Any], JUSTIFY_FLEX_END = JUSTIFY_FLEX_END.asInstanceOf[js.Any], JUSTIFY_FLEX_START = JUSTIFY_FLEX_START.asInstanceOf[js.Any], JUSTIFY_SPACE_AROUND = JUSTIFY_SPACE_AROUND.asInstanceOf[js.Any], JUSTIFY_SPACE_BETWEEN = JUSTIFY_SPACE_BETWEEN.asInstanceOf[js.Any], JUSTIFY_SPACE_EVENLY = JUSTIFY_SPACE_EVENLY.asInstanceOf[js.Any], LOG_LEVEL_COUNT = LOG_LEVEL_COUNT.asInstanceOf[js.Any], LOG_LEVEL_DEBUG = LOG_LEVEL_DEBUG.asInstanceOf[js.Any], LOG_LEVEL_ERROR = LOG_LEVEL_ERROR.asInstanceOf[js.Any], LOG_LEVEL_FATAL = LOG_LEVEL_FATAL.asInstanceOf[js.Any], LOG_LEVEL_INFO = LOG_LEVEL_INFO.asInstanceOf[js.Any], LOG_LEVEL_VERBOSE = LOG_LEVEL_VERBOSE.asInstanceOf[js.Any], LOG_LEVEL_WARN = LOG_LEVEL_WARN.asInstanceOf[js.Any], MEASURE_MODE_AT_MOST = MEASURE_MODE_AT_MOST.asInstanceOf[js.Any], MEASURE_MODE_COUNT = MEASURE_MODE_COUNT.asInstanceOf[js.Any], MEASURE_MODE_EXACTLY = MEASURE_MODE_EXACTLY.asInstanceOf[js.Any], MEASURE_MODE_UNDEFINED = MEASURE_MODE_UNDEFINED.asInstanceOf[js.Any], NODE_TYPE_COUNT = NODE_TYPE_COUNT.asInstanceOf[js.Any], NODE_TYPE_DEFAULT = NODE_TYPE_DEFAULT.asInstanceOf[js.Any], NODE_TYPE_TEXT = NODE_TYPE_TEXT.asInstanceOf[js.Any], Node = Node.asInstanceOf[js.Any], OVERFLOW_COUNT = OVERFLOW_COUNT.asInstanceOf[js.Any], OVERFLOW_HIDDEN = OVERFLOW_HIDDEN.asInstanceOf[js.Any], OVERFLOW_SCROLL = OVERFLOW_SCROLL.asInstanceOf[js.Any], OVERFLOW_VISIBLE = OVERFLOW_VISIBLE.asInstanceOf[js.Any], POSITION_TYPE_ABSOLUTE = POSITION_TYPE_ABSOLUTE.asInstanceOf[js.Any], POSITION_TYPE_COUNT = POSITION_TYPE_COUNT.asInstanceOf[js.Any], POSITION_TYPE_RELATIVE = POSITION_TYPE_RELATIVE.asInstanceOf[js.Any], PRINT_OPTIONS_CHILDREN = PRINT_OPTIONS_CHILDREN.asInstanceOf[js.Any], PRINT_OPTIONS_COUNT = PRINT_OPTIONS_COUNT.asInstanceOf[js.Any], PRINT_OPTIONS_LAYOUT = PRINT_OPTIONS_LAYOUT.asInstanceOf[js.Any], PRINT_OPTIONS_STYLE = PRINT_OPTIONS_STYLE.asInstanceOf[js.Any], UNIT_AUTO = UNIT_AUTO.asInstanceOf[js.Any], UNIT_COUNT = UNIT_COUNT.asInstanceOf[js.Any], UNIT_PERCENT = UNIT_PERCENT.asInstanceOf[js.Any], UNIT_POINT = UNIT_POINT.asInstanceOf[js.Any], UNIT_UNDEFINED = UNIT_UNDEFINED.asInstanceOf[js.Any], WRAP_COUNT = WRAP_COUNT.asInstanceOf[js.Any], WRAP_NO_WRAP = WRAP_NO_WRAP.asInstanceOf[js.Any], WRAP_WRAP = WRAP_WRAP.asInstanceOf[js.Any], WRAP_WRAP_REVERSE = WRAP_WRAP_REVERSE.asInstanceOf[js.Any], getInstanceCount = js.Any.fromFunction0(getInstanceCount))
    __obj.asInstanceOf[YogaStatic]
  }
  @scala.inline
  implicit class YogaStaticOps[Self <: YogaStatic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConfig(value: ConfigStatic): Self = this.set("Config", value.asInstanceOf[js.Any])
    @scala.inline
    def setNode(value: NodeStatic): Self = this.set("Node", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetInstanceCount(value: () => Double): Self = this.set("getInstanceCount", js.Any.fromFunction0(value))
  }
  
}

