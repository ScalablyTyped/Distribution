package typings.zui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Uploader extends StObject {
  
  def destroy(): Unit = js.native
  
  def disableBrowse(disable: Boolean): Unit = js.native
  
  def getFile(id: String): FileObj = js.native
  
  def getFiles(): js.Array[FileObj] = js.native
  
  def getState(): STATUS = js.native
  
  def getTotal(): UploadProgress = js.native
  
  def hideMessage(): Unit = js.native
  
  def isStarted(): Boolean = js.native
  
  def isStopped(): Boolean = js.native
  
  def removeFile(file: FileObj): Unit = js.native
  
  def showFile(file: js.Array[FileObj]): Unit = js.native
  def showFile(file: FileObj): Unit = js.native
  
  def showMessage(message: String, `type`: String): Unit = js.native
  def showMessage(message: String, `type`: String, time: Double): Unit = js.native
  
  def showStatus(): Unit = js.native
  
  def start(): Unit = js.native
  
  def stop(): Unit = js.native
}
