package typings.zeditUpf.mod

import typings.xelib.mod.RecordHandle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Helpers extends js.Object {
  
  /**
    * Uses record consistency caching to make certain the input record
    * stays at the same Form ID when the patch gets regenerated.
    * This function should be used on all records created by UPF patchers,
    * excluding overrides.
    * The id should be a unique string value for the record.
    * It is recommended to use a unique prefix for id to avoid collisions
    * with other patchers.
    * The record's editor ID will be set to id if the record
    * has an Editor ID field.
    */
  def cacheRecord(record: RecordHandle, id: String): RecordHandle = js.native
  
  /**
    * Load records from the files your patcher is targeting.
    */
  def loadRecords(search: String): js.Array[RecordHandle] = js.native
  def loadRecords(search: String, /**
    * @default false
    */
  includeOverride: Boolean): js.Array[RecordHandle] = js.native
  
  /**
    * Call this function to print a message to the progress modal's log.
    */
  def logMessage(message: String): Unit = js.native
}
