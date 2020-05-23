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
  
}

