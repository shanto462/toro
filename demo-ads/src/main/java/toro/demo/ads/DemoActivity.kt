/*
 * Copyright (c) 2018 Nam Nguyen, nam@ene.im
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package toro.demo.ads

import android.os.Bundle
import kotlinx.android.synthetic.main.activity_base.startImaDemo
import kotlinx.android.synthetic.main.activity_base.startMopubDemo
import kotlinx.android.synthetic.main.activity_base.toolbar
import toro.demo.ads.common.BaseActivity
import toro.demo.ads.ima.ImaDemoActivity
import toro.demo.ads.mopub.MoPubDemoActivity


class DemoActivity : BaseActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_base)
    setSupportActionBar(toolbar)

    startMopubDemo.setOnClickListener {
      startActivity(MoPubDemoActivity.createIntent(this))
    }

    startImaDemo.setOnClickListener {
      startActivity(ImaDemoActivity.createIntent(this))
    }
  }
}
