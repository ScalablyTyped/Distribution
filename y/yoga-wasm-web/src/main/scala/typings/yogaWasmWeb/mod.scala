package typings.yogaWasmWeb

import typings.std.BufferSource
import typings.std.PromiseLike
import typings.std.Response
import typings.std.WebAssembly.Module
import typings.yogaWasmWeb.distWrapAsmMod.Yoga
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("yoga-wasm-web", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(wasm: BufferSource): js.Promise[Yoga] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(wasm.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Yoga]]
  inline def default(wasm: Module): js.Promise[Yoga] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(wasm.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Yoga]]
  
  @JSImport("yoga-wasm-web", "ALIGN_AUTO")
  @js.native
  val ALIGN_AUTO: typings.yogaWasmWeb.distGeneratedYgenumsMod.ALIGN_AUTO = js.native
  
  @JSImport("yoga-wasm-web", "ALIGN_BASELINE")
  @js.native
  val ALIGN_BASELINE: typings.yogaWasmWeb.distGeneratedYgenumsMod.ALIGN_BASELINE = js.native
  
  @JSImport("yoga-wasm-web", "ALIGN_CENTER")
  @js.native
  val ALIGN_CENTER: typings.yogaWasmWeb.distGeneratedYgenumsMod.ALIGN_CENTER = js.native
  
  @JSImport("yoga-wasm-web", "ALIGN_FLEX_END")
  @js.native
  val ALIGN_FLEX_END: typings.yogaWasmWeb.distGeneratedYgenumsMod.ALIGN_FLEX_END = js.native
  
  @JSImport("yoga-wasm-web", "ALIGN_FLEX_START")
  @js.native
  val ALIGN_FLEX_START: typings.yogaWasmWeb.distGeneratedYgenumsMod.ALIGN_FLEX_START = js.native
  
  @JSImport("yoga-wasm-web", "ALIGN_SPACE_AROUND")
  @js.native
  val ALIGN_SPACE_AROUND: typings.yogaWasmWeb.distGeneratedYgenumsMod.ALIGN_SPACE_AROUND = js.native
  
  @JSImport("yoga-wasm-web", "ALIGN_SPACE_BETWEEN")
  @js.native
  val ALIGN_SPACE_BETWEEN: typings.yogaWasmWeb.distGeneratedYgenumsMod.ALIGN_SPACE_BETWEEN = js.native
  
  @JSImport("yoga-wasm-web", "ALIGN_STRETCH")
  @js.native
  val ALIGN_STRETCH: typings.yogaWasmWeb.distGeneratedYgenumsMod.ALIGN_STRETCH = js.native
  
  @JSImport("yoga-wasm-web", "DIMENSION_HEIGHT")
  @js.native
  val DIMENSION_HEIGHT: typings.yogaWasmWeb.distGeneratedYgenumsMod.DIMENSION_HEIGHT = js.native
  
  @JSImport("yoga-wasm-web", "DIMENSION_WIDTH")
  @js.native
  val DIMENSION_WIDTH: typings.yogaWasmWeb.distGeneratedYgenumsMod.DIMENSION_WIDTH = js.native
  
  @JSImport("yoga-wasm-web", "DIRECTION_INHERIT")
  @js.native
  val DIRECTION_INHERIT: typings.yogaWasmWeb.distGeneratedYgenumsMod.DIRECTION_INHERIT = js.native
  
  @JSImport("yoga-wasm-web", "DIRECTION_LTR")
  @js.native
  val DIRECTION_LTR: typings.yogaWasmWeb.distGeneratedYgenumsMod.DIRECTION_LTR = js.native
  
  @JSImport("yoga-wasm-web", "DIRECTION_RTL")
  @js.native
  val DIRECTION_RTL: typings.yogaWasmWeb.distGeneratedYgenumsMod.DIRECTION_RTL = js.native
  
  @JSImport("yoga-wasm-web", "DISPLAY_FLEX")
  @js.native
  val DISPLAY_FLEX: typings.yogaWasmWeb.distGeneratedYgenumsMod.DISPLAY_FLEX = js.native
  
  @JSImport("yoga-wasm-web", "DISPLAY_NONE")
  @js.native
  val DISPLAY_NONE: typings.yogaWasmWeb.distGeneratedYgenumsMod.DISPLAY_NONE = js.native
  
  @JSImport("yoga-wasm-web", "EDGE_ALL")
  @js.native
  val EDGE_ALL: typings.yogaWasmWeb.distGeneratedYgenumsMod.EDGE_ALL = js.native
  
  @JSImport("yoga-wasm-web", "EDGE_BOTTOM")
  @js.native
  val EDGE_BOTTOM: typings.yogaWasmWeb.distGeneratedYgenumsMod.EDGE_BOTTOM = js.native
  
  @JSImport("yoga-wasm-web", "EDGE_END")
  @js.native
  val EDGE_END: typings.yogaWasmWeb.distGeneratedYgenumsMod.EDGE_END = js.native
  
  @JSImport("yoga-wasm-web", "EDGE_HORIZONTAL")
  @js.native
  val EDGE_HORIZONTAL: typings.yogaWasmWeb.distGeneratedYgenumsMod.EDGE_HORIZONTAL = js.native
  
  @JSImport("yoga-wasm-web", "EDGE_LEFT")
  @js.native
  val EDGE_LEFT: typings.yogaWasmWeb.distGeneratedYgenumsMod.EDGE_LEFT = js.native
  
  @JSImport("yoga-wasm-web", "EDGE_RIGHT")
  @js.native
  val EDGE_RIGHT: typings.yogaWasmWeb.distGeneratedYgenumsMod.EDGE_RIGHT = js.native
  
  @JSImport("yoga-wasm-web", "EDGE_START")
  @js.native
  val EDGE_START: typings.yogaWasmWeb.distGeneratedYgenumsMod.EDGE_START = js.native
  
  @JSImport("yoga-wasm-web", "EDGE_TOP")
  @js.native
  val EDGE_TOP: typings.yogaWasmWeb.distGeneratedYgenumsMod.EDGE_TOP = js.native
  
  @JSImport("yoga-wasm-web", "EDGE_VERTICAL")
  @js.native
  val EDGE_VERTICAL: typings.yogaWasmWeb.distGeneratedYgenumsMod.EDGE_VERTICAL = js.native
  
  @JSImport("yoga-wasm-web", "EXPERIMENTAL_FEATURE_ABSOLUTE_PERCENTAGE_AGAINST_PADDING_EDGE")
  @js.native
  val EXPERIMENTAL_FEATURE_ABSOLUTE_PERCENTAGE_AGAINST_PADDING_EDGE: typings.yogaWasmWeb.distGeneratedYgenumsMod.EXPERIMENTAL_FEATURE_ABSOLUTE_PERCENTAGE_AGAINST_PADDING_EDGE = js.native
  
  @JSImport("yoga-wasm-web", "EXPERIMENTAL_FEATURE_FIX_ABSOLUTE_TRAILING_COLUMN_MARGIN")
  @js.native
  val EXPERIMENTAL_FEATURE_FIX_ABSOLUTE_TRAILING_COLUMN_MARGIN: typings.yogaWasmWeb.distGeneratedYgenumsMod.EXPERIMENTAL_FEATURE_FIX_ABSOLUTE_TRAILING_COLUMN_MARGIN = js.native
  
  @JSImport("yoga-wasm-web", "EXPERIMENTAL_FEATURE_WEB_FLEX_BASIS")
  @js.native
  val EXPERIMENTAL_FEATURE_WEB_FLEX_BASIS: typings.yogaWasmWeb.distGeneratedYgenumsMod.EXPERIMENTAL_FEATURE_WEB_FLEX_BASIS = js.native
  
  @JSImport("yoga-wasm-web", "FLEX_DIRECTION_COLUMN")
  @js.native
  val FLEX_DIRECTION_COLUMN: typings.yogaWasmWeb.distGeneratedYgenumsMod.FLEX_DIRECTION_COLUMN = js.native
  
  @JSImport("yoga-wasm-web", "FLEX_DIRECTION_COLUMN_REVERSE")
  @js.native
  val FLEX_DIRECTION_COLUMN_REVERSE: typings.yogaWasmWeb.distGeneratedYgenumsMod.FLEX_DIRECTION_COLUMN_REVERSE = js.native
  
  @JSImport("yoga-wasm-web", "FLEX_DIRECTION_ROW")
  @js.native
  val FLEX_DIRECTION_ROW: typings.yogaWasmWeb.distGeneratedYgenumsMod.FLEX_DIRECTION_ROW = js.native
  
  @JSImport("yoga-wasm-web", "FLEX_DIRECTION_ROW_REVERSE")
  @js.native
  val FLEX_DIRECTION_ROW_REVERSE: typings.yogaWasmWeb.distGeneratedYgenumsMod.FLEX_DIRECTION_ROW_REVERSE = js.native
  
  @JSImport("yoga-wasm-web", "GUTTER_ALL")
  @js.native
  val GUTTER_ALL: typings.yogaWasmWeb.distGeneratedYgenumsMod.GUTTER_ALL = js.native
  
  @JSImport("yoga-wasm-web", "GUTTER_COLUMN")
  @js.native
  val GUTTER_COLUMN: typings.yogaWasmWeb.distGeneratedYgenumsMod.GUTTER_COLUMN = js.native
  
  @JSImport("yoga-wasm-web", "GUTTER_ROW")
  @js.native
  val GUTTER_ROW: typings.yogaWasmWeb.distGeneratedYgenumsMod.GUTTER_ROW = js.native
  
  @JSImport("yoga-wasm-web", "JUSTIFY_CENTER")
  @js.native
  val JUSTIFY_CENTER: typings.yogaWasmWeb.distGeneratedYgenumsMod.JUSTIFY_CENTER = js.native
  
  @JSImport("yoga-wasm-web", "JUSTIFY_FLEX_END")
  @js.native
  val JUSTIFY_FLEX_END: typings.yogaWasmWeb.distGeneratedYgenumsMod.JUSTIFY_FLEX_END = js.native
  
  @JSImport("yoga-wasm-web", "JUSTIFY_FLEX_START")
  @js.native
  val JUSTIFY_FLEX_START: typings.yogaWasmWeb.distGeneratedYgenumsMod.JUSTIFY_FLEX_START = js.native
  
  @JSImport("yoga-wasm-web", "JUSTIFY_SPACE_AROUND")
  @js.native
  val JUSTIFY_SPACE_AROUND: typings.yogaWasmWeb.distGeneratedYgenumsMod.JUSTIFY_SPACE_AROUND = js.native
  
  @JSImport("yoga-wasm-web", "JUSTIFY_SPACE_BETWEEN")
  @js.native
  val JUSTIFY_SPACE_BETWEEN: typings.yogaWasmWeb.distGeneratedYgenumsMod.JUSTIFY_SPACE_BETWEEN = js.native
  
  @JSImport("yoga-wasm-web", "JUSTIFY_SPACE_EVENLY")
  @js.native
  val JUSTIFY_SPACE_EVENLY: typings.yogaWasmWeb.distGeneratedYgenumsMod.JUSTIFY_SPACE_EVENLY = js.native
  
  @JSImport("yoga-wasm-web", "LOG_LEVEL_DEBUG")
  @js.native
  val LOG_LEVEL_DEBUG: typings.yogaWasmWeb.distGeneratedYgenumsMod.LOG_LEVEL_DEBUG = js.native
  
  @JSImport("yoga-wasm-web", "LOG_LEVEL_ERROR")
  @js.native
  val LOG_LEVEL_ERROR: typings.yogaWasmWeb.distGeneratedYgenumsMod.LOG_LEVEL_ERROR = js.native
  
  @JSImport("yoga-wasm-web", "LOG_LEVEL_FATAL")
  @js.native
  val LOG_LEVEL_FATAL: typings.yogaWasmWeb.distGeneratedYgenumsMod.LOG_LEVEL_FATAL = js.native
  
  @JSImport("yoga-wasm-web", "LOG_LEVEL_INFO")
  @js.native
  val LOG_LEVEL_INFO: typings.yogaWasmWeb.distGeneratedYgenumsMod.LOG_LEVEL_INFO = js.native
  
  @JSImport("yoga-wasm-web", "LOG_LEVEL_VERBOSE")
  @js.native
  val LOG_LEVEL_VERBOSE: typings.yogaWasmWeb.distGeneratedYgenumsMod.LOG_LEVEL_VERBOSE = js.native
  
  @JSImport("yoga-wasm-web", "LOG_LEVEL_WARN")
  @js.native
  val LOG_LEVEL_WARN: typings.yogaWasmWeb.distGeneratedYgenumsMod.LOG_LEVEL_WARN = js.native
  
  @JSImport("yoga-wasm-web", "MEASURE_MODE_AT_MOST")
  @js.native
  val MEASURE_MODE_AT_MOST: typings.yogaWasmWeb.distGeneratedYgenumsMod.MEASURE_MODE_AT_MOST = js.native
  
  @JSImport("yoga-wasm-web", "MEASURE_MODE_EXACTLY")
  @js.native
  val MEASURE_MODE_EXACTLY: typings.yogaWasmWeb.distGeneratedYgenumsMod.MEASURE_MODE_EXACTLY = js.native
  
  @JSImport("yoga-wasm-web", "MEASURE_MODE_UNDEFINED")
  @js.native
  val MEASURE_MODE_UNDEFINED: typings.yogaWasmWeb.distGeneratedYgenumsMod.MEASURE_MODE_UNDEFINED = js.native
  
  @JSImport("yoga-wasm-web", "NODE_TYPE_DEFAULT")
  @js.native
  val NODE_TYPE_DEFAULT: typings.yogaWasmWeb.distGeneratedYgenumsMod.NODE_TYPE_DEFAULT = js.native
  
  @JSImport("yoga-wasm-web", "NODE_TYPE_TEXT")
  @js.native
  val NODE_TYPE_TEXT: typings.yogaWasmWeb.distGeneratedYgenumsMod.NODE_TYPE_TEXT = js.native
  
  @JSImport("yoga-wasm-web", "OVERFLOW_HIDDEN")
  @js.native
  val OVERFLOW_HIDDEN: typings.yogaWasmWeb.distGeneratedYgenumsMod.OVERFLOW_HIDDEN = js.native
  
  @JSImport("yoga-wasm-web", "OVERFLOW_SCROLL")
  @js.native
  val OVERFLOW_SCROLL: typings.yogaWasmWeb.distGeneratedYgenumsMod.OVERFLOW_SCROLL = js.native
  
  @JSImport("yoga-wasm-web", "OVERFLOW_VISIBLE")
  @js.native
  val OVERFLOW_VISIBLE: typings.yogaWasmWeb.distGeneratedYgenumsMod.OVERFLOW_VISIBLE = js.native
  
  @JSImport("yoga-wasm-web", "POSITION_TYPE_ABSOLUTE")
  @js.native
  val POSITION_TYPE_ABSOLUTE: typings.yogaWasmWeb.distGeneratedYgenumsMod.POSITION_TYPE_ABSOLUTE = js.native
  
  @JSImport("yoga-wasm-web", "POSITION_TYPE_RELATIVE")
  @js.native
  val POSITION_TYPE_RELATIVE: typings.yogaWasmWeb.distGeneratedYgenumsMod.POSITION_TYPE_RELATIVE = js.native
  
  @JSImport("yoga-wasm-web", "POSITION_TYPE_STATIC")
  @js.native
  val POSITION_TYPE_STATIC: typings.yogaWasmWeb.distGeneratedYgenumsMod.POSITION_TYPE_STATIC = js.native
  
  @JSImport("yoga-wasm-web", "PRINT_OPTIONS_CHILDREN")
  @js.native
  val PRINT_OPTIONS_CHILDREN: typings.yogaWasmWeb.distGeneratedYgenumsMod.PRINT_OPTIONS_CHILDREN = js.native
  
  @JSImport("yoga-wasm-web", "PRINT_OPTIONS_LAYOUT")
  @js.native
  val PRINT_OPTIONS_LAYOUT: typings.yogaWasmWeb.distGeneratedYgenumsMod.PRINT_OPTIONS_LAYOUT = js.native
  
  @JSImport("yoga-wasm-web", "PRINT_OPTIONS_STYLE")
  @js.native
  val PRINT_OPTIONS_STYLE: typings.yogaWasmWeb.distGeneratedYgenumsMod.PRINT_OPTIONS_STYLE = js.native
  
  @JSImport("yoga-wasm-web", "UNIT_AUTO")
  @js.native
  val UNIT_AUTO: typings.yogaWasmWeb.distGeneratedYgenumsMod.UNIT_AUTO = js.native
  
  @JSImport("yoga-wasm-web", "UNIT_PERCENT")
  @js.native
  val UNIT_PERCENT: typings.yogaWasmWeb.distGeneratedYgenumsMod.UNIT_PERCENT = js.native
  
  @JSImport("yoga-wasm-web", "UNIT_POINT")
  @js.native
  val UNIT_POINT: typings.yogaWasmWeb.distGeneratedYgenumsMod.UNIT_POINT = js.native
  
  @JSImport("yoga-wasm-web", "UNIT_UNDEFINED")
  @js.native
  val UNIT_UNDEFINED: typings.yogaWasmWeb.distGeneratedYgenumsMod.UNIT_UNDEFINED = js.native
  
  @JSImport("yoga-wasm-web", "WRAP_NO_WRAP")
  @js.native
  val WRAP_NO_WRAP: typings.yogaWasmWeb.distGeneratedYgenumsMod.WRAP_NO_WRAP = js.native
  
  @JSImport("yoga-wasm-web", "WRAP_WRAP")
  @js.native
  val WRAP_WRAP: typings.yogaWasmWeb.distGeneratedYgenumsMod.WRAP_WRAP = js.native
  
  @JSImport("yoga-wasm-web", "WRAP_WRAP_REVERSE")
  @js.native
  val WRAP_WRAP_REVERSE: typings.yogaWasmWeb.distGeneratedYgenumsMod.WRAP_WRAP_REVERSE = js.native
  
  inline def initStreaming(response: PromiseLike[Response]): js.Promise[Yoga] = ^.asInstanceOf[js.Dynamic].applyDynamic("initStreaming")(response.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Yoga]]
  inline def initStreaming(response: Response): js.Promise[Yoga] = ^.asInstanceOf[js.Dynamic].applyDynamic("initStreaming")(response.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Yoga]]
}
