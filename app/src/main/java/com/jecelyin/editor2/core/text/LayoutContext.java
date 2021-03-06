/*
 * Copyright (C) 2016 Jecelyin Peng <jecelyin@gmail.com>
 *
 * This file is part of 920 Text Editor.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.jecelyin.editor2.core.text;

import android.graphics.Paint;

import com.jecelyin.editor2.Pref;


/**
 * @author Jecelyin Peng <jecelyin@gmail.com>
 */
public class LayoutContext {
    public int lineNumber = 1;
    public Paint lineNumberPaint;
    public Paint linePaint;
    public Paint gutterBackgroundPaint;
    public float tabPath;
    public int gutterWidth;
    public int lineNumberX;
    public float translateX;
    public float translateY;
    public int cursorThickness;
    public Pref pref;
    public int scrollX;
    public boolean isShowWhiteSpace;
    public int whiteSpaceColor;
}
