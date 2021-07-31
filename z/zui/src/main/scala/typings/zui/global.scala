package typings.zui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("ERRORS")
  @js.native
  object ERRORS extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.zui.ERRORS & Double] = js.native
    
    /* -602 */ val FILE_DUPLICATE_ERROR: typings.zui.ERRORS.FILE_DUPLICATE_ERROR & Double = js.native
    
    /* -601 */ val FILE_EXTENSION_ERROR: typings.zui.ERRORS.FILE_EXTENSION_ERROR & Double = js.native
    
    /* -600 */ val FILE_SIZE_ERROR: typings.zui.ERRORS.FILE_SIZE_ERROR & Double = js.native
    
    /* -100 */ val GENERIC_ERROR: typings.zui.ERRORS.GENERIC_ERROR & Double = js.native
    
    /* -200 */ val HTTP_ERROR: typings.zui.ERRORS.HTTP_ERROR & Double = js.native
    
    /* -702 */ val IMAGE_DIMENSIONS_ERROR: typings.zui.ERRORS.IMAGE_DIMENSIONS_ERROR & Double = js.native
    
    /* -700 */ val IMAGE_FORMAT_ERROR: typings.zui.ERRORS.IMAGE_FORMAT_ERROR & Double = js.native
    
    /* -701 */ val IMAGE_MEMORY_ERROR: typings.zui.ERRORS.IMAGE_MEMORY_ERROR & Double = js.native
    
    /* -500 */ val INIT_ERROR: typings.zui.ERRORS.INIT_ERROR & Double = js.native
    
    /* -300 */ val IO_ERROR: typings.zui.ERRORS.IO_ERROR & Double = js.native
    
    /* -400 */ val SECURITY_ERROR: typings.zui.ERRORS.SECURITY_ERROR & Double = js.native
  }
  
  /**
    * messager
    */
  @JSGlobal("MessagerTypeEnum")
  @js.native
  object MessagerTypeEnum extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.zui.MessagerTypeEnum & Double] = js.native
    
    /* 0 */ val default: typings.zui.MessagerTypeEnum.default & Double = js.native
    
    /* 5 */ val danger: typings.zui.MessagerTypeEnum.danger & Double = js.native
    
    /* 6 */ val important: typings.zui.MessagerTypeEnum.important & Double = js.native
    
    /* 3 */ val info: typings.zui.MessagerTypeEnum.info & Double = js.native
    
    /* 1 */ val primary: typings.zui.MessagerTypeEnum.primary & Double = js.native
    
    /* 7 */ val special: typings.zui.MessagerTypeEnum.special & Double = js.native
    
    /* 2 */ val success: typings.zui.MessagerTypeEnum.success & Double = js.native
    
    /* 4 */ val warning: typings.zui.MessagerTypeEnum.warning & Double = js.native
  }
  
  @JSGlobal("STATUS")
  @js.native
  object STATUS extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.zui.STATUS & Double] = js.native
    
    /* 4 */ val DONE: typings.zui.STATUS.DONE & Double = js.native
    
    /* 3 */ val FAILED: typings.zui.STATUS.FAILED & Double = js.native
    
    /* 1 */ val QUEUED: typings.zui.STATUS.QUEUED & Double = js.native
    
    /* 2 */ val STARTED: typings.zui.STATUS.STARTED & Double = js.native
    
    /* 1 */ val STOPPED: typings.zui.STATUS.STOPPED & Double = js.native
    
    /* 2 */ val UPLOADING: typings.zui.STATUS.UPLOADING & Double = js.native
  }
}
