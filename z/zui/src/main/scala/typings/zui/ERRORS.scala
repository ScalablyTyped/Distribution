package typings.zui

import org.scalablytyped.runtime.TopLevel
import typings.zui.ERRORS.FILE_DUPLICATE_ERROR
import typings.zui.ERRORS.FILE_EXTENSION_ERROR
import typings.zui.ERRORS.FILE_SIZE_ERROR
import typings.zui.ERRORS.GENERIC_ERROR
import typings.zui.ERRORS.HTTP_ERROR
import typings.zui.ERRORS.IMAGE_DIMENSIONS_ERROR
import typings.zui.ERRORS.IMAGE_FORMAT_ERROR
import typings.zui.ERRORS.IMAGE_MEMORY_ERROR
import typings.zui.ERRORS.INIT_ERROR
import typings.zui.ERRORS.IO_ERROR
import typings.zui.ERRORS.SECURITY_ERROR
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ERRORS with Double] = js.native
  /* -602 */ @js.native
  object FILE_DUPLICATE_ERROR extends TopLevel[FILE_DUPLICATE_ERROR with Double]
  
  /* -601 */ @js.native
  object FILE_EXTENSION_ERROR extends TopLevel[FILE_EXTENSION_ERROR with Double]
  
  /* -600 */ @js.native
  object FILE_SIZE_ERROR extends TopLevel[FILE_SIZE_ERROR with Double]
  
  /* -100 */ @js.native
  object GENERIC_ERROR extends TopLevel[GENERIC_ERROR with Double]
  
  /* -200 */ @js.native
  object HTTP_ERROR extends TopLevel[HTTP_ERROR with Double]
  
  /* -702 */ @js.native
  object IMAGE_DIMENSIONS_ERROR extends TopLevel[IMAGE_DIMENSIONS_ERROR with Double]
  
  /* -700 */ @js.native
  object IMAGE_FORMAT_ERROR extends TopLevel[IMAGE_FORMAT_ERROR with Double]
  
  /* -701 */ @js.native
  object IMAGE_MEMORY_ERROR extends TopLevel[IMAGE_MEMORY_ERROR with Double]
  
  /* -500 */ @js.native
  object INIT_ERROR extends TopLevel[INIT_ERROR with Double]
  
  /* -300 */ @js.native
  object IO_ERROR extends TopLevel[IO_ERROR with Double]
  
  /* -400 */ @js.native
  object SECURITY_ERROR extends TopLevel[SECURITY_ERROR with Double]
  
}

