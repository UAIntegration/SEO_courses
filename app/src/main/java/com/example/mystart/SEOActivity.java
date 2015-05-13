package com.example.mystart;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.view.GestureDetector;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.widget.DrawerLayout;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v7.widget.Toolbar;


public class SEOActivity extends ActionBarActivity
        implements NavigationDrawerFragment.NavigationDrawerCallbacks {

    /**
     * Fragment managing the behaviors, interactions and presentation of the navigation drawer.
     */
    private NavigationDrawerFragment mNavigationDrawerFragment;

    /**
     * Used to store the last screen title. For use in {@link #restoreActionBar()}.
     */
    private CharSequence mTitle;



    MyFragment1 fragments1 = new MyFragment1();
    MyFragment2 fragments2 = new MyFragment2();
    MyFragment3 fragments3 = new MyFragment3();
    MyFragment4 fragments4 = new MyFragment4();
    android.app.FragmentManager fragmentManager2 = getFragmentManager();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seo);

        mNavigationDrawerFragment = (NavigationDrawerFragment)
                getSupportFragmentManager().findFragmentById(R.id.navigation_drawer);
        mTitle = getTitle();

        // Set up the drawer.
        mNavigationDrawerFragment.setUp(
                R.id.navigation_drawer,
                (DrawerLayout) findViewById(R.id.drawer_layout));
    }
    FragmentManager fragmentManager = getSupportFragmentManager();
    @Override
    public void onNavigationDrawerItemSelected(int position) {
        // update the main content by replacing fragments
        //FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.container, PlaceholderFragment.newInstance(position + 1))
                .commit();
    }

    public void onSectionAttached(int number) {
        switch (number) {
            case 1:
                mTitle = getString(R.string.title_section1);
                Toast.makeText(this, "First Page", Toast.LENGTH_SHORT).show();
                fragmentManager2.beginTransaction()          // получаем экземпляр FragmentTransaction
                        .replace(R.id.frgmCont, fragments1)
                        .addToBackStack("myStack")
                        .commit();            // вызываем commit для совершения действий FragmentTransaction
                break;
            case 2:
                mTitle = getString(R.string.title_section2);
                Toast.makeText(this, "Second Page", Toast.LENGTH_SHORT).show();
                fragmentManager2.beginTransaction()
                        .replace(R.id.frgmCont, fragments2)
                        .addToBackStack("myStack")
                        .commit();
                break;
            case 3:
                mTitle = getString(R.string.title_section3);
                Toast.makeText(this, "Third Page", Toast.LENGTH_SHORT).show();
                fragmentManager2.beginTransaction()
                        .replace(R.id.frgmCont, fragments3)
                        .addToBackStack("myStack")
                        .commit();
                break;
            case 4:
                mTitle = getString(R.string.title_section4);
                Toast.makeText(this, "Four Page", Toast.LENGTH_SHORT).show();
                fragmentManager2.beginTransaction()
                        .replace(R.id.frgmCont, fragments4)
                        .addToBackStack("myStack")
                        .commit();
                break;
            case 5:
                mTitle = getString(R.string.title_section5);
                Toast.makeText(this, "Five Page", Toast.LENGTH_SHORT).show();
                fragmentManager2.beginTransaction()
                        .replace(R.id.frgmCont, fragments4)
                        .addToBackStack("myStack")
                        .commit();
                break;
            case 6:
                mTitle = getString(R.string.title_section6);
                Toast.makeText(this, "Six Page", Toast.LENGTH_SHORT).show();
                fragmentManager2.beginTransaction()
                        .replace(R.id.frgmCont, fragments4)
                        .addToBackStack("myStack")
                        .commit();
                break;
            case 7:
                mTitle = getString(R.string.title_section7);
                Toast.makeText(this, "Seven Page", Toast.LENGTH_SHORT).show();
                fragmentManager2.beginTransaction()
                        .replace(R.id.frgmCont, fragments4)
                        .addToBackStack("myStack")
                        .commit();
                break;
            case 8:
                mTitle = getString(R.string.title_section8);
                Toast.makeText(this, "Eight Page", Toast.LENGTH_SHORT).show();
                fragmentManager2.beginTransaction()
                        .replace(R.id.frgmCont, fragments4)
                        .addToBackStack("myStack")
                        .commit();
                break;
            case 9:
                mTitle = getString(R.string.title_section9);
                Toast.makeText(this, "Nine Page", Toast.LENGTH_SHORT).show();
                fragmentManager2.beginTransaction()
                        .replace(R.id.frgmCont, fragments4)
                        .addToBackStack("myStack")
                        .commit();
                break;
            case 10:
                mTitle = getString(R.string.title_section10);
                Toast.makeText(this, "Ten Page", Toast.LENGTH_SHORT).show();
                fragmentManager2.beginTransaction()
                        .replace(R.id.frgmCont, fragments4)
                        .addToBackStack("myStack")
                        .commit();
                break;
            case 11:
                mTitle = getString(R.string.title_section11);
                Toast.makeText(this, "Eleven Page", Toast.LENGTH_SHORT).show();
                fragmentManager2.beginTransaction()
                        .replace(R.id.frgmCont, fragments4)
                        .addToBackStack("myStack")
                        .commit();
                break;
            case 12:
                mTitle = getString(R.string.title_section12);
                Toast.makeText(this, "Twelve Page", Toast.LENGTH_SHORT).show();
                fragmentManager2.beginTransaction()
                        .replace(R.id.frgmCont, fragments4)
                        .addToBackStack("myStack")
                        .commit();
                break;
            case 13:
                mTitle = getString(R.string.title_section13);
                Toast.makeText(this, "Thirteen Page", Toast.LENGTH_SHORT).show();
                fragmentManager2.beginTransaction()
                        .replace(R.id.frgmCont, fragments4)
                        .addToBackStack("myStack")
                        .commit();
                break;
        }
    }

    public void restoreActionBar() {
        ActionBar actionBar = getSupportActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
        actionBar.setDisplayShowTitleEnabled(true);
        actionBar.setTitle(mTitle);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        if (!mNavigationDrawerFragment.isDrawerOpen()) {
            // Only show items in the action bar relevant to this screen
            // if the drawer is not showing. Otherwise, let the drawer
            // decide what to show in the action bar.
            getMenuInflater().inflate(R.menu.seo, menu);
            restoreActionBar();
            return true;
        }
        //Toast.makeText(this, "MENU", Toast.LENGTH_SHORT).show();
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_seo, container, false);
            return rootView;
        }

        @Override
        public void onAttach(Activity activity) {
            super.onAttach(activity);
            ((SEOActivity) activity).onSectionAttached(
                    getArguments().getInt(ARG_SECTION_NUMBER));
        }
    }

    /*private class MyGestureListener extends GestureDetector.SimpleOnGestureListener
    {
        @Override
        public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY)
        {
            scrollBy((int)distanceX, (int)distanceY);
            return true;
        }
    }*/
}
