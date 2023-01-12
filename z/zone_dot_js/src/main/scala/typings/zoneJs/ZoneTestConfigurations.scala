package typings.zoneJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface of `zone-testing.js` test configurations.
  *
  * You can define the following configurations on the `window` or `global` object before
  * importing `zone-testing.js` to change `zone-testing.js` default behaviors in the test runner.
  */
trait ZoneTestConfigurations extends StObject {
  
  /**
    * Disable the Jasmine integration.
    *
    * In the `zone-testing.js` bundle, by default, `zone-testing.js` monkey patches Jasmine APIs
    * to make Jasmine APIs run in specified zone.
    *
    * 1. Make the `describe()`/`xdescribe()`/`fdescribe()` methods run in the syncTestZone.
    * 2. Make the `it()`/`xit()`/`fit()`/`beforeEach()`/`afterEach()`/`beforeAll()`/`afterAll()`
    * methods run in the ProxyZone.
    *
    * With this patch, `async()`/`fakeAsync()` can work with the Jasmine runner.
    *
    * If you set `__Zone_disable_jasmine = true` before importing `zone-testing.js`,
    * `zone-testing.js` does not monkey patch the jasmine APIs and the `async()`/`fakeAsync()` cannot
    * work with the Jasmine runner any longer.
    */
  var __Zone_disable_jasmine: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Disable the Jest integration.
    *
    * In the `zone-testing.js` bundle, by default, `zone-testing.js` monkey patches Jest APIs
    * to make Jest APIs run in the specified zone.
    *
    * 1. Make the `describe()`/`xdescribe()`/`fdescribe()` methods run in the syncTestZone.
    * 2. Make the `it()`/`xit()`/`fit()`/`beforeEach()`/`afterEach()`/`before()`/`after()` methods
    * run in the ProxyZone.
    *
    * With this patch, `async()`/`fakeAsync()` can work with the Jest runner.
    *
    * If you set `__Zone_disable_jest = true` before importing `zone-testing.js`,
    * `zone-testing.js` does not monkey patch the jest APIs and `async()`/`fakeAsync()` cannot
    * work with the Jest runner any longer.
    */
  var __Zone_disable_jest: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Disable the Mocha integration.
    *
    * In the `zone-testing.js` bundle, by default, `zone-testing.js` monkey patches the Mocha APIs
    * to make Mocha APIs run in the specified zone.
    *
    * 1. Make the `describe()`/`xdescribe()`/`fdescribe()` methods run in the syncTestZone.
    * 2. Make the `it()`/`xit()`/`fit()`/`beforeEach()`/`afterEach()`/`beforeAll()`/`afterAll()`
    * methods run in the ProxyZone.
    *
    * With this patch, `async()`/`fakeAsync()` can work with the Mocha runner.
    *
    * If you set `__Zone_disable_mocha = true` before importing `zone-testing.js`,
    * `zone-testing.js` does not monkey patch the Mocha APIs and the `async()/`fakeAsync()` can not
    * work with the Mocha runner any longer.
    */
  var __Zone_disable_mocha: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enable auto running into `fakeAsync()` when installing the `jasmine.clock()`.
    *
    * By default, `zone-testing.js` does not automatically run into `fakeAsync()`
    * if the `jasmine.clock().install()` is called.
    *
    * Consider the following example:
    *
    * ```
    * describe('jasmine.clock integration', () => {
    *   beforeEach(() => {
    *     jasmine.clock().install();
    *   });
    *   afterEach(() => {
    *     jasmine.clock().uninstall();
    *   });
    *   it('fakeAsync test', fakeAsync(() => {
    *     setTimeout(spy, 100);
    *     expect(spy).not.toHaveBeenCalled();
    *     jasmine.clock().tick(100);
    *     expect(spy).toHaveBeenCalled();
    *   }));
    * });
    * ```
    *
    * You must run `fakeAsync()` to make test cases in the `FakeAsyncTestZone`.
    *
    * If you set `__zone_symbol__fakeAsyncAutoFakeAsyncWhenClockPatched = true` before importing
    * `zone-testing.js`, `zone-testing.js` can run test case automatically in the
    * `FakeAsyncTestZone` without calling the `fakeAsync()`.
    *
    * Consider the following example:
    *
    * ```
    * describe('jasmine.clock integration', () => {
    *   beforeEach(() => {
    *     jasmine.clock().install();
    *   });
    *   afterEach(() => {
    *     jasmine.clock().uninstall();
    *   });
    *   it('fakeAsync test', () => { // here we don't need to call fakeAsync
    *     setTimeout(spy, 100);
    *     expect(spy).not.toHaveBeenCalled();
    *     jasmine.clock().tick(100);
    *     expect(spy).toHaveBeenCalled();
    *   });
    * });
    * ```
    *
    */
  var __zone_symbol__fakeAsyncAutoFakeAsyncWhenClockPatched: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Disable monkey patch the jasmine clock APIs.
    *
    * By default, `zone-testing.js` monkey patches the `jasmine.clock()` API,
    * so the `jasmine.clock()` can work with the `fakeAsync()/tick()` API.
    *
    * Consider the following example:
    *
    * ```
    * describe('jasmine.clock integration', () => {
    *   beforeEach(() => {
    *     jasmine.clock().install();
    *   });
    *   afterEach(() => {
    *     jasmine.clock().uninstall();
    *   });
    *   it('fakeAsync test', fakeAsync(() => {
    *     setTimeout(spy, 100);
    *     expect(spy).not.toHaveBeenCalled();
    *     jasmine.clock().tick(100);
    *     expect(spy).toHaveBeenCalled();
    *   }));
    * });
    * ```
    *
    * In the `fakeAsync()` method, `jasmine.clock().tick()` works just like `tick()`.
    *
    * If you set `__zone_symbol__fakeAsyncDisablePatchingClock = true` before importing
    * `zone-testing.js`,`zone-testing.js` does not monkey patch the `jasmine.clock()` APIs and the
    * `jasmine.clock()` cannot work with `fakeAsync()` any longer.
    */
  var __zone_symbol__fakeAsyncDisablePatchingClock: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enable waiting for the unresolved promise in the `async()` test.
    *
    * In the `async()` test, `AsyncTestZone` waits for all the asynchronous tasks to finish. By
    * default, if some promises remain unresolved, `AsyncTestZone` does not wait and reports that it
    * received an unexpected result.
    *
    * Consider the following example:
    *
    * ```
    * describe('wait never resolved promise', () => {
    *   it('async with never resolved promise test', async(() => {
    *     const p = new Promise(() => {});
    *     p.then(() => {
    *       // do some expectation.
    *     });
    *   }))
    * });
    * ```
    *
    * By default, this case passes, because the callback of `p.then()` is never called. Because `p`
    * is an unresolved promise, there is no pending asynchronous task, which means the `async()`
    * method does not wait.
    *
    * If you set `__zone_symbol__supportWaitUnResolvedChainedPromise = true`, the above case
    * times out, because `async()` will wait for the unresolved promise.
    */
  var __zone_symbol__supportWaitUnResolvedChainedPromise: js.UndefOr[Boolean] = js.undefined
}
object ZoneTestConfigurations {
  
  inline def apply(): ZoneTestConfigurations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZoneTestConfigurations]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ZoneTestConfigurations] (val x: Self) extends AnyVal {
    
    inline def set__Zone_disable_jasmine(value: Boolean): Self = StObject.set(x, "__Zone_disable_jasmine", value.asInstanceOf[js.Any])
    
    inline def set__Zone_disable_jasmineUndefined: Self = StObject.set(x, "__Zone_disable_jasmine", js.undefined)
    
    inline def set__Zone_disable_jest(value: Boolean): Self = StObject.set(x, "__Zone_disable_jest", value.asInstanceOf[js.Any])
    
    inline def set__Zone_disable_jestUndefined: Self = StObject.set(x, "__Zone_disable_jest", js.undefined)
    
    inline def set__Zone_disable_mocha(value: Boolean): Self = StObject.set(x, "__Zone_disable_mocha", value.asInstanceOf[js.Any])
    
    inline def set__Zone_disable_mochaUndefined: Self = StObject.set(x, "__Zone_disable_mocha", js.undefined)
    
    inline def set__zone_symbol__fakeAsyncAutoFakeAsyncWhenClockPatched(value: Boolean): Self = StObject.set(x, "__zone_symbol__fakeAsyncAutoFakeAsyncWhenClockPatched", value.asInstanceOf[js.Any])
    
    inline def set__zone_symbol__fakeAsyncAutoFakeAsyncWhenClockPatchedUndefined: Self = StObject.set(x, "__zone_symbol__fakeAsyncAutoFakeAsyncWhenClockPatched", js.undefined)
    
    inline def set__zone_symbol__fakeAsyncDisablePatchingClock(value: Boolean): Self = StObject.set(x, "__zone_symbol__fakeAsyncDisablePatchingClock", value.asInstanceOf[js.Any])
    
    inline def set__zone_symbol__fakeAsyncDisablePatchingClockUndefined: Self = StObject.set(x, "__zone_symbol__fakeAsyncDisablePatchingClock", js.undefined)
    
    inline def set__zone_symbol__supportWaitUnResolvedChainedPromise(value: Boolean): Self = StObject.set(x, "__zone_symbol__supportWaitUnResolvedChainedPromise", value.asInstanceOf[js.Any])
    
    inline def set__zone_symbol__supportWaitUnResolvedChainedPromiseUndefined: Self = StObject.set(x, "__zone_symbol__supportWaitUnResolvedChainedPromise", js.undefined)
  }
}
