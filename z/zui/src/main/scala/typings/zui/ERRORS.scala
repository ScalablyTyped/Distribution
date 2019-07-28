package typings.zui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ERRORS extends js.Object

@JSGlobal("ERRORS")
@js.native
object ERRORS extends js.Object {
  @js.native
  sealed trait FILE_DUPLICATE_ERROR extends ERRORS
  
  @js.native
  sealed trait FILE_EXTENSION_ERROR extends ERRORS
  
  @js.native
  sealed trait FILE_SIZE_ERROR extends ERRORS
  
  @js.native
  sealed trait GENERIC_ERROR extends ERRORS
  
  @js.native
  sealed trait HTTP_ERROR extends ERRORS
  
  @js.native
  sealed trait IMAGE_DIMENSIONS_ERROR extends ERRORS
  
  @js.native
  sealed trait IMAGE_FORMAT_ERROR extends ERRORS
  
  @js.native
  sealed trait IMAGE_MEMORY_ERROR extends ERRORS
  
  @js.native
  sealed trait INIT_ERROR extends ERRORS
  
  @js.native
  sealed trait IO_ERROR extends ERRORS
  
  @js.native
  sealed trait SECURITY_ERROR extends ERRORS
  
  /* -602 */ val FILE_DUPLICATE_ERROR: typings.zui.ERRORS.FILE_DUPLICATE_ERROR with Double = js.native
  /* -601 */ val FILE_EXTENSION_ERROR: typings.zui.ERRORS.FILE_EXTENSION_ERROR with Double = js.native
  /* -600 */ val FILE_SIZE_ERROR: typings.zui.ERRORS.FILE_SIZE_ERROR with Double = js.native
  /* -100 */ val GENERIC_ERROR: typings.zui.ERRORS.GENERIC_ERROR with Double = js.native
  /* -200 */ val HTTP_ERROR: typings.zui.ERRORS.HTTP_ERROR with Double = js.native
  /* -702 */ val IMAGE_DIMENSIONS_ERROR: typings.zui.ERRORS.IMAGE_DIMENSIONS_ERROR with Double = js.native
  /* -700 */ val IMAGE_FORMAT_ERROR: typings.zui.ERRORS.IMAGE_FORMAT_ERROR with Double = js.native
  /* -701 */ val IMAGE_MEMORY_ERROR: typings.zui.ERRORS.IMAGE_MEMORY_ERROR with Double = js.native
  /* -500 */ val INIT_ERROR: typings.zui.ERRORS.INIT_ERROR with Double = js.native
  /* -300 */ val IO_ERROR: typings.zui.ERRORS.IO_ERROR with Double = js.native
  /* -400 */ val SECURITY_ERROR: typings.zui.ERRORS.SECURITY_ERROR with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ERRORS with Double] = js.native
}

