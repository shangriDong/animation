package com.dqs.shangri.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.ImageView;

import com.dqs.shangri.animation.R;
import com.dqs.shangri.roots.FragmentRoot;

import java.util.logging.Logger;

/**
 * Created by Shangri on 2016/5/30.
 */
public class MainFragment extends FragmentRoot {
    private static final Logger log = Logger.getLogger(MainFragment.class.toString());
    private View mView;
    private Button mRightTranslateBt;
    private Button mScaleBt;
    private Button mAlphBt;
    private Button mRotateBt;
    private ImageView mIconIv;

    public MainFragment() {
        super(log);
    }

    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.right_translate_bt:
                    //第一个参数fromXDelta为动画起始时 X坐标上的移动位置
                    //第二个参数toXDelta为动画结束时 X坐标上的移动位置
                    //第三个参数fromYDelta为动画起始时Y坐标上的移动位置
                    //第四个参数toYDelta为动画结束时Y坐标上的移动位置
                    Animation rightAnim = AnimationUtils.loadAnimation(getActivity(), R.anim.translate);
                    mIconIv.startAnimation(rightAnim);
                    break;
                case R.id.scale_bt:
                    //第一个参数fromX为动画起始时 X坐标上的伸缩尺寸
                    //第二个参数toX为动画结束时 X坐标上的伸缩尺寸
                    //第三个参数fromY为动画起始时Y坐标上的伸缩尺寸
                    //第四个参数toY为动画结束时Y坐标上的伸缩尺寸
                    /*说明:
                                        以上四种属性值
                                        0.0表示收缩到没有
                                        1.0表示正常无伸缩
                                        值小于1.0表示收缩
                                        值大于1.0表示放大
                    */
                    //第五个参数pivotXType为动画在X轴相对于物件位置类型
                    //第六个参数pivotXValue为动画相对于物件的X坐标的开始位置
                    //第七个参数pivotXType为动画在Y轴相对于物件位置类型
                    //第八个参数pivotYValue为动画相对于物件的Y坐标的开始位置
                    Animation scaleAnim = new ScaleAnimation(0.0f, 1.4f, 0.0f, 1.4f,
                            Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                    scaleAnim.setDuration(700);
                    mIconIv.startAnimation(scaleAnim);
                    break;
                case R.id.alph_bt:
                    //第一个参数fromAlpha为 动画开始时候透明度
                    //第二个参数toAlpha为 动画结束时候透明度
                    //说明:0.0表示完全透明,1.0表示完全不透明
                    Animation alphAnim = new AlphaAnimation(0.1f, 1.0f);
                    //设置时间持续时间为 5000毫秒
                    alphAnim.setDuration(5000);
                    mIconIv.startAnimation(alphAnim);
                    break;
                case R.id.rotate_bt:
                    //第一个参数fromDegrees为动画起始时的旋转角度
                    //第二个参数toDegrees为动画旋转到的角度
                    //第三个参数pivotXType为动画在X轴相对于物件位置类型
                    //第四个参数pivotXValue为动画相对于物件的X坐标的开始位置
                    //第五个参数pivotXType为动画在Y轴相对于物件位置类型
                    //第六个参数pivotYValue为动画相对于物件的Y坐标的开始位置
                    Animation rotateAnim = new RotateAnimation(0.0f, +360.0f, Animation.RELATIVE_TO_SELF,
                            0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
                    rotateAnim.setDuration(3000);
                    mIconIv.startAnimation(rotateAnim);
                    break;
                default:
                    break;
            }
        }
    };

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.activity_main, container, false);
        initView();
        initListener();
        return mView;
    }

    private void initView() {
        mRightTranslateBt = (Button) mView.findViewById(R.id.right_translate_bt);
        mIconIv = (ImageView) mView.findViewById(R.id.image_view);
        mScaleBt = (Button) mView.findViewById(R.id.scale_bt);
        mAlphBt = (Button) mView.findViewById(R.id.alph_bt);
        mRotateBt = (Button) mView.findViewById(R.id.rotate_bt);
    }

    private void initListener() {
        mRightTranslateBt.setOnClickListener(listener);
        mAlphBt.setOnClickListener(listener);
        mRotateBt.setOnClickListener(listener);
        mScaleBt.setOnClickListener(listener);
    }
}