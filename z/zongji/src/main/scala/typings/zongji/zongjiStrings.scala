package typings.zongji

import typings.zongji.mod.ZongJi.EventTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object zongjiStrings {
  
  @js.native
  sealed trait binlog extends StObject
  inline def binlog: binlog = "binlog".asInstanceOf[binlog]
  
  @js.native
  sealed trait deleterows
    extends StObject
       with EventTypes
  inline def deleterows: deleterows = "deleterows".asInstanceOf[deleterows]
  
  @js.native
  sealed trait error extends StObject
  inline def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait format
    extends StObject
       with EventTypes
  inline def format: format = "format".asInstanceOf[format]
  
  @js.native
  sealed trait intvar
    extends StObject
       with EventTypes
  inline def intvar: intvar = "intvar".asInstanceOf[intvar]
  
  @js.native
  sealed trait query
    extends StObject
       with EventTypes
  inline def query: query = "query".asInstanceOf[query]
  
  @js.native
  sealed trait ready extends StObject
  inline def ready: ready = "ready".asInstanceOf[ready]
  
  @js.native
  sealed trait rotate
    extends StObject
       with EventTypes
  inline def rotate: rotate = "rotate".asInstanceOf[rotate]
  
  @js.native
  sealed trait stopped extends StObject
  inline def stopped: stopped = "stopped".asInstanceOf[stopped]
  
  @js.native
  sealed trait tablemap
    extends StObject
       with EventTypes
  inline def tablemap: tablemap = "tablemap".asInstanceOf[tablemap]
  
  @js.native
  sealed trait unknown
    extends StObject
       with EventTypes
  inline def unknown: unknown = "unknown".asInstanceOf[unknown]
  
  @js.native
  sealed trait updaterows
    extends StObject
       with EventTypes
  inline def updaterows: updaterows = "updaterows".asInstanceOf[updaterows]
  
  @js.native
  sealed trait writerows
    extends StObject
       with EventTypes
  inline def writerows: writerows = "writerows".asInstanceOf[writerows]
  
  @js.native
  sealed trait xid
    extends StObject
       with EventTypes
  inline def xid: xid = "xid".asInstanceOf[xid]
}
