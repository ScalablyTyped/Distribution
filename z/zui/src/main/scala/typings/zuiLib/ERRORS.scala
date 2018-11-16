package typings
package zuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ERRORS extends js.Object

@JSGlobal("ERRORS")
@js.native
object ERRORS extends js.Object {
  @js.native
  sealed trait FILE_DUPLICATE_ERROR
    extends zuiLib.ERRORS
  
  @js.native
  sealed trait FILE_EXTENSION_ERROR
    extends zuiLib.ERRORS
  
  @js.native
  sealed trait FILE_SIZE_ERROR
    extends zuiLib.ERRORS
  
  @js.native
  sealed trait GENERIC_ERROR
    extends zuiLib.ERRORS
  
  @js.native
  sealed trait HTTP_ERROR
    extends zuiLib.ERRORS
  
  @js.native
  sealed trait IMAGE_DIMENSIONS_ERROR
    extends zuiLib.ERRORS
  
  @js.native
  sealed trait IMAGE_FORMAT_ERROR
    extends zuiLib.ERRORS
  
  @js.native
  sealed trait IMAGE_MEMORY_ERROR
    extends zuiLib.ERRORS
  
  @js.native
  sealed trait INIT_ERROR
    extends zuiLib.ERRORS
  
  @js.native
  sealed trait IO_ERROR
    extends zuiLib.ERRORS
  
  @js.native
  sealed trait SECURITY_ERROR
    extends zuiLib.ERRORS
  
  /* -602 */ val FILE_DUPLICATE_ERROR: FILE_DUPLICATE_ERROR with scala.Double = js.native
  /* -601 */ val FILE_EXTENSION_ERROR: FILE_EXTENSION_ERROR with scala.Double = js.native
  /* -600 */ val FILE_SIZE_ERROR: FILE_SIZE_ERROR with scala.Double = js.native
  /* -100 */ val GENERIC_ERROR: GENERIC_ERROR with scala.Double = js.native
  /* -200 */ val HTTP_ERROR: HTTP_ERROR with scala.Double = js.native
  /* -702 */ val IMAGE_DIMENSIONS_ERROR: IMAGE_DIMENSIONS_ERROR with scala.Double = js.native
  /* -700 */ val IMAGE_FORMAT_ERROR: IMAGE_FORMAT_ERROR with scala.Double = js.native
  /* -701 */ val IMAGE_MEMORY_ERROR: IMAGE_MEMORY_ERROR with scala.Double = js.native
  /* -500 */ val INIT_ERROR: INIT_ERROR with scala.Double = js.native
  /* -300 */ val IO_ERROR: IO_ERROR with scala.Double = js.native
  /* -400 */ val SECURITY_ERROR: SECURITY_ERROR with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[zuiLib.ERRORS with scala.Double] = js.native
}

